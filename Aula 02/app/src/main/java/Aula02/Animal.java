/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author FELIPECANTINI
 */
public class Animal {
    private String  especie ;
    private String raca;
    private String nome;
    
    public Animal (String especie, String raca, String nome) {
        this.especie =  especie;
        this.raca = raca;
        this.nome = nome;
    }
    
    public void apresentarAnimal () {
        System.out.println("Animal: " + especie + 
                "\nRaca: " + raca +
                "\nNome: " + nome);
    }
}
