package my;

public class Screen
{
	//-----------------------------------------------------------
	//--------------访问私有属性：Getter与Setter-----------------
	//-----------------------------------------------------------
	private int number;//设置私有属性
	
	private String name;//设置私有属性
	
	//“Getter”，惯例：get+属性名字(首字母大写)
	public int getNumber()
	{
		return this.number;
	}
	//“Getter”，惯例：get+属性名字(首字母大写)
	public String getName()
	{
		return this.name;
	}
	
	//“Setter”，惯例：set+属性名字(首字母大写)
	public void setNumber(int number, String name)
	{
		this.number = number;
		this.name = name;
	}
	

	
}





























