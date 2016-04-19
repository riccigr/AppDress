package com.example.guilherme.demoappdress.BusinessLogic;

import com.example.guilherme.demoappdress.Class.Peca;
import com.example.guilherme.demoappdress.Class.Temperatura;

import java.util.HashMap;

/**
 * Created by Guilherme on 18/04/2016.
 */
public class RoupaLogic {

    public void Quantificador(int qtdDias, String dataInicio, int temperatura ){

        HashMap<String, Integer> pecas = new HashMap<>();

        if(temperatura <= Temperatura.FRIO){
            pecas.put(Peca.CALCA,  qtdDias / 3);
            pecas.put(Peca.CAMISA, qtdDias    );
            pecas.put(Peca.CASACO, qtdDias / 5);
            pecas.put(Peca.BLUSA,  qtdDias / 3);
            pecas.put(Peca.MEIA,   qtdDias * 2);
            pecas.put(Peca.CUECA,  qtdDias * 2);
            pecas.put(Peca.TENIS,  qtdDias /10);
            pecas.put(Peca.OCULOS, 1);


        }else{

        }
    }
}
