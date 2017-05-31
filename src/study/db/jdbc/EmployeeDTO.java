package study.db.jdbc;

import java.sql.Date;

//DTO(Data Transfer Object) 단순 데이터 전송 목적
//VO(Value Object)
//JavaBeans기술에서 이용
//Mybatis에서 사용
//멤버변수, default생성자, getter/setter
public class EmployeeDTO {
	private int employee_id; //컬럼 이름하고 변수 이름이 같아야 편하다
	private String first_name;
	private String last_name;
	private String email;
	private Date hire_date;
	private String job_id;
	private int salary;
	private int department_id;
	
	EmployeeDTO(){}
	
	public EmployeeDTO(int employee_id, String first_name, String last_name, String email, Date hire_date,
			String job_id, int salary, int department_id) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.salary = salary;
		this.department_id = department_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeDTO [employee_id=").append(employee_id).append(", first_name=").append(first_name)
				.append(", last_name=").append(last_name).append(", email=").append(email).append(", hire_date=")
				.append(hire_date).append(", job_id=").append(job_id).append(", salary=").append(salary)
				.append(", department_id=").append(department_id).append("]");
		return builder.toString();
	}
	
	
}

/* 소문자 ctrl+shift+y, 대문자는 ctrl+shift+x
string sql = "select employee_id, first_name, "
		+ "last_name, email, hire_date, job_id, "
		+ "salary, department_id from employees";*/
