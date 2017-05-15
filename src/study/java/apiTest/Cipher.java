package study.java.apiTest;

public class Cipher {
	public static void main(String[] args) {
		String plaintext = "everyday we have is one more than we deserve";
		System.out.println("암호화할 문자열 : "+ plaintext);
		System.out.println("암호화된 문자열 : "+ CaesarCipher(plaintext));
	}
	
	public static String CaesarCipher(String plain){
		String cipher="";
		int value;
		//a=97
		for(int i=0; i<plain.length(); i++){
			if(plain.charAt(i) ==' ') cipher+=" ";
			else if(plain.charAt(i) >='x' ){
				value=(plain.charAt(i))-23;
				cipher += (char)value;
			}
			else{
				value=(plain.charAt(i))+3;
				cipher += (char)value;
			}
		}
		
		return cipher;
	}
}
