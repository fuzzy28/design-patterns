package org.jrue.designpatterns.state;

class AmountValidState extends CashWidthrawal {

	public AmountValidState(WithdrawalContext context) {
		super(context);		
	}
	
	@Override
	void inputPin(String pinNo) {
		System.out.println("Pin already entered.");
	}
	
	@Override
	void inputAmount(double amount) {
		System.out.println("Amount already entered");
	}
	
	@Override
	void withdrawAmount() {
		System.out.println("Amount has been withdrawn!\nThank you!");
		context.setCurrentState(context.getMachineReadyState());
	}
}
