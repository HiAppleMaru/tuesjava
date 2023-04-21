package chap03;

import java.util.Random;
import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		//1. 컴퓨터 값을 생성한다.
		rand.setSeed(System.currentTimeMillis());       
		System.out.println(System.currentTimeMillis()); 
		int com = 1+ rand.nextInt(99);
		final int try_number = 7; //최대시도횟수, 상수로 표현
		int count = 0;            //시도횟수를 위한 카운트
		boolean state = true;	  //상태변수 (성공이라고 가정)
		
		//3. 반복을 한다 (try_number 횟수까지, 성공할때까지)
		do {
			count++;
			if(count > try_number) {
				state = false;
				break;
			}
			
			//2. 게임을 한다.
			System.out.println("사용자입력(1~99)>>");
			int user = scan.nextInt(); //1~99
			
			if(user>com) System.out.println("down 시켜!");
			else if(user<com) System.out.println("up 시켜!");
			else break;
		}while(true);
		
		if(state) System.out.println("맞추셨습니다!!");
		else      System.out.println("실패하셨습니다!! 시도횟수는" + (count-1));
	}

}
