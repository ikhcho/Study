package study.java.genericTest;

import java.lang.reflect.Array;
import java.util.Arrays;

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

}

class Worker extends Person {

	public Worker(String name) {
		super(name);
	}
}

class Student extends Person {

	public Student(String name) {
		super(name);
	}

}

class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
	}

}

class Course<T> {
	String name;
	T[] students;

	public Course(String name, int size) {
		super();
		this.name = name;
		students = (T[]) (new Object[size]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}

public class GenericTest2 {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName());
	}

	public static void registerCourseStudent(Course<? extends Student> course) {

	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {

	}
	public static void main(String[] args) {
		Course<Person> personCourse = new Course("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);

	}

}
