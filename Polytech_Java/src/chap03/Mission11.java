package chap03;

import java.util.Scanner;
public class Mission11 { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scan.nextLine();
			if(text.equals("exit")) // "exit"이 입력되면 반복 종료
				break; // while 문을 벗어남
		}
		System.out.println("반복문을 종료합니다.");
	}	
}
