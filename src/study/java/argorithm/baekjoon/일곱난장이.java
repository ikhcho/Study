package study.java.argorithm.baekjoon;

/*
 * �պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. 
 * �ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.
 * ��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�. 
 * �پ ������ �������� ������ �ִ� �鼳���ִ�, ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.
 * ��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : ��ȩ ���� �ٿ� ���� �ϰ� �������� Ű�� �־�����.
 * 			�־����� Ű�� 100�� ���� �ʴ� �ڿ����̸�, ��ȩ �������� Ű�� ��� �ٸ���, ������ ������ ���������� ��쿡�� �ƹ��ų� ����Ѵ�.
 * 
 * ��� : �ϰ� �������� Ű�� ������������ ����Ѵ�.
 * 
 * �Է¿��� :
20
7
23
19
10
15
25
8
13
��¿��� :
7
8
10
13
19
20
23
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class �ϰ������� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Short> height = new ArrayList<Short>();
		short input;
		short sum = 0;
		for(short i=0; i<9; i++){
			input = Short.parseShort(br.readLine());
			height.add(input);
			sum += input;
		}
		label :
		for(int j=0; j<8; j++){
			for(int k=(j+1); k<9; k++){
				if((sum-100) == (height.get(j)+height.get(k))){
					height.remove(j);
					height.remove(k-1);
					break label;
				}
			}
		}
		height.sort(null);
		for(short i=0; i<7; i++){
			System.out.println(height.get(i));
		}
	}
}
