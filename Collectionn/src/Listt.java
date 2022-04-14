import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import java.util.Map;
import java.util.PriorityQueue;

import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class Listt {
	public static void main(String[] args) {
		

		SortedSet set = new TreeSet();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);
         
		//List
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList<>();
		Vector vector = new Vector<>();
		Stack stack = new Stack<>();
		
		//Queue
		PriorityQueue priorityQueue=new PriorityQueue();
		ArrayDeque arrayDeque=new ArrayDeque<>();
		Deque deque=new ArrayDeque<>();
		PriorityBlockingQueue blockingQueue=new PriorityBlockingQueue<>();
		
		//Set
		HashSet hashSet=new HashSet<>();
		LinkedHashSet hashSet1=new LinkedHashSet<>();
		LinkedHashMap hashMap=new LinkedHashMap<>();//map
		TreeSet set2=new TreeSet();
		HashMap hashMap2=new HashMap<>();
		hashMap2.put(01, "sono");
		System.out.println(hashMap2);
		 //map
		Map map=new HashMap<>();
		HashMap hashMap3=new HashMap<>();
		LinkedHashMap hashMap4=new LinkedHashMap<>();
		TreeMap map2=new TreeMap<>();
		Map map3=new Hashtable<>();
		map3.put(1, "john");
		map3.put(2, "jerry");
		map3.put(3, "justin");
		map3.put(4, "tom");
		System.out.println(map3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
