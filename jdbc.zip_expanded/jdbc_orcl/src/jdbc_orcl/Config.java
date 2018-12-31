package jdbc_orcl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Config {
	private static Properties p = null;
	static{
		p = new Properties();
		try {
			//加载从项目的根目录开始查找
			p.load(new FileInputStream("config\\oracle.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 根据key值获取对应的value值
	 * @param key
	 * @return
	 */
	public static String getValue(String key) {
		return p.get(key).toString();
	}
}
