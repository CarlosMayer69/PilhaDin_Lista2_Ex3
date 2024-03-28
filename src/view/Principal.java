package view;

import java.util.Scanner;
import br.edu.fateczl.pilhainteiros.Pilha;
import controller.FatController;

public class Principal {
    public static void main(String[] args) {
    	
    	Pilha p = new Pilha();
    	
        Scanner scanner = new Scanner(System.in);
        int valor;

        // Pedir ao usuário um valor inteiro de 0 a 10
        do {
            System.out.print("Digite um valor inteiro de 0 a 10: ");
            valor = scanner.nextInt();
        } while (valor < 0 || valor > 10);

        scanner.close();

        // Chamar o método fatorial da classe FatController e exibir o resultado
        FatController controller = new FatController();
        long resultado = controller.fatorial(valor);
        System.out.println("O fatorial de " + valor + " é: " + resultado);
    }
}

