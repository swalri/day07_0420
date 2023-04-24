package list_;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
/*
add = 값 추가
get = 값 보여주기
remove = 값 제거
contains = 값이 있는지 확인
set = 지정 위치 수정
*/
		ArrayList<String> arr = new ArrayList<>();
		
		
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		for(String s : arr) {
			if(s.equals("bbb")) {
				System.out.println("ㅠㅠㅠ");
			}else {
				System.out.println("bbb");
			}
		}
//contains()
//arr안에 특정 데이터가 존재하면 true, 그렇지 않으면 false
		System.out.println("===================");
		System.out.println(arr);
		System.out.println(arr.contains("bbb"));
		System.out.println(arr.contains("ㅠㅠㅠ"));
		boolean n = arr.contains("bb2");
		System.out.println("삭제 전 : "+arr);
		arr.remove(1);
		System.out.println("삭제 후 : "+arr);
		
		
	}
}


