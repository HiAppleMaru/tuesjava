package chap04;

public class MethodSample {
	
	//메소트 오버로딩
	int getSum(int x, int y){return x+y;}
	int getSum(int x, int y, int z){return x+y+z;}
	
	double getSum(double x, double y){return (double)(x+y);}
	
	public static void main(String[] args) {
		MethodSample sample = new MethodSample();
		System.out.println(sample.getSum(1,2));
		System.out.println(sample.getSum(1,2,3));
		System.out.println(sample.getSum(2.0,3.0));
		//getSum부분에 static을 안붙였기 때문에 이런식으로 변형해서 사용!
	}

}
