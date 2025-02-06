/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalha;

/**
 *
 * @author FELIPECANTINI
 */

import java.util.Scanner;

public class Personagem {
    public String nome;
    public int vida;
    public int ataque;
    Scanner sc = new Scanner(System.in);
    
    public Personagem (String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }
    
    public void atacar(Personagem oponente) {    
        oponente.vida = oponente.vida - this.ataque;
        
        System.out.println(this.nome + "atacou " + oponente.nome + "! Seu ataque tem " + this.ataque + " de dano.\n" + oponente.nome +  "agora tem " + oponente.vida + " de vida!");
        }
    
    
         public boolean estaVivo() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }
    }  
}
    
   
    
    
