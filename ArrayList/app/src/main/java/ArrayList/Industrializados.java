/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author FELIPECANTINI
 */
public class Industrializados implements Produtos{
    
    
    @Override
    public String tipo() {
        return "Industrializados";
    }
    
    @Override
    public String[] nome() {
        String[] nomes = {"Doritos", "Coca-Cola", "Oreo", "Ketchup", "Mm's"};
        
        return nomes;
    }
    
    @Override
    public int[] preco() {
        int[] precos = {5, 8, 12, 10, 3};
        
        return precos;
    }
    
    @Override
    public int[] id() {
        int[] ids = {1, 2, 3, 4, 5};
        
        return ids;
    }
}
