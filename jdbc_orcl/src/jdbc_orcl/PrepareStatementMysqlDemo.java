package jdbc_orcl;
import java.sql.*;
public class PrepareStatementMysqlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String selectSql = "select sno, sname, age, sex from student";
		String insertSql = "insert into student values(?,?,?,?)";
		String updateSql = "update student set age = age +1 where sno = ?";
		String deleteSql = "delete from student where sno = ?";
		
		DBUtil db = new DBUtil();
		try{
			db.getConnection();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			db.closeAll();
		}
		
	}

}
