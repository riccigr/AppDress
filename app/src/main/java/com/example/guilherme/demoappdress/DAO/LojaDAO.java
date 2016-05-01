package com.example.guilherme.demoappdress.DAO;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.guilherme.demoappdress.Interfaces.DAO.ILojaDAO;
import com.example.guilherme.demoappdress.Interfaces.Schema.ILojaSchema;
import com.example.guilherme.demoappdress.Provider.DbContentProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guilherme on 21/04/2016.
 */
public class LojaDAO extends DbContentProvider implements ILojaSchema, ILojaDAO {

    public LojaDAO(SQLiteDatabase db){
        super(db);
    }

    @Override
    public List<Integer> getAll() {

        List<Integer> listLoja = new ArrayList<>();

        final String columnsArgs[] = {COLUMN_ID};
        final String selection = "";
        final String selectionArgs[] = { };

        try{
            Cursor c = mDb.query(false, LOJA_TABLE, columnsArgs , selection, selectionArgs, null, null, null, null );
            int idIndex = c.getColumnIndex("id");

            if(c.getCount() > 0){

                for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
                    listLoja.add(c.getInt(idIndex));
                }
            }
            c.close();

        }catch (Exception e){
            Log.e("ERRO>>>", "getAll: " + e.getMessage());
        }

        return listLoja;
    }
}
