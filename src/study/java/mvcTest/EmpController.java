package study.java.mvcTest;

import java.util.Scanner;

public class EmpController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpDAO.save();
		
		while(true){
			System.out.println("원하는 작업을 선택하세요");
			System.out.println("1.한명조회");
			System.out.println("2.전체조회");
			System.out.println("3.추가");
			System.out.println("4.수정");
			System.out.println("5.삭제");
			System.out.println("9.종료");
			
			int select=sc.nextInt();
			
			//배열순서가 아닌 사원번호에 따른 배열 주소를 변경하여 이어주도록 변경요
			switch(select){
				case 1: 
					EmpDAO searchOne = new EmpDAO();
					System.out.println("검색할 사원번호를 입력하세요.");
					searchOne.selectOne(sc.nextInt());
					break;
				case 2: 
					EmpDAO all = new EmpDAO();
					all.selectAll();
					break;
				case 3:
					EmpDAO ins = new EmpDAO();
					EmpDTO newEmp = new EmpDTO();
					System.out.println("사원번호를 입력하세요.");
					newEmp.setEmpid(sc.nextInt());
					System.out.println("이름을 입력하세요.");
					newEmp.setName(sc.next());
					System.out.println("연봉을 입력하세요.");
					newEmp.setSalary(sc.nextInt());
					ins.update(newEmp);
					break;
				case 4: 
					EmpDAO upd = new EmpDAO();
					EmpDTO newDTO = new EmpDTO();
					System.out.println("변경할 사원번호를 입력하세요.");
					newDTO.setEmpid(sc.nextInt());
					System.out.println("변경할 이름을 입력하세요.");
					newDTO.setName(sc.next());
					System.out.println("변경할 연봉을 입력하세요.");
					newDTO.setSalary(sc.nextInt());
					upd.update(newDTO);
					break;
				case 5: 
					EmpDAO del = new EmpDAO();
					System.out.println("삭제할 사원번호를 입력하세요.");
					del.del(sc.nextInt());
					break;
				case 9: break;
				
				
			}
		}
	}
	
}
