package study.java.inheritTest;

public class CheckingAccount extends Account{
    String cardNo;                     
    
    
    public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}


	int pay(String cardNo, int amount) {
      //ī���ȣ�� �ٸ��� ���ҺҰ� 
      //        �ݾ׸�ŭ ����
    
    	if(this.cardNo == cardNo) return withdraw(amount);
    	else {
    		System.out.println("ī���ȣ�� �ٸ��� ���ҺҰ�");
    		return 0;
    	}
     }

}
