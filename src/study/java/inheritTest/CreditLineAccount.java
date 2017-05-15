package study.java.inheritTest;

public class CreditLineAccount extends Account {
    int creditLine;   
    
    public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override
    int withdraw(int amount) {
        //마이너스 한도를 넘지않으면 인출
    	if(creditLine - amount > getBalance()){
    		setBalance(getBalance()-amount);
    		return amount;
    	}
    	else System.out.println("마이너스 한도를 넘지않으면 인출"); return 0;
     }       

}
