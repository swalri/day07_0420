package set_;
import java.util.ArrayList;
import java.util.Scanner;
public class test02_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(10,10) 칸에 원하는 좌표에 *추가
		//원하는 만큼 추가하다 종료하고 싶을경우 0을 입력
		// **********
		// **********
		// **********
		// **********
		// **********
		Scanner scan = new Scanner(System.in);
		int x=10,y=10;
		int a,b;
		String[][] xy = new String[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				xy[i][j] = "*";
				System.out.print(xy[i][j]);
			}
			System.out.println();
		}
		while(true) {
			System.out.print("좌표를 입력해 주세요(0,0) : ");
			a = scan.nextInt();
			b = scan.nextInt();
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					if(i==b && j==a) {
						xy[i][j] = "O";
					}
					System.out.print(xy[i][j]);
				}
				System.out.println();
			}//for
		}//while
	}
}


