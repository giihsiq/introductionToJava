package arrayExample;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // tipo do vetor - vect (vetor) = criar novo vetor do tipo double com [n vezes]
        double[] vect = new double[n];

        // para i começa na posição 0
        // enquanto i for MENOR que n
        // incrementa o i >>> pula pra posição 1
        for (int i=0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        // soma dos elementos dividos pelo n° de elementos
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = (sum / n);

        System.out.printf("Average height: %2f%n", avg);

        sc.close();

    }
}
