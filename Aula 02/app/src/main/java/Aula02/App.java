/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Aula02;

public class App {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Felipe", 19);
        
        pessoa1.apresentarPessoa();
        
        System.out.println("");
        
        Animal animal1 = new Animal("Gato", "Siames", "Dolly" );
        
        animal1.apresentarAnimal();
        
        System.out.println("");
        
        Carro carro1 = new Carro("Volkswagen", "Gol", "Cinza", 2017);
        
        carro1.apresentarCarro();
        
        
        /*
        
        double numero1 = 50;
        double numero2 = 30;
        
        
        double soma = numero1 + numero2;
        double sub = numero1 - numero2;
        double multi = numero1 * numero2;
        double div = numero1 / numero2;
        double modulo = numero1 % numero2;
        
        System.out.println(soma);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(modulo);
        
        
        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);
        System.out.println(numero1 > numero2);
        System.out.println(numero1 >= numero2);
        System.out.println(numero1 < numero2);
        System.out.println(numero1 <= numero2);
        
        
        boolean ligado = true;
        boolean quebrado = false;
        
        System.out.println(quebrado && ligado);
        System.out.println(ligado || quebrado);
        System.out.println(ligado && !quebrado);
        
        
        int idade = 18;
        boolean maiorIdade = idade >= 18;
        boolean temCarteira = false;
        
        if (maiorIdade && temCarteira) {
            System.out.println("Você pode dirigir");
        } else if (maiorIdade) {
            System.out.println("Você é de maior, mas nao tem carteira");
        } else {
            System.out.println("Você nao tem idade para dirigir");
        }
        
        String time = "Gremio";
        
        switch(time) {
            case "Gremio":
                System.out.println("Maior do sul");
                break;
                
            case "Inter":
                System.out.println("Menor do sul");
                break;
                
            default:
                System.out.println("Time fraco inexistente");
                break;
        }
        
        int voltas = 0;
        while(voltas <= 10) {
            System.out.println("Voce ja pedalou " + voltas + " voltas!");
            voltas ++;
        }
        
        for (int contagem = 0; contagem <= 10; contagem ++) {
            System.out.println(contagem);
        }

        */
    }
}
