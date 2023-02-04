public class Impares{


    public static void main(String args[]){

        int sumatoria = 0;

        for(int i = 0; i <= 500000; i++){
            if(i % 2 == 0)
                sumatoria += i;
        }
        System.out.println("La suma de numeros impares hasta el 500000 es: " + sumatoria)

    }

}