package com.example.guilherme.demoappdress.BusinessLogic;

import com.example.guilherme.demoappdress.Class.Peca;
import com.example.guilherme.demoappdress.Class.Temperatura;

import java.util.HashMap;

/**
 * Created by Guilherme on 18/04/2016.
 */
public class RoupaLogic {

    public HashMap<Integer, Integer> Quantificador(int qtdDias, char genero, int nivelTemperatura ){

        HashMap<Integer, Integer> pecas = new HashMap<>();

            switch (nivelTemperatura) {
                case Temperatura.MUITO_FRIO:
                    pecas.put(Peca.CALCA, qtdDias / 3);
                    pecas.put(Peca.CALCA_TERMICA, qtdDias / 2);
                    pecas.put(Peca.CAMISA_LONGA, qtdDias);
                    pecas.put(Peca.CAMISA_TERMICA, qtdDias);
                    pecas.put(Peca.CASACO, qtdDias / 5);
                    pecas.put(Peca.BLUSA, qtdDias / 3);
                    pecas.put(Peca.MEIA_LA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 2);
                    pecas.put(Peca.BOTA, qtdDias / 10);
                    pecas.put(Peca.GORRO, qtdDias / 3);
                    pecas.put(Peca.OCULOS, 1);
                    break;
                case Temperatura.FRIO:
                    pecas.put(Peca.CALCA, qtdDias / 3);
                    pecas.put(Peca.CAMISA_LONGA, qtdDias);
                    pecas.put(Peca.CASACO_PESADO, qtdDias / 5);
                    pecas.put(Peca.BLUSA, qtdDias / 3);
                    pecas.put(Peca.MEIA_LA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 2);
                    pecas.put(Peca.TENIS, qtdDias / 10);
                    pecas.put(Peca.GORRO, qtdDias / 3);
                    pecas.put(Peca.OCULOS, 1);
                    break;
                case Temperatura.AMENO:
                    pecas.put(Peca.CALCA, qtdDias / 3);
                    pecas.put(Peca.CAMISA, qtdDias);
                    pecas.put(Peca.MEIA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 2);
                    pecas.put(Peca.TENIS, qtdDias / 10);
                    pecas.put(Peca.OCULOS, 1);
                    break;
                case Temperatura.CALOR:
                    pecas.put(Peca.CALCA, qtdDias / 5);
                    pecas.put(Peca.BERMUDA, qtdDias / 2);
                    pecas.put(Peca.CAMISA, qtdDias);
                    pecas.put(Peca.REGATA, qtdDias / 2);
                    pecas.put(Peca.MEIA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 2);
                    pecas.put(Peca.TENIS, qtdDias / 10);
                    pecas.put(Peca.CHINELO, qtdDias / 10);
                    pecas.put(Peca.OCULOS, 1);
                    pecas.put(Peca.BONE, qtdDias / 5);
                    break;
                case Temperatura.MUITO_CALOR:
                    pecas.put(Peca.CALCA, qtdDias / 5);
                    pecas.put(Peca.BERMUDA, qtdDias );
                    pecas.put(Peca.CAMISA, qtdDias);
                    pecas.put(Peca.REGATA, qtdDias / 2);
                    pecas.put(Peca.MEIA, qtdDias * 2);
                    pecas.put(Peca.CUECA, qtdDias * 3);
                    pecas.put(Peca.TENIS, qtdDias / 10);
                    pecas.put(Peca.CHINELO, qtdDias / 10);
                    pecas.put(Peca.OCULOS, 1);
                    pecas.put(Peca.BONE, qtdDias / 5);
                    break;
            }

    return pecas;

    }
}
