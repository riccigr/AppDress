package com.example.guilherme.demoappdress.DAO;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.guilherme.demoappdress.Interfaces.DAO.IClimaDAO;
import com.example.guilherme.demoappdress.Interfaces.Schema.IClimaSchema;
import com.example.guilherme.demoappdress.Provider.DbContentProvider;

public class ClimaDAO extends DbContentProvider implements IClimaSchema, IClimaDAO {

    public ClimaDAO(SQLiteDatabase db) {
        super(db);
    }

    @Override
    public double getAverageTemperature(int month, String destiny) {

        final String columnsArgs[] = {COLUMN_TEMPERATURA_MEDIA};
        final String selection = COLUMN_MES + " = ? AND " + COLUMN_CIDADE + " = ?";
        final String selectionArgs[] = { String.valueOf(month), String.valueOf(destiny)};
        double temperatura = 0;

        try{
            Cursor c = mDb.query(false, CLIMA_TABLE, columnsArgs , selection, selectionArgs, null, null, null, null );
            int tempMediaIndex = c.getColumnIndex("tempMedia");

            if(c.getCount() > 0){

                c.moveToFirst();

                for(int i= 1; i <= c.getCount(); i++){
                    temperatura = c.getDouble(tempMediaIndex);
                    Log.i("TEMPERATURA", String.valueOf(temperatura) );
                }
            }
            c.close();

        }catch (Exception e){
            Log.e("ERRO>>>", "getAverageTemperature: " + e.getMessage());
        }

        return temperatura;
    }
}
