package com.example.guilherme.demoappdress.DAO;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

public class CreateDbDAO {

    public CreateDbDAO(SQLiteDatabase db){
        Create(db);
        Include(db);
    }

    public void Create(SQLiteDatabase db){
        db.execSQL("CREATE TABLE clima (" +
                "id INTEGER PRIMARY KEY," +
                "cidade VARCHAR(50) NULL, " +
                "mes INTEGER NULL, " +
                "tempMedia DECIMAL(2,2) NULL," +
                "tempMin DECIMAL(2,2) NULL," +
                "tempMax DECIMAL(2,2) NULL" +
                ")");
        
        db.execSQL("CREATE TABLE loja (" +
                "id INTEGER PRIMARY KEY," +
                "nome VARCHAR(50) NULL" +
                ")");

        db.execSQL("CREATE TABLE peca (" +
                "id INTEGER PRIMARY KEY," +
                "id_loja INTEGER NULL, " +
                "nome VARCHAR(50) NULL, " +
                "tipo_roupa VARCHAR(2) NULL, " +
                "imagem VARCHAR(50) NULL, " +
                "genero VARCHAR(1) NULL, " +
                "preco DECIMAL(5,2) NULL, " +
                "link VARCHAR(200) NULL" +
                ")");

        db.execSQL("CREATE TABLE enderecoLoja (" +
                "id INTEGER PRIMARY KEY," +
                "id_loja INTEGER NULL, " +
                "endereco VARCHAR(50) NULL," +
                "numero VARCHAR(5) NULL," +
                "CEP VARCHAR(9) NULL," +
                "latitude DECIMAL(10,6) NULL," +
                "longitude DECIMAL(10,6) NULL"+
                ")");

        db.execSQL("CREATE TABLE roupaClima (" +
                "id INTEGER PRIMARY KEY," +
                "id_peca INTEGER NULL, " +
                "id_clima INTEGER NULL " +
                ")");

        // 0 - Muito frio (<=5)
        // 1 - Frio (6 >= 15)
        // 2 - Ameno (16 >= 21)
        // 3 - Calor (22 >= 26)
        // 4 - Muito Calor (>27)
    }

    public void Include(SQLiteDatabase db){

        Log.i("bd", "before insert");

       String x ="INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 1, 25.9, 21, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 2, 26, 22, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 3, 25.7, 21.9, 29 );" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 4, 24.9, 21, 28);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 5, 23.8, 20, 27 );" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 6, 22.6, 18, 26 );" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 7, 22.3, 18, 26);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 8, 22.7, 18, 26 );" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 9, 23.9, 20, 27);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 10, 24.4, 20, 27 );" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 11, 25.2, 21, 29 );" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 12, 25.2, 21, 28 );" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 1, 25.9, 22, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 2, 25.9, 22, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 3, 25.7, 22, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 4, 25.1, 21, 28);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 5, 24.3, 21, 27 );" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 6, 23.5, 20, 26);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 7, 23.1, 20, 26);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 8, 23.2, 20, 26);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 9, 23.9, 20, 27);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 10, 24.8, 21, 28);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 11, 25.5, 21, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Maceio', 12, 25.3, 21, 28);" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 1, 26.7, 23, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 2, 26.6, 23, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 3, 26.2, 23, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 4, 26.0, 22, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 5, 25.8, 22, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 6, 25.6, 21, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 7, 25.5, 21 ,29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 8, 25.8, 22, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 9, 26.5, 23, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 10, 26.9, 23, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 11, 27.2, 24, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Fortaleza', 12, 26.8, 23, 30);" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 1, 26.9, 22, 31);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 2, 27,   23, 31);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 3, 26.7, 22, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 4, 26.3, 22, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 5, 25.6, 21, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 6, 24.5, 20, 28);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 7, 24,   20, 28);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 8, 24.1, 19, 20);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 9, 25,   20, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 10, 25.9, 21, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 11, 26.4, 22, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Natal', 12, 26.7, 22, 30);" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 1, 20.7, 15, 25);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 2, 20.1, 15, 24);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 3, 18.2, 13, 22);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 4, 15.4, 10, 19);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 5, 13.1, 8, 17);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 6, 12.1, 7, 16);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 7, 12.2, 7, 16);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 8, 13.2, 8, 18 );" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 9, 14.4, 9, 19);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 10, 16.4, 11, 21);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 11, 18.2, 13, 23);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Gramado', 12, 18.1, 13, 23);" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 1, -0.6, -4, 3);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 2, 0.5, -3, 4);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 3, 4.9, 0.7, 9);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 4, 10.6, 5, 15);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 5, 16.5, 11, 21);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 6, 21.5, 16, 26);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 7, 24.5, 19, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 8, 23.8, 19, 28);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 9, 19.5, 14, 24);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 10, 13.5, 8, 18);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 11, 7.9, 4, 11);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Nova York', 12, 2.2, -1, 5);" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 1, 15.1, 9, 21);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 2, 16.2, 10, 22);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 3, 18.8, 12, 25);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 4, 21.6, 15, 28);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 5, 24.6, 18, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 6, 26.7, 21, 32);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 7, 27.6, 22, 32);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 8, 27.6, 22, 32);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 9, 26.6, 21, 31);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 10, 23.4, 18, 28);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 11, 19.4, 13, 25);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Orlando', 12, 16.1, 10, 22);" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 1, 3.3, 0.7, 6);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 2, 4.2, 1, 7);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 3, 7.8, 3, 12);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 4, 10.8, 5, 15);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 5, 14.3, 8, 19);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 6, 17.5, 12, 22);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 7, 19.4, 14, 24);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 8, 19.1, 13, 24);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 9, 16.4, 11, 21);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 10, 11.6, 7, 15);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 11, 7.2, 4, 10);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Paris', 12, 4.2, 1, 6);" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 1, 23.6, 18, 29);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 2, 22.8, 17, 27);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 3, 20.6, 15, 25);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 4, 16.4, 11, 21);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 5, 13.5, 8, 18);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 6, 11, 7, 14);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 7, 10.6, 6, 14);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 8, 11.5, 6, 16);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 9, 13.5, 8, 18);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 10, 16.4, 11, 21);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 11, 19.5, 14, 24);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Buenos Aires', 12, 22, 16, 27);" +

       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 1, 7.1, 0.3, 13);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 2, 10, 3, 17);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 3, 13.2, 6, 20);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 4, 17.7, 10, 25);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 5, 22.9, 15, 30);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 6, 28.1, 19, 36);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 7, 31.6, 23, 39);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 8, 30.7, 22, 38);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 9, 26.2, 18, 34);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 10, 19.4, 11, 27);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 11, 12, 4, 19);" +
       "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Las Vegas', 12, 7.2, 0.4, 14);" ;




    }
}
