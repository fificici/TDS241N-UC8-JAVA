/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author FELIPECANTINI
 */
public class ContraBaixo implements Instrumentos {
    
    @Override
    public void tocar(){
        System.out.println("Bom bom boooom (plateia encantada, um verdadeiro groove master!)");
    }
    
    @Override
    public void afinar(){
        System.out.println("Contra-baixo sendo afinado...");
    }
}
