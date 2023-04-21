package chap03;

import java.util.Scanner;
public class Mission7 {

	public static void main(String[] args) {
		int count = 0 , sum = 0; //정수의 갯수, 총합
		double average = 0.0;    //평균
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하고 종료시에 -1을 입력하시오 : ");
		int n = scan.nextInt();
		
		while(n != -1) { //-1이 입력되면 while 문 벗어남
			sum = sum + n; // sum += n;
			count++;
			n = scan.nextInt(); // 정수 입력
		}
		if(count == 0) System.out.println("정수를 입력해");
		else {
			System.out.println("정수의 개수는 " + count + "개이며");
			average = (double)sum / count;
			System.out.println("평균은 " + average + "입니다.");
		}
		scan.close();
	}
	
}
