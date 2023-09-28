package exercicios01;

import java.util.Scanner;

public class NumPrimo {

    static public int vlrVerif;
    static public int vlr;

    public static void primos(int vlrVerif) {

        for (vlr = 1; vlr <= vlrVerif; vlr++) {

            int verifica = 0;

            for (int i = 1; i <= vlr; i++) {

                if (vlr % i == 0)
                    
                verifica++;
            }
            if (verifica == 2) {
                System.out.println("Primo menor do que " + vlrVerif + " : " + vlr);
            }

            verifica = 0;

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primos Menores");
        System.out.println("\nInforme o numero para verificar");
        int vlrVerif = scanner.nextInt();

        primos(vlrVerif);

        scanner.close();
    

    }

}
