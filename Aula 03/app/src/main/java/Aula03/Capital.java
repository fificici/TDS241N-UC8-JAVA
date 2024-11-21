/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author FELIPECANTINI
 */
public class Capital extends País{
    public String nomeCapital;
    
    public Capital (String continente, String nome, String nomeCapital) {
        super(continente, nome);
        this.nomeCapital = nomeCapital;
    }
    
    @Override
    public void exibirPaís() {
        System.out.println("Continente: " + continente + "\nNome do pais: " + nome + "\nNome da capital: " + nomeCapital);
    }
}
