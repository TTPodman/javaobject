package chapter25;

interface A
{
	public static final String MSG = "hello";// 全局变量

	public abstract void print();// 抽象方法
}

interface B
{
	public abstract void get();
}

class X implements A, B// X类实现了A B两个接口
{
	public void print()
	{
		System.out.println("A接口的抽象方法");
	}

	public void get()
	{
		System.out.println("B接口的抽象方法");
	}
}

public class Demo01
{
	public static void main(String[] args)
	{
		X x = new X();
		// A a = X;
		// B b = X;
	}
}
