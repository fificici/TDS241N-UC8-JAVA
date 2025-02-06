/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalha;

import java.util.Scanner;

/**
 *
 * @author FELIPECANTINI
 */
public class Guerreiro extends Personagem{
    
    public Guerreiro (String nome, int vida, int ataque) {
        super(nome, vida, ataque);
        this.vida = 100;
        this.ataque = 15;
    }
}
