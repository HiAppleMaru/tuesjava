package chap03;

public class Mission5 {

	public static void main(String[] args) {
		//1. while문 활용 : 1~10까지의 수(num)를 합산하여 결과값(sum)을 출력하시오.
//		int num = 1;
//		int sum = 0; //누적합 (초기화는 항상 0)
//		while(num<=10) {
//			sum += num; // sum = sum + num
//			num++;
//		}
//		System.out.println("sum = " + sum);
		
		//2. do-while 문 활용 : 1~10까지의 수(num)를 합산한 결과값(sum)을 출력하시오.
//		int num = 1;
//		int sum = 0; //누적합 (초기화는 항상 0)
//		do {
//			sum += num; // sum = sum + num
//			num++;
//		} while(num<=10); 
//		System.out.println("sum = " + sum);
//		
		//3. for문 활용 : 1~10까지의 수(num)를 합산한 결과값(sum)을 출력하시오.
//		int sum = 0;
//		for(int num=1; num<=10; num++)
//			sum += num;
//		System.out.println("sum = " + sum);
//		
		//4. 1~100까지의 수 중에서 3의 배수만 합산(sum)하라.
//		int sum = 0;
//		for(int num = 1; num <= 100; num++)
//			 if(num %3 == 0) sum += num;

		//5. 1~100까지의 수 중에서 13의 배수 이전까지만 합산(sum)하라.
//		int sum = 0;
//		 for(int num =1; num <= 100; num++){
//		 if(num %13 == 0) break;
// 		 sum += num; (break가 걸리기 전까지)
// }

		// 6. 1~100까지의 수 중에서 13의 배수를 제외하고, 합산(sum)하라.
		int sum = 0;
        for(int num =1; num <= 100; num++){
           if(num %13 == 0) continue; //(continue 하면 밑에줄 실행 안하고 이전줄로)
           sum += num;		
        }
        System.out.println("sum = " + sum);
}
}
