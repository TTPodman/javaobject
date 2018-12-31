package my;

public class Student//类型名
{
	//添加4个属性
	
	public String id;//学号
	
	public String name;//姓名
	
	public boolean sex;//性别 true：男 false：女
	
	public String cellphone;//手机号
	//类的属性可以是李刚一个类
	//类型是类的属性，该属性的类型仍然是一个类（如下）
	public StudentCards cards = new StudentCards();//卡号 
	
	//添加一个类的方法报数（我会干什么）而类的属性是（我有什么）
	public void show(int fromNum, int toNum)
	{
		for (int i=fromNum; i<=toNum; i++)
		{
			System.out.println("报数："+i);
		}
	}
	
	//构造方法
	public Student(String id, String name)
	{
		//此处构造--调用方法如下
		//Student st1 = new Student("201703231","邵发");
		
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		String s = "学校："+ id + ",姓名："+name;
		if(sex )
		{
			s += "(男)";
		}
		else
		{
			s += "(女)";
		}
		return s;
	}
	
	
	
	
	

}








