package my;

public class X64System extends X86System
{
	public void runProgram64(String program)
	{
		System.out.println("运行64位程序："+program);
	}

	@Override
	public void sys32()//重写父类的方法
	{
		System.out.println("运行了64位应用程序");
	}
	
	
}
