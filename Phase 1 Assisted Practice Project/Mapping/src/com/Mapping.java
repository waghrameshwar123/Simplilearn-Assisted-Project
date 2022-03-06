package com;

import java.util.*;
public class Mapping {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"A");    
	      hm.put(2,"B");    
	      hm.put(3,"C");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"D");  
	      ht.put(5,"E");  
	      ht.put(6,"F");  
	      ht.put(7,"G");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"H");    
	      map.put(9,"I");    
	      map.put(10,"J");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
