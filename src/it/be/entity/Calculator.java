package it.be.entity;

public interface Calculator {
	
	int calculateTotal(CoinBundle enteredCoins);
	
	
	CoinBundle calculateChange(int amountMoneyToReturn);
	

}
