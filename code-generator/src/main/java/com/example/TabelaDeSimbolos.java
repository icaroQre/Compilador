package com.example;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum TipoOswaldo {
        INTEIRO,
        REAL,
        STRING,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoOswaldo tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoOswaldo tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoOswaldo tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoOswaldo verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}