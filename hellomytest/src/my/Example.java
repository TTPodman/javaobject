package my;

public class Example
{
	public void welcome()//07-310方法
	{
		System.out.println("***************************");
		System.out.println("********Java学习指南*******");
		System.out.println("***************************");
	}
	
	public void cheng(double a, double b, double c)//07-311方法
	{
		double result = a*b*c;
		System.out.println("结果："+result);
	}
	

	public void showSquare(double a)	// 07-312方法-求a的平方
	{
		double result = a * a;
		System.out.println("结果为: " + result);
	}
	
	public void showAbs(double a)// 07-313方法-求绝对值
	{
		if (a<0)
		{
			a = -a;
		}
		System.out.println("绝对值为："+a);
	}
	
	public void shuzuQiuhe(int[] arr, int[] arr2)//07-315方法-求数组和
	{
		int result = 0;
		for (int i=0; i<arr.length; i++)
		{
			result += arr[i];
		}
		for (int i=0; i<arr2.length; i++)
		{
			result += arr2[i];
		}
		System.out.println("两个数组的所有元素的和："+result);
	}
	
	public int getMin(int[] a)//07-316求数组的最小元素
	{
		int result = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] < result)
			{
				result = a[i];
			}
		}
		return result;
	}
	
	public void checkSquare(int from, int to)//07-317找出给定范围内的完全平方数
	{
		int s = from;
		for(int i=10; s>=from && s<=to; i++)
		{
			s=i*i;
			System.out.println(s+" = "+i+" x "+i);
			if(s>to)
			{
				break;
			}
		}
	}
	
	public double temperTrance(double c)//07-318温度转换
	{
		double f = c*(9/5.0)+32;
		return f;
	}
	
	public int[] audioSample(double[] arr,double threshold)//threshold音量阈值
	{
		int count = arr.length;
		for(int i=0; i<arr.length; i++)//求出非噪点采样值个数count
		{
			if(arr[i]>threshold)
			{
				count--;
			}
		}
		int[] result = new int[count];
		for(int i=0,j=0; i<count; i++)//把噪点以外的采样值存入结果数组
		{
			if(arr[i]<=threshold)
			{
				result[i] = (int)(arr[j]*65535);
			}
			else 
			{
				j++;
			}
		}
		return result;//返回结果
	}
	
	

}
























