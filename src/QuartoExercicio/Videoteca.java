package QuartoExercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Videoteca {
    // ATRIBUTOS
    private static ArrayList<String> midias; // Lista de filmes/series
    private static ArrayList<String> assistidos;

    // METODOS
    public Videoteca(){
        midias = new ArrayList<>();
        assistidos = new ArrayList<>();
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

    public void removerItem(int indice){
        midias.remove(indice);
        System.out.println("\nItem removido.");
    }

    public int listarPedirIndice(Scanner entrada){
        int indice;

        this.exibir();
        System.out.print("\nInforme indice do item desejado: ");
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
            removerItem(indice);
        }
    }

    public void marcarComoAssistido(Scanner entrada){
        String nome;
        int indice = this.listarPedirIndice(entrada);
        nome = midias.get(indice);
        if(indice<0){
            System.out.println("\nIndice invalido. Operacao cancelada!");
        }
        else{
            assistidos.add(nome);
            midias.remove(indice);
        }
    }
    public void exibirAssistidos(){
        if( assistidos.size()==0 ){
            System.out.println("\nLista vazia.");
            return;
        }
        System.out.println("\nLista de filmes e series jah assistidos:");
        for(int i=0; i<assistidos.size(); i++){
            System.out.println("[" + i + "] " + assistidos.get(i));
        }
    }
}
