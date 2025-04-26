public class SumarNumeros {
    // Método que intenta sumar los números del 1 al 5 y  mostrar el resultado
    public static void sumarNumeros() {
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al 5 es: " + suma);
    }
    public static void main(String[] args) {
        sumarNumeros();
    }
}