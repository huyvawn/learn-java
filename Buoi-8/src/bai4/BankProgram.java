package bai4;

public class BankProgram {
public static void main(String[] args) {
	SavingAccount acc1 = new SavingAccount(500);
	acc1.SetSavingAmount(500);
	System.out.println("Your saving amount of account 1 is: "+ acc1.GetAmount());
	
	CreditAccount acc2 = new CreditAccount(0);
	acc2.CreditAmount(500);
	System.out.println("Your account balance of acc2 is: " +acc2.GetAmount());
}
}
