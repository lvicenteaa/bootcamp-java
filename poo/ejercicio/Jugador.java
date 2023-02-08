import java.time.LocalDate;

class Jugador{

    private int numIdentificacion;
    private String nombre;
    private String apellido;
    private int numero;
    private String posicion;
    private String equipo;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private double estatura;
    private double peso;

    public Jugador(){

    }

    public Jugador(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido  = apellido;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setNumIdentificacion(int id){
        this.numIdentificacion = id;
    }

    public int getNumIdentificacion(){
        return this.numIdentificacion;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public String getPosicion(){
        return this.posicion;
    }

    public void setEquipo(String equipo){
        this.equipo = equipo;
    }

    public String getEquipo(){
        return this.equipo;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

     public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad(){
        return this.nacionalidad;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }

    public double getEstatura(){
        return this.estatura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

}