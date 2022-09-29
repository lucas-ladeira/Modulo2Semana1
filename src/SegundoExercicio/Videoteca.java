package SegundoExercicio;

import java.util.ArrayList;

public class Videoteca {
    // ATRIBUTOS
    private static ArrayList<String> midias; // Lista de filmes/series

    // METODOS
    public Videoteca(){
        midias = new ArrayList<>();
    }

    public void setMidias(String nome){ // ADICIONAR ELEMENTO
        midias.add(nome);
    }

    public void getMidias() { // EXIBIR ELEMENTOS
        if( midias.size()==0 ){
            System.out.println("\nLista vazia.");
            return;
        }
        System.out.println("\nLista de filmes e series:");
        for(int i=0; i<midias.size(); i++){
            System.out.println("[" + i + "] " + midias.get(i));
        }
    }
}
