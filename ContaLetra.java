package exercicios01;

import java.util.Scanner;

public class ContaLetra {

    public static String frase;
    static int vogal = 0;
    static int cons = 0;
    static int espaco = 0;
    static int i = 0;

    public static void conta(String frase) {

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O'
                    || frase.charAt(i) == 'U') {

                vogal += 1;

                    } else if (frase.charAt(i) == ' '){

                    espaco++;

                }

            }

        
        int contVogal = frase.length();

        int cons = contVogal - (vogal + espaco);

        System.out.println("A frase '" + frase + "' tem " + vogal + " vogais, " + cons + " consoantes e " + espaco
                + " espacos vazios.");

    }

    public static void main(String[] args) {

        System.out.println("Contagem de Letras");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = scanner.nextLine();

        conta(frase);
        scanner.close();

    }

}
