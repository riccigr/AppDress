package com.example.guilherme.demoappdress.Interfaces.DAO;

import com.example.guilherme.demoappdress.POJO.Peca;

import java.util.List;

public interface IPecaDAO {

    public List<Peca> getListPecas(List<Integer> tipoPeca, char genero);

}
