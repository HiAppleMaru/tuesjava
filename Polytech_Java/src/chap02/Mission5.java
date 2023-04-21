package chap02;
import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >>");
		int res;
		int money = scan.nextInt(); //won 금액
		int 오만 = money/50000; // = 5만원권
		res = (money%50000);  // 5만원권 환전 후 나머지
		int 만 = res/10000;  // = 만원권
		res = (money%10000); // 만원권 환전 후 나머지
		int 천 = res/1000; // = 천원권
		res = (money%1000); // 천원권 환전 후 나머지
		int 백 = res/100; // = 백원권
		res = (money%100); // 백원권 환전 후 나머지
		int 오십 = res/50; // = 50원권
		res = (money%50); // 50원권 환전 후 나머지
		int 십 = res/10; // = 10원권
		res = (money%10); // =10원권 환전 후 나머지
		int 일 = res/1; // = 1원권
		
			
		System.out.println("오만원권 : " + 오만 + "매");
		System.out.println("만원권 : " + 만 + "매");
		System.out.println("천원권 : " + 천 + "매");
		System.out.println("백원권 : " + 백 + "매");
		System.out.println("오십원권 : " + 오십 + "매");
		System.out.println("십원권 : " + 십 + "매");
		System.out.println("일원권 : " + 일 + "매");
		scan.close();
		
		
	}

}
