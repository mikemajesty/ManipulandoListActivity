package com.example.mike.trabalhomarcelolistactivity;

import android.graphics.Color;

/**
 * Created by mike on 06/11/15.
 */
public class Cores {
    private String nome;
    private int cor;

    public Cores(String nome, int cor) {
        this.nome = nome;
        this.cor = cor;
    }
    public Cores() {
    }
    public String getNome()
    {
        return  nome;
    }
    public  void  SetNome(String nome){
        this.nome = nome;
    }
    public  int getCor(){
        return  cor;
    }
    public void setCor(int cor){
        this.cor = cor;
    }
}
