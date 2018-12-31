package my.chapter15;

public class Monkey
{
	public int id;
	public String name;
	public Monkey next;
	
	public Monkey()
	{		
	}
	
	public Monkey(int id, String name)
	{
		//构造方法-用于创建对象时同时初始化
		//调用方法
		//Monkey m1 = new Monkey();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return String.format("(%s, %s)", name, id);
	}
	
	
}
