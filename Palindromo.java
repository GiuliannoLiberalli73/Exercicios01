package exercicios01;

import java.util.Scanner;

public class Palindromo {

    public static String palavra;
    public static String verifica = "";
    
    public static void teste(String palavra) {

        for (int i = 0; i < palavra.length(); i++) {
        	
        	verifica = palavra.charAt(i) + verifica;
        	
        }
         
        if (palavra.equalsIgnoreCase(verifica)) {

            System.out.println("A palavra " + palavra + " e palindromo.");

        } else {

            System.out.println("A palavra " + palavra + " nao e um palindromo.");

        }

    }

    public static void main(String[] args) {

        System.out.println("Teste se a palavra informada e um palindromo");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInforme uma palavra: ");
        String palavra = scanner.next();

        teste(palavra);

        scanner.close();

    }

}
