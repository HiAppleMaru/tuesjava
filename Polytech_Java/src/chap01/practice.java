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
		System.out.print("�� ���� �հ�� " + s);
		System.out.println("�Դϴ�.");
		int c = 15;
		System.out.print("ȭ���µ��� "+CtoF(c));
		System.out.println("�� �Դϴ�.");
		int x = 10;
		int y = 20;
				System.out.print("�� ū ���� "+max(x,y));
				System.out.println("�Դϴ�.");
		}
		
	}
