/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Pokemon;

/**
 *
 * @author FELIPECANTINI
 */
public class Raichu extends Pokemon{
       
    public Raichu() {
        super ("Raichu", "Eletrico", 48);
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
