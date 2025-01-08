/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

/**
 *
 * @author reroes
 */
import ejemplos01.*;
import java.util.Scanner;
public class Ejemplo031 {

    public static void main(String[] args) {
        Scanner datos =  new Scanner (System.in);
        
        // 
        int valor1;
        int valor2;
        System.out.println("ingrese un valor ");
        valor1 = datos.nextInt();
        System.out.println("ingrese un valor ");
        valor2 = datos.nextInt();
        
        
        int valor = obtenerSuma(valor1 , valor2); // se invoca al método 
                                         // obtenerSuma
                                    
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        return suma;
        // return a + b;
    }
    
    
}
