package my;

public class ColorLight
{
	public int color = 1;
	
	public void showColor()
	{
		if(color==1)
		{
			System.out.println("红色");
		}
		else if(color==2)
		{
			System.out.println("绿色");
		}
		else if(color==3)
		{
			System.out.println("黄色");
		}
		else
		{
			System.out.println("故障");
		}
	}
	
	public void pressButton()
	{
		color += 1;
		if(color>3)
		{
			color = 1;
		}
		this.showColor();
	}
	
}






