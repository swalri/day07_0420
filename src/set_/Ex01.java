package set_;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
/*
set
 - 순서가 존재하지 않는다 
 - 데이터의 중복을 허용하지 않는다
 - 배열 안의 공간을 16개로 잡고 75%가 차면 새롭개 16개의 공간을 생성한다.
 - 공간은 유동적이다
*/
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("eee");
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		arr.add("ddd");
		arr.add("eee");
		System.out.println("set : "+set);
		System.out.println("arr : "+arr);
		System.out.println("=====remove=====");
		set.remove("bbb");
		System.out.println("set : "+set);
		set.addAll(arr);
		System.out.println("set : "+set);
		
		
		
		
	}
}


