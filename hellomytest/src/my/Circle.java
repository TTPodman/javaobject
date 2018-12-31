package my;

public class Circle
{
	double PI = 3.14159;
	public double r;
	public double perimeter()//计算周长
	{
		return this.r*2*PI;
	}
	public double area()//计算面积
	{
		return this.r*this.r*PI;
	}
}
