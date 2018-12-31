package my;
//import java.util.Arrays;//打印数组
import java.util.Scanner;//键盘输入
public class OnlineJudge
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);//控制键盘输入。可删
		// TODO Auto-generated method stub
		
		//290.求1到100之间，所有能被3整除的数的立方和
//		int result = 0;
//		for (int i = 3; i<=100; i+=3)
//		{
//			if (i%3==0)
//			{
//				result += i*i*i;
//			}
//		}
//		System.out.println(result);
		
		//278给定三角形的三条边的长度。判断该三角形是否为直角三角形。
//		int a = 3, b = 5, c = 4;
//		int aa = a*a, bb = b*b, cc = c*c;
//		if (aa+bb==cc || aa+cc==bb || bb+cc==aa)
//		{
//			System.out.println("是直角三角形");
//		}
//		else
//		{
//			System.out.println("不是");
//		}
		
		//279给定学生的分数ABC。。。
//		int score = 89;
//		String level = "";
//		if (score>=90&&score<=100)
//		{
//			level = "A";
//		}
//		else if (score>=80&&score<90)
//		{
//			level = "B";
//		}
//		else if (score>=70&&score<80)
//		{
//			level = "C";
//		}
//		else if (score>=60&&score<70)
//		{
//			level = "D";
//		}
//		else
//		{
//			level = "E";
//		}
//		System.out.println("该学生得分:"+score+"，评定等级:"+level);
		
		//280.公司招聘前台，职位要求：限女性，20-30岁
//		boolean female = true;
//		int age = 31;
//		if (female)
//		{
//			if (age>=20&&age<=30)
//			{
//				System.out.println("符合条件");
//			}
//			else 
//			{
//				System.out.println("不符合年龄要求");
//			}
//		}
//		else 
//		{
//			System.out.println("不符合性别要求");
//		}
		
		//285.给定一个整数N ，判断它是否为质数
//		int N = 59;
//		int i;
//		for (i = 1; i<=N; i++)
//		{
//			if (N%i==0 && i>=2 && i<N)
//			{
//				System.out.println("不是质数");
//				break ;
//			}
//		}
//		if (i==N+1)
//		{
//			System.out.println("是质数");
//		}
		
		//286.打印下面的图形。(倒三角)
//		*****
//		****
//		***
//		**
//		*
//		for (int i = 5; i>=1; i--)
//		{
//			for (int j = 1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
		//287.打印出这样的图形
//		*   *
//		 * * 
//		  *  
//		 * * 
//		*   *
//		int N = 5;
//		
//		for( int i=0; i<N; i++)
//		{
//			for(int k=0; k< N; k++)
//			{
//				if(k== i || k == N-i-1) // 这个仔细判断慢慢调就行了。一下子是想不出来的。
//				{
//					System.out.print("*"); // 用print，不是println
//				}
//				else
//				{
//					System.out.print(" "); // 打印一个空格
//				}
//			}
//			System.out.print("\n"); // 换行
//		}
		
		//288.打印显示出1~1000以内的所有完全平方数
//		int n = 1000;
//		for (int i = 1; i*i<=n; i++)
//		{
//			System.out.print(i*i+",");
//		}
		//或者||
//		for( int i=1; i<=1000; i++)  // 条件表达式要自己慢慢调整、尝试
//		{
//			for(int k=0; k< i; k++)
//			{
//				if (k * k == i)
//				{
//					System.out.println(k + "*" + k + "=" + i);
//				}
//			}
//		}
		
		//289.打印出100~200之间，前10个能被7整除的数。
//		int flag = 0;
//		for (int i = 100; i>=100&&i<=200; i++)
//		{
//			if (i%7==0)
//			{
//				System.out.print(i+" ");
//				flag++;
//			}
//			if (flag==10)
//			{
//				break ;
//			}
//		}
		
		//291.给定一个年份，判断是否为闰年
