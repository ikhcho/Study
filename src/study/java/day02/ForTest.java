package study.java.day02;

public class ForTest {
	public static void main(String[] args) {
		
		firtslabel:
		for(int i=1; i<10;i++)
		{
			for(int j=2;j<10;j++)
			{
				if(j==4) break firtslabel;
				System.out.print(j + " * " + i + " = " + j*i);
				System.out.print("	");
			}
			System.out.println("");
		}
	}
}
