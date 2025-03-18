package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicaomaior;
		double maior;

		System.out.print("Quantas numeros você vai digitadar? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero ");
			vetor[i] = sc.nextDouble();
		}

		maior = vetor[0];
		posicaomaior = 0;

		for (int i = 0; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicaomaior = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaomaior);

	}

}
