package study.java.mvcTest;


//DTO(Data Transfer Object), VO(Value Object)
//JavaBeans... �ݵ�� default �����ڰ� �����ؾ��Ѵ�.
//POJO(Plain Old Java Object)
public class EmpDTO {
	private int empid;
	private String name;
	private int salary;
	
	public EmpDTO(){
		// �߰� �����ڰ� ����� �ݵ�� �������Ѵ�.
	}
	
	public EmpDTO(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmpDTO [empid=");
		builder.append(empid);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	
}
