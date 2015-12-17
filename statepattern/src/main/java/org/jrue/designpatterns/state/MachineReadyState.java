package org.jrue.designpatterns.state;

class MachineReadyState extends CashWidthrawal {

	public MachineReadyState(WithdrawalContext context) {
		super(context);
	}
	
	@Override
	void insertCard() {
		System.out.println("Welcome! Please input your Pin");
		context.setCurrentState(context.getHasCardState());
	}
	
	@Override
	void inputPin(String pinNo) {
		System.out.println("No ATM Card has been inserted.");
	}
	
	@Override
	void inputAmount(double amount) {
		System.out.println("You have to insert your ATM Card before entering any amount");
	}
	
	@Override
	void cancelTransaction() {		
		System.out.println("No transaction to be cancelled");
		context.setCurrentState(context.machineReadyState);
	}

	@Override
	void withdrawAmount() {
		System.out.println("You have to insert your ATM Card before withdrawing any amount");
	}
}
