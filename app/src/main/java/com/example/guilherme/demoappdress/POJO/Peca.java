package com.example.guilherme.demoappdress.POJO;


public class Peca {

    private String nome;
    private int lojaId;
    private int id;
    private String link;
    private Double preco;
    private int tipoRoupa;
    private char genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getTipoRoupa() {
        return tipoRoupa;
    }

    public void setTipoRoupa(int tipoRoupa) {
        this.tipoRoupa = tipoRoupa;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getLojaId() {
        return lojaId;
    }

    public void setLojaId(int lojaId) {
        this.lojaId = lojaId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }




}
