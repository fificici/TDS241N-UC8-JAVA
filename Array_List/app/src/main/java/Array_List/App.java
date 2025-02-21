/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<String> itens = new ArrayList<>();
    private final ArrayList<Integer> precos = new ArrayList<>();
    
        public static void main(String[] args) {
        App app = new App();

        boolean encerrar = false;
        Scanner scanner = new Scanner(System.in);

        while (!encerrar) {
            app.menu();
            System.out.println("\nEscolha uma opcao: ");
            int opcao = scanner.nextInt();
            encerrar = app.escolha(opcao);
        }
    }

    public void removerItem() {
        if (itens.isEmpty()) {
            System.out.println("Seu carrinho esta vazio!");
            return;
        }

        System.out.println("\nRemover Item: ");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(i + ". " + itens.get(i) + " - R$" + precos.get(i));
        }

        System.out.print("\nEscolha um item para remover: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < itens.size()) {
            System.out.println(itens.get(indice) + " removido do carrinho!");
            itens.remove(indice);
            precos.remove(indice);
        } else {
            System.out.println("Opcao invalida.");
        }
    }

    public void verCarrinho() {
        if (itens.isEmpty()) {
            System.out.println("Seu carrinho esta vazio!");
            return;
        }

        System.out.println("\nCarrinho de Compras: ");
        int total = 0;
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i) + " - R$" + precos.get(i));
            total += precos.get(i);
        }
        System.out.println("\nTotal: R$" + total);
    }

    public void pagar() {
        if (itens.isEmpty()) {
            System.out.println("Seu carrinho esta vazio!");
            return;
        }

        int total = 0;
        for (int preco : precos) {
            total += preco;
        }

        System.out.println("\nPagamento: ");
        System.out.println("\nTotal da compra: R$" + total);
        System.out.println("\nPagamento realizado com sucesso! Obrigado por comprar no Mercado do Povo!!!");
        
        System.exit(0);
    }

    public void menu(){
        System.out.println("\nMERCADO DO POVO!!!");
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
        Industrializados industrializados = new Industrializados();
        Organicos organicos = new Organicos();
        Ferramentas ferramentas = new Ferramentas();
        Eletrodomesticos eletrodomesticos = new Eletrodomesticos();
        Erro error = new Erro();
        
        

        switch (opcao) {
            case 1:

                System.out.println("\nEscolha um produto pelo indice: ");

                String[] nomes = industrializados.nome();
                int[] precosLista = industrializados.preco();

                for (int i = 0; i < nomes.length; i++) {
                    System.out.println(i + ". " + nomes[i] + " - R$" + precosLista[i]);
                }


                int alternativa = scanner.nextInt();
                if (alternativa >= 0 && alternativa < nomes.length) {
                    itens.add(nomes[alternativa]);
                    precos.add(precosLista[alternativa]);
                    System.out.println(nomes[alternativa] + " adicionado ao carrinho!");
                } else {
                    System.out.println("Opcao invalida.");
                }

                break;

            case 2:

                System.out.println("\nEscolha um produto pelo indice: ");

                String[] nomes2 = organicos.nome();
                int[] precosLista2 = organicos.preco();

                for (int i = 0; i < nomes2.length; i++) {
                    System.out.println(i + ". " + nomes2[i] + " - R$" + precosLista2[i]);
                }


                int alternativa2 = scanner.nextInt();
                if (alternativa2 >= 0 && alternativa2 < nomes2.length) {
                    itens.add(nomes2[alternativa2]);
                    precos.add(precosLista2[alternativa2]);
                    System.out.println(nomes2[alternativa2] + " adicionado ao carrinho!");
                } else {
                    System.out.println("Opcao invalida.");
                }

                break;

            case 3:

                System.out.println("\nEscolha um produto pelo indice: ");

                String[] nomes3 = eletrodomesticos.nome();
                int[] precosLista3 = eletrodomesticos.preco();

                for (int i = 0; i < nomes3.length; i++) {
                    System.out.println(i + ". " + nomes3[i] + " - R$" + precosLista3[i]);
                }


                int alternativa3 = scanner.nextInt();
                if (alternativa3 >= 0 && alternativa3 < nomes3.length) {
                    itens.add(nomes3[alternativa3]);
                    precos.add(precosLista3[alternativa3]);
                    System.out.println(nomes3[alternativa3] + " adicionado ao carrinho!");
                } else {
                    System.out.println("Opcao invalida.");
                }

                break;

            case 4:

                System.out.println("\nEscolha um produto pelo indice: ");

                String[] nomes4 = ferramentas.nome();
                int[] precosLista4 = ferramentas.preco();

                for (int i = 0; i < nomes4.length; i++) {
                    System.out.println(i + ". " + nomes4[i] + " - R$" + precosLista4[i]);
                }


                int alternativa4 = scanner.nextInt();
                if (alternativa4 >= 0 && alternativa4 < nomes4.length) {
                    itens.add(nomes4[alternativa4]);
                    precos.add(precosLista4[alternativa4]);
                    System.out.println(nomes4[alternativa4] + " adicionado ao carrinho!");
                } else {
                    System.out.println("Opcao invalida.");
                }

                break;

            case 5:

                System.out.println("\n???: ");

                String[] nomes5 = error.nome();
                int[] precosLista5 = error.preco();

                for (int i = 0; i < nomes5.length; i++) {
                    System.out.println(i + ". " + nomes5[i] + " - R$" + precosLista5[i]);
                }


                int alternativa5 = scanner.nextInt();
                if (alternativa5 >= 0 && alternativa5 < nomes5.length) {
                    itens.add(nomes5[alternativa5]);
                    precos.add(precosLista5[alternativa5]);
                    System.out.println(nomes5[alternativa5] + " adicionado ao carrinho!");
                } else {
                    System.out.println("Opcao invalida.");
                }

                break;

            case 6:

                removerItem();

                break;

            case 7:

                verCarrinho();

                break;

            case 8:

                pagar();

                break;

            case 9:

                System.out.println("Bye bye!");

                return true;

            default:
                System.out.println("Opcao invalida!");

        }

        return false;
    }


}
