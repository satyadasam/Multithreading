package forkJoinDemoAsyncExample;

import java.util.concurrent.ConcurrentHashMap;

public class A {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> reducedMap = new ConcurrentHashMap<>();
		reducedMap.put("One", 1);
		reducedMap.put("Two", 2);
		reducedMap.put("Three", 3);
		System.out.println("reduce example => " 
		 +reducedMap.reduce(2, (k, v) -> v*2, (total, elem) -> total + elem) ); 
		System.out.println("reduceKeys example => " 
		 +reducedMap.reduceKeys(2, (key1, key2) -> key1.length() > key2.length() ? key1 + "-"+key2 : key2 + "-"+key1)); 
		System.out.println("reduceValues example => " 
		 +reducedMap.reduceValues(2, (v) -> v*2 , (value1, value2) -> value1 > value2 ? value1 - value2 : value2 - value1));
		System.out.println("After reduce => " +reducedMap);
	}

}
