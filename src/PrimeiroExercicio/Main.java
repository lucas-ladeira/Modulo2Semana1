package PrimeiroExercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Videoteca lista = new Videoteca();
        Scanner entrada = new Scanner(System.in);
        String info;

        do{
            System.out.print("Informe filme/serie: ");
            info = entrada.nextLine();
            if( !info.equals("0") ){
                lista.setMidias(info);
            }
        } while( !info.equals("0") );

        System.out.println("\nFilmes e series:\n" + lista.getMidias());
    }
}
