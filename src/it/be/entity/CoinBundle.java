package it.be.entity;

public class CoinBundle {

	public int number5Cents;
	public int number10Cents;
	public int number20Cents;
	public int number50Cents;
	public int number100Cents;

	public CoinBundle(int[] enteredCoins) {
		this.number5Cents = enteredCoins[0];
		this.number10Cents = enteredCoins[1];
		this.number20Cents = enteredCoins[2];
		this.number50Cents = enteredCoins[3];
		this.number100Cents = enteredCoins[4];

	}

	public int getTotal() {
		int total = 0;
		total += this.number5Cents * 5;
		total += this.number10Cents * 10;
		total += this.number20Cents * 20;
		total += this.number50Cents * 50;
		total += this.number100Cents * 100;

		return total;
	}

}
