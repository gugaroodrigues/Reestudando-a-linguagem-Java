package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Exercicu_4_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, numeropares;
		
		System.out.print("Quantas pessoas serão digitadas?");
		n = sc.nextInt();
		
		int [] vetor = new int [n];
		
		for( int i= 0; i< n; i++) {
			System.out.print("Digite um numero ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNumeros Pares: ");
		
		numeropares = 0;
		for (int i = 0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d  ", vetor[i]);
				numeropares++;
			}
		}
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", numeropares);
		
		
		
		
		
		sc.close();

	}

}
