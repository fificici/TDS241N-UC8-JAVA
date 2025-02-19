/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Pokemon;

/**
 *
 * @author FELIPECANTINI
 */
public class Gengar extends Pokemon{
   
    public Gengar() {
        super ("Gengar", "Fantasma / Veneno", 58);
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
