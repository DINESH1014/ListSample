package org.sample.list;

import java.util.*;
public class SetSample {
	
	public static void main(String[] args) {
		
		
		Set<Integer> S = new TreeSet<Integer>();
		
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		System.out.println(S);
		Set< Integer> si = new TreeSet<Integer>();
		si.add(100);
		si.add(200);
		si.add(400);
        si.add(400);
        System.out.println(si);
        
      int a =   si.size();
        System.out.println(a);
        
       S.addAll(si);
        System.out.println(S);
        
        
        
		/*boolean d = si.contains(400);
		System.out.println(d);
		
		si.remove(400);
		System.out.println(si);

		S.retainAll(si);
		System.out.println(S);*/
		S.removeAll(si);
		System.out.println(S);
		
		
		for (Integer X : S) {
			System.out.println("  "+X);
		}
		
	}
	

}