//		int year = 2002;
//		if (year%100==0)
//		{
//			if (year%400==0)
//			{
//				System.out.println(year+"年是闰年");
//			}
//			else
//			{
//				System.out.println(year+"年不是闰年");
//			}
//		}
//		else if (year%4==0)
//		{
//			System.out.println(year+"年是闰年");
//		}
//		else 
//		{
//			System.out.println(year+"年不是闰年");
//		}
		
		//292.输出九九乘法表
//		for (int i = 1; i<=9; i++)
//		{
//			for (int k = 1; k<=i; k++)
//			{
//				int ttt = i*k;
//				System.out.print(k + "x" + i + "=" + ttt + " ");
//			}
//			System.out.print("\n");
//		}
		
		//打印输出所有的水仙花数
//		int a , b , c = 0;
//		for (int i=100; i<=999; i++)
//		{
//			a = i/100;
//			b = (i/10)%10;
//			c = i%10;
//			if (i==a*a*a+b*b*b+c*c*c) 
//			{
//				System.out.print(i+" ");
//			}
// 		}
		
		//294.任意给定一个正整数 (1~10000) 之间。 将它的各位数字解析出来单独显示
//		int n = 7609;
//
//		for (int i=5; i>=1; i--)
//		{
//			System.out.print(n%10);
//			n /= 10;
//			
//			if (n==0)
//			{
//				break;
//			}
//			System.out.print("-");
//		}
		
		//07-310
//		Example w = new Example();//创建对象
//		w.welcome();//调用方法
		
		//07-311
//		Example c = new Example();
//		c.cheng(29.2, 19, 39);
		
		//07-312
//		Example sq = new Example();
//		sq.showSquare(193.819);
		
		
		//07-313
//		Example abs = new Example();
//		abs.showAbs(-192);
		
		//07-314
//		Example qiuhe = new Example();
//		int[] arr = {12,39,90,13};
//		int[] arr2 = {4,0,3};
//		qiuhe.shuzuQiuhe(arr, arr2);
		
		//07-316
//		Example min = new Example();
//		int[] arr = {12,39,90,13};
//		System.out.println(min.getMin(arr));
		
		//07-317
//		Example check = new Example();
//		check.checkSquare(100,999);
		
		//07-318
//		Example temper = new Example();
//		double f = temper.temperTrance(37.5);
//		System.out.println(f);
		
		//07-319
//		Example au = new Example();
//		double audio[] = {0.21,0.69,0.22,0.71,0.43,0.37};
//		int[] result = au.audioSample(audio, 0.7);
//		System.out.println(Arrays.toString(result));
		
		//当前对象//对应的类是Triangle
		//08-320
//		Triangle t = new Triangle();
//		t.a = 3;
//		t.b = 4;
//		t.c = 5;
//		int p = t.perimeter();
//		System.out.println("周长为："+p);
		
		//08-322
//		Circle c = new Circle();
//		c.r = 4.7;
//		double C = c.perimeter();
//		double S = c.area();
//		System.out.println("周长为："+C+"面积为："+S);
		
		//08-324
//		Scanner sc = new Scanner(System.in );//键盘输入
//		Fraction f1 = new Fraction();
//		Fraction f2 = new Fraction();
//		System.out.print("请输入第1个分数的分子：");
//		f1.fenzi = sc.nextInt();
//		System.out.print("请输入第1个分数的分母：");
//		f1.fenmu = sc.nextInt();
//		System.out.print("请输入第2个分数的分子：");
//		f2.fenzi = sc.nextInt();
//		System.out.print("请输入第2个分数的分母：");
//		f2.fenmu = sc.nextInt();
//		Fraction c = f1.mul( f2); // a,b相乘
//		System.out.print("f1 * f2 = " + c.value());    //  c.value() 是将结果以分数形式显示
		
		
		//08-321
//		ColorLight cl = new ColorLight();
//		System.out.print("自定义灯或者下一个颜色：");
//
//		while(sc.nextInt()!=0)
//		{
//			cl.pressButton();
//		}
		
		

	}
	
}















































