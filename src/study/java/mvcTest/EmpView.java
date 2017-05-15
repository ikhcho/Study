package study.java.mvcTest;

public class EmpView {
	
	public void print(EmpDTO empone){
		System.out.println(empone);
		
	}
	
	public void print(EmpDTO[] emplist){
		for(EmpDTO emp : emplist ){
			if(emp != null)
			System.out.println(emp);
		}
	}
}
