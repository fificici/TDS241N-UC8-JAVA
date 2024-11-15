/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author FELIPECANTINI
 */
public class Violao implements Instrumentos {
    
    @Override
    public void tocar(){
        System.out.println("Blein Blein Bleeeein (campo harmonico de la menor, plateia vai a delirio!)");
    }
    
    @Override
    public void afinar(){
        System.out.println("Violao sendo afinado...");
    }
}
