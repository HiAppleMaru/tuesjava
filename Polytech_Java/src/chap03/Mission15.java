package chap03;

public class Mission15 {

	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}
		//exception�� ���� �⺻���� ���־� import���ص� ��
		catch(ArithmeticException e){
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} 
		
		
	}

}
