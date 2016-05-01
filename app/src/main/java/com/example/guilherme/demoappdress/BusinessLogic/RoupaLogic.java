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

        if(genre == 'M') {
            switch (temperatureLevel) {
                case Temperatura.MUITO_FRIO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CALCA_TERMICA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.CAMISA_LONGA, Math.min(days,10 ));
                    item.put(TipoPeca.CAMISA_TERMICA, Math.min(days,10 ));
                    item.put(TipoPeca.CASACO, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BLUSA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.MEIA_LA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.BOTA, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.GORRO, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.LUVA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CACHECOL, (int) Math.ceil(days / 4.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.FRIO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CAMISA_LONGA, Math.min(days,10 ));
                    item.put(TipoPeca.CASACO_PESADO, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BLUSA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.MEIA_LA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.GORRO, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.LUVA, (int) Math.ceil(days / 4.0));
                    item.put(TipoPeca.CACHECOL, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.AMENO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CAMISA, Math.min(days,10 ));
                    item.put(TipoPeca.MEIA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.CALOR:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BERMUDA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.CAMISA, Math.min(days,10 ));
                    item.put(TipoPeca.REGATA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.MEIA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CHINELO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.BONE, (int) Math.ceil(days / 5.0));
                    break;
                case Temperatura.MUITO_CALOR:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BERMUDA, Math.min(days,10 ));
                    item.put(TipoPeca.CAMISA, Math.min(days,10 ));
                    item.put(TipoPeca.REGATA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.MEIA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 3,10 ));
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CHINELO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    item.put(TipoPeca.BONE, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    break;
            }
        }else{
            switch (temperatureLevel) {
                case Temperatura.MUITO_FRIO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CALCA_TERMICA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.CAMISA_LONGA, Math.min(days,10 ));
                    item.put(TipoPeca.CAMISA_TERMICA, Math.min(days,10 ));
                    item.put(TipoPeca.CASACO, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BLUSA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.MEIA_LA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.BOTA, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.GORRO, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.LUVA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CACHECOL, (int) Math.ceil(days / 4.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.FRIO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CAMISA_LONGA, Math.min(days,10 ));
                    item.put(TipoPeca.CASACO_PESADO, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.BLUSA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.MEIA_LA, Math.min(Math.min(days * 2,10 ),10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.GORRO, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.LUVA, (int) Math.ceil(days / 4.0));
                    item.put(TipoPeca.CACHECOL, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.AMENO:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 3.0));
                    item.put(TipoPeca.CAMISA, Math.min(days ,10 ));
                    item.put(TipoPeca.MEIA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    break;
                case Temperatura.CALOR:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.SAIA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.CAMISA, Math.min(days ,10 ));
                    item.put(TipoPeca.REGATA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.MEIA, Math.min(days * 2, 10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 2, 10 ));
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.SANDALIA, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.CHAPEU, (int) Math.ceil(days / 5.0));
                    break;
                case Temperatura.MUITO_CALOR:
                    item.put(TipoPeca.CALCA, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.SAIA, Math.min(days ,10 ));
                    item.put(TipoPeca.CAMISA, Math.min(days ,10 ));
                    item.put(TipoPeca.REGATA, (int) Math.ceil(days / 2.0));
                    item.put(TipoPeca.MEIA, Math.min(days * 2,10 ));
                    item.put(TipoPeca.CUECA, Math.min(days * 3,10 ));
                    item.put(TipoPeca.TENIS, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.SANDALIA, (int) Math.ceil(days / 10.0));
                    item.put(TipoPeca.OCULOS, 1);
                    item.put(TipoPeca.CHAPEU, (int) Math.ceil(days / 5.0));
                    item.put(TipoPeca.CINTO, (int) Math.ceil(days / 10.0));
                    break;
            }
        }

    return item;

    }

    public HashMap<Integer, List<Peca>> getRoupaIndication(Context applicationContext, int temperatureLevel, char genre) {

        List<Integer> listTipo = new ArrayList<>();
        List<Peca> listPecas = new ArrayList<>();
        List<Integer> listLoja = new ArrayList<>();
        HashMap<Integer, List<Peca>> mapPeca = new HashMap<>();

        Database db = new Database(applicationContext);
        try {
            db.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            listTipo = db.mClassificacaoDAO.getListPecaPorClima(temperatureLevel);
            listLoja = db.mLojaDAO.getAll();

            if (listTipo != null && listTipo.size() > 0 && listLoja != null && listLoja.size() > 0) {
                for (Integer idLoja : listLoja ) {
                    Log.e("getRoupaIndication: ", "ID Loja: " + String.valueOf(idLoja));
                    listPecas = db.mPecaDAO.getListPecasByLoja(listTipo, genre, idLoja);
                    mapPeca.put(idLoja,listPecas);
                }
            }else{
                Log.e("Erro: ", "Lista tipo ou loja vazia");
            }

//            for ( Peca p : listPecas ) {
//                Log.i("id", String.valueOf(p.getId()));
//                Log.i("Loja", String.valueOf(p.getLojaId()));
//                Log.i("preco", String.valueOf(p.getPreco()));
//                Log.i("link", String.valueOf(p.getLink()));
//                Log.i("tipo", String.valueOf(p.getTipoRoupa()));
//            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return  mapPeca;
    }


}
