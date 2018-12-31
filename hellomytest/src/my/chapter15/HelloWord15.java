package my.chapter15;

//import my.Student; 

public class HelloWord15
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		Student[] ss = new Student[4];
//		ss[0] = new Student("20170300990","邵发");
//		ss[1] = new Student("20150300988","校长");
//		ss[2] = new Student("20140300432","小王");
//		ss[3] = null;
//		
//		ss[3] = ss[2];
//		ss[2] = ss[1];
//		ss[1] = new Student("20160300432","小李");
//		
//		System.out.println("完成");
		
		
		//----------------【链表】----------------
		//有什么用？>>m1.next.next.next.id = 109;
		//实例1
		//四只猴子
		Monkey m1 = new Monkey(100,"圆圆");
		Monkey m2 = new Monkey(101,"方圆");
		Monkey m3 = new Monkey(102,"姣姣");
		Monkey m4 = new Monkey(103,"珠珠");
		
		//串起来形成链表
		m1.next = m2;
		m2.next = m3;
		m3.next = m4;
		m4.next = null;
		
//		System.out.println("111exit");
//		
		//新建一个准备插入的对象
		Monkey m5 = new Monkey(105,"花花");
		
//		////////////////////////////////
//		m4.next = m5;//插入到末尾（前提是已知最后一个对象）
//		///////遍历链表///////////
//		Monkey m = m1;
//		while(m!=null)
//		{
//			System.out.println("链表中的节点"+m);
//			m = m.next;
//		}
//		
//		System.out.println("222exit");
		
		
		
		
		
		//链表的插入【2】从末尾插入

		// 找到链表的最后一个节点 
//		Monkey tail = m1; 
//		while( true ) 
//		{ 
//			//判断此猴子是不是最后一只猴子（此对象是不是最后在一个对象）
//		if(tail.next == null) break; 
//		tail = tail.next; //换下一只猴子（换下一个对象next）
//		} 
//		 
//		// 附加到末尾 
//		tail.next = m5; 
		
		//链表的插入【3】插入到头节点之后,类似于借用一个中间变量来交换数值
//		Monkey head = new Monkey();
//		head = m1;
//		//可以简写成Monkey head = m1;
//		m5.next = m1.next;//让m2跟着m5---5234
//		m1.next = m5;//让m5跟着m1---15234
//		
		
		
		
		//链表的插入【4】插入到指定位置 id = 102的对象之后
		
//		Monkey node = m1;
//		while(node!=null)
//		{
//			if(node.id == 102)
//			{
//				m5.next = node.next ;
//				node.next = m5;
//				break;
//			}
//			node = node.next ;
//		}
		
		//有头链表
//		Monkey head = new Monkey(0,"石猴");​
//		head.next = m1;
		
		
		//--------------------容器类------------------------
		MonkeyList monkeys = new MonkeyList();//新建一个容器类存放Monkey对象
		monkeys.add(m1);
		monkeys.add(m2);
		monkeys.add(m3);
		monkeys.add(m4);
		
		Monkey who = monkeys.get(103);//找到编号103的猴子
		if(who!=null);
		{
			System.out.println("找到："+who);
		}
		System.out.println("exit");
		
	}

}












