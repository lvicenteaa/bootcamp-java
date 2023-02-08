import java.util.HashMap;
import java.util.Set;

public class Hashmatique{

    public static void main(String[] args){

        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Sugar","The Kombucha mushroom people Sitting around all day Who can believe you? Who can believe you? Let your mother pray (sugar) ");
        trackList.put("Chop Suey!","Wake up (Wake up) Grab a brush and put a little make-up Hide the scars to fade away the shake-up (Hide the scars to fade away the...) Why'd you leave the keys upon the table? Here you go create another fable You wanted to Grab a brush and put a little makeup You wanted to Hide the scars to fade away the shake-up");
        trackList.put("Lonely Day","Such a lonely day, and it's mine The most loneliest day of my life Such a lonely day should be banned It's a day that I can't stand The most loneliest day of my life The most loneliest day of my life Such a lonely day shouldn't exist");
        trackList.put("Soldier Side","Dead men lying on the bottom of the grave Wondering when the Savior comes, is he gonna be saved Maybe you're a sinner into your alternate life Maybe you're a joker, maybe you deserve to die They were crying when their sons left God is wearing black");
        trackList.put("Roulette","I have a problem that I cannot explain I have no reason why it should have been so plain Have no questions but I sure have excuse I lack the reason why I should be so confused I know, how I feel when I'm around you I don't know, how I feel when I'm around you");

        Set<String> titulos = trackList.keySet();
        System.out.println("Track List");
        int i = 1;
        for(String titulo : titulos){
            System.out.println(i + ". "+ titulo + ": " + trackList.get(titulo));
            i++;
        }


        String msg = "Digite el nombre de la canción a buscar: ";
        System.out.println(msg);
        String tema = System.console().readLine();
        System.out.println("Buscando la canción");
        if(trackList.containsKey(tema)){
            System.out.println(tema + ": "+ trackList.get(tema));
        }else{
            for(String titulo : titulos){
                if(titulo.indexOf(tema) != -1){
                    System.out.println(titulo + ": "+ trackList.get(titulo));
                }
            }
        }




    }

}