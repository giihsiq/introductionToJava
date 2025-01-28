package dataInputAndOutputTest;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.println(product1 + ", " + "which price is $ " + String.format("%.2f", price1));
		System.out.println(product2 + ", which price is $ " + String.format("%.2f", price2));
		System.out.println();
		
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.println();
		
		System.out.println("Measure with eight decimal places: " + String.format("%.8f", measure));
		System.out.println("Rouded (three decimal places): " + String.format("%.3f", measure));
		
		Locale.setDefault(Locale.US);
		System.out.println("US decimal point: " + String.format("%.3f", measure));
		}
}
