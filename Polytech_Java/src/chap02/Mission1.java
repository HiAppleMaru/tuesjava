package chap02;

public class Mission1 {

	public static void main(String[] args) {
		boolean result;
		result = 3 == 5;
		System.out.println(result);
		System.out.println("==============");
		
		int a = (int) 3.5;
		
		int plain = 10;
		int key = 8;
		int cyper = plain ^ key;
		System.out.println("cyper = " + cyper);
		System.out.println("plain = " + (cyper ^ key));
		System.out.println("==============");
		System.out.println(10 >> 1);
		System.out.println(10 << 1);

		System.out.println("==============");
		var v = 30;
		System.out.println(v);
		
	}

}
		
		
//		int b = 12;
//		int c = a^b;
//		System.out.println(c);
		
//		int d = 12.5;
//		int e = (int) 12.5;
