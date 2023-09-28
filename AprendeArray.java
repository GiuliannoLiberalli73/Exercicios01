package exerciciosZero.exerciciosZero;

public class AprendeArray {
    
    public static void main (String[] args){

        int[] umAteCinco = new int[15];
            /**umAteCinco[0]=1;
            umAteCinco[1]=2;
            umAteCinco[2]=3;
            umAteCinco[3]=4;
            umAteCinco[4]=5;*/
            for (int i=0;i<umAteCinco.length;i++) {
                //int a = 0;
                umAteCinco[i] = i * 2;
                System.out.println("No Array " + i + " o valor e de "  + umAteCinco[i]);
            }

    }


}
