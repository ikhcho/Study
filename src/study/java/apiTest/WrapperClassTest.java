package study.java.apiTest;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class WrapperClassTest {
	public static void main(String[] args) throws ParseException {
		int a=10;
		System.out.println(a>10);
		
		Integer b = new Integer(20);
		Integer c = 30; // AutoBoxing

		System.out.println(Math.max(b, c));
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sd = new SimpleDateFormat("yyMMdd");
		String now = sd.format(d);
		System.out.println(now);
		
		Date birth = new Date(1991-1900,4-1,2);
		System.out.println(birth);
		
		java.sql.Date d2 = new java.sql.Date(1991-1900,4-1,2);
		System.out.println(d2);
		
		String str = "2017-05-08";
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd");
		Date d3 = sd2.parse(str);
		System.out.println(d3);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.MILLISECOND));
		
		String msg="이름은 {0}이고 전화번호는 {1}입니다.";
		String msgResult = MessageFormat.format(msg,"조익현","010-1234-5678");
		System.out.println(msgResult);
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		String res = df.format(1234567890.12345678);
		System.out.println(res);
		
		int year = LocalDate.now().getYear();
		System.out.println(year);
		System.out.println(LocalDate.now().getMonthValue());
	}
}
