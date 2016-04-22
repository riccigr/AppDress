package com.example.guilherme.demoappdress.DAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.guilherme.demoappdress.Interfaces.IClimaDAO;
import com.example.guilherme.demoappdress.Interfaces.IClimaSchema;
import com.example.guilherme.demoappdress.Provider.DbContentProvider;

public class ClimaDAO extends DbContentProvider implements IClimaSchema, IClimaDAO {

    private SQLiteDatabase database;

    private Cursor cursor;
    private ContentValues initialValues;

    public ClimaDAO(SQLiteDatabase db) {
        super(db);
    }

    @Override
    public double buscaTemperaturaMedia(int mes, String cidade) {

        final String columnsArgs[] = {COLUMN_TEMPERATURA_MEDIA};
        final String selection = COLUMN_MES + " = ? AND " + COLUMN_CIDADE + " = ?";
        final String selectionArgs[] = { String.valueOf(mes), String.valueOf(cidade)};
        double temperatura = 0;

        try{

            Cursor c = mDb.query(false, CLIMA_TABLE, columnsArgs , selection, selectionArgs, null, null, null, null );

            int tempMediaIndex = c.getColumnIndex("tempMedia");

            if(c.getCount() > 0){

                c.moveToFirst();

                for(int i= 1; i <= c.getCount(); i++){

                    Log.i("TEMPERATURA", c.getString(tempMediaIndex));
                    temperatura = c.getDouble(tempMediaIndex);

                }
            }

            c.close();


        }catch (Exception e){
            Log.e("ERRO>>>", "buscaTemperaturaMedia: " + e.getMessage());
        }

        return temperatura;
    }
}
