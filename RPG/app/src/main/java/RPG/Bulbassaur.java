/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author FELIPECANTINI
 */
public class Bulbassaur implements Pokemon {
    
    String nome = "Bulbassaur";
    int força = 8;
    int vida = 10;
    int mana = 12;
   
    
    public void atacar(Oponente oponente) {
        oponente.vida = oponente.vida - this.força;
        this.mana = this.mana - 3;
        System.out.println(this.nome + " atacou " + oponente.nome + " e causou " + this.força + " de dano! Agora voce tem " + this.mana + " de mana!!!");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
