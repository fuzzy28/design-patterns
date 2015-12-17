package org.jrue.designpatterns.state;

class HasCardState extends CashWidthrawal {

	public HasCardState(WithdrawalContext context) {
		super(context);	
	}
	
	@Override
	void inputPin(String pinNo) {
		if(pinNo != null && pinNo.length() == 4) {
			System.out.println("Pin has been entered");
			context.setCurrentState(context.getPasswordValidState());
		} else {
			System.out.println("Wrong Pin please try again");
			context.setCurrentState(context.getPasswordNotValidState());
		}
	}
	
	@Override
	void inputAmount(double amount) {
		System.out.println("You have to put your Pin first before entering an amount to be withdrawn");
	}
	
	@Override
	void withdrawAmount() {
		System.out.println("You have to put your Pin before withdrawing any amount");
	}
}
