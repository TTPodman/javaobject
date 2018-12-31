package chapter10;
/**
 * 单例模式实例-套路
 * @author YANG!
 *
 */
public abstract class SingleModel
{
	private static SingleModel me =null;
	
	
	public int count = 0;
	private SingleModel()
	{
		count ++;
	}
//	public static void main(String[] args)
//	{
//		SingleModelDemo single1 = new SingleModelDemo();
//		System.out.println(single1.count);
//		SingleModelDemo single2 = new SingleModelDemo();
//		System.out.println(single2.count);
//		SingleModelDemo single3 = new SingleModelDemo();
//		System.out.println(single3.count);
//		SingleModelDemo single4 = new SingleModelDemo();
//		System.out.println(single4.count);
//		
//	}
}











