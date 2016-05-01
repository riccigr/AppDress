package com.example.guilherme.demoappdress.Interfaces.DAO;

import com.example.guilherme.demoappdress.POJO.Peca;

import java.util.List;

public interface IPecaDAO {

    public List<Peca> getListPecasByLoja(List<Integer> tipoPeca, char genero, int idLoja);

}
