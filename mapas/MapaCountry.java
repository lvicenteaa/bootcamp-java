import java.util.HashMap;
import java.util.Set;

public class MapaCountry {
    public static void main(String[] args){
        HashMap<String, String> countryCapitals = new HashMap<String, String>();

        // Add five countries and capitals to the 'countryCapitals' map
        // Print all keys from the map
        // Print two countries and their capitals ('The capital of Oman is Muscat.')
        countryCapitals.put("Alemania", "Berlin");
        countryCapitals.put("Francia", "Paris");
        countryCapitals.put("España", "Madrid");
        countryCapitals.put("Inglaterra", "Londres");
        countryCapitals.put("Colombia", "Bogota");

        Set<String> keys = countryCapitals.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        for(String key : keys){
            System.out.println("The capital of "+ key+ " is "+ countryCapitals.get(key));
        }

    }
}