package jdbc_orcl;
import java.sql.*;
public class PrepareStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String selectSql = "select sno, sname, age, sex from student";
		String insertSql = "insert into student values(?,?,?,?)";
		String updateSql = "update student set age = age +1 where sno = ?";
		String deleteSql = "delete from student where sno = ?";
		
		DBUtil db = new DBUtil();
		try{
			db.getConnection();
			
			int count = db.executeUpdate(insertSql, new String[]{"D00006","zhouyu","20","1"});
			System.out.println("insert a count");
			
			count = db.executeUpdate(updateSql, new String[]{"D00006"});
			System.out.println("set a count");
			
			ResultSet rs = db.executeQuery(selectSql, null);
			while(rs.next()){
				System.out.println("lineNumber"+rs.getRow()
					+"\t学生编号："+rs.getString(1)
					+"\t学生姓名："+rs.getString(2)
					+"\t学生年龄："+rs.getString(3)
					+"\t学生性别："+rs.getString(4)
					
				);
			}
			count = db.executeUpdate(deleteSql, new String[]{"D00006"});
				System.out.println("delete a count");
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			db.closeAll();
		}
		
	}

}
