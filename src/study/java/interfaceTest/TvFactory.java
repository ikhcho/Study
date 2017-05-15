package study.java.interfaceTest;

public class TvFactory{
	
	public static TV makeTV(String brand){
		switch(brand){
			case "samsung":
				return new SamsungTV();
			case "lg":
				return new LgTV();
			default : return null;
		}
		
	}
}
