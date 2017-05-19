package study.db.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) {
		//1. driver load
		//2. Connection DB연결
		Connection conn=null;
		//3. Statement...DB와 소통하는
		Statement st = null;
		//4. 결과받아서 처리
		ResultSet rs = null;
		//5. 쿼리
		String sql = "select * from employees";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("성공");
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int empid = rs.getInt(1);
				String fname = rs.getString("first_name");
				int sal = rs.getInt("salary");
				Date hire = rs.getDate("hire_date");
				System.out.println(empid + "\t" + fname + "\t" +sal +  "\t" + hire);
			}
		} catch(ClassNotFoundException e){
			System.out.println("없음");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			//6. 연결해제
			try{
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(conn!=null) conn.close(); 
			} catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
}
