/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Estoy creando un flujo de datos de entrada procedente del teclado.
        
        System.out.println("Introduce un número:");
        int num = teclado.nextInt();
        
        System.out.println("El valor introducido es:"+num);
        
        teclado.nextLine();
        
        System.out.println("Introduce un nombre:");
        String cadena = teclado.nextLine();
        
        System.out.println("Cadena Introducida: "+cadena);
        
    }
    
}
