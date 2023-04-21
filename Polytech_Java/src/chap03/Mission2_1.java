package chap03;

import java.util.Random; 
import java.util.Scanner;

public class Mission2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int count = 0;
		final int TRY_NUMBER = 7; 
								  
		boolean state = true; 
		rand.setSeed(System.currentTimeMillis());       //시드를 만들어 다른값을 적용하도록 설정
		System.out.println(System.currentTimeMillis()); //생성 난수를 보겠다
		int com = 1+ rand.nextInt(99);
		
		while(true) {
			count++; 
			if(count > TRY_NUMBER) {
				state = false; 
				count--;
				break;
			}
			
			System.out.println("1~99중 하나를 입력 >>");
			int user = scan.nextInt();
			
			if (user > com)			System.out.println("Down 시켜!");
			else if (user < com ) 	System.out.println("UP 시켜!");
			else break;
		} //while절
		
		System.out.println("======================");
		if(state) {System.out.println("이겼다!!");
				  System.out.println("시도횟수 : " + count);}
		else 	  {System.out.println("실패했다!!");
				  System.out.println("시도횟수 : " + count);}
	
	scan.close();	
	} //main절
} //class절

	