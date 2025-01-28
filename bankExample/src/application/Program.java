package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Account account;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char question = sc.next().charAt(0);

        if (question == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            // Criou conta contendo number, holder e initialdeposit
                account = new Account(number, holder, initialDeposit);
        } else {
            //Criou conta contendo number, holder com initialdeposit = 0
                account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.print(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        // Criou uma variável temporária para referenciar o construtor deposit
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.print(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();

	}

}
