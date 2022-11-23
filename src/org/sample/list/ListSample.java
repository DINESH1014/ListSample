
package org.sample.list;

import java.util.ArrayList;

import java.util.List;


public class ListSample {

	public static void main(String[] args) {
//<<<<<<< HEAD
		System.out.println("DH");
	
//=======
		int a = 20;	
//>>>>>>> 8a7e87a44f85c3f8eaa65d5eaccaa6b9dcf92e0a
	
	List l = new ArrayList();
	
	List<Integer> li = new ArrayList<Integer>();
	
	
	
     l.add(10);
     l.add(20);
     l.add("Dinesh");
     l.add(40);
     l.add(50);
    
     
     
     li.add(200);
     li.add(300);
     li.add(400);
     li.add(10);
     li.add(40);
     
     int f = l.size();
	System.out.println(f);
	
	Object Obj = l.get(2);
	System.out.println(Obj);
	
	l.add(3,"Hari");
	System.out.println(l);
	
	l.remove(4);
	System.out.println(l);
	
	l.set(3, "Love");
	System.out.println(l);
	
	

	int H = l.indexOf(50);
	System.out.println(H);
	
       
/*	l.addAll(li);
	System.out.println(l);
*/	
	
	/*l.retainAll(li);
	System.out.println(l);
	
	l.removeAll(li);
	System.out.println(l);
	*/
/*	for (int i = 0; i < l.size(); i++) {
		
		System.out.println(l.get(i));
	}
*/	

	for (Object A : l) {
		System.out.println(A);
		
	}
	
	
	}
}
