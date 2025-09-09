package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Example {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		// Calculator[] = classe
		// vetor do tipo referência inicia n valores nulo, por conta do new (instanciando a classe Calculator)
		Calculator[] vector = new Calculator[n];
		
		for (int i=0; i<n; i++) {
			scanner.nextLine();
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			
			vector[i] = new Calculator(name, price);
		}
		
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
			// acessando o vetor na posição i e pegando o valor armazenado
			sum += vector[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("Average price = %.2f%n", avg);
		
		scanner.close();
		
	}

}
