/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author FELIPECANTINI
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void apresentarPessoa() {
        System.out.println("Ola! Meu nome eh " + nome + " e tenho " + idade + " anos.");
    }
}
