package exercicios01;

import java.util.Scanner;

public class Circulo {

    static int raio;
    static double area;

    public static void calculo(int raio) {

        double area = 3.14 * (raio * raio);

        System.out.println("A area do circulo cujo raio e de " + raio + " vale " + Math.round(area));

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de Area de um Circulo");
        System.out.println("Informe o valor do raio: ");
        int raio = scanner.nextInt();

        calculo(raio);

        scanner.close();

    }

}
