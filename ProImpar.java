package exercicios01;

public class ProImpar {
	
	static int comeca = 15;
	static int termina = 30;
	static float resulta;
	static int i;
	
	public static void main (String[] args) {
		
		System.out.println("Produto dos numeros impares entre 15 e 30");
		
		for (i = comeca; comeca <= termina; i++) {
			
			if (i % 2 != 0) {
				
				float resulta = i * i;
				
				System.out.println("Resultado: " + resulta);
								
			} else {
				
				comeca = i + 1;
				
			}
			
		}
		
	}

}
