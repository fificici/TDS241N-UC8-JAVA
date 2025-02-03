/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author FELIPECANTINI
 */
public class Squirtle extends Personagem {
    
    public Squirtle () {
        super("Squirtle", 12, 0, 35, 15, 0, 10, 0);
    }
    
    @Override
        public void atacar(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueExtra;
        this.manaExtra = this.manaExtra - 3;
        System.out.println(this.nome + " usou  Tackle em " + oponente.pokemon + " e causou " + this.ataqueExtra + " de dano! Agora voce tem " + this.manaExtra + " de mana!!!");
    }
        
         @Override
        public void atacarForte(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueForte;
        this.manaExtra = this.manaExtra - 8;
        System.out.println(this.nome + " usou Water Gun em " + oponente.pokemon + " e causou " + this.ataqueExtra + " de dano! Agora voce tem " + this.manaExtra + " de mana!!!");
    }

        @Override
        public boolean estaVivo() {
        return vidaExtra > 0;
    }
}
