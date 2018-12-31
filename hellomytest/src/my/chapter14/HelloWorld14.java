package my.chapter14;

import java.util.Random;

public class HelloWorld14
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		YmyConsole c = new YmyConsole();
//		
//		c.print("请输入用户名: ");
//		String username = c.readString("guest");
//		
//		c.print("请输入密码: ");
//		String password = c.readString("12345");
//
//		
//		if(password.equals("123456"))
//		{
//			c.println(username + ",你好! 欢迎进入系统!");
//		}
//		else
//		{
//			c.println("密码错误！");
//		}
		
		//随机数random实例1
//		Random rand = new Random();
//		
//		//生成10个1000以内的随机数
//		for(int i=0; i<10; i++)
//		{
//			System.out.println("生成随机数"+(i+1)+"："+rand.nextInt(1000));
//		}
		
		//随机数random实例2
//		String[] names = {
//				"邵发",
//				"小王",
//				"小李",
//				"小赵"
//		};
//		Random rand = new Random();
//		System.out.println("恭喜："+names[rand.nextInt(4)]+"获得特等奖");
		
		//随机数random实例3
		//从96个员工选出3人获得一等奖
//		int[] result = new int[3];
//		int count = 0;
//
//		Random rand = new Random();
//		while (count < 3)
//		{
//			// 抽一个幸运员工, s是它的号码
//			int s = rand.nextInt(95);
//
//			// 检查s是否已经中过奖了, 检查s是否在result里
//			boolean exist = false;
//			for (int i = 0; i < count; i++)
//			{
//				if (result[i] == s)
//				{
//					exist = true;
//					break;
//				}
//			}
//
//			//
//			if (exist)
//			{
//				continue;
//			} 
//			else
//			{
//				result[count] = s;
//				count++;
//			}
//		}
//
//		for (int i = 0; i < result.length; i++)
//		{
//			System.out.println("第" + (result[i] + 1) + "号获奖!");
//		}
		
		//-----------------------字符(只有一个字符)-------------------------
		
//		char c1 = 'A'; // 英文字母 
//		char c2 = '9'; // 数字 
//		char c3 = ' '; // 英文标点 （空格） 
//		char c4 = '邵'; // 中文 
//		char c5 = '。'; // 中文标点（句号） 
//		char c6 = 'の'; // 日文 
//		char c7 = '며' ; // 韩文 
//		char c8 = 'β'; // 希腊字母 
		
		//四、字符与字符串 
		//- 转换 String => char 
//		String str = "afanihao阿发你好"; 
//		char ch = str.charAt(8); // 下标从0开始计数 
//		char[] chs = str.toCharArray(); 
//		 
//		//- 转换 char => String 
//		char[] chs1 = {'阿', '发', '你', '好'}; 
//		String str1 = new String(chs, 1,3); 
//		str += '的'; 
//		 
//		//在字符串字符中查找字符 
//		//例如， 
//		String str2 = "afanihao阿发你好"; 
//		int p = str.indexOf('发'); 
//		System.out.println("位置: " + p); 
		

	}

}






















