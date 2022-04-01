package it.be.util;

import it.be.entity.Calculator;
import it.be.entity.CoinBundle;
import it.be.entity.E_prodotto;
import it.be.entity.VendingMachine;

public class TextBasedVendingMachine implements VendingMachine {

	private int selectedProduct;
	private CoinBundle change;

	@Override
	public void displayProducts() {
		System.out.println("***********************************************");
		System.out.println("\tWELCOME TO THE VENDING MACHINE\n");
		System.out.println("***********************************************");

		System.out.println("\t Products available:\n");
		System.out.println("\t\n");

		for (E_prodotto prodotto : E_prodotto.values()) {
			System.out.println("\t\n" + prodotto.getSelectionNumber() + " " + prodotto.name() + "\t-> Price: "
					+ prodotto.getPrezzo());
		}

		System.out.println("\t\n");
		System.out.println("Please select your product: ");

	}

	@Override
	public void selectProducts(int selectionNumber) {
		this.selectedProduct = selectionNumber;
	}

	@Override
	public void displayEnterCoinsMessage() {
		System.out.println(" Please enter coins as follows: ");
		System.out.println(
				" Number of 5 cents coins, Number of 10 cents coins,Number of 20 cents coins,Number of 50 cents coins,Number of 100 cents coins ");

		System.out.println(" Please enter coins: ");
	}

	@Override
	public void enterCoins(int[] coins) {
		Calculator calculator = new SimpleCalculator();
		E_prodotto prodotto = E_prodotto.valueOf(this.selectedProduct);
		int total = calculator.calculateTotal(new CoinBundle(coins));

		int changeAmount = total - prodotto.getPrezzo();
		this.change = calculator.calculateChange(changeAmount);

	}

	@Override
	public void displayChangeMessage() {
		System.out.println("\t \n");
		System.out.println(" Your change is: " + change.getTotal() + " cents splitted as follows. ");
		System.out.println("\t 100 cents coins: " + change.number100Cents);
		System.out.println("\t 50 cents coins: " + change.number50Cents);
		System.out.println("\t 20 cents coins: " + change.number20Cents);
		System.out.println("\t 10 cents coins: " + change.number10Cents);
		System.out.println("\t 5 cents coins: " + change.number5Cents);
	}

	@Override
	public void displayProductMessage() {
		E_prodotto prodotto = E_prodotto.valueOf(this.selectedProduct);
		System.out.println("\t \n");
		System.out.println(" Enjoy your " + prodotto.name());
	}

}
