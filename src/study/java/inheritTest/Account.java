package study.java.inheritTest;

public class Account {
	private String accountNo;
    private String ownerName;
    private int balance;
    
    
    public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

    void deposit(int amount) {
         //�ܰ����� 
    	balance += amount;
    }
    int withdraw(int amount) {
         //�ܰ��� ū �ݾ� ���ҺҰ� 
    	if(balance > amount){
    		balance-=amount;
    		return amount;
    	}
    	else {
    		System.out.println("�ܰ��� ū �ݾ� ���ҺҰ�");
    		return 0;
    	}
    }
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accountNo=");
		builder.append(accountNo);
		builder.append(", ownerName=");
		builder.append(ownerName);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}

}
