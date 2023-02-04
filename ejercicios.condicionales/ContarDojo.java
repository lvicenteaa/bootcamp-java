public class ContarDojo{

    public static void main(String [] args){

        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0 || i % 10 == 0)
                System.out.print("Coding");
                if(i % 10 == 0)
                    System.out.print("Dojo");
            else
                System.out.print( i );
        }

    }


}