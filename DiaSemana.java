package exercicios01;

import java.util.Scanner;

public class DiaSemana {
	
	static int dia;
	static String s;
	
	public static void diasemana (int dia) {
		
		String[] s = {"","Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
		
		System.out.println("O dia escolhido foi " + s[dia]);
			
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um numero de 1 a 7");
		int dia = scanner.nextInt();
		
		diasemana(dia);
		
		scanner.close();
		
	}

}
