package com.example.guilherme.demoappdress.Interfaces.Schema;

public interface IClassificacaoPecaSchema {

    String CLASSIFICACAO_TABLE = "classificacao";
    String COLUMN_ID = "id";
    String COLUMN_PECA_ID = "peca_id";
    String COLUMN_CLIMA_NIVEL = "clima_nivel";

    String[] CLASSIFICACAO_COLUMNS = new String[] { COLUMN_ID,
            COLUMN_PECA_ID, COLUMN_CLIMA_NIVEL};

    String CLASSIFICACAO_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + CLASSIFICACAO_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY, "
            + COLUMN_PECA_ID
            + " VARCHAR(50) NULL, "
            + COLUMN_CLIMA_NIVEL
            + " VARCHAR(50) NULL "
            + ")";

        String CLASSIFICACAO_TABLE_INSERT = "INSERT INTO " + CLASSIFICACAO_TABLE + " ( " + COLUMN_PECA_ID +" , " + COLUMN_CLIMA_NIVEL + " ) VALUES "
            + "  (1,0) "
            + "  (1,1) "
            + "  (2,0) "
            + "  (2,1) "
            + "  (3,0) "
            + "  (3,1) "
            + "  (3,2) "
            + "  (3,3) "
            + "  (3,4) "
            + "  (4,0) "
            + "  (4,1) "
            + "  (4,2) "
            + "  (4,3) "
            + "  (4,4) "
            + "  (5,0) "
            + "  (5,1) "
            + "  (5,2) "
            + "  (5,3) "
            + "  (5,4) "
            + "  (6,2) "
            + "  (6,3) "
            + "  (6,4) "
            + "  (7,2) "
            + "  (7,3) "
            + "  (7,4) "
            + "  (8,0) "
            + "  (8,1) "
            + "  (9,0) "
            + "  (9,1) "
            + "  (10,3) "
            + "  (10,4) "
            + "  (11,0) "
            + "  (11,1) "
            + "  (12,0) "
            + "  (12,1) "
            + "  (13,2) "
            + "  (13,3) "
            + "  (13,4) "
            + "  (14,2) "
            + "  (14,3) "
            + "  (14,4) "
            + "  (15,3) "
            + "  (15,4) "
            + "  (16,3) "
            + "  (16,4) "
            + "  (17,0) "
            + "  (17,1) "
            + "  (17,2) "
            + "  (17,3) "
            + "  (17,4) "
            + "  (18,0) "
            + "  (18,1) "
            + "  (18,2) "
            + "  (18,3) "
            + "  (18,4) "
            + "  (19,3) "
            + "  (19,4) "
            + "  (20,3) "
            + "  (20,4) "
            + "  (21,3) "
            + "  (21,4) "
            + "  (22,3) "
            + "  (22,4) "
            + "  (23,0) "
            + "  (23,1) "
            + "  (24,0) "
            + "  (24,1) "
            + "  (25,0) "
            + "  (25,1) "

            + "  (26,0) "
            + "  (27,0) "
            + "  (28,0) "
            + "  (29,0) "
            + "  (30,0) "
            + "  (31,0) "
            + "  (32,0) "
            + "  (33,0) "
            + "  (34,0) "
            + "  (35,0) "
            + "  (36,0) "
            + "  (37,0) "
            + "  (38,0) "
            + ";";


}
