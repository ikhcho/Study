package study.java.objectTest;

public class FindCharacters {
	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);
	}
	public int countChar(String str, char c) {
		 //¿€º∫
		int count=0;
		for(int i=0; i<str.length();i++){
			count = str.charAt(i)==c? ++count:count;
		}
		return count;
	}

}