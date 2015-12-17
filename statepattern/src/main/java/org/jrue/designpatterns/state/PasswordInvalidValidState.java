package org.jrue.designpatterns.state;

class PasswordInvalidValidState extends CashWidthrawal {

	private int invalidCtr = 1;
	
	public PasswordInvalidValidState(WithdrawalContext context) {		
		super(context);
	}
	
	@Override
	void inputPin(String pinNo) {
		if(pinNo != null && pinNo.length() == 4) {
			context.setCurrentState(context.getPasswordValidState());
		} else if(++invalidCtr == 3) {
			System.out.println("Wrong pin has been entered for 3 times, transaction has beeen automatically cancelled");
			context.setCurrentState(context.getMachineReadyState());
		} else {
			System.out.println("Wrong pin please try again");
		}
	}
	
	@Override
	void inputAmount(double amount) {
		System.out.println("Input a valid pin before entering an amount.");
	}
	
	@Override
	void withdrawAmount() {
		System.out.println("Can't withdraw amount, password is invalid!");
	}
}
