public class MultipleCinco{

    public static void main(String [] args){

        int MULTIPLO = 5;
        System.out.println("Multiplos de: " + MULTIPLO);
        for(int i=0; i <= 1000; i++){
            if(i % MULTIPLO == 0)
                System.out.print(" " + i);
        }

    }

}