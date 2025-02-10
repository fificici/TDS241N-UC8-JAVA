/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_List;

/**
 *
 * @author FELIPECANTINI
 */
public class Erro implements Produtos {
    
    @Override
    public String tipo() {
        return "???";
    }
    
    @Override
    public String[] nome() {
        String[] nomes = {"FIlhote de Belzebu", "Verdade de Demiurgo", "Caos e Destruição", "Segredo da Vida", "Ilha no Caribe"};
        
        return nomes;
    }
    
    @Override
    public int[] preco() {
        int[] precos = {1, 1, 1, 1, 1000000000};
        
        return precos;
    }
    
    @Override
    public int[] id() {
        int[] ids = {21, 22, 23, 24, 25};
        
        return ids;
    }
}
