package PrimeiroExercicio;

import java.util.ArrayList;

public class Videoteca {
    // ATRIBUTOS
    private static ArrayList<String> midias; // Lista de filmes/series

    // METODOS
    public Videoteca(){
        midias = new ArrayList<>();
    }

    public void setMidias(String nome){ // ADICIONAR ELEMENTO
        midias.add((nome));
    }

    public ArrayList<String> getMidias() { // EXIBIR ELEMENTOS
        return midias;
    }
}
