package chap03;

import java.util.Random;
import java.util.Scanner;

public class homework_0404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();					    // 랜덤=>ran
		boolean state = true;	                        // 상태변수 (성공이라고 가정)

		
		while(state) {
			ran.setSeed(System.currentTimeMillis());        // 시드를 만들어 다른값을 적용하도록 설정
			int goal = ran.nextInt(100);                    // 답=> goal(0~99까지)
			int t = 1;										// 시도횟수=> t 
			int min = 0, max = 99;							// min=> 최소값, max=> 최대값
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");

			while(state){
				System.out.println(min + "~" + max);
				System.out.print(t + ">>");
				int in = scan.nextInt();                        // 사용자 입력값=> in 
					if(in>goal) 	 {System.out.println("더 낮게");
										max = in; t++;}			// max에 입력값 적용
					else if(in<goal) {System.out.println("더 높게");
						 				min = in; t++;}			// min에 입력값 적용
					else break;
						}	
			System.out.println("맞았습니다.");		
			System.out.println("다시하시겠습니까(y/n)>>");
			String text = scan.next();
				if(text.equals("n")) break; 					// n을 입력하면 종료
					}
	}
}

