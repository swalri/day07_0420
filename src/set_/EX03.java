package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class EX03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashSet<String> name = new HashSet<>();
		String n;
		
//		Iterator<String> its = set.iterator();
		while(true) {
			System.out.println("이름 입력");
			n = scan.next();
			boolean bool = name.add(n);
			if(!bool) {
				System.out.println("존재하는 이름 입니다");
			}else {
				System.out.println("저장 완료");
			}
		}
	}
}


