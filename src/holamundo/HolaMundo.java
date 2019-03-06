package holamundo;

/**
 * Clase de ejemplo para mostrar los argumentos pasados por linea de comando 
 * cuando ejecutamos esta clase con varios argumentos. Ejem: java HolaMundo Arg1 Arg2 etc..
 * 
 * @author fpayan
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Saludamos
        System.out.println("Hola " + saludoPorArgumnentosMain(args));
    }
    
    /**
     * Construye la cadena a devolver bien formada si el array que se le pasa como parámetro tiene un tamaño superior a cero.
     * 
     * @param _args Array de String
     * 
     * @return String cadena pasada por parámetro
     */
    public static String saludoPorArgumnentosMain(String[] _args){
        StringBuilder saludo = new StringBuilder();
        // More arguments
        if(_args.length > 0){
            // Yes arguments
            for(String data: _args){
                saludo.append(data).append(" ");
            }
        }else{
            // Not arguments
            saludo.append("Invitado");
        }     
        return saludo.toString();
    }
}
