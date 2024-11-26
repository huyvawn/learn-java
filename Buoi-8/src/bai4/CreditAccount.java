package bai4;

public class CreditAccount implements iBank,iCreditAccount {

	double accountBalance = 0;
	public CreditAccount(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public void CreditAmount(double amount) {
		// TODO Auto-generated method stub
		accountBalance -= amount;
	}

	@Override
	public double GetAmount() {
		// TODO Auto-generated method stub
		return accountBalance;
	}

}
