package org.jrue.designpatterns.state;

abstract class CashWidthrawal {
	
	protected WithdrawalContext context;
	
	public CashWidthrawal(WithdrawalContext context) {
		this.context = context;
	}
	
	void insertCard() {
		System.out.println("A card already inserted");
	}
	void inputPin(String inputPin) {
		throw new UnsupportedOperationException();
	}
	void inputAmount(double amount) {
		throw new UnsupportedOperationException();
	}
	void cancelTransaction() {
		System.out.println("Transaction has been cancelled");
		context.setCurrentState(context.getMachineReadyState());
	}
	void withdrawAmount() {
		throw new UnsupportedOperationException();
	}
}
