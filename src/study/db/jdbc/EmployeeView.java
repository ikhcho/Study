package study.db.jdbc;

import java.util.List;

//View(data를 받아서 출력)...JSP
public class EmployeeView {
	
	public static void print(List<EmployeeDTO> emplist){
		System.out.println("모든 직원 정보 출력");
		
		for(EmployeeDTO emp : emplist){
		
			System.out.println(emp);
		}
	}
	
	public static void print(EmployeeDTO emp){
		System.out.println("한 건의 직원 정보만 출력");
		System.out.println(emp);
	}
	
	public static void print(String msg){
		System.out.println(msg);
	}
}
