/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

generar una solucion que permita sumar dos numeros a traves de un metodo los numeros deben ser
ingresados por teclado por el metodo main el metodo que genera la suma debe verifcicar que los dos 
numeros sean positivos para realizar la operacion caso contrario debe devolver 0 como suma 
el cero no es positivo 
 */ 
package ejemplos03;

/**
 *
 * @author reroes
 */
import java.util.Scanner;
public class Ejemplo031 {

    public static void main(String[] args) {
        Scanner datos =  new Scanner (System.in);
        
        // 
        int valor1;
        int valor2;
        
        System.out.print("Ingrese un valor:");
        valor1 = datos.nextInt();
        System.out.print("Ingrese un valor:");
        valor2 = datos.nextInt();
        
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int ab;
        if (a > 0 && b > 0) {
            ab = a + b;
        }else {
            ab = 0;
        }
        return ab;
        // return a + b;
    }
    
    
}
