package com.example.guilherme.demoappdress.Interfaces.Schema;

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

        String CLIMA_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
                + CLIMA_TABLE
                + " ("
                + COLUMN_ID
                + " INTEGER PRIMARY KEY, "
                + COLUMN_CIDADE
                + " VARCHAR(50) NULL, "
                + COLUMN_MES
                + " INTEGER NULL,"
                + COLUMN_TEMPERATURA_MEDIA
                + " DECIMAL(2,2) NULL, "
                + COLUMN_TEMPERATURA_MAXIMA
                + " DECIMAL(2,2) NULL, "
                + COLUMN_TEMPERATURA_MINIMA
                + " DECIMAL(2,2) NULL "
                + ")";

        String CLIMA_TABLE_INSERT = "INSERT INTO clima (cidade, mes, tempMedia, tempMin, tempMax) VALUES ('Porto Seguro', 1, 25.9, 21, 29) " +
                 ",('Porto Seguro', 2, 26, 22, 29) " +
                 ",('Porto Seguro', 3, 25.7, 21.9, 29 ) " +
                 ",('Porto Seguro', 4, 24.9, 21, 28) " +
                 ",('Porto Seguro', 5, 23.8, 20, 27 ) " +
                 ",('Porto Seguro', 6, 22.6, 18, 26 ) " +
                 ",('Porto Seguro', 7, 22.3, 18, 26) " +
                 ",('Porto Seguro', 8, 22.7, 18, 26 ) " +
                 ",('Porto Seguro', 9, 23.9, 20, 27) " +
                 ",('Porto Seguro', 10, 24.4, 20, 27 ) " +
                 ",('Porto Seguro', 11, 25.2, 21, 29 ) " +
                 ",('Porto Seguro', 12, 25.2, 21, 28 ) " +

                 ",('Maceio', 1, 25.9, 22, 29) " +
                 ",('Maceio', 2, 25.9, 22, 29) " +
                 ",('Maceio', 3, 25.7, 22, 29) " +
                 ",('Maceio', 4, 25.1, 21, 28) " +
                 ",('Maceio', 5, 24.3, 21, 27 ) " +
                 ",('Maceio', 6, 23.5, 20, 26) " +
                 ",('Maceio', 7, 23.1, 20, 26) " +
                 ",('Maceio', 8, 23.2, 20, 26) " +
                 ",('Maceio', 9, 23.9, 20, 27) " +
                 ",('Maceio', 10, 24.8, 21, 28) " +
                 ",('Maceio', 11, 25.5, 21, 29) " +
                 ",('Maceio', 12, 25.3, 21, 28) " +

                 ",('Fortaleza', 1, 26.7, 23, 30) " +
                 ",('Fortaleza', 2, 26.6, 23, 29) " +
                 ",('Fortaleza', 3, 26.2, 23, 29) " +
                 ",('Fortaleza', 4, 26.0, 22, 29) " +
                 ",('Fortaleza', 5, 25.8, 22, 29) " +
                 ",('Fortaleza', 6, 25.6, 21, 29) " +
                 ",('Fortaleza', 7, 25.5, 21 ,29) " +
                 ",('Fortaleza', 8, 25.8, 22, 29) " +
                 ",('Fortaleza', 9, 26.5, 23, 29) " +
                 ",('Fortaleza', 10, 26.9, 23, 30) " +
                 ",('Fortaleza', 11, 27.2, 24, 30) " +
                 ",('Fortaleza', 12, 26.8, 23, 30) " +

                 ",('Natal', 1, 26.9, 22, 31) " +
                 ",('Natal', 2, 27,   23, 31) " +
                 ",('Natal', 3, 26.7, 22, 30) " +
                 ",('Natal', 4, 26.3, 22, 30) " +
                 ",('Natal', 5, 25.6, 21, 29) " +
                 ",('Natal', 6, 24.5, 20, 28) " +
                 ",('Natal', 7, 24,   20, 28) " +
                 ",('Natal', 8, 24.1, 19, 20) " +
                 ",('Natal', 9, 25,   20, 29) " +
                 ",('Natal', 10, 25.9, 21, 30) " +
                 ",('Natal', 11, 26.4, 22, 30) " +
                 ",('Natal', 12, 26.7, 22, 30) " +

                 ",('Gramado', 1, 20.7, 15, 25) " +
                 ",('Gramado', 2, 20.1, 15, 24) " +
                 ",('Gramado', 3, 18.2, 13, 22) " +
                 ",('Gramado', 4, 15.4, 10, 19) " +
                 ",('Gramado', 5, 13.1, 8, 17) " +
                 ",('Gramado', 6, 12.1, 7, 16) " +
                 ",('Gramado', 7, 12.2, 7, 16) " +
                 ",('Gramado', 8, 13.2, 8, 18 ) " +
                 ",('Gramado', 9, 14.4, 9, 19) " +
                 ",('Gramado', 10, 16.4, 11, 21) " +
                 ",('Gramado', 11, 18.2, 13, 23) " +
                 ",('Gramado', 12, 18.1, 13, 23) " +

                 ",('Nova York', 1, -0.6, -4, 3) " +
                 ",('Nova York', 2, 0.5, -3, 4) " +
                 ",('Nova York', 3, 4.9, 0.7, 9) " +
                 ",('Nova York', 4, 10.6, 5, 15) " +
                 ",('Nova York', 5, 16.5, 11, 21) " +
                 ",('Nova York', 6, 21.5, 16, 26) " +
                 ",('Nova York', 7, 24.5, 19, 29) " +
                 ",('Nova York', 8, 23.8, 19, 28) " +
                 ",('Nova York', 9, 19.5, 14, 24) " +
                 ",('Nova York', 10, 13.5, 8, 18) " +
                 ",('Nova York', 11, 7.9, 4, 11) " +
                 ",('Nova York', 12, 2.2, -1, 5) " +

                 ",('Orlando', 1, 15.1, 9, 21) " +
                 ",('Orlando', 2, 16.2, 10, 22) " +
                 ",('Orlando', 3, 18.8, 12, 25) " +
                 ",('Orlando', 4, 21.6, 15, 28) " +
                 ",('Orlando', 5, 24.6, 18, 30) " +
                 ",('Orlando', 6, 26.7, 21, 32) " +
                 ",('Orlando', 7, 27.6, 22, 32) " +
                 ",('Orlando', 8, 27.6, 22, 32) " +
                 ",('Orlando', 9, 26.6, 21, 31) " +
                 ",('Orlando', 10, 23.4, 18, 28) " +
                 ",('Orlando', 11, 19.4, 13, 25) " +
                 ",('Orlando', 12, 16.1, 10, 22) " +

                 ",('Paris', 1, 3.3, 0.7, 6) " +
                 ",('Paris', 2, 4.2, 1, 7) " +
                 ",('Paris', 3, 7.8, 3, 12) " +
                 ",('Paris', 4, 10.8, 5, 15) " +
                 ",('Paris', 5, 14.3, 8, 19) " +
                 ",('Paris', 6, 17.5, 12, 22) " +
                 ",('Paris', 7, 19.4, 14, 24) " +
                 ",('Paris', 8, 19.1, 13, 24) " +
                 ",('Paris', 9, 16.4, 11, 21) " +
                 ",('Paris', 10, 11.6, 7, 15) " +
                 ",('Paris', 11, 7.2, 4, 10) " +
                 ",('Paris', 12, 4.2, 1, 6) " +

                 ",('Buenos Aires', 1, 23.6, 18, 29) " +
                 ",('Buenos Aires', 2, 22.8, 17, 27) " +
                 ",('Buenos Aires', 3, 20.6, 15, 25) " +
                 ",('Buenos Aires', 4, 16.4, 11, 21) " +
                 ",('Buenos Aires', 5, 13.5, 8, 18) " +
                 ",('Buenos Aires', 6, 11, 7, 14) " +
                 ",('Buenos Aires', 7, 10.6, 6, 14) " +
                 ",('Buenos Aires', 8, 11.5, 6, 16) " +
                 ",('Buenos Aires', 9, 13.5, 8, 18) " +
                 ",('Buenos Aires', 10, 16.4, 11, 21) " +
                 ",('Buenos Aires', 11, 19.5, 14, 24) " +
                 ",('Buenos Aires', 12, 22, 16, 27) " +

                 ",('Las Vegas', 1, 7.1, 0.3, 13) " +
                 ",('Las Vegas', 2, 10, 3, 17) " +
                 ",('Las Vegas', 3, 13.2, 6, 20) " +
                 ",('Las Vegas', 4, 17.7, 10, 25) " +
                 ",('Las Vegas', 5, 22.9, 15, 30) " +
                 ",('Las Vegas', 6, 28.1, 19, 36) " +
                 ",('Las Vegas', 7, 31.6, 23, 39) " +
                 ",('Las Vegas', 8, 30.7, 22, 38) " +
                 ",('Las Vegas', 9, 26.2, 18, 34) " +
                 ",('Las Vegas', 10, 19.4, 11, 27) " +
                 ",('Las Vegas', 11, 12, 4, 19) " +
                 ",('Las Vegas', 12, 7.2, 0.4, 14) " ;


}
