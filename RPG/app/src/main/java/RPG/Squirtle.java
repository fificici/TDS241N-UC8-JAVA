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
        super("Squirtle", 12, 30, 15, 10);
    }
    
    @Override
        public void atacar(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataque;
        this.mana = this.mana - 3;
        System.out.println(this.nome + " usou  Tackle em " + oponente.pokemon + " e causou " + this.ataque + " de dano! Agora voce tem " + this.mana + " de mana!!!");
    }
        
         @Override
        public void atacarForte(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueForte;
        this.mana = this.mana - 8;
        System.out.println(this.nome + " usou Water Gun em " + oponente.pokemon + " e causou " + this.ataque + " de dano! Agora voce tem " + this.mana + " de mana!!!");
    }

        @Override
        public boolean estaVivo() {
        return vida > 0;
    }
}
