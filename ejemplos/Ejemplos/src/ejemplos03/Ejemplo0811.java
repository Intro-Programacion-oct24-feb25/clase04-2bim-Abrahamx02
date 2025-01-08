/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

//import ejemplos01.*;
import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejemplo0811 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        
        
        String mensaje = "";
               int  limite;
              int   tabla; 
                 int opcion;
                 System.out.println("ingrese el limite de la tabla");
                 limite = datos.nextInt();
                 System.out.println("ingrese  una tabla");
                 tabla = datos.nextInt();
                 System.out.println("ingrese la opcion a realizar con la tabla (1)suma , (2) multiplicacion");
                 opcion = datos.nextInt();
                     switch (opcion) {
            case 1:
                mensaje = obtenerTablaSumar(limite, tabla);
                break;
            case 2:
                 mensaje = obtenerTablaMultiplicar(limite, tabla);
        }
        
        System.out.printf("%s\n", mensaje);
            
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
