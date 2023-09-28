package exercicios01;

public class DivMultiplo3 {

    static int i = 1;
    static double resulta = 0;

    public static void main(String[] args) {

        System.out.println("Dividindo por 2 os Multiplos de 3 de 01 a 100");

        for (i = 1; i <= 100; i++) {

            if (i % 3 == 0) {

                double resulta = i / 2.00;
                System.out.println("Numero: " + i + " - Divisao por 2: " + String.format("%.2f", resulta));

            }

        }

    }

}
