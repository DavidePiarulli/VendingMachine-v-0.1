package it.be.entity;

public enum E_prodotto {
	
	CAFFÉ(1, 40),
	CAPPUCCINO(2, 60),
	EMPTY(0, 0);
	
	private int selectionNumber;
	private final int prezzo;
	
	
	private E_prodotto(int selectionNumber, int prezzo) {
		this.selectionNumber = selectionNumber;
		this.prezzo = prezzo;
	}


	public int getSelectionNumber() {
		return selectionNumber;
	}


	public int getPrezzo() {
		return prezzo;
	}

	public static E_prodotto valueOf(int productSelected) {
		for (E_prodotto product : E_prodotto.values()) {
			if(productSelected == product.getSelectionNumber()) {
				return product;
			}
		}
		return null;
	}
	
}


