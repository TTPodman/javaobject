package my;

public class MyMathTools
{
	//创建一个计算最大值的方法
		public void getMax(int[] data)
		{
			int result = 0;
			for (int i = 0; i < data.length; i++)
			{
				if (data[i] > result);
				{
					result = data[i];
				}
			}
			System.out.println("最大值：" + result);
		}
	
	//创建一个计算最大值的方法(有返回值)
	public int getMax2(int[] data)
	{
		int result = 0;
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] > result);
			{
				result = data[i];
			}
		}
		return result;//返回result
	}
	
	
	//创建一个判断数组和是否越界的方法(有返回值)
	public boolean check(int[] arr)
	{
		boolean result = false;

		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			if (sum > 100)
			{
				result = true;
				break;
			}
		}
		return result; // 没必要把return总是写在最后面
	}
	
	//（推荐）创建一个判断数组和是否越界的方法(有返回值)
	public boolean check1(int[] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			if (sum > 100)
			{
				return true;
			}
		}
		return false;// 没必要把return总是写在最后面
	}
	
	//
	public void print(int n)
	{
		if (n <= 0)
		{
			System.out.println("给定的数<=0!!");
			return;
		}
		if (n > 10)
		{
			System.out.println("给定的数太大了!");
			return;
		}
		int rows = 0; // 行数
		int cols = 0; // 列数
		for (int k = 1; k <= n; k++)
		{
			System.out.print(k + " ");
			cols++;
			if (cols > rows)
			{
				System.out.print("\n"); // 换行
				rows++;
				cols = 0;
			}
		}
	}
	
	//把符合要求的输放在返回值里
	public int[] find8(int[] arr)
	{
		// 创建等大的数组
		int[] temp = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 8 == 0)
			{
				temp[count] = arr[i];
				count++;
			}
		}
		// 拷贝到结果数组里
		int[] result = new int[count];
		for (int i = 0; i < count; i++)
		{
			result[i] = temp[i];
		}
		return result;
	}
	
	
	//
//	public Student createNew(String id, String name)
//	{
//
//		Student temp = new Student();
//		temp.id = id;
//		temp.name = name;
//		return temp;//返回一个对象
//	}
	
	public static void main(String[] args)
	{
		MyMathTools m1 = new MyMathTools();

	}
	
}
	















