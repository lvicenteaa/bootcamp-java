class Articulo{

    private int id;
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Articulo(int id,String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getId(){
        return this.id;
    }

}