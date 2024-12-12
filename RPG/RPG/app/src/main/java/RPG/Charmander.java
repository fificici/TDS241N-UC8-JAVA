/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author FELIPECANTINI
 */
public class Charmander extends Personagem {
    
    public Charmander () {
        super("Charmander", 15, 0, 35, 10, 0, 12, 0);
    }
    
        @Override
        public void atacar(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueExtra;
        this.manaExtra = this.manaExtra - 3;
        System.out.println(this.nome + " usou Scratch em  " + oponente.pokemon + " e causou " + this.ataqueExtra + " de dano! Agora voce tem " + this.manaExtra + " de mana!!!");
    }
        
         @Override
        public void atacarForte(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueForte;
        this.manaExtra = this.manaExtra - 8;
        System.out.println(this.nome + " usou Fire Fang em " + oponente.pokemon + " e causou " + this.ataqueForte + " de dano! Agora voce tem " + this.manaExtra + " de mana!!!");
    }

        @Override
        public boolean estaVivo() {
        return vidaExtra > 0;
    }
}
