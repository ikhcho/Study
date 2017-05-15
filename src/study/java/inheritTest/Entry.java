package study.java.inheritTest;

abstract class Entry{
	private String name;
	private int size;
	public Entry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entry(String name) {
		super();
		this.name = name;
	}
	public Entry(int size) {
		super();
		this.size = size;
	}
	public Entry(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public abstract void print();
	

}
class Directory extends Entry{
	
	Directory(String name){
		super(name);
	}
	@Override
	public void print(){
		System.out.println(getName());
	}
}

class File extends Entry{
	
	File(String name, int size)
	{
		super(name,size);
	}
	
	@Override
	public void print(){
		System.out.println(getName()+"("+getSize()+")");
	}
}
