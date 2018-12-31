package jdbc_orcl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DBUtil {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	/**
	 * 得到数据库连接
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection  getConnection() throws ClassNotFoundException, SQLException{
		try {
			String driver = Config.getValue("driver");
			String url = Config.getValue("url");
			String user = Config.getValue("user");
			String pwd = Config.getValue("pwd");
			//指定驱动程序 JDBC4.0以上可以不用显示声明
			Class.forName(driver);
			//建立数据库连接
			conn = DriverManager.getConnection(url,user,pwd);
			return conn;
		} catch (Exception e) {
			//如果连接过程出现异常，抛出异常信息
			throw new SQLException("驱动错误或连接失败!");
		}
	}
	/**
	 * 释放资源
	 */
	public void closeAll(){
		try {
			//如果rs不为空，则关闭rs
			if(rs != null){
				rs.close();
			}
			//如果ps不为空，则关闭ps
			if(ps != null){
				ps.close();
			}
			//如果conn不为空，则关闭conn
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 执行SQL语句，可以进行查询
	 * @param preparedSql
	 * @param param
	 * @return
	 */
	public ResultSet executeQuery(String preparedSql,String[] param){
		try {
			//得到ProperedStatement对象
			ps = conn.prepareStatement(preparedSql);
			if(param != null){
				for (int i = 0; i < param.length; i++) {
					//为预编译的sql设置参数
					ps.setString(i+1, param[i]);
				}
			}
			//执行SQL得到结果集
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	/**
	 * 执行sql语句，进行 新增、修改、删除操作，但不能进行查询操作
	 * @param preparedSql
	 * @param param
	 * @return
	 */
	public int executeUpdate(String preparedSql,String[] param){
		int count = 0;
		try {
			//得到ProperedStatement对象
			ps = conn.prepareStatement(preparedSql);
			if(param != null){
				for (int i = 0; i < param.length; i++) {
					//为预编译的sql设置参数
					ps.setString(i+1, param[i]);
				}
			}
			//执行SQL得到结果集处理记录数
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
