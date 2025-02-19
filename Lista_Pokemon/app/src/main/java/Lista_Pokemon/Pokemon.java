/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Pokemon;

/**
 *
 * @author FELIPECANTINI
 */
public class Pokemon {
    String nome;
    String tipo;
    int level;
    
    public Pokemon (String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void getPokemon() {
        System.out.println(nome + " | " + tipo + " | " + "lvl: " + level);
    }
}
