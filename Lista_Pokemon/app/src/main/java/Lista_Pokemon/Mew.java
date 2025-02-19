/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Pokemon;

/**
 *
 * @author FELIPECANTINI
 */
public class Mew extends Pokemon{
       
    public Mew() {
        super ("Mew", "Psiquico", 70);
    }
    
    @Override
    public String getNome() {
        return nome;
    }
       
    @Override
    public void getPokemon() {
        System.out.println(nome + " | " + tipo + " | " + "lvl: " + level);
    }
}
