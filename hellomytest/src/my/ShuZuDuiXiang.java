package my;

public class ShuZuDuiXiang
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// 创建一个数组对象，容量为30个int
//		int[] arr = new int [30];
//		arr[0]=98;
//		arr[1]=89;
//		arr[2]=92;
//		int s = arr[0]+arr[1]+arr[2];
//		System.out.println(s);
		
		//遍历打印-----------------------------------------------------
//		int[] arr = new int[4];
//		arr[0]=98;
//		arr[1]=89;
//		arr[2]=90;
//		arr[3]=87;
//		// 遍历打印 
//		for (int i = 0; i < 4; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
		
		//实例2-------------------------------------------------------
//		int[] arr = new int[4];
//		arr[0]=98;
//		arr[1]=89;
//		arr[2]=90;
//		arr[3]=87;
//		//求和
//		int total = 0;
//		for (int i = 0;i<4; i++)
//		{
//			total += arr[i];
//		}
//		System.out.println("结果为："+total);
		
		//--------------------------------------------------------
//		int[] arr = { 98, 89, 98, 87 }; 
//		 
//		for( int i=0; i<arr.length; i++) // arr.length 表示数组的长度 
//		{ 
//		System.out.print( arr[i] + " "); 
//		} 

		//实例3--------------------------------------------------------
//		int[] arr = { 98, 89, 98, 87 };
//
//		for (int i = 0; i < arr.length; i++) // arr.length 表示数组的长度
//		{
//			System.out.print(arr[i] + " ");
//		}
		
		//数组的使用举例-------------------------------------------------
//		String[] name = {"少","网","张","理"};
//		int[] score = {98,89,94,93};
//		
//		for (int i = 0; i < name.length; i++)
//		{
//			System.out.println( name[i] + "       " + score[i] );
//		}
		
		//求出所有1000以内的质数，并存到数组里---------------------------
//		int[] result = new int[50]; // 最多存50个
//		int count = 0;
//		
//		for(int i=2; i<1000; i++)
//		{
//			// 判断 i 是否为质数
//			boolean isPrime = true;
//			for(int k=2; k<i; k++)
//			{
//				if( i % k == 0)
//				{
//					isPrime = false;
//					break;
//				}
//			}
//			
//			// 如果是质数，则存到数组result里
//			if( isPrime )
//			{
//				result[ count ] = i;
//				count ++;
//				if(count >= result.length)
//				{
//					break; // 已经存满50个，则退出查找
//				}
//			}
//		}
//		
//		// 把找到的质数打印输出
//		for(int i=0; i<count; i++)
//		{
//			System.out.println( result[i] );
//		}
		
		//对象与引用-------------------------------------------
//		int[] a = {11,11,11,11};	//a指向了一个对象
//		int[] b = a;	//b也指向了同一个对象
//		b[3] = 45;	//利用b指示更改了数组对象的第三个元素的值为45
//		for (int i=0; i<a.length; i++)		
//		{
//			System.out.print(a[i]+" ");		//利用a指示来输出原数组对象时输出
//		}                                   //的值已经被b指示变更
		
		//清空/撤销所指向的对象再引用报错
//		int[] a = {11,11,11,11};
//		int[] b = a;
//		System.out.println(a[3]+"  "+b[3]);
//		a = null;
//		System.out.println(a[3]+"  "+b[3]);	//清空所指的对象后再引用就会【报错】
//		                                    //空指针错误【NullPointerException】
//		
		
		//	失去引用的对象 lost	----------------------------------------
//		int[] a = {8,8,8};		//创建一个数组对象obj1并由a所指向
//		
//		System.out.println("a[0] a[1] a[2]"+" : "+a[0]+" "+a[1]+" "+a[2]);
//		
//		a = new int[4];		//令a指向另一个对象（原来指向的对象obj2丢失）
//		
//		a[0]=a[1]=a[2]=a[3]=17;		//为对象obj2变更内容
//		//此后对象obj1无人引用（此对象丢失/失去引用/后随即被系统删除）
//		System.out.println("a[0] a[1] a[2]"+" : "+a[0]+" "+a[1]+" "+a[2]);
//		System.out.println("a[0] a[1] a[2] a[3]"+" : "+a[0]+" "+a[1]+" "+a[3]+" "+a[3]);
		
		//多次失去引用的对象后指向最后一个创建的对象
	



	}

}


























