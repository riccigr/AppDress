package com.example.guilherme.demoappdress.Interfaces.DAO;

import java.util.List;

/**
 * Created by Guilherme on 24/04/2016.
 */
public interface IClassificacaoPecaDAO {

    public List<Integer> getListPecaPorClima(int temperatureLevel);
}
