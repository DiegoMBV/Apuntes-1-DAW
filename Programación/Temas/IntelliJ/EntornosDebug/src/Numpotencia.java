import java.util.Scanner;

public class Numpotencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("EScribe le potencia");
        int potencia = sc.nextInt();
        sc.nextLine();
        int numero2 = 1;

        for (int i = 0; i < potencia; i++) {
             numero2 = numero*numero2;
        }
        System.out.println(numero2);
    }
}
//import java.util.Scanner;
//
//public class Numpotencia {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Escribe el numero");
//        int numero = sc.nextInt();
//        sc.nextLine();
//        System.out.println("EScribe le potencia");
//        int potencia = sc.nextInt();
//        sc.nextLine();
//        int result = potencia(numero,potencia);
//        System.out.println(numero +" elevado a "+potencia+" es: "+result);
//    }
//    static int potencia(int base, int exponente){
//        int result = 1;
//        for (int i = 0; i < exponente; i++) {
//            result = base * result;
//        }
//        return result;
//    }
//}
