package SegundoExercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Videoteca lista = new Videoteca();
        Scanner entrada = new Scanner(System.in);
        String info;
        int op;

        do{
            System.out.print("\n>>>>> LISTA DE OPERACOES <<<<<\n" +
                    "1 - Listar\n" +
                    "2 - Adicionar\n" +
                    "0 - Sair\n" +
                    "Informe operacao: ");
            op = Integer.parseInt( entrada.nextLine() );
            switch (op){
                case 1:
                    lista.getMidias();
                    break;
                case 2:
                    System.out.print("\nInforme filme/serie para adicionar: ");
                    info = entrada.nextLine();
                    lista.setMidias(info);
                    break;
                case 0:
                    System.out.println("\nSelecionada Opcao Sair.");
                    break;
                default:
                    System.out.println("\nOPERACAO INVALIDA!");
                    break;
            }
        } while( op!=0 );
    }
}
