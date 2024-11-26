package bai4;

public class SavingAccount implements iBank, iSavingAccount {
	double accountBalance = 0;
	
	public SavingAccount(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public void SetSavingAmount(double amount) {
		// TODO Auto-generated method stub
		accountBalance += amount;
	}

	@Override
	public double GetAmount() {
		// TODO Auto-generated method stub
		return accountBalance;
	}
	
}
