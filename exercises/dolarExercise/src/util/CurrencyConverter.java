package util;

public class CurrencyConverter {
	
	    // A taxa de 6% (IOF) em valor decimal
		public static final double IOF_TAX = 0.06;
		
		/**
		 * Calcula o valor em reais a ser pago para comprar uma certa quantia de dólares.
		 * @param dollarPrice A cotação atual do dólar.
		 * @param amountInDollars A quantidade de dólares a serem comprados.
		 * @return O valor total em reais, incluindo a taxa IOF.
		 */
		public static double amountToBePaidInReais(double dollarPrice, double amountInDollars) {
			double totalWithoutTax = dollarPrice * amountInDollars;
			double taxValue = totalWithoutTax * IOF_TAX;
			
			return totalWithoutTax + taxValue;
		}
}
