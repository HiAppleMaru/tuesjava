package chap03;

import java.util.Random; 
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int count = 0;
		final int TRY_NUMBER = 10; //상수, TRY_NUMBER로 지정하여
								   //     가독성 상승
		boolean state = true; // 상태가 성공임을 가정
		
		
		while(true) {
			count++; // count = count + 1 -> 3회반복 할 예정
			if(count > TRY_NUMBER) {
				state = false; // 횟수 넘어가면 state가 false로 변경
				break;
			}//if절 횟수초과로 break(탈출실패)
			int com = 1+ rand.nextInt(3);
	
			System.out.println("1(가위), 2(바위), 3(보) 중 하나를 입력 >>");
			int user = scan.nextInt();
			
			if (com == 1)			System.out.println("com : 가위");
			else if (com == 2) 		System.out.println("com : 바위");
			else 					System.out.println("com : 보");
			
			int result = user - com;
			if(result==0) 							System.out.println("무승부!");
			else if(result == -1 || result == 2 )   System.out.println("컴퓨터 승!");
//			else 									System.out.println("사용자 승!");
			else { System.out.println("사용자 승!"); break;} //이것을 대신 넣으면 사용자가 이기면 프로그램 종료   			
		} //while절
		System.out.println("======================");
		if(state) System.out.println("당신의 승리!");
		else 	  System.out.println("시도횟수 초과!");
		
	scan.close();	
	} //main절
} //class절

	

