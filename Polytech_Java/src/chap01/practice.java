package chap01;

public class practice {
	public static int sum(int a, int b) {
		return a+b;
	}
	public static double CtoF(int c) {
		return (9.0/5.0)*c + 32;
	}
	public static int max(int d, int e){
		if(d>e) 
			return d; 
		else
			return e; 
}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int s = sum (a, b);
		System.out.print("두 값의 합계는 " + s);
		System.out.println("입니다.");
		int c = 15;
		System.out.print("화씨온도는 "+CtoF(c));
		System.out.println("도 입니다.");
		int x = 10;
		int y = 20;
				System.out.print("더 큰 수는 "+max(x,y));
				System.out.println("입니다.");
		}
		
	}
