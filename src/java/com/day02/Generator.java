package java.com.day02;

public class Generator {
	public static void main(String[] args) {
		int[] num = new int[6];
		for(int i=0; i<6; i++)//6���� ���� ����
		{
			num[i] = (int)(45*Math.random()+1);
			for(int j=0;j<i;j++)//�Է� ��ġ �������� ���ϰ� Ȯ��
			{
				if(num[j] == num[i]) i--;//���� ������ ���ϰ� ����� �� ��ġ �ٽý���
			}
		}
		
	}
}
