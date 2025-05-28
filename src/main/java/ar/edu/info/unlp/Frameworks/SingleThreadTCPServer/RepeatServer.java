package ar.edu.info.unlp.Frameworks.SingleThreadTCPServer;

import java.io.PrintWriter;
import java.util.Random;
public class RepeatServer extends SingleThreadTCPServerRefactorizado {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] words = message.split(String.valueOf(""));
        cheaquearArgumentosDelMensaje(words);
        char caracterDelimitador = words[3].charAt(0); 
        int cantidadDeRepeticiones = Integer.parseInt(words[1]);

        StringBuilder response = new StringBuilder();
        response=response.repeat(words[0]+caracterDelimitador, cantidadDeRepeticiones);

        out.println(response.deleteCharAt(response.length() - 1).toString());
    
    }
    private void cheaquearArgumentosDelMensaje(String[] words) {
        if (words.length < 2 || words.length > 3) 
            System.exit(1);
        if (words[0] == null || words[0].isEmpty()) 
            System.exit(1);
        try {
            Integer.parseInt(words[1]);
        }
         catch (NumberFormatException e) {
            System.exit(1);
        }
        if (words.length == 3 && words[2].length() != 1) {
            System.exit(1);
    }

        
    }

    

    public static void main(String[] args) {

        new RepeatServer().startLoop(args);

    }

 
    
}
