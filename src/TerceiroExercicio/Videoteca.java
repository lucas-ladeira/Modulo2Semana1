package TerceiroExercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Videoteca {
    // ATRIBUTOS
    private static ArrayList<String> midias; // Lista de filmes/series

    // METODOS
    public Videoteca(){
        midias = new ArrayList<>();
    }

    public void adicionar(String nome){ // ADICIONAR ELEMENTO
        midias.add(nome);
    }

    public void exibir() { // EXIBIR ELEMENTOS
        if( midias.size()==0 ){
            System.out.println("\nLista vazia.");
            return;
        }
        System.out.println("\nLista de filmes e series:");
        for(int i=0; i<midias.size(); i++){
            System.out.println("[" + i + "] " + midias.get(i));
        }
    }

    public void removerItem(int indice, Scanner entrada){
        midias.remove(indice);
        System.out.println("\nItem removido.");
    }

    public int listarPedirIndice(Scanner entrada){
        int indice;

        this.exibir();
        System.out.print("\nInforme indice do item que deseja remover: ");
        try{
            indice = Integer.parseInt( entrada.nextLine() );
        } catch (Exception e){
            indice = -1;
        }
        return indice;
    }

    public void removerItemLista(Scanner entrada){
        int indice = this.listarPedirIndice(entrada);

        if(indice<0 || indice>=midias.size()){
            System.out.println("\nIndice invalido. Operacao de remocao cancelada!");
        }
        else{
            removerItem(indice, entrada);
        }
    }
}
