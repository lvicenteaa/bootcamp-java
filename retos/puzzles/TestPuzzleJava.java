import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	//..
		// Escribe tus otros casos de prueba aquí.
		//..

        // Letra aleatoria
        System.out.println(generator.getRandomLetter());

        // Contraseña generada
        System.out.println(generator.generatePassword());

        // Palabras de 8 caracteres
        int longitud = 8;
        String [][] matriz = generator.getNewPasswordSet(longitud);
        for(int i = 0; i < longitud; i++){
            for(int j = 0; j < longitud; j++){
                System.out.print(" - " + matriz[i][j]);
            }
            System.out.println();
        }

        // Reordenando arreglo
        int [] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] nuevoArreglo = generator.shuffleArray(arreglo);
        for(int i = 0; i < nuevoArreglo.length; i++){
            System.out.print(" - " + nuevoArreglo[i]);
        }

	}
}
