class TestCar {

    public static void main(String [] args){
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Honda";
        client1Car.model = "Civic";
        client1Car.color = "blanco";
    
        // Crear otro auto nuevo, y asignarle algunos valores
        Car client2Car = new Car();
        client2Car.year = 2018;
        client2Car.make = "Mazda";
        client2Car.model = "CX-3";
        client2Car.color = "azul marino";
    
        // Ahora tienen sus propios datos individuales almacenados juntos
        System.out.println("Marca auto 1: " + client1Car.make);
        System.out.println("Modelo auto 1: " + client1Car.model);
    
    	System.out.println("Marca auto 2: " + client2Car.make);
        System.out.println("Modelo auto 2: " + client2Car.model);
    }

}