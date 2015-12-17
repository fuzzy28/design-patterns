package org.jrue.designpatterns.state;

class PasswordValidState extends CashWidthrawal {

	public PasswordValidState(WithdrawalContext context) {		
		super(context);
	}
	
	@Override
	void inputPin(String pinNo) {
		System.out.println("Pin already entered");
	}
	
	@Override
	void inputAmount(double amount) {
		if(amount > 0) {
			System.out.println("Amount entered");
			context.setCurrentState(context.getAmountValidState());
		} else {
			System.out.println("Please enter amount greater than 0");
			context.setCurrentState(context.getAmountNotValidState());
		}
	}
	
	@Override
	void withdrawAmount() {
		System.out.println("Enter amount to be withdrawn first");
	}
}
