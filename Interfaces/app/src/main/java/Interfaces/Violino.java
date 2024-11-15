/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author FELIPECANTINI
 */
public class Violino implements Instrumentos {
    
    @Override
    public void tocar(){
        System.out.println("Fiiiiiin fiiiin fiiiiiiin (o apice da classe e maestria, emocionando todos presentes!)");
    }
    
    @Override
    public void afinar(){
        System.out.println("Violino sendo afinado...");
    }
}
