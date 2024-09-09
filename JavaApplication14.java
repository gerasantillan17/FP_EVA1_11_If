/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner capturar = new Scanner(System.in);
        System.out.println("Captura la edad:");
        edad = capturar.nextInt();
        
        if(edad >=18){
            System.out.println("Es un adulto");
                    }else{
            System.out.println("Es menor de edad");

        }
    }
    
}
