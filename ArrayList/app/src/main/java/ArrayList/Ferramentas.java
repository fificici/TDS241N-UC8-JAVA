/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author FELIPECANTINI
 */
public class Ferramentas implements Produtos{
    
    @Override
    public String tipo() {
        return "Ferramentas";
    }
    
    @Override
    public String[] nome() {
        String[] nomes = {"Martelo", "AK-47", "Furadeira", "Espada Medieval", "Betoneira"};
        
        return nomes;
    }
    
    @Override
    public int[] preco() {
        int[] precos = {7, 47, 18, 30, 100};
        
        return precos;
    }
    
    @Override
    public int[] id() {
        int[] ids = {11, 12, 13, 14, 15};
        
        return ids;
    }
}
