package chapter56;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<String> all = new ArrayList<String>();
		all.add("1");
		all.add("2");
		all.add("3");
		all.add("4");
		all.add("5");
		ListIterator<String> it = all.listIterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
			
		}
		System.out.println("*****************");
		while(it.hasPrevious()) {
			String str = it.next();
			System.out.println(str);
			
		}
		
		
		
	}

}
