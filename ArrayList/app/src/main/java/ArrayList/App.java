/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public void menu(){
        System.out.println("MERCADO DO POVO!!!");
        System.out.println("");
        System.out.println("1. Alimentos Industrializados");
        System.out.println("2. Alimentos Organicos");
        System.out.println("3. Ferramentas");
        System.out.println("4. Eletrodomesticos");
        System.out.println("5. ???");
        System.out.println("6. Remover Item");
        System.out.println("7. Ver Carrinho");
        System.out.println("8. Pagar");
        System.out.println("9. Sair");
    }
    
    public boolean escolha(int opcao) {
        Scanner scanner = new Scanner(System.in);
        Industrializados industrializados = new Industrializados();
        
        ArrayList<String> itens = new ArrayList<>();
        ArrayList<Integer> precos = new ArrayList<>();
        
        switch (opcao) {
            case 1:
                
                System.out.println("Adicione pelo indice: ");
                        
                industrializados.nome();
                industrializados.preco();
                
                int alternativa = scanner.nextInt();
                
                
                break;
                
            case 2:
                
                System.out.println("");
                
                break;
            
            case 3:
                
                System.out.println("");
                
                break;
                
            case 4: 
                
                System.out.println("");
                
                break;
                
            case 5:
                
                System.out.println("");
                
                break;
                
            case 6:
                
                System.out.println("");
                
                break;
                
            case 7:
                
                System.out.println("");
                
                break;
                
            case 8:
                
                System.out.println("");
                
                break;
                
            case 9:
                
                System.out.println("Bye bye!");
                
                return true;
                
            default:
                System.out.println("Opcao invalida!");
                
        }
        
        return false;
    }
    
    public void main() {
        boolean encerrar = false;
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        
        while (!encerrar) {
            app.menu();
            System.out.println("\nEscolha uma opcao: ");
            int opcao = scanner.nextInt();
            encerrar = app.escolha(opcao);
        }
    }
    
    public static void main(String[] args) {
        App app = new App();
        
        app.main();
    }
}
