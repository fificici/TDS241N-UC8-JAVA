/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package RPG;

import java.util.Scanner;

public class App {
    
    public void inicializarStatusBase(Personagem pokemon) {
        
        pokemon.ataqueExtra = pokemon.ataqueBase;
        pokemon.vidaExtra = pokemon.vidaBase;
        pokemon.manaExtra = pokemon.manaBase;
    }
    
    public boolean tentarFugir(Personagem pokemon) {
        
        Scanner scanner = new Scanner(System.in);
        Dados dados = new Dados();
                
    int dados1 = dados.rolarDados(scanner);
    if (dados1 >= 9) {
        System.out.println("\nVoce conseguiu fugir da batalha!");
        return true; 
    } else {
        System.out.println("\nTentativa de fuga falha!");
        return false; 
    }
}
    
    public void caminho1(Personagem pokemon) {
        
        Scanner scanner = new Scanner(System.in);
        Dados dados = new Dados();
        App app = new App();
        
        
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
                 int dados1 = dados.rolarDados(scanner);
                 System.out.println("\nDados para vida: ");
                 int dados2 = dados.rolarDados(scanner);
                 System.out.println("\nDados para mana: ");
                 int dados3 = dados.rolarDados(scanner);
   
                 
                pokemon.ataqueExtra = pokemon.ataqueBase + dados1;
                pokemon.vidaExtra = pokemon.vidaBase + dados2;
                pokemon.manaExtra = pokemon.manaBase + dados3;   
                
                System.out.println("\nSeu ataque: " + pokemon.ataqueExtra);
                System.out.println("Sua vida: " + pokemon.vidaExtra);
                System.out.println("Seu mana: " + pokemon.manaExtra);
         
                while (pokemon.estaVivo() && oponenteA.estaVivo()) {
                System.out.println("\nEscolha o seu movimento:");
                System.out.println("1. Atacar");
                System.out.println("2. Ataque Especial (35 de dano - Custo: 8 de mana.)");
                System.out.println("3. Fugir");
                
                int escolhaBatalha = scanner.nextInt();
                
                boolean fugaBemSucedida = false;
                

                switch (escolhaBatalha) {
                    case 1:
                        if (pokemon.manaExtra >= 3) {
                             pokemon.atacar(oponenteA);
                        } else {
                            System.out.println("\nVoce nao tem mana suficiente para atacar!");
                        }
                        break;
                     case 3:
                         fugaBemSucedida = app.tentarFugir(pokemon);                   
                        break;
                     case 2:
                         if (pokemon.manaExtra >= 8) {
                             pokemon.atacarForte(oponenteA);
                         } else {
                             System.out.println("Voce nao tem mana suficiente para ataque especial");
                         break;
                         }
                }
                
                if (fugaBemSucedida) {
                     System.out.println("Voce passa pela Carvena dos Digletts sem nenhum problema, encontra alguns POKEMON mas apenas a companhia de "
                + pokemon.nome + " ja basta.");
                     app.inicializarStatusBase(pokemon);
                    app.caminho2(pokemon);
                    break;
                }

                if (oponenteA.vida > 0 && oponenteA.mana >= 3) {
                    
                    oponenteA.atacar(pokemon);
                    
                } else if (oponenteA.vida > 0 && oponenteA.mana < 3) {
                    
                    System.out.println("Oponente nao tem mana suficiente para atacar!");
                }
            
                System.out.println("Sua vida: " + pokemon.vidaExtra + "\nVida inimiga: " + oponenteA.vida);        
            

                if (!oponenteA.estaVivo()) {
                    System.out.println("\n" + oponenteA.nome + " foi derrotado!");
                    app.inicializarStatusBase(pokemon);
                    app.caminho2(pokemon);
                    break;
                } 
        }

        } else if (escolha1 == 2) {
            System.out.println("\nVoce passa pela Floresta de Viridian sem nenhum problema, encontra alguns POKEMON mas apenas a companhia de "
                    + pokemon.nome + " ja basta.");
            app.caminho2(pokemon);
        }
}

    public void caminho2(Personagem pokemon)  {
        
        Scanner scanner = new Scanner(System.in);
        Dados dados = new Dados();
        App app = new App();
        
        System.out.println("\nChegando na cidade de Pewter  voce decide parar um pouco para descansar e aproveitar a cidade. "
                + "\nVoce conversa com moradores para conseguir informacoes e seguir seu caminho, entao descobre que para chegar na proxima parada, "
                + "\ncidade de Cerulean, "
                + "e necessario passar pelo Monte Moon, uma montanha cheia de misterios e lendas que a tangem!"
                + "\nEntao voce decide adentrar a caverna formada na base da montanha. \nAdentrando voce se depara com uma bifurcacao, "
                + "qual lado escolhera?"
                + "\n"
                + "\n1. Esquerda"
                + "\n2. Direita");
        int escolha2 = scanner.nextInt();
         String skip3 = scanner.nextLine();
         
         if (escolha2 == 2) {
                System.out.println("\nVoce decide ir pelo caminho da direita."
                        + "\nApos caminhar pelo terreno rochoso por um longo tempo, encontra um treinador aventureiro pronto para duelar!"
                        + "\nSeu nome e Whingslompson que te desafia para uma batalha POKEMON, agora e hora de duelar!");
         
                 OponenteB oponenteB = new OponenteB();
                 
                 System.out.println("\nDados para ataque: ");
                 int dados1 = dados.rolarDados(scanner);
                 System.out.println("\nDados para vida: ");
                 int dados2 = dados.rolarDados(scanner);
                 System.out.println("\nDados para mana: ");
                 int dados3 = dados.rolarDados(scanner);
   
                 
                pokemon.ataqueExtra = pokemon.ataqueBase + dados1;
                pokemon.vidaExtra = pokemon.vidaBase + dados2;
                pokemon.manaExtra = pokemon.manaBase + dados3;   
                
                System.out.println("\nSeu ataque: " + pokemon.ataqueExtra);
                System.out.println("Sua vida: " + pokemon.vidaExtra);
                System.out.println("Seu mana: " + pokemon.manaExtra);
         
                while (pokemon.estaVivo() && oponenteB.estaVivo()) {
                System.out.println("\nEscolha o seu movimento:");
                System.out.println("1. Atacar");
                System.out.println("2. Ataque Especial (35 de dano - Custo: 8 de mana.)");
                System.out.println("3. Fugir");
                
                int escolhaBatalha = scanner.nextInt();
                
                boolean fugaBemSucedida = false;
                

                switch (escolhaBatalha) {
                    case 1:
                        if (pokemon.manaExtra >= 3) {
                             pokemon.atacar(oponenteB);
                        } else {
                            System.out.println("\nVoce nao tem mana suficiente para atacar!");
                        }
                        break;
                     case 3:
                         fugaBemSucedida = app.tentarFugir(pokemon);                   
                        break;
                     case 2:
                         if (pokemon.manaExtra >= 8) {
                             pokemon.atacarForte(oponenteB);
                         } else {
                             System.out.println("Voce nao tem mana suficiente para ataque especial");
                         break;
                         }
                }
                
                if (fugaBemSucedida) {
                     System.out.println("Explorando o Monte Moon voce encontra bastante Zubats na trilha, porem decide nao testar a sorte e passa bem mansinho"
                             + " ate encontrar a saida para a cidade de Cerulean.");
                    app.caminho3(pokemon);
                    break;
                }

                if (oponenteB.vida > 0 && oponenteB.mana >= 3) {
                    
                    oponenteB.atacar(pokemon);
                    
                } else if (oponenteB.vida > 0 && oponenteB.mana < 3) {
                    
                    System.out.println("Oponente nao tem mana suficiente para atacar!");
                }
            
                System.out.println("Sua vida: " + pokemon.vidaExtra + "\nVida inimiga: " + oponenteB.vida);        
            

                if (!oponenteB.estaVivo()) {
                    System.out.println("\n" + oponenteB.nome + " foi derrotado!");
                    app.caminho3(pokemon);
                    break;
                } 
        }

        } else if (escolha2 == 1) {
            System.out.println("Caminhando pelo caminho da esquerda voce se depara com um treinador perdido, seu nome e Jamberlau!\n"
                    + "Jamberlau conta que e um explorador que veio investigar as lendas do Monte Moon, porem no caminho se perdeu na imensidao"
                    + " da escuridao da caverna.\n Voce decide ajudar Jamberlau e juntos procuram a saida da caverna."
                    + "\nApos um longo periodo voces encontram a saida, Jamberlau agradece a ajuda e se despede, rumando a outro caminho."
                    + "\nAgora seu destino e a cidade de Cerulean");
            app.caminho3(pokemon);
        }         
    }
    
    public void caminho3(Personagem pokemon) {
        
        Scanner scanner = new Scanner(System.in);
        Dados dados = new Dados();
        App app = new App();
        
        System.out.println("\nChegando na cidade de Cerulean voce se encanta com a cidade e decide turistar. "
                + "Apos passear voce se depara com um Ginasio, \na cidade de Cerulean e famosa por ter a lider de ginasio Misty!"
                + "Voce quer lutar pela Insignia ou passar reto?"
                + "\n"
                + "\n1. Entrar no Ginasio"
                + "\n2. Passar reto"
);
        int escolha2 = scanner.nextInt();
         String skip3 = scanner.nextLine();
         
         if (escolha2 == 1) {
                System.out.println("\nVoce decide entrar no Ginsaio."
                        + "\nEntrando no Ginasio de Cerulean voce descobre que a lider de ginasio Misty foi derrotada por um treinador novato que assumiu seu posto de lider de ginasio."
                        + "\nSeu nome é Yestumpfo! O novo lider do Ginasio de Cerulean com seu destemido e implacavel Magikarp!"
                        + "\nAgora e hora de batalhar!");
         
                 OponenteC oponenteC = new OponenteC();
                 
                 System.out.println("\nDados para ataque: ");
                 int dados1 = dados.rolarDados(scanner);
                 System.out.println("\nDados para vida: ");
                 int dados2 = dados.rolarDados(scanner);
                 System.out.println("\nDados para mana: ");
                 int dados3 = dados.rolarDados(scanner);
   
                 
                pokemon.ataqueExtra = pokemon.ataqueBase + dados1;
                pokemon.vidaExtra = pokemon.vidaBase + dados2;
                pokemon.manaExtra = pokemon.manaBase + dados3;   
                
                System.out.println("\nSeu ataque: " + pokemon.ataqueExtra);
                System.out.println("Sua vida: " + pokemon.vidaExtra);
                System.out.println("Seu mana: " + pokemon.manaExtra);
         
                while (pokemon.estaVivo() && oponenteC.estaVivo()) {
                System.out.println("\nEscolha o seu movimento:");
                System.out.println("1. Atacar");
                System.out.println("2. Ataque Especial (35 de dano - Custo: 8 de mana.)");
                System.out.println("3. Fugir");
                
                int escolhaBatalha = scanner.nextInt();
                
                boolean fugaBemSucedida = false;
                

                switch (escolhaBatalha) {
                    case 1:
                        if (pokemon.manaExtra >= 3) {
                             pokemon.atacar(oponenteC);
                        } else {
                            System.out.println("\nVoce nao tem mana suficiente para atacar!");
                        }
                        break;
                     case 3:
                         fugaBemSucedida = app.tentarFugir(pokemon);                   
                        break;
                     case 2:
                         if (pokemon.manaExtra >= 8) {
                             pokemon.atacarForte(oponenteC);
                         } else {
                             System.out.println("Voce nao tem mana suficiente para ataque especial");
                         break;
                         }
                }
                
                if (fugaBemSucedida) {
                     System.out.println("Voce fugiu da batalha pela Insignia como um COVARDE!\nA cidade inteira ficou sabendo do  ocorrido, e como retaliacao "
                             + "voce foi enforcado em praca publica para servir de exemplo!\nNunca fuja de uma batalha POKEMON!"
                             + "\n"
                             + "\n"
                             + "\n"
                             + "\nFIM.");
                    
                    break;
                }

                if (oponenteC.vida > 0 && oponenteC.mana >= 3) {
                    
                    oponenteC.atacar(pokemon);
                    
                } else if (oponenteC.vida > 0 && oponenteC.mana < 3) {
                    
                    System.out.println("Oponente nao tem mana suficiente para atacar!");
                }
            
                System.out.println("Sua vida: " + pokemon.vidaExtra + "\nVida inimiga: " + oponenteC.vida);        
            

                if (!oponenteC.estaVivo()) {
                    System.out.println("\n" + oponenteC.nome + " foi derrotado!");
                    System.out.println("\nVoce ganhou a Insignia do Ginasio de Cerulean!\nVoce completou o primeiro passo para se tornar um mestre POKEMON!\n"
                            + "PARABENS!!!"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "\nFIM.");
                    break;
                } 
        }

        } else if (escolha2 == 2) {
            System.out.println("Voce passa reto pelo Ginasio... Parabens, voce e muito chato!"
                    + "\nO jogo acabou porque temos desgosto de jogadores como voce!!!"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\nFIM.");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Personagem pokemon = new Bulbasaur();
        Dados dados = new Dados();
        App app = new App();
        
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
         
         System.out.println("\nCerto! Seu primeiro parceiro em sua jornada e " + pokemon.nome + "! " + treinador + ", agora vamos definir"
                 + " os status extras de seu POKEMON!");
         
         System.out.println("\nDados para ataque: ");
                 int dados1 = dados.rolarDados(scanner);
                 System.out.println("\nDados para vida: ");
                 int dados2 = dados.rolarDados(scanner);
                 System.out.println("\nDados para mana: ");
                 int dados3 = dados.rolarDados(scanner);
   
                 
                pokemon.ataqueBase = pokemon.ataqueBase + dados1;
                pokemon.vidaBase = pokemon.vidaBase + dados2;
                pokemon.manaBase = pokemon.manaBase + dados3;   
                
                System.out.println("\nSeu ataque: " + pokemon.ataqueBase);
                System.out.println("Sua vida: " + pokemon.vidaBase);
                System.out.println("Seu mana: " + pokemon.manaBase);
                
         System.out.println("\nCerto, " + treinador + "! Voce tera uma jornada e tanto pela frente, "
                 + "cuide bem do seu POKEMON e se divirta nessa fantastica aventura que lhe aguarda no mundo POKEMON!");
         
        app.caminho1(pokemon);
    }
}
