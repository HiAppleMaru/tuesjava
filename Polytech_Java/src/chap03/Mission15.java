package chap03;

public class Mission15 {

	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}
		//exception은 보통 기본으로 들어가있어 import안해도 됨
		catch(ArithmeticException e){
			System.out.println("0으로는 나눌 수 없습니다.");
		} 
		
		
	}

}
