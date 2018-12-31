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
	 * �õ����ݿ�����
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
			//ָ���������� JDBC4.0���Ͽ��Բ�����ʾ����
			Class.forName(driver);
			//�������ݿ�����
			conn = DriverManager.getConnection(url,user,pwd);
			return conn;
		} catch (Exception e) {
			//������ӹ��̳����쳣���׳��쳣��Ϣ
			throw new SQLException("�������������ʧ��!");
		}
	}
	/**
	 * �ͷ���Դ
	 */
	public void closeAll(){
		try {
			//���rs��Ϊ�գ���ر�rs
			if(rs != null){
				rs.close();
			}
			//���ps��Ϊ�գ���ر�ps
			if(ps != null){
				ps.close();
			}
			//���conn��Ϊ�գ���ر�conn
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ִ��SQL��䣬���Խ��в�ѯ
	 * @param preparedSql
	 * @param param
	 * @return
	 */
	public ResultSet executeQuery(String preparedSql,String[] param){
		try {
			//�õ�ProperedStatement����
			ps = conn.prepareStatement(preparedSql);
			if(param != null){
				for (int i = 0; i < param.length; i++) {
					//ΪԤ�����sql���ò���
					ps.setString(i+1, param[i]);
				}
			}
			//ִ��SQL�õ������
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	/**
	 * ִ��sql��䣬���� �������޸ġ�ɾ�������������ܽ��в�ѯ����
	 * @param preparedSql
	 * @param param
	 * @return
	 */
	public int executeUpdate(String preparedSql,String[] param){
		int count = 0;
		try {
			//�õ�ProperedStatement����
			ps = conn.prepareStatement(preparedSql);
			if(param != null){
				for (int i = 0; i < param.length; i++) {
					//ΪԤ�����sql���ò���
					ps.setString(i+1, param[i]);
				}
			}
			//ִ��SQL�õ�����������¼��
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
