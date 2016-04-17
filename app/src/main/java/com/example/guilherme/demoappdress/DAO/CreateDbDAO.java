package com.example.guilherme.demoappdress.DAO;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class CreateDbDAO {

    public CreateDbDAO(SQLiteDatabase db){
        Include(db);
    }

    public void Include(SQLiteDatabase db){

        Log.i("bd", "before insert");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 1, 25.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 2, 26)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 3, 25.7 )");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 4, 24.9 )");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 5, 23.8 )");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 6, 22.6 )");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 7, 22.3)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 8, 22.7 )");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 9, 23.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 10, 24.4 )");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 11, 25.2 )");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Porto Seguro', 12, 25.2 )");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 1, 25.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 2, 25.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 3, 25.7)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 4, 25.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 5, 24.3)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 6, 23.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 7, 23.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 8, 23.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 9, 23.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 10, 24.8)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 11, 25.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Maceio', 12, 25.3)");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 1, 26.7)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 2, 26.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 3, 26.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 4, 26.0)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 5, 25.8)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 6, 25.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 7, 25.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 8, 25.8)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 9, 26.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 10, 26.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 11, 27.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Fortaleza', 12, 26.8)");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 1, 26.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 2, 27)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 3, 26.7)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 4, 26.3)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 5, 25.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 6, 24.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 7, 24)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 8, 24.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 9, 25)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 10, 25.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 11, 26.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Natal', 12, 26.7)");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 1, 20.7)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 2, 20.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 3, 18.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 4, 15.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 5, 13.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 6, 12.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 7, 12.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 8, 13.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 9, 14.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 10, 16.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 11, 18.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Gramado', 12, 18.1)");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 1, -0.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 2, 0.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 3, 4.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 4, 10.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 5, 16.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 6, 21.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 7, 24.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 8, 23.8)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 9, 19.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 10, 13.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 11, 7.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Nova York', 12, 2.2)");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 1, 15.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 2, 16.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 3, 18.8)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 4, 21.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 5, 24.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 6, 26.7)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 7, 27.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 8, 27.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 9, 26.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 10, 23.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 11, 19.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Orlando', 12, 16.1)");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 1, 3.3)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 2, 4.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 3, 7.8)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 4, 10.8)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 5, 14.3)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 6, 17.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 7, 19.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 8, 19.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 9, 16.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 10, 11.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 11, 7.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Paris', 12, 4.2)");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 1, 23.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 2, 22.8)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 3, 20.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 4, 16.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 5, 13.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 6, 11)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 7, 10.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 8, 11.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 9, 13.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 10, 16.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 11, 19.5)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Buenos Aires', 12, 22)");

        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 1, 7.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 2, 10)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 3, 13.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 4, 17.7)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 5, 22.9)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 6, 28.1)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 7, 31.6)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 8, 30.7)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 9, 26.2)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 10, 19.4)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 11, 12)");
        db.execSQL("INSERT INTO dadosClimaticos (cidade, mes, temperatura) VALUES ('Las Vegas', 12, 7.2)");




    }
}
