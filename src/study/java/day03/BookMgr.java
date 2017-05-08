package study.java.day03;

public class BookMgr {
	//1
	Book[] booklist;
	
	//2
	BookMgr(Book[] size){
		booklist = size;
	}
	
	//3
	public void printBookList(){
		System.out.println("=== 책 목록 ===");
		
		for(Book i : booklist){
			System.out.println(i.getTitle());
		}
		/*
		 for(int i=0; i<booklist.length; i++)
		{
			System.out.println(booklist[i].getTitle());
		}
		*/
		System.out.println();
	}
	
	//4
	public void printTotalPrice(){
		int sum=0;
		System.out.println("=== 책 가격의 총합 ===");
		
		for(Book i : booklist){
			sum += i.getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + sum);
		
	}
}
