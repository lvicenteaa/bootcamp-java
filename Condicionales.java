public class Condicionales{

    public static void main(String args[]){
        int day = 4;

        switch(day){
            case 1:
                System.out.println("Opción 1");
                break;
            case 2:
                System.out.println("Opción 2");
                break;
            case 3:
                System.out.println("Opción 3");
                break;
            default:
                System.out.println("Defecto");
        }

        boolean llueve = true;
        System.out.println(llueve ? "Lleva paraguas": "Ten un lindo día!");

    }

}