import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        // TU CÓDIGO AQUÍ
        return String.format("Hola, %s. Encantado de verte", name);
    }
    
    public String dateAnnouncement() {
        // TU CÓDIGO AQUÍ
        Date fecha = new Date();
        return String.format("Actualmente es %s, %d de %s a las %d:%d:%d PDT de %d", diaSemanaActual(fecha), fecha.getDate(), mesActual(fecha), fecha.getHours(), fecha.getMinutes(), fecha.getSeconds(),(fecha.getYear() + 1900));
    }
    
    public String respondBeforeAlexis(String conversation) {
        // TU CÓDIGO AQUÍ
        String respuesta = "";
        if(conversation.contains("Alexis") || conversation.contains("Alfred")){
            if (conversation.indexOf("Alexis") != -1){
                respuesta += "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
            }
            if (conversation.indexOf("Alfred") != -1){
                respuesta += "A su servicio. Como desee, naturalmente";
            }
        }else {
            respuesta = "Bien. Y con eso, me retiraré";
        }

        return respuesta;
    }


    private String mesActual(Date fecha){
        int mesNum = fecha.getMonth();
        String mes = "";
        switch(mesNum){
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Error mes";
        }
        return mes;
    }

    private String diaSemanaActual(Date fecha){
        int diaSemana = fecha.getDay();
        String dia = "";
        switch(diaSemana){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Error dia de la semana";
        }
        return dia;
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    // ="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!

    public String guessGreeting(String nombre, String dayPeriod){
        return String.format("%s, %s. Encantado de verte.", dayPeriod, nombre);
    }

    public String guessGreeting(String nombre, Date fecha){
        return String.format("%s, %s. Encantado de verte.", periodoDelDia(fecha), nombre);
    }

    private String periodoDelDia(Date fecha){
        if (fecha.getHours() >= 1 && fecha.getHours() < 13){
            return "Buenos dias";
        } else if (fecha.getHours() >= 13 && fecha.getHours() < 7){
            return "Buenas tardes";
        } else if (fecha.getHours() >= 7 && fecha.getHours() < 1){
            return "Buenas noches";
        } else {
            return "Error hora";
        }
    }


}

