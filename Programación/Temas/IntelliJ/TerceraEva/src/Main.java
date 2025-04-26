import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, String> mapa = new HashMap<>();

        System.out.println("Traductor español-inglés");
        System.out.println("Introducir traducción");
        for (int i = 0; i < 2; i++) {
            String palabraEsp = teclado.nextLine();
            String palabraIng = teclado.nextLine();
            mapa.put(palabraEsp, palabraIng);
        }

        System.out.println("Todas las palabras registradas");
        mapa.forEach((clave, valor) -> System.out.println(clave + ": " + valor));

        System.out.println("Introducir palabra en español a traducir");
        String palabra = teclado.nextLine();
        System.out.println(mapa.getOrDefault(palabra, "La palabra no está registrada en el diccionario."));

        System.out.println("Eliminar la palabra del diccionario que incluyas");
        String palabraEliminar = teclado.nextLine();
        Iterator i = mapa.keySet().iterator();
        while (i.hasNext()){
            mapa.remove(palabraEliminar);
            String clave = (String) i.next();
        }
        System.out.println("Todas las palabras registradas");
        mapa.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }
}
