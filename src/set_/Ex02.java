package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		/*
		
		*/
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		Iterator<String> it = arr.iterator();
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================");
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		Iterator<String> its = set.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
		
		
	}
}


