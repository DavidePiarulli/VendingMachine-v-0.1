package it.be.entity;

public interface VendingMachine {
	void displayProducts();

	void selectProducts(int selectionNumber);

	void displayEnterCoinsMessage();

	void enterCoins(int[] coins);

	void displayChangeMessage();

	void displayProductMessage();
}
