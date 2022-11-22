package org.sample.list;


import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSample {
	
	public static void main(String[] args) {
		
		Map<Integer, String>m = new HashMap<>();
		
		m.put(10, "dinesh");
		m.put(20, "hari");
		m.put(30, "dhanush");
		m.put(40, "surya");
		m.put(30, "yuvan");
		
		System.out.println(m);
		
	int a =	m.size();
	System.out.println(a);
	
	boolean b = m.containsKey(30);
		System.out.println(b);
		
	boolean c=	m.containsValue("surya");
		System.out.println(c);
		
	
		/*Set<Integer>k=  m.keySet();
		System.out.println(k);
		
		
		Collection<String> j =m.values();
		System.out.println(j);
		*/
		
	Set<Entry<Integer, String>> entrySet = m.entrySet();	
	
	
	for (Entry<Integer, String> x : entrySet) {
		System.out.println(x);
	}
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
