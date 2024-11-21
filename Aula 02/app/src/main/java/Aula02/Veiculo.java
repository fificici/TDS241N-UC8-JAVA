/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author FELIPECANTINI
 */
public class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    // Método da superclasse
    public void apresentarCarro() {
        System.out.println("Marca do veículo: " + marca);
    }
}
