package study.java.apiTest;

public class Spliting {
	public static void main(String[] args) {
		Spliting p = new Spliting();
		String addr = "서울시,강남구,역삼동,삼성SDS멀티캠퍼스";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
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
