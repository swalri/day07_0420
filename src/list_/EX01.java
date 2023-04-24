package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
/*
collection
 - 데이터의 집합 구조
 - 공가의 크기가 유동적이다
framework
 - 기본 틀
 - 
collection framwork
 - list
 	- 순서가 존재한다.
 	- 데이터의 중복은 허용 가능
 - map
 - set
*/
//		ArrayList<String> arr = new ArrayList<>();
//		arr.add("0");
//		arr.add("1");
//		arr.add("2");
//		arr.add("3");
//		System.out.println(arr.size());
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
//		System.out.println(arr.get(3));
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
//		System.out.println("===for each===");
//		for(String s : arr) {
//			System.out.println(s);
		ArrayList<Integer> arr_Int = new ArrayList<>();
		arr_Int.add(0);
		arr_Int.add(1);
		arr_Int.add(2);
		arr_Int.add(3);
		arr_Int.add(4);
		arr_Int.add(5);
		for(int i : arr_Int) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


