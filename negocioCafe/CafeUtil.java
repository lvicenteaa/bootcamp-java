import java.util.ArrayList;
import java.text.NumberFormat;

public class CafeUtil{

    NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();


    public int getStreakGoal(){
        int suma = 0;
        for(int i = 1; i <= 10; i++){
            suma += i;
        }
        return suma;
    }

    public int getStreakGoal(int numWeeks){
        int suma = 0;
        for(int i = 1; i <= numWeeks; i++){
            suma += i;
        }
        return suma;
    }

    public double getOrderTotal(double[] prices){
        double suma = 0.0;
        for(int i=0; i<prices.length; i++){
            suma += prices[i];
        }
        return suma;
    }

    public void displayMenu(ArrayList<String> menuItems){
        System.out.println("");
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
        System.out.println("");
    }

    public void addCustomer(ArrayList<String> customers){
        String msgNombre = "Por favor, ingresa tu nombre: ";
        System.out.println(msgNombre);
        String userName = System.console().readLine();
        System.out.println(String.format("Hola, %s!", userName));
        System.out.println(String.format("Hay %d personas frente a ti", customers.size()));
        customers.add(userName);
        for(String customer: customers){
            System.out.print(customer + " ");
        }
        System.out.println("");
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        double sum = 0.0;
        for(int i=1; i <= maxQuantity; i++){
            sum += price;
            if (i != 1)
                sum -= 400;
            System.out.println(i+" "+ formatoImporte.format(sum));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size())
            return false;

        int tamanio = menuItems.size();

        for(int i = 0; i < tamanio; i++){
            System.out.println( i+" "+ menuItems.get(i) + " -- "+ formatoImporte.format(prices.get(i)));
        }
        return true;
    }

    public void addCustomers(){
        ArrayList<String> clientes = new ArrayList<String>();
        String msg = "Desea agregar un nuevo cliente: \n 1: Si \n q: Salir";
        String opcion = "0";
        do{
            
            addCustomer(clientes);
            
            System.out.println(msg);
            opcion = System.console().readLine();
        }while(opcion.equals("1"));

    }

}