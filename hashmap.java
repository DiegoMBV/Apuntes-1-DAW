import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class ConjuntosHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        HashMap<String, Double> mapaInventario = new HashMap<String, Double>();
        
        System.out.println("");
        System.out.println("Introduce prenda y precio");
        mapaInventario.put(teclado.nextLine(), teclado.nextDouble());
        
        
        //Ver iteradores
        for (Map.Entry<String,Double> elemento: mapaInventario.entrySet()){
        
            System.out.println(elemento.getKey() +"-->"+ elemento.getValue());
        }
        
        

    }

}