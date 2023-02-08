import java.util.Random; 

class CuentaBancaria{

    private String numeroCuenta;
    private double saldoCuentaCorriente;
    private double saldoAhorros;
    private static int cantidadCuentas = 0;
    private static double cantidadTotalDinero = 0.0;

    public CuentaBancaria(){
        cantidadCuentas++;
        this.numeroCuenta = this.getNumeroCuenta();
    }

    public double getSaldoCuentaCorriente(){
        return this.saldoCuentaCorriente;
    }

    public double getSaldoAhorros(){
        return this.saldoAhorros;
    }

    public static double getCantidadTotalDinero(){
        return cantidadTotalDinero;
    }

    public static int getCantidadCuentas(){
        return cantidadCuentas;
    }

    public void agregarDinero(String tipoCuenta, double dinero){
        if(dinero<=0){
            System.out.println("El dinero debe ser mayor a 0");
        }else{
            if(tipoCuenta.equalsIgnoreCase("Ahorros")){
                this.saldoAhorros += dinero;
                cantidadTotalDinero += dinero;
            }else if(tipoCuenta.equalsIgnoreCase("Corriente")){
                this.saldoCuentaCorriente += dinero;
                cantidadTotalDinero += dinero;
            }else{
                System.out.println("Error en el tipo de cuenta");
            }
        }
    }



    public void retirarDinero(String tipoCuenta, double dinero){
        if(dinero<=0){
            System.out.println("El dinero debe ser mayor a 0");
        }else{
            if(tipoCuenta.equalsIgnoreCase("Ahorros")){
                if(this.saldoAhorros > dinero){
                this.saldoAhorros -= dinero;
                cantidadTotalDinero -= dinero;
                }else{
                    System.out.println("Cantidad de dinero a retirar no puede ser mayor que el saldo");
                }
            }else if(tipoCuenta.equalsIgnoreCase("Corriente")){
                if(this.saldoCuentaCorriente > dinero){
                this.saldoCuentaCorriente -= dinero;
                cantidadTotalDinero -= dinero;
                }else{
                    System.out.println("Cantidad de dinero a retirar no puede ser mayor que el saldo");
                }
            }else{
                System.out.println("Error en el tipo de cuenta");
                }
            }
    }

    public void verDineroTotal(){
        System.out.println("Cantidad de dinero en la cuenta de ahorros: " + this.saldoAhorros);
        System.out.println("Cantidad de dinero en la cuenta corriente: " + this.saldoCuentaCorriente);
    }

    private String getNumeroCuenta(){
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String numero = "";
        Random random = new Random();
        for(int i = 0; i < 8; i++){
            numero += numeros[random.nextInt(10)];
        }
        return numero;
    }




}