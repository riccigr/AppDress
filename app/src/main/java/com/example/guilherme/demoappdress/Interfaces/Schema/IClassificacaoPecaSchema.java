package com.example.guilherme.demoappdress.Interfaces.Schema;

import com.example.guilherme.demoappdress.Constants.TipoPeca;
import com.example.guilherme.demoappdress.Constants.Temperatura;

public interface IClassificacaoPecaSchema {

    String CLASSIFICACAO_TABLE = "classificacao";
    String COLUMN_ID = "id";
    String COLUMN_TIPO_PECA = "tipo_peca";
    String COLUMN_CLIMA_NIVEL = "clima_nivel";

    String[] CLASSIFICACAO_COLUMNS = new String[] { COLUMN_ID,
            COLUMN_TIPO_PECA, COLUMN_CLIMA_NIVEL};

    String CLASSIFICACAO_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + CLASSIFICACAO_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY, "
            + COLUMN_TIPO_PECA
            + " INTEGER NULL, "
            + COLUMN_CLIMA_NIVEL
            + " INTEGER NULL "
            + ")";

        String CLASSIFICACAO_TABLE_INSERT = "INSERT INTO " + CLASSIFICACAO_TABLE + " ( " + COLUMN_TIPO_PECA +" , " + COLUMN_CLIMA_NIVEL + " ) VALUES "
              + "   ("+ TipoPeca.BERMUDA + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.BERMUDA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.BIQUINI + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.BIQUINI + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.BLUSA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.BLUSA + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.BONE + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.BONE + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.BOTA + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.BOTA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CACHECOL + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CACHECOL + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.CALCA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.CALCA + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.CALCA + " , " + Temperatura.AMENO + " ) "
              + " , ("+ TipoPeca.CALCA + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.CALCA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CALCA_TERMICA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CAMISA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.CAMISA + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.CAMISA + " , " + Temperatura.AMENO + " ) "
              + " , ("+ TipoPeca.CAMISA + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.CAMISA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CAMISA_LONGA + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.CAMISA_LONGA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CAMISA_TERMICA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CASACO + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.CASACO + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CASACO_PESADO + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.CASACO_PESADO + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CHAPEU + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.CHAPEU + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.CHINELO + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.CHINELO + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.CINTO + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.CINTO + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.CINTO + " , " + Temperatura.AMENO + " ) "
              + " , ("+ TipoPeca.CINTO + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.CINTO + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.CUECA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.CUECA + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.CUECA + " , " + Temperatura.AMENO + " ) "
              + " , ("+ TipoPeca.CUECA + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.CUECA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.OCULOS + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.OCULOS + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.OCULOS + " , " + Temperatura.AMENO + " ) "
              + " , ("+ TipoPeca.OCULOS + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.OCULOS + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.GORRO + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.GORRO + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.LUVA + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.LUVA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.MEIA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.MEIA + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.MEIA + " , " + Temperatura.AMENO + " ) "
              + " , ("+ TipoPeca.MEIA + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.MEIA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.MEIA_LA + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.SAIA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.SAIA + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.SANDALIA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.SANDALIA + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.REGATA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.REGATA + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.TENIS + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.TENIS + " , " + Temperatura.CALOR + " ) "
              + " , ("+ TipoPeca.TENIS + " , " + Temperatura.AMENO + " ) "
              + " , ("+ TipoPeca.TENIS + " , " + Temperatura.FRIO + " ) "
              + " , ("+ TipoPeca.TENIS + " , " + Temperatura.MUITO_FRIO + " ) "
              + " , ("+ TipoPeca.SUNGA + " , " + Temperatura.MUITO_CALOR + " ) "
              + " , ("+ TipoPeca.SUNGA + " , " + Temperatura.CALOR + " ) "
              + ";";


}
