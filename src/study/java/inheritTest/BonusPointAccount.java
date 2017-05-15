package study.java.inheritTest;

public class BonusPointAccount extends Account{
	int bonusPoint;    // 누적 포인트  
    
	public BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	
	void deposit(int amount){//예금시 0.1% 적립 
		bonusPoint = (int)(amount*0.001);
		setBalance(getBalance()+amount+bonusPoint);
	}

}
