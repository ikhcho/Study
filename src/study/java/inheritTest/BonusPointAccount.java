package study.java.inheritTest;

public class BonusPointAccount extends Account{
	int bonusPoint;    // ���� ����Ʈ  
    
	public BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	
	void deposit(int amount){//���ݽ� 0.1% ���� 
		bonusPoint = (int)(amount*0.001);
		setBalance(getBalance()+amount+bonusPoint);
	}

}
