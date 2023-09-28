package exercicios01;

import java.util.Scanner;

public class PrimoMenor {
	
	static int numPrim;
	static int calcPrim;
	static int vlr = 0;
	static int a;
	static int b;
	
	
	public static void primos (int numPrim) {
		
		for (a = 1; a <= numPrim; a++) {
			
				if ((a % 1 != 0) && (a % 2 != 0)) {
					System.out.println("O numero " + a + " e primo.");
				} 

		}
	
	}
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o numero: ");
		
		int numPrim = scanner.nextInt();
		
		primos(numPrim);
		
		System.out.println(numPrim);
		
		scanner.close();
		
		
	}
	
	
	
	
	
	
	

}
