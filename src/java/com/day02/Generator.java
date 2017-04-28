package java.com.day02;

public class Generator {
	public static void main(String[] args) {
		int[] num = new int[6];
		for(int i=0; i<6; i++)//6개의 난수 저장
		{
			num[i] = (int)(45*Math.random()+1);
			for(int j=0;j<i;j++)//입력 위치 이전까지 동일값 확인
			{
				if(num[j] == num[i]) i--;//만약 이전에 동일값 존재시 현 위치 다시시작
			}
		}
		
	}
}
