
public interface IABCBankAccount {
	static void showMessage() {
		System.out.println("Welcome to ABC Bank!");
	}
	
}
interface IBankTransaction extends  IABCBankAccount{
	
	void depositAmount();
	void withdrawAmount();
	void balancecheck();
}
class SavingsAccount implements IBankTransaction{

	@Override
	public void depositAmount() {
		System.out.println("Deposit in Savings Account.");
	}

	@Override
	public void withdrawAmount() {
		System.out.println("Withdraw in Savings Account.");
	}

	@Override
	public void balancecheck() {
		System.out.println("Balance in Savings Account.");
	}
	
	
}

class CurrentAccount implements IBankTransaction{

	@Override
	public void depositAmount() {
		System.out.println("Deposit in Current Account.");
	}

	@Override
	public void withdrawAmount() {
		System.out.println("Withdraw in Current Account.");
	}

	@Override
	public void balancecheck() {
		System.out.println("balance in Current Account.");
	}
	
}








