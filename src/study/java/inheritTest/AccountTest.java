package study.java.inheritTest;

public class AccountTest {
	public static void main(String[] args) {
		Account act = new Account("112-304-402", "조익현", 400000);		
		System.out.println(act);
		
		CheckingAccount act2 = new CheckingAccount("113-402-4023", "조익현2", 500000, "123-456-789");
		System.out.println(act2);
		
		CreditLineAccount act3 = new CreditLineAccount("1414-213123-123123", "조익현3", 0, 10000);
		System.out.println(act3);
		
		BonusPointAccount act4 = new BonusPointAccount("402-343-2323", "보너스", 500000, 0);
		work(act);
		work(act2);
		work(act3);
		work(act4);
	}
	
	public static void work(Account account){
		
		account.withdraw(40000);
		account.deposit(50000);
		
		if(account instanceof CheckingAccount) ((CheckingAccount) account).pay(((CheckingAccount) account).cardNo, 30000);
		
		System.out.println(account);
		System.out.println("==================");
		
	}
}
