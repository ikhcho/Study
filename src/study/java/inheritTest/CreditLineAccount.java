package study.java.inheritTest;

public class CreditLineAccount extends Account {
    int creditLine;   
    
    public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override
    int withdraw(int amount) {
        //���̳ʽ� �ѵ��� ���������� ����
    	if(creditLine - amount > getBalance()){
    		setBalance(getBalance()-amount);
    		return amount;
    	}
    	else System.out.println("���̳ʽ� �ѵ��� ���������� ����"); return 0;
     }       

}
