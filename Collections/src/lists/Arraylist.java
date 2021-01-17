package lists;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String args[])
	{  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi"); //Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");
		
		list.set(2, "ram");
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator(); 
		
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		} 
		System.out.println();
		list.remove(0);
		
		Iterator<String> itr2=list.iterator();
		while(itr2.hasNext())
		{  
		System.out.println(itr2.next());  
		}
	}
}
