package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dollar: ");
		double dollarPrice = scanner.nextDouble();
		
		System.out.print("Reais: ");
		double amountInDollars = scanner.nextDouble();
		
		System.out.print(CurrencyConverter.amountToBePaidInReais(dollarPrice, amountInDollars));
		
		scanner.close();
	}

}
