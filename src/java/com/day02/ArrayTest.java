package java.com.day02;

public class ArrayTest {
	public static void main(String[] args) {
		//1.�迭 �������� ����
		//2. �迭 ������ �ʱ�ȭ ũ��� �ݵ�� ����
		int[] a=new int[10];
		char b[]=new char[5];
		double c[]=new double[5];
		boolean d[]=new boolean[5];
		System.out.println(a[0]);
		System.out.println(b[4]);
		System.out.println(c[3]);
		System.out.println(d[0]);
		
		int[] iarr = {1,3,5,2,4,0};
		for(int i =0; i<iarr.length;i++)
		{
			System.out.println(i + "��°" + iarr[i]);
		}
		//����for
		for(int data : iarr)//iarr�� ���� ���������� �����ϸ� data�� ����
		{
			System.out.println(data + "��°" + iarr[data] );
		}
		
		String[] str = {"A","B"};
		for(String data : str)
		{
			System.out.println(data + "��°");
		}
		
		//2���� �迭
		int[][][] k = {{{1,2},{3,4}},{{5,6},{7,8}}};
		for(int[][] data : k)
		{
			System.out.println(data[0][0] + "��°");
		}
		
		
	}
}
