/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_List;

/**
 *
 * @author FELIPECANTINI
 */
public class Eletrodomesticos implements Produtos {
    
   @Override
    public String tipo() {
        return "Industrializados";
    }
    
    @Override
    public String[] nome() {
        String[] nomes = {"Micro-ondas", "TV", "Air-fryer", "Cadeira Elétrica", "Liquidificador"};
        
        return nomes;
    }
    
    @Override
    public int[] preco() {
        int[] precos = {200, 500, 150, 1000, 80};
        
        return precos;
    }
    
    @Override
    public int[] id() {
        int[] ids = {16, 17, 18, 19, 20};
        
        return ids;
    }
}
