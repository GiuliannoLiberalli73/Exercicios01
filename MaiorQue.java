package exercicios01;

import java.util.Scanner;

public class MaiorQue {
	
	static int num01;
	static int num02;
	
	public static void maior (int num01, int num02) {
		
		if (num01 > num02) {
			System.out.println("O maior numero e " + num01);
		} else {
			System.out.println("O maior numero e " + num02);
		}
		
	}
	
	public static void main (String [] args) {
		
		System.out.println("\nQual e o maior numero");
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o primeiro numero: ");
		int num01 = scanner.nextInt();
		System.out.println("Informe o segundo numero: ");
		int num02 = scanner.nextInt();
		
		maior(num01, num02);
		
		scanner.close();
		
	}
	

}
