import java.util.ArrayList;
import java.text.NumberFormat;

class PedidoKiosko{

    private ArrayList<Articulo> menu;
    private ArrayList<Pedido> pedidos;

    public PedidoKiosko(){
        this.menu = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void addMenuItem(String nombre, double precio){
        this.menu.add(new Articulo(menu.size(),nombre, precio));
    }

    public void displayMenu(){
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        for(Articulo art: menu){
            System.out.println( (art.getId()+1)+" "+art.getNombre() + " -- " +formatoImporte.format(art.getPrecio()));
        }
    }

    public void newOrder() {
        
    	// Mostrar al usuario un aviso de mensaje y luego establece su entrada en una variable, nombre
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();
    
    	// Tu código:
        // Crea un nuevo pedido con la cadena de entrada dada
        Pedido pedido = new Pedido(name);
        // Muestra el menú al usuario, para que puedan elegir artículos para agregar
        this.displayMenu();
    	// Pedir al usuario que ingrese un número de artículo
        System.out.println("Ingrese un índice de artículo del menú o q para salir:");
        name = System.console().readLine();
        
        // Escribir un bucle while para recopilar todos los artículos del pedido del usuario
        while(!name.equals("q")) {
            pedido.addArticulo(this.menu.get(Integer.parseInt(name)-1));
            // Obtén el objeto del artículo del menú y agrega el artículo al pedido
            System.out.println("Articulo añadido");
            // Pídales que ingresen un nuevo índice de artículo o q nuevamente, y toma su entrada
            this.displayMenu();
            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            name = System.console().readLine();
        }
        // Después de haber completado su pedido, imprime los detalles del pedido 
    	// como el ejemplo de abajo. Puedes utilizar el método de visualización del pedido
        pedido.display();
        this.pedidos.add(pedido);
        System.out.println("Termino de añadir pedido");
        
    }


    public void addMenuItemByInput(){
        System.out.println("Ingrese el nombre del Artículo para el menú:");
        String name = System.console().readLine();

        System.out.println("Ingrese el precio del Artículo para el menú:");
        double precio = Double.parseDouble(System.console().readLine());

        this.addMenuItem(name, precio);    
        System.out.println("Artículo añadido al menu!");

        System.out.println("Ingrese el nombre del Artículo para el menú: o q para salir:");
        name = System.console().readLine();
        
        while(!name.equals("q")) {
            System.out.println("Ingrese el precio del Artículo para el menú:");
            precio = Double.parseDouble(System.console().readLine());

            this.addMenuItem(name, precio);    
            System.out.println("Artículo añadido al menu!");



            System.out.println("Ingrese el nombre del Artículo para el menú: o q para salir:");
            name = System.console().readLine();
        }

        this.displayMenu();
        System.out.println("Termino de añadir menu");
    }

}