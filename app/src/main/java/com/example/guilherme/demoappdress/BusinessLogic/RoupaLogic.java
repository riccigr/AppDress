package com.example.guilherme.demoappdress.BusinessLogic;

import android.content.Context;
import android.util.Log;

import com.example.guilherme.demoappdress.Constants.TipoPeca;
import com.example.guilherme.demoappdress.Constants.Temperatura;
import com.example.guilherme.demoappdress.Helper.Database;
import com.example.guilherme.demoappdress.POJO.Peca;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RoupaLogic {

    public HashMap<Integer, Integer> quantifier(int days, char genre, int temperatureLevel){

        HashMap<Integer, Integer> item = new HashMap<>();

            switch (temperatureLevel) {
                case Temperatura.MUITO_FRIO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CALCA_TERMICA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.CAMISA_LONGA, days);
                    item.put(TipoPeca.CAMISA_TERMICA, days);
                    item.put(TipoPeca.CASACO, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BLUSA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.MEIA_LA, days * 2);
                    item.put(TipoPeca.CUECA, days * 2);
                    item.put(TipoPeca.BOTA, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.GORRO, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.LUVA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CACHECOL, (int) Math.ceil(days / 4.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.FRIO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CAMISA_LONGA, days);
                    item.put(TipoPeca.CASACO_PESADO, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BLUSA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.MEIA_LA, days * 2);
                    item.put(TipoPeca.CUECA, days * 2);
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.GORRO, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.LUVA, (int) Math.ceil(days / 4.0));
                    item.put(TipoPeca.CACHECOL, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.AMENO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CAMISA, days);
                    item.put(TipoPeca.MEIA, days * 2);
                    item.put(TipoPeca.CUECA, days * 2);
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.CALOR:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BERMUDA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.CAMISA, days);
                    item.put(TipoPeca.REGATA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.MEIA, days * 2);
                    item.put(TipoPeca.CUECA, days * 2);
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CHINELO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.BONE, (int) Math.ceil(days / 5.0));
                    break;
                case Temperatura.MUITO_CALOR:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BERMUDA, days );
                    item.put(TipoPeca.CAMISA, days);
                    item.put(TipoPeca.REGATA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.MEIA, days * 2);
                    item.put(TipoPeca.CUECA, days * 3);
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CHINELO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    item.put(TipoPeca.BONE, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    break;
            }

    return item;

    }

    public List<Peca> getRoupaIndication(Context applicationContext, int temperatureLevel, char genre) {

        List<Integer> listTipo = new ArrayList<>();
        List<Peca> listPecas = new ArrayList<>();

        Database db = new Database(applicationContext);
        try {
            db.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            listTipo = db.mClassificacaoDAO.getListPecaPorClima(temperatureLevel);

            if (listTipo != null && listTipo.size() > 0) {

                listPecas = db.mPecaDAO.getListPecas(listTipo, genre);
            }

            for ( Peca p : listPecas ) {
                Log.i("id", String.valueOf(p.getId()));
                Log.i("Loja", String.valueOf(p.getLojaId()));
                Log.i("preco", String.valueOf(p.getPreco()));
                Log.i("link", String.valueOf(p.getLink()));
                Log.i("tipo", String.valueOf(p.getTipoRoupa()));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return  listPecas;
    }
}
