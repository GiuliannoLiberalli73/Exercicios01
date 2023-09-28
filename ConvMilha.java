package exercicios01;

import java.util.Scanner;

public class ConvMilha {
	
	static double dist;
	static double vlr;
	
	public static void milha (double dist) {
		
		vlr = dist * 1.609;
		
		System.out.println("A distancia de " + dist + " milhas e igual a " + vlr + " quilometros.");
		
	}
	
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nInforme a distancia para converter");
		System.out.println("Milhas: ");
		double dist = scanner.nextDouble();
		
		milha(dist);
		
		scanner.close();
		
	}

}
