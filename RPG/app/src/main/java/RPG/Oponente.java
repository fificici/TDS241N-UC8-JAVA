/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author FELIPECANTINI
 */
public class Oponente{
    
    String nome;
    String pokemon;
    int ataque;
    int vida;
    int mana;

    public Oponente (String nome, String pokemon, int ataque, int vida, int mana) {
        this.pokemon = pokemon;
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.mana = mana;
    }

    public void atacar(Personagem oponente) {
        oponente.vida = oponente.vida - this.ataque;
        this.mana = this.mana - 3;
        System.out.println(this.nome + " atacou " + oponente.nome + " e causou " + this.ataque + " de dano! Agora voce tem " + this.mana + " de mana!!!");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
