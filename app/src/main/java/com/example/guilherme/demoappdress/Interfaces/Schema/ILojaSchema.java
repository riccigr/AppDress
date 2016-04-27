package com.example.guilherme.demoappdress.Interfaces.Schema;

public interface ILojaSchema {

    String LOJA_TABLE = "loja";
    String COLUMN_ID = "id";
    String COLUMN_NOME = "nome";
    String COLUMN_LOGO = "logo";

    String[] LOJA_COLUMNS = new String[] { COLUMN_ID,
            COLUMN_NOME, COLUMN_LOGO};

    String LOJA_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + LOJA_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY, "
            + COLUMN_NOME
            + " VARCHAR(50) NULL, "
            + COLUMN_LOGO
            + " VARCHAR(50) NULL "
            + ")";

    String LOJA_TABLE_INSERT = "INSERT INTO " +LOJA_TABLE+ " ( " + COLUMN_NOME +" , " + COLUMN_LOGO + " ) VALUES "
            + "  ('Rick', 'logo_rick') "
            + " ,('Dafrente', 'logo_dafrente') "
            + " ,('Seya', 'logo_seya') "
            + " ,('Marilda', 'logo_marilda') "
            + ";";


}
