package it.be.util;

import it.be.entity.Calculator;
import it.be.entity.CoinBundle;

public class SimpleCalculator implements Calculator {

	@Override
	public int calculateTotal(CoinBundle enteredCoins) {
		
		return enteredCoins.getTotal();
	}

	@Override
	public CoinBundle calculateChange(int amountMoneyToReturn) {
		
		CoinBundle change = new CoinBundle(new int[5]);
		int remainingAmount = amountMoneyToReturn;
		
		change.number100Cents = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		change.number50Cents = remainingAmount / 50;
		remainingAmount = remainingAmount % 50;
		
		change.number20Cents = remainingAmount / 20;
		remainingAmount = remainingAmount % 20;
		
		change.number10Cents = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		change.number5Cents = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		return change;
	}

}
