/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author FELIPECANTINI
 */
public class Carro extends Veiculo{
    private String modelo;
    private String cor;
    private int ano;
    
    public Carro (String marca, String modelo, String cor, int ano) {
        super(marca);
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    @Override
    public void apresentarCarro() {
    System.out.println("Marca: " + getMarca() + "\nModelo: " + modelo + "\nCor: " + cor + "\nAno: " + ano);
}
}
