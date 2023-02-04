import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        
    /* 
      Necesitarás agregar 1 línea a este archivo para crear una instancia
      de la clase CafeUtil.
      Sugerencia: deberás corresponder con el nombre de la variable que se usa a continuación.
    */

        CafeUtil appTest = new CafeUtil();
    	
        /* ============ Casos de prueba de la App ============= */
          
        System.out.println("\n----- Prueba Meta café -----");
        System.out.printf("Compras necesarias para la semana 10: %s \n\n", appTest.getStreakGoal());
    
        System.out.println("----- Prueba Total Orden -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Total orden: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Prueba Mostrar Menú-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("café de goteo");
        menu.add("capuchino");
        menu.add("latte");
        menu.add("moka");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Prueba acgregar cliente-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Probar 4 veces ---
        for (int i = 0; i < 4; i++) {
           appTest.addCustomer(customers);
           System.out.println("\n");
        }

        // Pruebas nuevos metodos
        appTest.printPriceChart("Jabon", 5000, 5);
        appTest.printPriceChart("Café Colombiano", 12000, 3);
        

        
        // Lista de menu;
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Café de goteo");
        menuItems.add("Capuchino");
        menuItems.add("Latte");
        menuItems.add("Moka");

        // Lista de precios;
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(1.200d);
        prices.add(3.200d);
        prices.add(3.600d);
        prices.add(3.200d);

        appTest.displayMenu(menuItems, prices);
        

        appTest.addCustomers();

    }
}
