package exercicios01;

import java.util.Scanner;

public class Alfabetica {

    public static String pal01;
    public static String pal02;
    public static int tam01;
    public static int tam02;

    public static void ordena(String pal01, String pal02) {

        if (pal01.compareTo(pal02) < 0) {

            System.out.println("Em ordem: " + pal01 + " - " + pal02);

        } else if (pal01.compareTo(pal02) > 0) {

            System.out.println("Em ordem: " + pal02 + " - " + pal01);

        } else if (pal01.compareTo(pal02) == 0) {

            System.out.println("As palavras são iguais.");

        }

        tam01 = pal01.length();
        tam02 = pal02.length();

        if (tam01 > tam02) {

            System.out.println("A palavra com maior numero de caracteres e " + pal01);

        } else if (tam01 < tam02) {

            System.out.println("A palavra com maior numero de caracteres e " + pal02);

        } else {

            System.out.println("As duas palavras tem o mesmo numero de caracteres.");

        }

       
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nOrdenando as palavras");
        System.out.println("Informe a primeira: ");
        String pal01 = scanner.next();
        System.out.println("Informe a segunda:");
        String pal02 = scanner.next();

        ordena(pal01, pal02);

        scanner.close();

    }

}
