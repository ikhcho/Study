package java.com.day04;

public class Employee {//extends Object...�����Ǿ��ִ� �θ�Ŭ����
	private String id;
	private String name;
	private int baseSalary;
	
	Employee(String id, String name, int baseSalary){
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getSalary(double bonus){
		double salary = baseSalary + baseSalary * bonus ;
		return salary;
	}
	
	public String toString(){
		String msg = name
				+"("
				+id
				+") ����� �⺻���� "
				+baseSalary
				+"�� �Դϴ�.";
		return msg;
	}
}
