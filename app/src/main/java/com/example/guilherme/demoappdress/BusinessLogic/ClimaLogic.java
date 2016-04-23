package com.example.guilherme.demoappdress.BusinessLogic;


import android.content.Context;
import android.util.Log;

import com.example.guilherme.demoappdress.Constants.Temperatura;
import com.example.guilherme.demoappdress.Helper.Database;

import java.sql.SQLException;

public class ClimaLogic {

    public int retornoNivelTemperatura(Context applicationContext, int mes, String cidade){

        int nivel = 0;

        Log.i("mes", String.valueOf(mes));
        Log.i("cidade", String.valueOf(cidade));

        Database db = new Database(applicationContext);
        try {
            db.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        double temperaturaMedia = db.mClimaDAO.buscaTemperaturaMedia(mes, cidade);

        if(temperaturaMedia <= 5 ){
            nivel = Temperatura.MUITO_FRIO;
        }else if( 6 < temperaturaMedia  && temperaturaMedia <= 15){
            nivel = Temperatura.FRIO;
        }else if( 16 < temperaturaMedia  && temperaturaMedia <= 21){
            nivel = Temperatura.AMENO;
        }else if( 22 < temperaturaMedia  && temperaturaMedia <= 26){
            nivel = Temperatura.CALOR;
        }else if( 27 < temperaturaMedia){
            nivel = Temperatura.MUITO_CALOR;
        }

        return nivel;
    }
}
