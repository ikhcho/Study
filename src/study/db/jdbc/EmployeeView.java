package study.db.jdbc;

import java.util.List;

//View(data�� �޾Ƽ� ���)...JSP
public class EmployeeView {
	
	public static void print(List<EmployeeDTO> emplist){
		System.out.println("��� ���� ���� ���");
		
		for(EmployeeDTO emp : emplist){
		
			System.out.println(emp);
		}
	}
	
	public static void print(EmployeeDTO emp){
		System.out.println("�� ���� ���� ������ ���");
		System.out.println(emp);
	}
	
	public static void print(String msg){
		System.out.println(msg);
	}
}
