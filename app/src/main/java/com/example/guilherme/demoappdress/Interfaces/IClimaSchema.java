package com.example.guilherme.demoappdress.Interfaces;

public interface IClimaSchema {
        String CLIMA_TABLE = "clima";
        String COLUMN_ID = "id";
        String COLUMN_CIDADE = "cidade";
        String COLUMN_MES = "mes";
        String COLUMN_TEMPERATURA_MEDIA = "tempMedia";
        String COLUMN_TEMPERATURA_MAXIMA = "tempMax";
        String COLUMN_TEMPERATURA_MINIMA = "tempMin";

        String[] CLIMA_COLUMNS = new String[] { COLUMN_ID,
                COLUMN_CIDADE, COLUMN_MES, COLUMN_TEMPERATURA_MEDIA, COLUMN_TEMPERATURA_MAXIMA, COLUMN_TEMPERATURA_MINIMA};

}
