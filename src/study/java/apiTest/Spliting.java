package study.java.apiTest;

public class Spliting {
	public static void main(String[] args) {
		Spliting p = new Spliting();
		String addr = "�����,������,���ﵿ,�ＺSDS��Ƽķ�۽�";
		String[] addrArr = p.split(addr, ',');
		System.out.println("�迭 ũ�� : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){
		str.split("s");
		int i=0;
		int index;
		int count=1;
		String buffer=str;
		while(buffer.indexOf(separator)!=-1){
			index = buffer.indexOf(separator);
			buffer = buffer.substring((index+1),buffer.length());
			count++;
		}
		
		String[] reValue = new String[count];
		while(true){
			if(str.indexOf(separator)==-1){
				reValue[i]=str.substring(0,str.length());
				break;
			}else{
				index = str.indexOf(separator);
				reValue[i]=str.substring(0,index);
				str = str.substring((index+1),str.length());
				i++;
			}
		}
		return reValue;
	}

}
