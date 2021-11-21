
package test;

import java.sql.*;
public class TestMySqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url,"root","admin");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM test.persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Persona: "+resultado.getInt("id_persona"));
                System.out.print(" Nombre: "+resultado.getString("nombre"));
                System.out.print(" Apellido: "+resultado.getString("apellido"));
                System.out.print(" email: "+resultado.getString("email"));
                System.out.println(" Telefono: "+resultado.getString("telefono"));
            }
            //cerrar objetos
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
