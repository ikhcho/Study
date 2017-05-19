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
		//2. Connection DB����
		Connection conn=null;
		//3. Statement...DB�� �����ϴ�
		Statement st = null;
		//4. ����޾Ƽ� ó��
		ResultSet rs = null;
		//5. ����
		String sql = "select * from employees";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("����");
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
			System.out.println("����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			//6. ��������
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
