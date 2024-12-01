/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package RPG;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Personagem pokemon = new Bulbasaur();
        Dados dados = new Dados();
        
        System.out.println ("Ola! Bem-vindo ao mundo dos POKEMON! Meu nome e Carvalho! "
            + "As pessoas me chamam de PROF. POKEMON!\nEste mundo e habitado por criaturas chamadas POKEMON! "
            + "Para algumas pessoas, POKEMON sao animais de estimacao. "
            + "\nOutros os usam para lutas. Eu... eu estudo POKEMON como profissao. \nPrimeiro, qual e o seu nome?\n");
    
        String treinador = scanner.nextLine();
        
        System.out.println("Certo! Entao seu nome e " + treinador + "! Prazer em conhece-lo!\nVoce acabou de completar 10 anos e tem direito a escolher "
                + "seu POKEMON inicial!\nEle ira te acompanhar em sua aventura pelo mundo POKEMON, sendo seu companheiro e leal amigo, tambem te ajudando em possiveis batalhas no caminho. "
                + "\n\nAqui no laboratorio temos 3 escolhas, permita-me apresenta-las: "
                + "\n"
                + "\n1. Bulbasaur - O POKEMON bulbo do tipo Planta e Veneno"
                + "\n"
                + "\nAtaque: 10"
                + "\nVida: 12"
                + "\nMana: 15"
                + "\n"
                + "\n2. Squirtle - O POKEMON tartaruga do tipo Agua"
                + "\n"
                + "\nAtaque: 12"
                + "\nVida: 15"
                + "\nMana: 10"
                + "\n"
                + "\n3. Charmander - O POKEMON salamandra do tipo Fogo"
                + "\n"
                + "\nAtaque: 15"
                + "\nVida: 10"
                + "\nMana: 12"
                + "\n"
                + "\nEntao, qual sua escolha?\n");
        
        int escolhaPokemon = scanner.nextInt();
        String skip1 = scanner.nextLine();
        
         if (escolhaPokemon == 1) {
            
            pokemon = new Bulbasaur();
                    
         } else if (escolhaPokemon == 2) {
        
            pokemon = new Squirtle();
                
         } else if (escolhaPokemon == 3) {
        
            pokemon = new Charmander();
                
         } else {
                
            System.out.println("Escolha invalida, erro!");
            System.exit(0);
            
         }
         
         System.out.println("Certo! Seu primeiro parceiro em sua jornada e " + pokemon.nome + "! " + treinador + ", agora vamos definir"
                 + " os status extras de seu POKEMON!");
         
         System.out.println("\nDados para ataque: ");
                 int dados1 = dados.rolarDados(scanner);
                 System.out.println("\nDados para vida: ");
                 int dados2 = dados.rolarDados(scanner);
                 System.out.println("\nDados para mana: ");
                 int dados3 = dados.rolarDados(scanner);
   
                 
                pokemon.ataque = pokemon.ataque + dados1;
                pokemon.vida = pokemon.vida + dados2;
                pokemon.mana = pokemon.mana + dados3;   
                
                System.out.println("\nSeu ataque: " + pokemon.ataque);
                System.out.println("Sua vida: " + pokemon.vida);
                System.out.println("Seu mana: " + pokemon.mana);
                
         System.out.println("Certo, " + treinador + "! Voce tera uma jornada e tanto pela frente, "
                 + "cuide bem do seu POKEMON e se divirta nessa fantastica aventura que lhe aguarda no mundo POKEMON!");
         
         System.out.println("\nVoce sai do laboratorio do PROF. Carvalho, situado na cidade de Palette, rumo a sua jornada."
                 + "\nPassando pela cidade de Palette e atravessando a rota 1 sem nenhum empecilho, acaba chegando na cidade de Viridian."
                 + "\nA cidade de Viridian bifurca para duas rotas diferente para chegar a cidade de Pewter, uma delas passando pela Caverna dos Digletts,"
                 + " a outra pela Floresta de Viridian."
                 + "\nQual sua escolha de caminho?"
                 + "\n"
                 + "\n1. Carverna dos Digletts\n2. Floresta de Viridian");
         int escolha1 = scanner.nextInt();
         String skip2 = scanner.nextLine();
         
         if (escolha1 ==1) {
                System.out.println("\nVoce adentra a Carvena dos Digletts rumo a cidade de Pewter, "
                        + "apos caminhar por um curto periodo um treinador vai de encontro a voce!"
                        + "\nSeu nome e Xanadson que te desafia para uma batalha POKEMON, agora e hora de duelar!");
         
                 OponenteA oponenteA = new OponenteA();
                 
                 System.out.println("\nDados para ataque: ");
                 int dados4 = dados.rolarDados(scanner);
                 System.out.println("\nDados para vida: ");
                 int dados5 = dados.rolarDados(scanner);
                 System.out.println("\nDados para mana: ");
                 int dados6 = dados.rolarDados(scanner);
   
                 
                pokemon.ataque = pokemon.ataque + dados4;
                pokemon.vida = pokemon.vida + dados5;
                pokemon.mana = pokemon.mana + dados6;   
                
                System.out.println("\nSeu ataque: " + pokemon.ataque);
                System.out.println("Sua vida: " + pokemon.vida);
                System.out.println("Seu mana: " + pokemon.mana);
         
                while (pokemon.estaVivo() && oponenteA.estaVivo()) {
                System.out.println("\nEscolha o seu movimento:");
                System.out.println("1. Atacar");
                System.out.println("2. Ataque Especial (30 de dano - Custo: 8 de mana.)");
                System.out.println("3. Fugir");
                int escolhaBatalha = scanner.nextInt();
                

                switch (escolhaBatalha) {
                    case 1:
                        if (pokemon.mana >= 3) {
                             pokemon.atacar(oponenteA);
                        } else {
                            System.out.println("\nVoce nao tem mana suficiente para atacar!");
                        }
                        break;
                     case 3:
                            int dados7 =  dados.rolarDados(scanner);
                            if (dados7 >= 9) {
                                System.out.println("\nVoce conseguiu fugir da batalha!");
                                System.out.println("Voce passa pela Carvena dos Digletts sem nenhum problema, encontra alguns POKEMON mas apenas a companhia de "
                    + pokemon.nome + " ja basta. \nChegando na cidade de Pewter voce decide parar para descansar...");
                                System.exit(0);
                            } else {
                                System.out.println("\nTentativa de fuga falha!");
                            }
                            
                        break;
                     case 2:
                         if (pokemon.mana >= 8) {
                             pokemon.atacarForte(oponenteA);
                         } else {
                             System.out.println("Voce nao tem mana suficiente para ataque especial");
                         break;
                         }
                }

                if (oponenteA.vida > 0 && oponenteA.mana >= 3) {
                    
                    oponenteA.atacar(pokemon);
                    
                } else if (oponenteA.vida > 0 && oponenteA.mana < 3) {
                    
                    System.out.println("Oponente nao tem mana suficiente para atacar!");
                }
            
                System.out.println("Sua vida: " + pokemon.vida + "\nVida inimiga: " + oponenteA.vida);        
            

                if (!oponenteA.estaVivo()) {
                    System.out.println(oponenteA.nome + " foi derrotado!");
                }
        }

        } else if (escolha1 == 2) {
            System.out.println("Voce passa pela Floresta de Viridian sem nenhum problema, encontra alguns POKEMON mas apenas a companhia de "
                    + pokemon.nome + " ja basta. Chegando na cidade de Pewter voce decide parar para descansar...");
        }
    }
}

