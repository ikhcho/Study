package study.java.inheritTest;

public class CheckingAccount extends Account{
    String cardNo;                     
    
    
    public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}


	int pay(String cardNo, int amount) {
      //카드번호가 다르면 지불불가 
      //        금액만큼 차감
    
    	if(this.cardNo == cardNo) return withdraw(amount);
    	else {
    		System.out.println("카드번호가 다르면 지불불가");
    		return 0;
    	}
     }

}
