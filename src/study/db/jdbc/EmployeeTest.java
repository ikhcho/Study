package study.db.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeTest {
	public static void main(String[] args) {
		String sql = "select * from employees";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = Util.getConnection(url, "hr", "hr");
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int empid = rs.getInt(1);
				String fname = rs.getString(2);
				int sal = rs.getInt("salary");
				Date hire = rs.getDate("hire_date");
				System.out.println(empid + "\t" + fname + "\t" +sal +  "\t" + hire);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			if(conn != null && st != null && rs != null) Util.dbclose(conn, st, rs);
		}
		
	}
}
