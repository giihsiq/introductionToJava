package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// Recebe o número do tamanho de array desejado
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();
		
		int[] vetor = new int[n];
			
			//Cria o for para incrementar o vetor com os valores digitados pelo usuário
			for (int i=0; i<n; i++) {
				System.out.print("Digite um numero: ");
				vetor[i] = scanner.nextInt();
			}
				
				//Analisa se o número digitado é negativo, se for, adiciona no vetor
			System.out.print("Números negativos: ");
			for (int i=0; i<n; i++) {
			  if (vetor[i] < 0) {
			  System.out.println(vetor[i]);
			  }
		    }
				
		scanner.close();
	}

}
