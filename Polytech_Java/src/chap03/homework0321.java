package chap03;

public class homework0321 {

	public static void main(String[] args) {
		int x = 0;	
		
		for (x = 1; x <=99; x++) {
			int one = x % 10; //일의 자리
			int ten = x / 10; //십의 자리
			
			if (x < 10) {
                if (x % 3 == 0)
                    System.out.println(x + " 박수 짝");} // 3, 6, 9 뽑아냄 
            else {
                if ((ten % 3 == 0) && (x % 10 == 0))            // 30, 60, 90
                    System.out.println(x + " 박수 짝");
                else if ((one % 3 == 0) && (ten % 3 == 0))     // 일의 자리, 십의 자리 둘다 3의 배수
                    System.out.println(x + " 박수 짝짝");
                else if ((one % 3 == 0) || (ten % 3 == 0))     
                    if (x % 10 != 0)        				// 3의 배수가 1개이면서 10의 배수 거르기
                        System.out.println(x + " 박수 짝");
				}
			}
			}
			}
			
	

	

