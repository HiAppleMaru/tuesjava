package chap04;

public class MethodSample {
	
	//�޼�Ʈ �����ε�
	int getSum(int x, int y){return x+y;}
	int getSum(int x, int y, int z){return x+y+z;}
	
	double getSum(double x, double y){return (double)(x+y);}
	
	public static void main(String[] args) {
		MethodSample sample = new MethodSample();
		System.out.println(sample.getSum(1,2));
		System.out.println(sample.getSum(1,2,3));
		System.out.println(sample.getSum(2.0,3.0));
		//getSum�κп� static�� �Ⱥٿ��� ������ �̷������� �����ؼ� ���!
	}

}