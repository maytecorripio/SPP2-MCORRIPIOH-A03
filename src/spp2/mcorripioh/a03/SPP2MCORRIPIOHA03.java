/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.a03;
//Agregar libreria, import
import java.util.Scanner;


/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Paso 1. Definir variables
        double opuesto , adyacente , hip ; //opuesto= cateto opuesto, adyacente=cateto adyacente, hip=hipotenusa
        Scanner T = new Scanner (System.in);
         
        //Paso 2. Pedir datos
        System.out.println("Hola, en este programa se calculara la hipotenusa de un triángulo, dados dos catetos: cateto opuesto y cateto adyacente ");
        System.out.println("A continuación introduce el valor de tu cateto opuesto");
        opuesto = T.nextDouble();
        System.out.println("Ahora introduce el valor de tu cateto adyacente");
        adyacente = T.nextDouble();
        
        
        //Paso 3. Realizar operación
        hip = Math.sqrt(Math.pow(opuesto,2) + Math.pow(adyacente,2));
        
        //Paso 4. Mostrar resultados
        System.out.println("La hipotenusa dado esos dos valores es:" +hip);
      
        
    }
    
}
