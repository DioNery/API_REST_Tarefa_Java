package com.example.tarefas.models;

public class Tarefa{

    private int id;
    private String descricao;
    private boolean feita;
    public Tarefa() {
    }
    public Tarefa(int id, String descricao, boolean feita) {
        this.id = id;
        this.descricao = descricao;
        this.feita = feita;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isFeita() {
        return feita;
    }
    public void setFeita(boolean feita) {
        this.feita = feita;
    }
    
}