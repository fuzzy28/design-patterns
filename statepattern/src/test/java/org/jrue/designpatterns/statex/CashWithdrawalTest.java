package org.jrue.designpatterns.statex;

import org.jrue.designpatterns.state.WithdrawalContext;

public class CashWithdrawalTest {

	public static void main(String[] args) {
		//happy path
		WithdrawalContext cashWithdraw = new WithdrawalContext();
		cashWithdraw.insertCard();
		cashWithdraw.inputPin("1234");
		
		System.out.println("-------------------------------------");
		
		//monkey test
		cashWithdraw.insertCard();
		cashWithdraw.withdrawAmount(); 
		cashWithdraw.inputAmount(123); 
		cashWithdraw.inputPin("1");
		cashWithdraw.inputAmount(445);
		cashWithdraw.inputPin("");
		cashWithdraw.inputPin(null);
		cashWithdraw.inputAmount(124);
		cashWithdraw.withdrawAmount();
		cashWithdraw.insertCard();
		cashWithdraw.inputPin("1234");
		cashWithdraw.inputPin("12");
		cashWithdraw.inputPin("1234");
		cashWithdraw.inputAmount(0);
		cashWithdraw.inputPin("1234");
		cashWithdraw.inputAmount(0);
		cashWithdraw.inputAmount(-1);
		cashWithdraw.cancelTransaction();		
		cashWithdraw.withdrawAmount();
		cashWithdraw.insertCard();
		cashWithdraw.cancelTransaction();
		cashWithdraw.cancelTransaction();		
	}
}
