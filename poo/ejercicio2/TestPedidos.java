import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args) {
    
        // Elementos del menú
        Articulo articulo1 = new Articulo();
        articulo1.nombre = "moka";
        articulo1.precio = 1200;
        
        Articulo articulo2 = new Articulo();
        articulo2.nombre = "latte";
        articulo2.precio = 1300;
        
        Articulo articulo3 = new Articulo();
        articulo3.nombre = "cafe de goteo";
        articulo3.precio = 1400;
        
        Articulo articulo4 = new Articulo();
        articulo4.nombre = "capuchino";
        articulo4.precio = 1500;
        
        //Ordenar variables -- orden1, orden2, etc.
        
        Pedido pedido1 = new Pedido();
        pedido1.nombre = "Cindhuri";

        Pedido pedido2 = new Pedido();
        pedido2.nombre = "Jimmy";

        Pedido pedido3 = new Pedido();
        pedido3.nombre = "Noah";

        Pedido pedido4 = new Pedido();
        pedido4.nombre = "Sam";


        // Simulaciones de aplicaciones
        // Imprime la variable pedido1, muestra una direccion de memoria
        System.out.println(pedido1);

        // Imprimiendo pedido1.total = 0, porque no tiene articulos
        System.out.printf("Total: %s\n", pedido1.total);

        // Agregar articulo1 a las lista de articulos del pedido2
        pedido2.items.add(articulo1);
        pedido2.total += articulo1.precio;
        System.out.printf("Nombre: %s\n", pedido2.nombre);
        System.out.printf("Total: %s\n", pedido2.total);


        // Pedido 3 pidio un capuchino
        pedido3.items.add(articulo4);
        pedido3.total += articulo4.precio;
        System.out.printf("Nombre: %s\n", pedido3.nombre);
        System.out.printf("Total: %s\n", pedido3.total);

        
        // Pedido4 agrego un latte
        pedido4.items.add(articulo2);
        pedido4.total += articulo4.precio;
        System.out.printf("Nombre: %s\n", pedido4.nombre);
        System.out.printf("Total: %s\n", pedido4.total);


        // Pedido de cindhuri esta listo
        pedido1.listo = true;
        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.listo);


        // Sam pidió 2 lattes
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;
        System.out.printf("Nombre: %s\n", pedido4.nombre);
        System.out.printf("Total: %s\n", pedido4.total);


        // El pedidio de Jimmy esta listo
        pedido2.listo = true;
        System.out.printf("Nombre: %s\n", pedido2.nombre);
        System.out.printf("Listo: %s\n", pedido2.listo);


        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        /*
        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);
        */
    }
}
