/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Main_Github {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        numero();
        
    }
    
    public static void numero() {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10?");
        int num = leer1.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}
