package com.example.guilherme.demoappdress.Constants;


import java.util.HashMap;

public class TipoPeca {

    public static final int CHAPEU = 0;
    public static final int BONE = 1;
    public static final int GORRO = 2;
    public static final int OCULOS = 3;

    public static final int CAMISA = 4 ;
    public static final int CAMISA_LONGA = 5 ;
    public static final int CAMISA_TERMICA = 6 ;
    public static final int CASACO= 7;
    public static final int CASACO_PESADO= 8;
    public static final int BLUSA = 9;
    public static final int REGATA = 10;

    public static final int CALCA = 11;
    public static final int CALCA_TERMICA = 12;
    public static final int SAIA = 13;
    public static final int BERMUDA = 14;

    public static final int BIQUINI = 15;
    public static final int SUNGA = 16;
    public static final int CUECA = 17;


    public static final int MEIA = 18;
    public static final int MEIA_LA = 19;

    public static final int TENIS = 20;
    public static final int BOTA = 21;
    public static final int CHINELO = 22;
    public static final int SANDALIA = 23;
    public static final int CACHECOL = 24;
    public static final int LUVA = 25;
    public static final int CINTO = 26;
    

    public static HashMap<Integer, String> pecaImageMap;
    static {
        pecaImageMap = new HashMap<Integer, String>();
        pecaImageMap.put(0,"flat_chapeu");
        pecaImageMap.put(1,"flat_bone");
        pecaImageMap.put(2,"flat_gorro");
        pecaImageMap.put(3,"flat_oculos");
        pecaImageMap.put(4,"flat_camisa");
        pecaImageMap.put(5,"flat_camisa_longa");
        pecaImageMap.put(6,"flat_camisa_termica");
        pecaImageMap.put(7,"flat_casaco");
        pecaImageMap.put(8,"flat_casaco_pesado");
        pecaImageMap.put(9,"flat_blusa");
        pecaImageMap.put(10,"flat_regata");
        pecaImageMap.put(11,"flat_calca");
        pecaImageMap.put(12,"flat_calca_termica");
        pecaImageMap.put(13,"flat_saia");
        pecaImageMap.put(14,"flat_bermuda");
        pecaImageMap.put(15,"flat_biquini");
        pecaImageMap.put(16,"flat_sunga");
        pecaImageMap.put(17,"flat_cueca");
        pecaImageMap.put(18,"flat_meia");
        pecaImageMap.put(19,"flat_meia_la");
        pecaImageMap.put(20,"flat_tenis");
        pecaImageMap.put(21,"flat_bota");
        pecaImageMap.put(22,"flat_chinelo");
        pecaImageMap.put(23,"flat_sandalia");
        pecaImageMap.put(24,"flat_cachecol");
        pecaImageMap.put(25,"flat_luva");
        pecaImageMap.put(26,"flat_belt");
    }
    
    
    public HashMap<Integer, String> getPecaImageMap(){        
        return pecaImageMap;
    }


}
