/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Caluladora_GIT;

import java.util.Scanner;

public class Calculadora {
    public double n1; 
    public double n2;
    Scanner sc = new Scanner(System.in);
     
    
    public Calculadora (double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public void somar() {
        
        System.out.println("Digite o primeiro numero: ");
        this.n1 = sc.nextDouble();
        
         System.out.println("Digite o segundo numero: ");
        this.n2 = sc.nextDouble();
        
         System.out.println("Resultado: " + (this.n1 + this.n2));
    }
    
        public void subtrair() {
        
        System.out.println("Digite o primeiro numero: ");
        this.n1 = sc.nextDouble();
        
         System.out.println("Digite o segundo numero: ");
        this.n2 = sc.nextDouble();
        
         System.out.println("Resultado: " + (this.n1 - this.n2));
    }
        
        public void multiplicar() {
        
         System.out.println("Digite o primeiro numero: ");
        this.n1 = sc.nextDouble();
        
         System.out.println("Digite o segundo numero: ");
        this.n2 = sc.nextDouble();
        
         System.out.println("Resultado: " + (this.n1 * this.n2));
    }
        
        public void dividir() {
        
        System.out.println("Digite o primeiro numero: ");
        this.n1 = sc.nextDouble();
        
         System.out.println("Digite o segundo numero: ");
        this.n2 = sc.nextDouble();
        
         System.out.println("Resultado: " + (this.n1 / this.n2));
    }
        
         public void menu() {
             System.out.println("CALCULADORA !!! \n1. somar\n2. subtrair\n3. multiplicar\n4. dividir\n 5.sair");
         }
     
         public boolean escolha() {
          
         int opcao = sc.nextInt();
         
         
         switch (opcao) {

        case 1:

            this.somar();

            break;

        case 2:

            this.subtrair();

            break;

        case 3:

            this.multiplicar();

            break;
        
        case 4:

            this.dividir();

            break;

        case 5:
           
            System.out.println("Encerrando programa...");
            
            return true; 

        default:
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
    }
    return false; 
    } 
     
     public void main() {
         boolean encerrar = false;

    while (!encerrar) {
        this.menu();
        System.out.println("Digite a opcao: ");
        
         
         encerrar = this.escolha();
    }
}
}
                
        





