package study.java.objectTest;

public class Money {
	int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(Money money) {
        //더하기 구현
    	return new Money(this.amount+money.amount);
    }
    public Money minus(Money money) {
        //빼기 구현
    	return new Money(this.amount-money.amount);
    }
    public Money multiply(Money money) {
        //곱하기 구현
    	return new Money(this.amount*money.amount);
    }
    public Money devide(Money money) {
        //나누기 구현
    	return new Money(this.amount/money.amount);
    } 
    @Override
    public boolean equals(Object object) {
        //Object equals 메쏘드 재정의
    	if(object instanceof Money){
    		return this.amount == ((Money) object).amount?true:false;
    	}
    	else return false;
    }
    public static void main(String[] args){
        Money five  = new Money(5);
        Money two   = new Money(2);
        Money three = new Money(3);
        Money ten   = new Money(10);
        
        if( five.equals(two.add(three))
            && three.equals(five.minus(two))
            && ten.equals(five.multiply(two))
            && two.equals(ten.devide(five)) )  {
            System.out.println("Money Class 구현을 완료 하였습니다.");
        }
    }
}
