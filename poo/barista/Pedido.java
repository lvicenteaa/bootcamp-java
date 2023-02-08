import java.util.ArrayList;

class Pedido{

    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> articulos;

    public Pedido(){
        this.nombre = "Invitado";
        this.articulos = new ArrayList<>();
    }

    public Pedido(String nombre){
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setListo(boolean listo){
        this.listo = listo;
    }

    public boolean isListo(){
        return this.listo;
    }

    public void setArticulos(ArrayList<Articulo> articulos){
        this.articulos = articulos;
    }

    public ArrayList<Articulo> getArticulos(){
        return this.articulos;
    }
    
    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public String getStatusMessage(){
        if(this.listo)
            return "Tu pedido está listo.";
        
        return "Gracias por esperar. Tu pedido estará listo pronto.";
    }

    public void display(){
        System.out.printf("Nombre Cliente: %s\n", this.nombre);
        for(Articulo art: this.articulos){
            System.out.println(art.getNombre() +": " + art.getPrecio());
        }
        System.out.printf("Total: %s\n", this.getOrderTotal());
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(Articulo art: this.articulos){
            total += art.getPrecio();
        }
        return total;
    }

}