package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		/**
		 * Programa que lê os valores da largura e altura de um retângulo,
		 * e calcula sua área, perímetro e diagonal.
		 *
		 * Program to read the width and height of a rectangle,
		 * and calculate its area, perimeter, and diagonal.
		 *
		 * @author Giovanna Siqueira
		 */

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		
		Rectangle pRectangle = new Rectangle();
		
		pRectangle.width = scanner.nextDouble();
		pRectangle.height = scanner.nextDouble();
		
		System.out.println(pRectangle.toString());
		
		scanner.close();
		
	}

}
