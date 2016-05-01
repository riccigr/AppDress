package com.example.guilherme.demoappdress.DAO;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import android.util.Log;

import com.example.guilherme.demoappdress.Interfaces.DAO.IPecaDAO;
import com.example.guilherme.demoappdress.Interfaces.Schema.IPecaSchema;
import com.example.guilherme.demoappdress.POJO.Peca;
import com.example.guilherme.demoappdress.Provider.DbContentProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PecaDAO extends DbContentProvider implements IPecaDAO, IPecaSchema {

    public PecaDAO(SQLiteDatabase db){
        super(db);
    }

    @Override
    public List<Peca> getListPecasByLoja(List<Integer> listTipoPeca, char genero, int idLoja) {

        String sqlQuestionMark = " ";
        List<Peca> listPeca = new ArrayList<>();
        HashMap<Integer, List<Peca>> mapPeca = new HashMap<>();
        int currentLoja = -1;

        for (int i = 0; i <  listTipoPeca.size(); i++) {
            if (i < listTipoPeca.size() -1 ){
                sqlQuestionMark += " ? ,";
            }else{
                sqlQuestionMark += " ? ";
            }

        }

        final String columnsArgs[] = PECA_COLUMNS;
        final String selection =  COLUMN_TIPO_PECA + " IN ( " + sqlQuestionMark + " ) AND " + COLUMN_GENERO + " IN (?,?)  AND " + COLUMN_LOJA_ID + " = ?";
        final String selectionArgs[] =  new String[listTipoPeca.size() + 3];
        final String orderBy = COLUMN_LOJA_ID;

        for (int cont = 0; cont < listTipoPeca.size(); cont++){
            selectionArgs[cont] = String.valueOf(listTipoPeca.get(cont));
        }

        selectionArgs[listTipoPeca.size()] = String.valueOf(genero).toUpperCase();
        selectionArgs[listTipoPeca.size() +1 ] =  String.valueOf('U');
        selectionArgs[listTipoPeca.size() +2 ] =  String.valueOf(idLoja);

        try{
            Cursor c = mDb.query(false, PECA_TABLE, columnsArgs , selection, selectionArgs, null, null, orderBy, null );
            int idPecaIndex = c.getColumnIndex("id");
            int idLojaIndex = c.getColumnIndex("loja_id");
            int precoIndex = c.getColumnIndex("preco");
            int linkIndex = c.getColumnIndex("link");

            if(c.getCount() > 0){

                for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {

                    Peca p = new Peca();
                    p.setGenero(genero);
                    p.setLink(c.getString(linkIndex));
                    p.setLojaId(c.getInt(idLojaIndex));
                    p.setPreco(c.getDouble(precoIndex));
                    p.setId(c.getInt(idPecaIndex));

                    listPeca.add(p);
                }
            }
            c.close();

        }catch (Exception e){
            Log.e("ERRO>>>", "getListPecasByLoja: " + e.getMessage());
            throw new SQLiteDatabaseCorruptException();
        }

        return listPeca;
    }
}
