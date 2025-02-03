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
        int vidaBase;
        int vidaExtra;
        int manaBase;
        int manaExtra;

        public Personagem (String nome, int ataqueBase, int ataqueExtra, int ataqueForte, int vidaBase, int vidaExtra, int manaBase, int manaExtra) {
            this.nome = nome;
            this.ataqueForte = ataqueForte;
            this.ataqueExtra = ataqueExtra;
            this.vidaBase = vidaBase;
            this.ataqueBase = ataqueBase;
            this.vidaExtra = vidaExtra;
            this.manaBase = manaBase;
            this.manaExtra = manaExtra;
    }

        @Override
        public void atacar(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueExtra;
        this.manaExtra = this.manaExtra - 3;
        System.out.println(this.nome + " atacou " + oponente.nome + " e causou " + this.ataqueExtra + " de dano! Agora voce tem " + this.manaExtra + " de mana!!!");
    }
        
        @Override
        public void atacarForte(Oponente oponente) {
        oponente.vida = oponente.vida - this.ataqueForte;
        this.manaExtra = this.manaExtra - 10;
        System.out.println(this.nome + " atacou " + oponente.nome + " e causou " + this.ataqueForte + " de dano! Agora voce tem " + this.manaExtra + " de mana!!!");
    }

        @Override
        public boolean estaVivo() {
        return vidaExtra > 0;
    }
}

