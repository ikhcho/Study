package study.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exam10 {
	public static void main(String[] args) throws Exception {
		printEmployeeList("mana", 10000, 15000);
		printEmployeeList("admin", 15000, 20000);
	}
	
	private static void printEmployeeList(String jobTtile, int loSal, int hiSal) throws Exception {
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr", "hr");
		Statement st = null;
		ResultSet rs = null;
		String sql = "select e.first_name, e.salary, j.job_title from employees e, jobs j where e.job_id = j.job_id";
		sql = sql + " and e.salary >= " + loSal + " and e.salary <= " + hiSal + " and upper(j.job_title) like '%" + jobTtile.toUpperCase() +"%'";
		
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		while(rs.next()){
			String first_name = rs.getString("first_name");
			int salary = rs.getInt("salary");
			String job_title = rs.getString("job_title");
			System.out.println(first_name + "\t" + salary + "\t" +job_title);
		}
		if(rs!=null) rs.close();
		if(st!=null) st.close();
		if(conn!=null) conn.close(); 		
	}
}
