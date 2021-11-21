
package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class TestManejoPersonas {
    public static void main(String[] args) {
        Connection conexion=null;
        try {
             conexion = Conexion.getConnection();
            //no haga commit automatico
            if(conexion.getAutoCommit() == true){
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDAO = new PersonaDAO(conexion);
            Persona personaCambio = new Persona(2,"Karla","Alberta","email5","33333");
            personaDAO.actualizar(personaCambio);
            
            Persona personaInsert = new Persona(9, "sandra", "apellido2", "email9", "333456");
            personaDAO.insertar(personaInsert);
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
        
    }
}
