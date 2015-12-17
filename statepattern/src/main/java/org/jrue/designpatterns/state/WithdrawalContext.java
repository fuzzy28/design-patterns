package org.jrue.designpatterns.state;

public class WithdrawalContext {
	
	CashWidthrawal machineReadyState;	
	CashWidthrawal hasCardState;	
	CashWidthrawal passwordValidState;
	CashWidthrawal passwordNotValidState;
	CashWidthrawal amountValidState;
	CashWidthrawal amountNotValidState;
		
	CashWidthrawal currentState;
	
	public WithdrawalContext() {
		machineReadyState = new MachineReadyState(this);	
		hasCardState = new HasCardState(this);
		passwordValidState = new PasswordValidState(this);
		passwordNotValidState = new PasswordInvalidValidState(this);
		amountValidState = new AmountValidState(this);
		amountNotValidState = new AmountInvalidState(this);
		currentState = machineReadyState;
	}

	public void insertCard() {
		currentState.insertCard();
	}
	
	public void inputPin(String pinNo) {
		currentState.inputPin(pinNo);
	}
	
	public void inputAmount(double amount) {
		currentState.inputAmount(amount);
	}
	
	public void cancelTransaction() {
		currentState.cancelTransaction();
	}
	
	public void withdrawAmount() {
		currentState.withdrawAmount();
	}
	
	public CashWidthrawal getMachineReadyState() {
		return machineReadyState;
	}

	public void setMachineReadyState(CashWidthrawal machineReadyState) {
		this.machineReadyState = machineReadyState;
	}

	public CashWidthrawal getHasCardState() {
		return hasCardState;
	}

	public void setHasCardState(CashWidthrawal hasCardState) {
		this.hasCardState = hasCardState;
	}

	public CashWidthrawal getPasswordValidState() {
		return passwordValidState;
	}

	public void setPasswordValidState(CashWidthrawal passwordValidState) {
		this.passwordValidState = passwordValidState;
	}

	public CashWidthrawal getPasswordNotValidState() {
		return passwordNotValidState;
	}

	public void setPasswordNotValidState(CashWidthrawal passwordNotValidState) {
		this.passwordNotValidState = passwordNotValidState;
	}

	public CashWidthrawal getAmountValidState() {
		return amountValidState;
	}

	public void setAmountValidState(CashWidthrawal amountValidState) {
		this.amountValidState = amountValidState;
	}

	public CashWidthrawal getAmountNotValidState() {
		return amountNotValidState;
	}

	public void setAmountNotValidState(CashWidthrawal amountNotValidState) {
		this.amountNotValidState = amountNotValidState;
	}

	public CashWidthrawal getCurrentState() {
		return currentState;
	}

	public void setCurrentState(CashWidthrawal currentState) {
		this.currentState = currentState;
	}
	
}
