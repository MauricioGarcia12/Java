
package mx.com.gm.sga.cliente;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;


public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try {
            Context jndi = new InitialContext();
            //PersonaServiceRemote personaService = jndi.lookup()
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
