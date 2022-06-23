package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("Minimum Balance for savings Account is Rs500");
	}
	private void fixed() {
		System.out.println("Minimum duration for fixed Account is 6 months");
	}
	
	public static void main(String[] args) {
			BankInfo b=new BankInfo();
			b.savings();
			b.fixed();
			b.deposit();
	}
}
