package study.java.mvcTest;

import java.util.Scanner;

public class EmpController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpDAO.save();
		
		while(true){
			System.out.println("���ϴ� �۾��� �����ϼ���");
			System.out.println("1.�Ѹ���ȸ");
			System.out.println("2.��ü��ȸ");
			System.out.println("3.�߰�");
			System.out.println("4.����");
			System.out.println("5.����");
			System.out.println("9.����");
			
			int select=sc.nextInt();
			
			//�迭������ �ƴ� �����ȣ�� ���� �迭 �ּҸ� �����Ͽ� �̾��ֵ��� �����
			switch(select){
				case 1: 
					EmpDAO searchOne = new EmpDAO();
					System.out.println("�˻��� �����ȣ�� �Է��ϼ���.");
					searchOne.selectOne(sc.nextInt());
					break;
				case 2: 
					EmpDAO all = new EmpDAO();
					all.selectAll();
					break;
				case 3:
					EmpDAO ins = new EmpDAO();
					EmpDTO newEmp = new EmpDTO();
					System.out.println("�����ȣ�� �Է��ϼ���.");
					newEmp.setEmpid(sc.nextInt());
					System.out.println("�̸��� �Է��ϼ���.");
					newEmp.setName(sc.next());
					System.out.println("������ �Է��ϼ���.");
					newEmp.setSalary(sc.nextInt());
					ins.update(newEmp);
					break;
				case 4: 
					EmpDAO upd = new EmpDAO();
					EmpDTO newDTO = new EmpDTO();
					System.out.println("������ �����ȣ�� �Է��ϼ���.");
					newDTO.setEmpid(sc.nextInt());
					System.out.println("������ �̸��� �Է��ϼ���.");
					newDTO.setName(sc.next());
					System.out.println("������ ������ �Է��ϼ���.");
					newDTO.setSalary(sc.nextInt());
					upd.update(newDTO);
					break;
				case 5: 
					EmpDAO del = new EmpDAO();
					System.out.println("������ �����ȣ�� �Է��ϼ���.");
					del.del(sc.nextInt());
					break;
				case 9: break;
				
				
			}
		}
	}
	
}
