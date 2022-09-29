package QuartoExercicio;

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
                    "3 - Remover\n" +
                    "4 - Marcar como assistido\n" +
                    "5 - Listar assistidos\n" +
                    "0 - Sair\n" +
                    "Informe operacao: ");
            try{
                op = Integer.parseInt( entrada.nextLine() );
            } catch(Exception e){
                op = -1;
            }

            switch (op){
                case 1: // EXIBIR LISTA
                    lista.exibir();
                    break;
                case 2: // ADICIONAR ELEMENTO NA LISTA
                    System.out.print("\nInforme filme/serie para adicionar: ");
                    info = entrada.nextLine();
                    lista.adicionar(info);
                    break;
                case 3: // REMOVER ELEMENTO DA LISTA
                    lista.removerItemLista(entrada);
                    break;
                case 4: // MARCAR COMO ASSISTIDO
                    lista.marcarComoAssistido(entrada);
                    break;
                case 5: // EXIBIR ASSISTIDOS
                    lista.exibirAssistidos();
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
