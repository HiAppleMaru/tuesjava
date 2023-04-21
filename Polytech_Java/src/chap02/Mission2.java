package chap02;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		/*자동 import : Ctrl + Shift + O
		  한줄 복사 : Ctrl + Alt + 방향키 */
		
		Scanner scan = new Scanner(System.in);
		/*Scanner scan;
		new Scanner(System.in); 이 두 줄을 합친것*/
		System.out.print("입력할 내용을 적어주세요 >>");
		String msg = scan.next();
		System.out.println("msg = " + msg);
	
		System.out.print("입력할 정수을 적어주세요 >>");
		int num = scan.nextInt();
		System.out.println("num = " + num);
		
	
	
	}

}
