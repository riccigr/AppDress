package com.example.guilherme.demoappdress.BusinessLogic;


import android.content.Context;
import android.util.Log;

import com.example.guilherme.demoappdress.Constants.Temperatura;
import com.example.guilherme.demoappdress.Helper.Database;

import java.sql.SQLException;

public class ClimaLogic {

    public int getTemperatureLevel(Context applicationContext, int month, String destiny){

        int level = 0;

        Log.i("mes", String.valueOf(month));
        Log.i("cidade", String.valueOf(destiny));

        Database db = new Database(applicationContext);
        try {
            db.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        double temperatureAverage = db.mClimaDAO.getAverageTemperature(month, destiny);

        if(temperatureAverage <= 5 ){
            level = Temperatura.MUITO_FRIO;
        }else if( 6 < temperatureAverage  && temperatureAverage <= 15){
            level = Temperatura.FRIO;
        }else if( 16 < temperatureAverage  && temperatureAverage <= 21){
            level = Temperatura.AMENO;
        }else if( 22 < temperatureAverage  && temperatureAverage <= 26){
            level = Temperatura.CALOR;
        }else if( 27 < temperatureAverage){
            level = Temperatura.MUITO_CALOR;
        }

        return level;
    }

    public String getWeatherDescription(int temperatureLevel){

        String message = "";

        switch (temperatureLevel){
            case Temperatura.MUITO_FRIO:
                message = "É esperado temperaturas extremamente baixas, com média de 7ºC. Vista-se com diversas camadas e procure roupas impermeáveis porque a chances de nevar";
                break;
            case Temperatura.FRIO:
                message = "Temperaturas baixas são esperadas, busque roupas grossas para se manter aquecido.";
                break;
            case Temperatura.AMENO:
                message = "Vista-se tranquilamente. Aguarde um clima agradável. A temperatura média fica entre 16ºC e 21ºC.";
                break;
            case Temperatura.CALOR:
                message = "Clima quente, então busque roupas leves e claras para ficar confortável.";
                break;
            case Temperatura.MUITO_CALOR:
                message = "O calor estará extremo, passando dos 27ºC a média. Hidrate-se sempre e use roupas super leves e arejadas.";
                break;
        }

        return message;
    }
}
