package com.javabasics.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		
		ListIterator<Integer> li=al.listIterator();
		
       System.out.println(al);
       // ways to initlize an ArrayList
       ArrayList<String> al1= new ArrayList<String>(Arrays.asList("Tulasi","kaki"));
        System.out.println(al1);
        // Immutable Collection  List.of("kaki","paki");
        
        HashMap<String,String> hm= new HashMap<String,String>();
        
        hm.put("Tulasi", "Infosys");
        hm.put("Baby", "TCS");
        
        al1.addAll(hm.keySet());
        
        System.out.println(al1);
        
        System.out.println('c');
        
        // arrayList list of Lists 
        
        ArrayList<List<Integer>> list= new ArrayList<>();
        
        list.add(Arrays.asList(10,20,30));
        list.add(Arrays.asList(40,50,60,70));
        
        list.forEach(list1-> li.forEachRemaining(le->System.out.println(le)));
        
        for(List a:list) {
        	System.out.println(a);
        }
        
        System.out.println(list.size());
        
         ArrayList<String> tul= new ArrayList<String>(Arrays.asList("Tulasi","Karthi","baby"));
          ArrayList<String> tu2=new ArrayList<>();
          
         tul.stream().filter( paki -> !paki.contains("Tulasi")).forEachOrdered(tu2::add);
          System.out.println(tu2);
         tu2.remove("Tulasi");
         
         tul.clear();
         System.out.println(tul);
         
         // removing duplicates 
         ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
         
         System.out.println(numbersList);
         
         List<Integer> nodup=numbersList.stream().distinct().collect(Collectors.toList());
       
         
         System.out.println(nodup);
         
         ArrayList<String> stringList=new ArrayList<String>(Arrays.asList("Tulasi","Karthi","Amma","Baby","kphb","Tulasi","kphb"));
         System.out.println(stringList);
         List<String> nostrdup=stringList.stream().distinct().collect(Collectors.toList());
         System.out.println(nostrdup);
           
	}

}
