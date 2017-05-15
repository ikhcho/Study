package study.java.mvcTest;


//DAO(Data Access Object)
//Business logic작성
public class EmpDAO {
	static  EmpDTO[] emplist = new EmpDTO[10];
	
	static void save(){
		emplist[0] = new EmpDTO(1, "일", 100);
		emplist[1] = new EmpDTO(2, "이", 200);
		emplist[2] = new EmpDTO(3, "삼", 300);
		emplist[3] = new EmpDTO(4, "사", 400);
		emplist[4] = new EmpDTO(5, "오", 500);
	}
	
	
	public void selectOne(int empid ){
		EmpView one = new EmpView();
		one.print(emplist[empid-1]);
	}
	
	public void selectAll(){
		EmpView all = new EmpView();
		all.print(emplist);
	}
	
	public void insert(EmpDTO newDTO){
		emplist[emplist.length] = newDTO;
		new EmpView().print(emplist);
	}
	public void update(EmpDTO newDTO){
		emplist[newDTO.getEmpid()-1] = newDTO;
		new EmpView().print(newDTO);
	}
	
	public void del(int empid){
		
		for(int i = empid; i<emplist.length; i++){
			emplist[i-1] = emplist[i];
		}
		new EmpView().print(emplist);
	}
}
