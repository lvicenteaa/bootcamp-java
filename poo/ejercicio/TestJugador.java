class TestJugador{

    public static void main(String [] args){

        Jugador jugador = new Jugador();
        jugador.setNombre("James");
        jugador.setApellido("Rodriguez");
        System.out.println("Jugador: " + jugador.getNombre() + " " + jugador.getApellido());

        Jugador jugador1 = new Jugador("Cristiano", "Ronaldo");
        System.out.println("Jugador: "+ jugador1.getNombre() + " " + jugador1.getApellido());



    }
}