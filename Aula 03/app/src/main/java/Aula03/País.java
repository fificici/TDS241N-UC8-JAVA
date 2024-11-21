/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author FELIPECANTINI
 */
public class País {
    public String continente;
    public String nome;
    
    public País(String continente, String nome) {
        this.continente = continente;
        this.nome = nome;
    }
    
    public void exibirPaís() {
        System.out.println("Continente: " + continente + "\nNome: " + nome);
    }
}
