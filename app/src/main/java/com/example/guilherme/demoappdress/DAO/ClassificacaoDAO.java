package com.example.guilherme.demoappdress.DAO;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.guilherme.demoappdress.Interfaces.DAO.IClassificacaoPecaDAO;
import com.example.guilherme.demoappdress.Interfaces.Schema.IClassificacaoPecaSchema;
import com.example.guilherme.demoappdress.Provider.DbContentProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guilherme on 27/04/2016.
 */
public class ClassificacaoDAO extends DbContentProvider implements IClassificacaoPecaDAO, IClassificacaoPecaSchema {

    public ClassificacaoDAO(SQLiteDatabase db) {
        super(db);
    }

    @Override
    public List<Integer> getListPecaPorClima(int temperatureLevel) {

        List<Integer> listPecas = new ArrayList<>();

        final String columnsArgs[] = {COLUMN_TIPO_PECA};
        final String selection = COLUMN_CLIMA_NIVEL + " = ? ";
        final String selectionArgs[] = { String.valueOf(temperatureLevel)};

        Log.i("CAÇA", "temperatura do lista: "+ String.valueOf(temperatureLevel));

        try{
            Cursor c = mDb.query(true, CLASSIFICACAO_TABLE, columnsArgs , selection, selectionArgs, null, null, null, null );
            int pecaIdIndex = c.getColumnIndex(COLUMN_TIPO_PECA);

            Log.i("CAÇA", "retorno do classificacao: "+ String.valueOf(c.getCount()));

            if(c.getCount() > 0){

                for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
                    listPecas.add(c.getInt(pecaIdIndex));
            //        Log.i("PECA", String.valueOf(c.getInt(pecaIdIndex)));
                }
            }
            c.close();

        }catch (Exception e){
            Log.e("ERRO>>>", "getListPecaPorClima: " + e.getMessage());
        }
        
        return listPecas;
    }
}
