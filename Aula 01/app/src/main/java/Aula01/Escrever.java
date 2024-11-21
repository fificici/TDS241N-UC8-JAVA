/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author FELIPECANTINI
 */

import java.util.Scanner;

public class Escrever {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Digite um numero: ");
         int numero1 = sc.nextInt();
         
         System.out.println("Digite outro numero: ");
         int numero2 = sc.nextInt();
         
         System.out.println("Resultado: " + (numero1 + numero2));
    }
}

