package chap02;
// user 와 com 이 있다.
// user는 1,2,3 - 가위 바위 보
// com은 random 하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
// if 또는 switch 중에 결정해서 프로그램 작성

import java.util.Random; 
// Random 클래스 사용시 추가
import java.util.Scanner;

public class Mission10_1 {

	public static void main(String[] args) {
		// 1) Math.random() 메소드를 활용해서 난수를 생성
		// int com = (int)(1 + Math.random()*3);
		
		// 2) Random() 클래스의 nextInt, nextDouble...
		Random rand = new Random();
		int com = 1+ rand.nextInt(3);

		Scanner scan = new Scanner(System.in);
		System.out.println("1(가위), 2(바위), 3(보) 중 하나를 입력 >>");
		int user = scan.nextInt();
		if (com == 1)
			System.out.println("com : 가위");
		else if (com == 2) 
			System.out.println("com : 바위");
		else
			System.out.println("com : 보");
		
		int result = user - com;
		if(result==0) System.out.println("무승부!");
		else if(result == -1 || result == 2 ) System.out.println("컴퓨터 승!");
		else System.out.println("사용자 승!");
		}
		}

	

