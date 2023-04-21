//5번문제

package chap02;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오 >>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a > b && a > c) { 
			if (a<b+c) System.out.println("삼각형이 됩니다.");
			else       System.out.println("삼각형이 되지 않습니다.");;
		}
		if (b > a && b > c) { 
			if (b<a+c) System.out.println("삼각형이 됩니다.");
			else       System.out.println("삼각형이 되지 않습니다.");;
		}
		if (c > b && c > a) { 
			if (c<a+b) System.out.println("삼각형이 됩니다.");
			else       System.out.println("삼각형이 되지 않습니다.");;
		scan.close();}
	}

}
