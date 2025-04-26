import java.util.Scanner;

 public class Cuadrado {
    /* public static int Cuadrado(int num){
        int resultado = 0;
        for (int i = 0; i < 1; i++) {
            resultado = num * num;
        }
        if(resultado%2==0){
            System.out.println("El numero es par");
        } else{
            System.out.println("El numero es impar");
        }
        return resultado;
    }*/

    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        teclado.nextLine();
        int resultado = Cuadrado(numero);
        System.out.println("El cuadrado de "+numero+" es: "+resultado); */

        int sumaCuadrados = 0;
        int [] numeros = {2, 3};

        for (int i = 0; i < numeros.length; i++) {
            sumaCuadrados += numeros[i] * numeros[i];
        }

        System.out.println("la suma de los cuadrados es "+sumaCuadrados);

        if (sumaCuadrados % 2 == 0){
            System.out.println("El resultado es par");
        }else {
            System.out.println("El resultado es impar");
        }

    }
}
