class TestCuentaBancaria{

    public static void main(String[] args){
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();

        cuenta1.agregarDinero("Ahorros", 1200);
        cuenta1.retirarDinero("Corriente", 500);

        cuenta1.verDineroTotal();

        System.out.println(CuentaBancaria.getCantidadCuentas());
        System.out.println(CuentaBancaria.getCantidadTotalDinero());

        cuenta2.agregarDinero("Ahorros", 1900);
        cuenta2.agregarDinero("Corriente", 5000);

        cuenta2.verDineroTotal();

        System.out.println(CuentaBancaria.getCantidadCuentas());
        System.out.println(CuentaBancaria.getCantidadTotalDinero());

        cuenta1.agregarDinero("Corriente", 2000);

        cuenta2.retirarDinero("Ahorros", 700);
        cuenta2.retirarDinero("Corriente", 300);

        cuenta1.retirarDinero("Ahorros", 200);
        cuenta1.retirarDinero("Corriente", 150);

        System.out.println(CuentaBancaria.getCantidadCuentas());
        System.out.println(CuentaBancaria.getCantidadTotalDinero());
    }

}