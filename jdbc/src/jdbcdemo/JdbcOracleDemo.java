package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "159753");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select empno,ename,sal from emp");
			
			while(rs.next()) {
				System.out.println("员工编号："+rs.getLong("empno")+"\t"+"姓名："+rs.getString("ename")+"\t"
					
					
						);
			}
 		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} 
	}

}
