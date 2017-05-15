package study.java.apiTest;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] iarr = {10,30,90,60,70,80};
		
		int result = Arrays.binarySearch(iarr,60);
		System.out.println(result);
		System.out.println(Arrays.toString(iarr));
		Arrays.sort(iarr);
		System.out.println(Arrays.toString(iarr));
	
		Student[] students = new Student[5];
		students[0] = new Student("A",10,"정통",new int[]{10,20,30});
		students[1] = new Student("B",11,"컴공",new int[]{11,20,25});
		students[2] = new Student("C",12,"정통",new int[]{14,26,34});
		students[3] = new Student("D",13,"컴공",new int[]{13,22,36});
		students[4] = new Student("E",14,"정통",new int[]{18,26,38});
		System.out.println(Arrays.toString(students));
		Arrays.sort(students);
	}

}

class Student{
	String name;
	int age;
	String major;
	int[] score;
	public Student(String name, int age, String major, int[] score) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", major=" + major + ", score=" + Arrays.toString(score)
				+ ", getSum=" + getSum() + "]";
	}
	
	public int getSum(){
		int sum1=0;
		for(int jumsu : score){
			sum1+=jumsu;
		}
		return sum1;
	}
	public int compareTo(Student obj){
		int sum2=0;
		for(int jumsu : obj.score){
			sum2+=jumsu;
		}
			
		return getSum()-sum2;
	}
	
	
	
}