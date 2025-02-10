/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_List;

/**
 *
 * @author FELIPECANTINI
 */
public class Organicos implements Produtos{
    
    @Override
    public String tipo() {
        return "Organicos";
    }
    
    @Override
    public String[] nome() {
        String[] nomes = {"Banana", "Ovos", "Salsinha", "Cacetinho", "Melão"};
        
        return nomes;
    }
    
    @Override
    public int[] preco() {
        int[] precos = {4, 12, 3, 1, 8};
        
        return precos;
    }
    
    @Override
    public int[] id() {
        int[] ids = {6, 7, 8, 9, 10};
        
        return ids;
    }
}
