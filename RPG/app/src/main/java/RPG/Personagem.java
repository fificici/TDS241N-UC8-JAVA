/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author FELIPECANTINI
 */
public class Personagem implements Pokemon{
    
        String nome;
        int ataqueBase;
        int ataqueExtra;
        int ataqueForte;
        int vida;
        int mana;

        public Personagem (String nome, int ataqueBase, int ataqueExtra, int ataqueForte, int vida, int mana) {
            this.nome = nome;
            this.ataqueForte = ataqueForte;
            this.ataqueExtra = ataqueExtra;
            this.vida = vida;
            this.ataqueBase = ataqueBase;
            this.mana = mana;
    }

        @Override
        public void atacar(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueExtra;
        this.mana = this.mana - 3;
        System.out.println(this.nome + " atacou " + oponente.nome + " e causou " + this.ataqueExtra + " de dano! Agora voce tem " + this.mana + " de mana!!!");
    }
        
        @Override
        public void atacarForte(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueForte;
        this.mana = this.mana - 10;
        System.out.println(this.nome + " atacou " + oponente.nome + " e causou " + this.ataqueForte + " de dano! Agora voce tem " + this.mana + " de mana!!!");
    }

        @Override
        public boolean estaVivo() {
        return vida > 0;
    }
}

