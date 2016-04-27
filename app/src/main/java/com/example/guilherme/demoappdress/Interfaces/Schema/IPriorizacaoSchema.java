package com.example.guilherme.demoappdress.Interfaces.Schema;

/**
 * Created by Guilherme on 24/04/2016.
 */
public interface IPriorizacaoSchema {

    String PRIORIZACAO_TABLE = "loja";
    String COLUMN_ID = "id";
    String COLUMN_LOJA_ID = "loja_id";
    String COLUMN_NIVEL_CLIMA = "clima_nivel";
    String COLUMN_PRIORIDADE = "prioridade";

    String[] PRIORIZACAO_COLUMNS = new String[] { COLUMN_ID,
            COLUMN_LOJA_ID, COLUMN_NIVEL_CLIMA, COLUMN_PRIORIDADE};

    String PRIORIZACAO_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + PRIORIZACAO_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY, "
            + COLUMN_LOJA_ID
            + " INTEGER NULL, "
            + COLUMN_NIVEL_CLIMA
            + " INTEGER NULL, "
            + COLUMN_PRIORIDADE
            + " INTEGER NULL " +
            ")";

//    String PRIORIZACAO_TABLE_INSERT = "INSERT INTO " +PRIORIZACAO_TABLE+ " ( " + COLUMN_LOJA_ID +" , " + COLUMN_NIVEL_CLIMA + " , " + COLUMN_PRIORIDADE + " ) VALUES "
//            + "  (1, 1, 1) "
//            + " ,(2, 2, 2) "
//            + " ,(3, 3, 3) "
//            + " ,(4, 4, 4) "
//            + ";";

}
