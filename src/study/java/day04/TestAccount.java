package study.java.day04;

class Account{
	String accNo;
	static int balance=0;
	
	void save(int money){
		balance+=money;
		if(money>=10000){
			money=money/10000;
			System.out.println(getAccNo()+" 계좌에 " + money + "만원이 입금되었습니다.");
			getBalance();
		}else{
			System.out.println(getAccNo()+" 계좌에 " + money + "원이 입금되었습니다.");
			getBalance();
		}
		
	}
	void deposit(int money){
		balance-=money;
		if(money>=10000){
			money=money/10000;
			System.out.println(getAccNo()+" 계좌에 " + money + "만원이 출금되었습니다.");
			getBalance();
		}else{
			System.out.println(getAccNo()+" 계좌에 " + money + "원이 출금되었습니다.");
			getBalance();
		}
	}
	void getBalance(){
		if(balance>=10000){
			System.out.println(getAccNo()+" 계좌의 잔고는 " + balance/10000 + "만원입니다.");
		}else{
			System.out.println(getAccNo()+" 계좌의 잔고는 " + balance + "원입니다.");
		}
	}
	String getAccNo(){
		return accNo;
	}
	Account(String accNo){
		this.accNo = accNo;
		System.out.println(getAccNo() + " 계좌가 개설되었습니다.");
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
