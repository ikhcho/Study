package study.java.day02;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[][] test1={{30,30,30,30},{40,40,40,40},{50,50,50,50}};
		int[][] test2={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] result=new int[3][4];
		
		ArrayTest2 test = new ArrayTest2();
		test.prn(test.sub(test1,test2,result));
		
		
	}
	
	public int[][] sub(int[][] a, int[][] b, int[][] c)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		return c;
	}
	
	public void prn(int[][] c)
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
