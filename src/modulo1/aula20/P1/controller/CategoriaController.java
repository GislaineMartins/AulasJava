package modulo1.aula20.P1.controller;

import modulo1.aula20.P1.model.Categoria;

import java.util.ArrayList;

public class CategoriaController {
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();

    public void salvar(Categoria c){
        categorias.add(c);
    }

    public ArrayList<Categoria> listar(){
        return categorias;
    }
}
