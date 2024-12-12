/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author FELIPECANTINI
 */

import java.util.Scanner;

public class Dados {
    public int rolarDados(Scanner scanner) {
        int resultadoTotal = 0;
        
        for (int i = 1; i <= 2; i++) {
            System.out.println("\nPressione Enter para rolar o dado " + i);
            scanner.nextLine();
            
            int resultado = (int) (Math.random() * 6) + 1;
            System.out.println("\nVoce rolou: " + resultado);
            resultadoTotal += resultado;
        }
        return resultadoTotal;
    }
}
