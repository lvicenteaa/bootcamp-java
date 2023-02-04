public class Reto{

/*
Crea un método que reciba un número entero y regrese el factorial de este.
4 ! = 1*2*3*4
*/

/*
Crea un método que reciba un número y que regrese un ArrayList con la serie fibonacci hasta esa posición
0 1 1 2 3 5 8 13 21 34 55 89
*/
    public static int factorial(int num){
        if(num == 1 || num == 0)
            return 1;
        return num * factorial(num-1);
    }

    public static int[] fibonacci(int num){
        int[] arreglo = new int[5];
        int pos0 = 0;
        int pos1 = 1;
        int temp;
        for(int i = 0; i < num; i++){
            arreglo[i]  = pos0;
            temp = pos0;
            pos0 = pos1;
            pos1 = temp + pos1;
        }
        return arreglo;
    }

    public static void main(String[] args){
        Reto reto = new Reto();
        System.out.println(reto.factorial(5));

        int [] arreglo = reto.fibonacci(5);
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }

}