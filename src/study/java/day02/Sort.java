package study.java.day02;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] base = {3,24,1,55,17,43,5};
		
		//arrSort(base);
		Arrays.sort(base);
		for(int i=0; i<base.length;i++)
		{
			System.out.println(base[i]);
		}
	}
	
	public static void arrSort(int[] arr)
	{
		int tmp;
		for(int i =0; i<arr.length-1; i++)
		{
			for(int j =i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
}
