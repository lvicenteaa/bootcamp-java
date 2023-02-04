public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.8;
        double precioFiltro = 8; 
        double precioLeche = 5.00;
        double precioCapuchino = 10.00;

        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = true;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = true;
        boolean estaListoOrden4 = true;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
    
        if (estaListoOrden1)
            System.out.println("Cafe de " + cliente1 + " " + mensajeListo);
        else
            System.out.println("Cafe de " + cliente1 + " " + mensajePendiente);


        System.out.println(saludoGeneral + cliente4);
        if(estaListoOrden4){
            System.out.println("Cafe de " + cliente4 + " "+ mensajeListo);
            System.out.println(mensajeMostrarTotal +(precioCapuchino * 2));
        }else
            System.out.println("Cafe de " + cliente4 + " " + mensajePendiente);
        

        System.out.println(saludoGeneral + cliente2);
        if(estaListoOrden2){
            System.out.println("Cafe de " + cliente2 + " "+ mensajeListo);
            System.out.println(mensajeMostrarTotal +(precioLeche * 2));
        }else
            System.out.println("Cafe de " + cliente2 + " " + mensajePendiente);
        

        estaListoOrden2 = !estaListoOrden2;

        if(estaListoOrden2){
            System.out.println("Cafe de " + cliente2 + " "+ mensajeListo);
            System.out.println(mensajeMostrarTotal +(precioLeche * 2));
        }else
            System.out.println("Cafe de " + cliente2 + " " + mensajePendiente);
                
        System.out.println(saludoGeneral + cliente3);
        System.out.println(cliente3 + ", " + mensajeMostrarTotal + (precioMocha - precioLeche));



    }
}
