package controller;

import br.edu.fateczl.pilhainteiros.Pilha;

public class FatController {
    public long fatorial(int valor) {
        Pilha pilha = new Pilha();

        // Empilhar os valores de 1 até o valor fornecido
        for (int i = 1; i <= valor; i++) {
            pilha.push(i);
        }

        long resultado = 1;
        // Multiplicar os valores desempilhados para calcular o fatorial
        while (!pilha.isEmpty()) {
            try {
				resultado *= pilha.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        return resultado;
    }
}
