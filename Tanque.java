package exercicios01;

import java.util.Scanner;

public class Tanque {

    static int quilom, quilomTot, gasol, gasolTot, tot, tanques;
    static float cons, consTot;
   

    public static void main(String[] args) {

        tot = 0;

        System.out.println("Calculo Medio de Quilometragem e Consumo");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQuantos tanques serao analisados? ");
        int tanques = scanner.nextInt();

        while (tot < tanques) {

            System.out.println("\nInforme os quilometros rodados: ");
            int quilom = scanner.nextInt();
            System.out.println("Informe a quantidade consumida: ");
            int gasol = scanner.nextInt();

            tot = tot + 1;

            float cons = (float) (quilom / ((gasol * 100.00) / 100.00));
            System.out.println(
                    "O veiculo " + tot + " rodou " + quilom + "Km usando " + gasol + " litros gerando um consumo de "
                            + String.format("%.2f", cons) + " Km/l.");

            quilomTot = quilomTot + quilom;
            gasolTot = gasolTot + gasol;
            consTot = consTot + cons;

            if (tot > tanques) {
                scanner.close();
            }

        }

        System.out.println(
                "\nOs veiculos rodaram " + quilomTot + "Km usando " + gasolTot + " litros gerando um consumo de "
                        + String.format("%.2f", consTot) + " Km/l.");

    }

}
