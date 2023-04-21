package chap02;

import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이 입력 >>");
		int age = scan.nextInt();
		System.out.println("시간 입력 >>");
		int time = scan.nextInt();
		
		int price = 0; // = 0은 초기화 시켜주는작업
		
		//중첩 if문
		if(time >= 9 && time <= 18) 		//주간권
		{
			if(age <= 7 || age >= 65) price = 15000;
			else					  price = 30000;
		}
		else if(time > 18 && time <=22)
		{
			if(age <= 7 || age >= 65) price = 10000;
			else					  price = 20000;
		}
	System.out.println("요금은 " + price + "원 입니다.");
	scan.close();
	}

}
