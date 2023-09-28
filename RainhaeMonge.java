package exercicios01;

public class RainhaeMonge {
	
	
	
	public static void main(String[] args) {
		
        long[][] tabuleiro = new long[8][8];
        int quadradoOverflowInt = 0;  // Para rastrear em que quadrado ocorre o overflow para int
        long quadradoOverflowLong = 0;  // Para rastrear em que quadrado ocorre o overflow para long

        int maxInt = Integer.MAX_VALUE;  // Máximo valor para um int
        long maxLong = Long.MAX_VALUE;   // Máximo valor para um long

        long numeroDeGraos = 1;  // começando com 1 grão no primeiro quadrado

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = numeroDeGraos;

                if (numeroDeGraos > maxInt && quadradoOverflowInt == 0) {
                    quadradoOverflowInt = i * 8 + j + 1;
                }
                if (numeroDeGraos < 0) {  // Detectar overflow para long (irá ficar negativo)
                    quadradoOverflowLong = i * 8 + j + 1;
                    break;
                }
                numeroDeGraos *= 2;  // Dobrando o número de grãos para a próxima posição
            }
        }

        System.out.println("Overflow para int ocorre no quadrado: " + quadradoOverflowInt);
        System.out.println("Overflow para long ocorre no quadrado: " + quadradoOverflowLong);
        System.out.println(maxLong);
    }

}
