package study.java.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

class ListTest{
	public static void listTest(){
		
		List<String> data = new ArrayList<String>();
		
		data.add("월");
		data.add("화");
		data.add("수");
		data.add("목");
		data.add("목");
		System.out.println(data.size()); // 중복허용
		for(String s : data){
			System.out.println(s + s.hashCode()); // 순서가있다
		}
	}
	
	public static void listTest2(){
		
		List<String> data = new LinkedList<String>();
		
		data.add("수");
		data.add("목");
		data.add("금");
		data.add("토");
		data.add("토");
		System.out.println(data.size()); // 중복허용
		for(String s : data){
			System.out.println(s + s.hashCode()); // 순서가있다
		}
	}
	
	public static void listTest3(){
		
		List<String> data = new Vector<String>();
		
		data.add("목");
		data.add("금");
		data.add("토");
		data.add("일");
		data.add("일");
		System.out.println(data.size()); // 중복허용
		for(String s : data){
			System.out.println(s + s.hashCode()); // 순서가있다
		}
	}
}

class SetTest{
	public static void print(Set<String> data){
		Iterator<String> it = data.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void setTest(){
		
		Set<String> data = new HashSet<String>();
		
		data.add("월");
		data.add("화");
		data.add("수");
		data.add("목");
		data.add("목");
		System.out.println(data.size()); // 중복허용
		SetTest.print(data);
	}
	
	public static void setTest2(){
		
		Set<String> data = new LinkedHashSet<String>();
		
		data.add("수");
		data.add("목");
		data.add("금");
		data.add("토");
		data.add("토");
		System.out.println(data.size()); // 중복허용
		for(String s : data){
			System.out.println(s + s.hashCode()); // 순서가있다
		}
	}
	
	public static void setTest3(){
		
		Set<String> data = new TreeSet<String>();
		
		data.add("목");
		data.add("금");
		data.add("토");
		data.add("일");
		data.add("일");
		System.out.println(data.size()); // 중복허용
		for(String s : data){
			System.out.println(s + s.hashCode()); // 순서가있다
		}
	}
}

class MapTest{
	
	public static void mapTest(){
		Map<String,Integer> data = new HashMap<String,Integer>();
		
		data.put("월",1);
		data.put("화",2);
		data.put("수",3);
		data.put("수",4);
		System.out.println(data.size()); 
		for(String s : data.keySet()){
			System.out.println(s + s.hashCode()+":"+data.get(s)); 
		}
		for(Entry<String,Integer> entry : data.entrySet()){
			System.out.println(entry.getKey() + entry.hashCode()+":"+entry.getValue());
		}
	}
}

public class CollectionTest {
	

	public static void main(String[] args) {
		ListTest.listTest();
		ListTest.listTest2();
		ListTest.listTest3();
		System.out.println("===================");
		SetTest.setTest();
		SetTest.setTest2();
		SetTest.setTest3();
		System.out.println("===================");
		MapTest.mapTest();
	}
}
