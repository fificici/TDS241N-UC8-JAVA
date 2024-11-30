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
        super("Charmander", 15, 30, 10, 12);
    }
    
        @Override
        public void atacar(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataque;
        this.mana = this.mana - 3;
        System.out.println(this.nome + " usou Scratch em  " + oponente.pokemon + " e causou " + this.ataque + " de dano! Agora voce tem " + this.mana + " de mana!!!");
    }
        
         @Override
        public void atacarForte(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueForte;
        this.mana = this.mana - 8;
        System.out.println(this.nome + " usou Fire Frang em " + oponente.pokemon + " e causou " + this.ataqueForte + " de dano! Agora voce tem " + this.mana + " de mana!!!");
    }

        @Override
        public boolean estaVivo() {
        return vida > 0;
    }
}
