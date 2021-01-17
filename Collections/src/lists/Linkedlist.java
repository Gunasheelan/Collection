package lists;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String args[])
	{  
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Ravi");  
		ll.add("Vijay");  
		ll.add("Ravi");  
		ll.add("Ajay");  
		
		Iterator<String> itr=ll.iterator();  
		
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		} 
		
		System.out.println();
		
		Iterator<String> i = ll.descendingIterator();
		
		while(i.hasNext())
		{  
		System.out.println(i.next());  
		} 
	}
}
