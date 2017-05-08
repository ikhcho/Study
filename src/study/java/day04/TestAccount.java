package study.java.day04;

class Account{
	String accNo;
	static int balance=0;
	
	void save(int money){
		balance+=money;
		if(money>=10000){
			money=money/10000;
			System.out.println(getAccNo()+" ���¿� " + money + "������ �ԱݵǾ����ϴ�.");
			getBalance();
		}else{
			System.out.println(getAccNo()+" ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
			getBalance();
		}
		
	}
	void deposit(int money){
		balance-=money;
		if(money>=10000){
			money=money/10000;
			System.out.println(getAccNo()+" ���¿� " + money + "������ ��ݵǾ����ϴ�.");
			getBalance();
		}else{
			System.out.println(getAccNo()+" ���¿� " + money + "���� ��ݵǾ����ϴ�.");
			getBalance();
		}
	}
	void getBalance(){
		if(balance>=10000){
			System.out.println(getAccNo()+" ������ �ܰ�� " + balance/10000 + "�����Դϴ�.");
		}else{
			System.out.println(getAccNo()+" ������ �ܰ�� " + balance + "���Դϴ�.");
		}
	}
	String getAccNo(){
		return accNo;
	}
	Account(String accNo){
		this.accNo = accNo;
		System.out.println(getAccNo() + " ���°� �����Ǿ����ϴ�.");
		getBalance();
	}
}
public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account("078-3762-293");
		a.save(100000);
		a.deposit(50000);
	}
}
