package study.java.collectionTest;

import java.util.HashMap;
import java.util.Map;

class Fruit{
	private String name;
	private int count;
	private int price;
	private String color;
	
	public Fruit(String name, int count, int price, String color) {
		super();
		this.name = name;
		this.count = count;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", count=" + count + ", price=" + price + ", color=" + color + "]";
	}
	
	
}



public class CollectionTest2 {
	public static void main(String[] args) {
		Map<String, Fruit> cart = new HashMap();
		cart.put("���", new Fruit("���",10,5000,"RED"));
		cart.put("�ٳ���", new Fruit("�ٳ���",20,7000,"YELLOW"));
		
		//����
		Fruit fruit = new Fruit("���",20,3000,"RED");
		if(cart.containsKey(fruit.getName())){
			cart.get(fruit.getName()).setCount(cart.get(fruit.getName()).getCount()+fruit.getCount());
		}else{
			cart.put(fruit.getName(), fruit);
		}
		
		System.out.println(cart.get("���").toString());
	}
}
