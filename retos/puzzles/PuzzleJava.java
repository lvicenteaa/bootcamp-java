import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{

    Random aleatorio = new Random(); 

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            arreglo.add(aleatorio.nextInt(21));
        }
        return arreglo;
    }

    public char getRandomLetter(){

        char [] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' ,'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int numAleatorio = aleatorio.nextInt(26);

        return alfabeto[numAleatorio];  
    }

    public String generatePassword(){
        char [] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' ,'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '?', '¡', '{', ']'};
        String contrasena = "";
        for(int i=0; i<8; i++){
            int numAleatorio = aleatorio.nextInt(40);
            contrasena += alfabeto[numAleatorio]; 
        }
        return contrasena;
    }

    public String[][] getNewPasswordSet(int longitud){
        String [][] palabras = new String[longitud][longitud];

        for(int i = 0; i < longitud; i++){
            for(int j = 0; j < longitud; j++){
                palabras[i][j] = generatePassword();
            }
        }
        return palabras;
    }

    public int[] shuffleArray(int [] arreglo){
        int [] nuevoArreglo = arreglo;

        for(int i = 0; i < arreglo.length; i++){
            int aux = nuevoArreglo[i];
            int ale = aleatorio.nextInt(arreglo.length);
            nuevoArreglo[i] = arreglo[ale];
            nuevoArreglo[ale] = aux;
        }

        return nuevoArreglo;
    }


}