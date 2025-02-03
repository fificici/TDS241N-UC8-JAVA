/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author FELIPECANTINI
 */
public class OponenteA extends Oponente{
    public OponenteA () {
        super("Xanadson", "Rattata", 4, 120, 30);
    }
    
    @Override
    public void atacar(Personagem oponente) {
        oponente.vidaExtra = oponente.vidaExtra - this.ataque;
        this.mana = this.mana - 3;
        System.out.println(this.pokemon + " usou Tackle em " + oponente.nome + " e causou " + this.ataque + " de dano! Agora " + this.pokemon + " tem " + this.mana + " de mana!!!");
    }
    
    @Override
    public boolean estaVivo() {
        return vida > 0;
    }
}
