/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author FELIPECANTINI
 */
public class Estado extends País {
    public String nomeEstado;
    public String capitalEstado;
    
    public Estado(String continente, String nome, String nomeEstado, String capitalEstado) {
        super(continente, nome);
        this.capitalEstado = capitalEstado;
        this.nomeEstado = nomeEstado;
    }
    
    @Override
    public void exibirPaís() {
        System.out.println("Continente: " + continente + "\nNome do pais: " + nome + "\nNome de um estado: " + 
                nomeEstado + "\nCapital desse Estado: " + capitalEstado);
        
    }
}
