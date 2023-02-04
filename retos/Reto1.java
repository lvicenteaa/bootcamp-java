public class Reto1{

    public int numMayor(int[] arreglo){
        int numMayor = arreglo[0];

        for(int i=1; i< arreglo.length; i++){
            if(arreglo[i] > numMayor)
                numMayor = arreglo[i];
        }

        return numMayor;
    }

    public int sumatorio(int[] arreglo){
        int sumatoria = 0;
        for(int i=0; i< arreglo.length; i++){
            sumatoria += arreglo[i];
        }
        return sumatoria;
    }

    public static void main(String [] args){

        int[] arreglo = {, 15,14 ,7489, 45,57, 875,64 54,5 ,-2, 584, 5, 54, -45, -12,, -554, 5648};

        System.out.println(Reto1.numMayor(arreglo));
        System.out.println(Reto1.sumatorio(arreglo));
    }

}