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

public class Frase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
             
        System.out.println("Eh aluno? ");
        boolean aluno = sc.nextBoolean();
        
        System.out.println("Nome: " + nome + 
                                     "\nIdade: " + idade + 
                                     "\nAltura: " + altura + 
                                     "\nEh aluno? " + aluno);
    }
}
