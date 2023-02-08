import java.util.HashMap;
import java.util.Set;


public class Main{

    public static void main(String[] args){
        // Creación
        HashMap<String, String> userMap = new HashMap<String, String>();
        // Almacenar datos clave-valor
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("deft@codingdojo.com", "Hyuk Kyu");



        // Obtener datos del HashMap
        String name = userMap.get("nninja@codingdojo.com");
        System.out.println(name);

        // Recorriendo un HashMap
        Set<String> keys = userMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }

}