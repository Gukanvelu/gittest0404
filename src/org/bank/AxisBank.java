package org.bank;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		System.out.println("Deposit : 7.5%");
		super.deposit();
	}
	private void loan() {
	
		System.out.println("Loan : 9.5%");
	}
	

	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();
	    a.loan();
	}
	
	
}
