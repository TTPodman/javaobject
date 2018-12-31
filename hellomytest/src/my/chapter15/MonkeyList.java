package my.chapter15;

public class MonkeyList
{
	//添加一个假节点，链表头（假猴子）
	private Monkey head = new Monkey(0,"石猴");
	
	
	//写一个方法用来增加一个Monkey对象
	public void add(Monkey m)
	{
		m.next = head.next;
		head.next = m;
	}
	
	
	//写一个方法用来取得一个Monkey对象(按编号查找)
	public Monkey get(int id)
	{
		Monkey m = head.next;
		while(m!=null)
		{
			if(m.id == id)
			{
				return m;
			}
			System.out.println("链表中的节点："+m);;
			m = m.next ;
		}
		return null;
	}
	
//	public int count(MonkeyList mk)//计算容器的存储个数
//	{
//		
//		
//	}
}
//容器类

















