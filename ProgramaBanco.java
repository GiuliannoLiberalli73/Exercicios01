package exercicios01;

import java.util.Scanner;

public class ProgramaBanco {

	
	public String numero, tipo, primeiroTitular, segundoTitular;
	public double saldo, limiteTotal, limiteAtual;
	public double credito = 0;
	public double debito = 0;
	
	public static void aumenta (double credito) {
		
		
		
	}
	
	public static void diminui (double debito) {
		
		
		
		
	}
	
	public static void resumo (String numero, String primeiroTitular, String segundoTitular, double saldo) {
		
		System.out.println("Conta Corrente: " + numero);
		System.out.println("Primeiro Titular: " + primeiroTitular);
		System.out.println("Segundo Titular: "  + segundoTitular);
		
		if (segundoTitular.isEmpty()) {
			
			segundoTitular = "Nao Informado ou Inexistente";
			
		}
		
		
		
		System.out.println("Saldo da Conta: " + saldo);
		
			
		
	}
	
	public static void main (String [] args) {
		
		System.out.println("Conta Corrente");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o numero da conta");
		String numero = scanner.nextLine();
		System.out.println("Informe o primeiro titular: ");
		String primeiroTitular = scanner.nextLine();
		System.out.println("Informe o segundo titular (caso houver): ");
		String segundoTitular = scanner.nextLine();
		System.out.println("Qual o saldo inicial? ");
		double saldo = scanner.nextDouble();
		
		resumo(numero, primeiroTitular, segundoTitular, saldo);
		
		scanner.close();
		
		
		
	}
	
	
	
	
	
	
}
