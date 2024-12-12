/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author FELIPECANTINI
 */
public class OponenteC extends Oponente{
    public OponenteC () {
        super("Yestumpfo", "Magikarp", 8, 125, 40);
    }
    
    @Override
    public void atacar(Personagem oponente) {
        oponente.vidaExtra = oponente.vidaExtra - this.ataque;
        this.mana = this.mana - 3;
        System.out.println(this.pokemon + " usou Water Gun em " + oponente.nome + " e causou " + this.ataque + " de dano! Agora " + this.pokemon + " tem " + this.mana + " de mana!!!");
    }
    
    @Override
    public boolean estaVivo() {
        return vida > 0;
    }
}

