
package test;
import static aritmetica.Aritmetica.division;
import excepciones.OperacionException;

public class Test1 {
    public static void main(String[] args) {
        int resultado;
        try{
           resultado= division(3,0);
        }catch(OperacionException e){
            System.out.println("Ocurrio un tipo de OperacionException");
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        
        
    }
}
