/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author FELIPECANTINI
 */

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();
        
        numeros.add(0, "A");
        numeros.add("B");
        numeros.add(1, "C");
        numeros.add("D");
        numeros.add("A");        
        
        numeros.remove(2);

        System.out.println(numeros);
        System.out.println(numeros.get(2));
        System.out.println(numeros.indexOf("A"));
        System.out.println(numeros.lastIndexOf("A"));
        System.out.println(numeros.contains("B"));
        
        System.out.println("");
        numeros.set(1, "B");
        numeros.set(2, "C");
        numeros.set(3, "D");
        
        System.out.println(numeros);
        System.out.println(numeros.contains("B"));
    }
}
