package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employ = new Employee();
		
		System.out.print("Name: ");
		employ.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employ.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employ.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employ);
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employ.increaseSalary(percentage);
		
		System.out.println();
		
		System.out.print("Updated data: " + employ);
		
		sc.close();
	}

}
