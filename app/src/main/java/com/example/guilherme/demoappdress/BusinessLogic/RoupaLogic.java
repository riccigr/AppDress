package com.example.guilherme.demoappdress.BusinessLogic;

import android.util.Log;

import com.example.guilherme.demoappdress.Constants.Peca;
import com.example.guilherme.demoappdress.Constants.Temperatura;

import java.util.HashMap;

public class RoupaLogic {

    public HashMap<Integer, Integer> Quantificador(int qtdDias, char genero, int nivelTemperatura ){

        Log.i("Dias", String.valueOf(qtdDias));
        Log.i("genero", String.valueOf(genero));
        Log.i("nivel", String.valueOf(nivelTemperatura));

        HashMap<Integer, Integer> pecas = new HashMap<>();

            switch (nivelTemperatura) {
                case Temperatura.MUITO_FRIO:
                    pecas.put(Peca.CALCA, (int) Math.ceil(qtdDias / 3.0));
                    pecas.put(Peca.CALCA_TERMICA, (int) Math.ceil(qtdDias / 2.0));
                    pecas.put(Peca.CAMISA_LONGA, qtdDias);
                    pecas.put(Peca.CAMISA_TERMICA, qtdDias);
                    pecas.put(Peca.CASACO, (int) Math.ceil(qtdDias / 5.0));
                    pecas.put(Peca.BLUSA, (int) Math.ceil(qtdDias / 3.0));
                    pecas.put(Peca.MEIA_LA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 2);
                    pecas.put(Peca.BOTA, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.GORRO, (int) Math.ceil(qtdDias / 3.0));
                    pecas.put(Peca.LUVA, (int) Math.ceil(qtdDias / 3.0));
                    pecas.put(Peca.CACHECOL, (int) Math.ceil(qtdDias / 4.0));
                    pecas.put(Peca.CINTO, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.OCULOS, 1);
                    break;
                case Temperatura.FRIO:
                    pecas.put(Peca.CALCA, (int) Math.ceil(qtdDias / 3.0));
                    pecas.put(Peca.CAMISA_LONGA, qtdDias);
                    pecas.put(Peca.CASACO_PESADO, (int) Math.ceil(qtdDias / 5.0));
                    pecas.put(Peca.BLUSA, (int) Math.ceil(qtdDias / 3.0));
                    pecas.put(Peca.MEIA_LA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 2);
                    pecas.put(Peca.TENIS, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.GORRO, (int) Math.ceil(qtdDias / 3.0));
                    pecas.put(Peca.LUVA, (int) Math.ceil(qtdDias / 4.0));
                    pecas.put(Peca.CACHECOL, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.CINTO, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.OCULOS, 1);
                    break;
                case Temperatura.AMENO:
                    pecas.put(Peca.CALCA, (int) Math.ceil(qtdDias / 3.0));
                    pecas.put(Peca.CAMISA, qtdDias);
                    pecas.put(Peca.MEIA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 2);
                    pecas.put(Peca.TENIS, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.CINTO, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.OCULOS, 1);
                    break;
                case Temperatura.CALOR:
                    pecas.put(Peca.CALCA, (int) Math.ceil(qtdDias / 5.0));
                    pecas.put(Peca.BERMUDA, (int) Math.ceil(qtdDias / 2.0));
                    pecas.put(Peca.CAMISA, qtdDias);
                    pecas.put(Peca.REGATA, (int) Math.ceil(qtdDias / 2.0));
                    pecas.put(Peca.MEIA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 2);
                    pecas.put(Peca.TENIS, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.CHINELO, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.OCULOS, 1);
                    pecas.put(Peca.CINTO, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.BONE, (int) Math.ceil(qtdDias / 5.0));
                    break;
                case Temperatura.MUITO_CALOR:
                    pecas.put(Peca.CALCA, (int) Math.ceil(qtdDias / 5.0));
                    pecas.put(Peca.BERMUDA, qtdDias );
                    pecas.put(Peca.CAMISA, qtdDias);
                    pecas.put(Peca.REGATA, (int) Math.ceil(qtdDias / 2.0));
                    pecas.put(Peca.MEIA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 3);
                    pecas.put(Peca.TENIS, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.CHINELO, (int) Math.ceil(qtdDias / 10.0));
                    pecas.put(Peca.OCULOS, 1);
                    pecas.put(Peca.BONE, (int) Math.ceil(qtdDias / 5.0));
                    pecas.put(Peca.CINTO, (int) Math.ceil(qtdDias / 10.0));
                    break;
            }

    return pecas;

    }

}
