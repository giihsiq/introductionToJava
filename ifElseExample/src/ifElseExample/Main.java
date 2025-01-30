package ifElseExample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        int n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if (n > 0) {
		System.out.println("Não negativo");	
		} else {
			System.out.println("Negativo");
		}

		sc.close();
	
	}
}
