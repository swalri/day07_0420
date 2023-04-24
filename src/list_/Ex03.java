package list_;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		/*
		
		*/
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		System.out.println(arr.indexOf("ccc"));
		System.out.println(arr.indexOf("bbb22"));
		System.out.println("============");
		
		System.out.println(arr);
		arr.remove("bbb");
		arr.add("bbb");//마지막 추가
		arr.add(1, "ㅁㅁㅁ");//특정위치 추가
		System.out.println(arr);
		arr.set(1, "ddd");//특정위치 수정
		System.out.println(arr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


;