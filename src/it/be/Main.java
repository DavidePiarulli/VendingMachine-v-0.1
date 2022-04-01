package it.be;

import java.util.Scanner;

import it.be.entity.Coin;
import it.be.entity.VendingMachine;
import it.be.util.TextBasedVendingMachine;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		VendingMachine vendingMachine = new TextBasedVendingMachine();

		vendingMachine.displayProducts();

		String selectedProduct = scanner.nextLine();
		int selectProductNumber = Integer.parseInt(selectedProduct);

		vendingMachine.selectProducts(selectProductNumber);

		vendingMachine.displayEnterCoinsMessage();

		String userEnteredCoins = scanner.nextLine();

		int[] enteredCoins = Coin.parseCoins(userEnteredCoins);

		vendingMachine.enterCoins(enteredCoins);
		vendingMachine.displayChangeMessage();

		vendingMachine.displayProductMessage();

		scanner.close();

	}

}
