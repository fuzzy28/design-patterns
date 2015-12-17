package org.jrue.designpatterns.state;

class AmountInvalidState extends CashWidthrawal {

	int wrongAmountCtr = 1;
	
	public AmountInvalidState(WithdrawalContext context) {
		super(context);		
	}
	
	@Override
	void inputPin(String pinNo) {
		System.out.println("Pin already entered.");
	}
	
	@Override
	void inputAmount(double amount) {
		if(amount > 0) {
			System.out.println("Amount entered");
			context.setCurrentState(context.getAmountValidState());
		} else if (++wrongAmountCtr == 3) {
			System.out.println("Wrong amount has been entered for 3 times, transaction has beeen automatically cancelled");
			context.setCurrentState(context.getMachineReadyState());
		} else {
			System.out.println("Please enter amount greater than 0");
		}
	}
	
	@Override
	void withdrawAmount() {
		System.out.println("Amount has been withdrawn!\n Thank you!");
		context.setCurrentState(context.getHasCardState());
	}
}
