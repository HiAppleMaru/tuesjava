package chap04;

public class Circle {
	//필드 : 속성 ====================================================
	public static int radius; //멤버변수
	public String name; //멤버변수
	public static final double PI = 3.14; //책에는 없지만 임의로 집어넣음. 변하면 안되기 때문에
								   //final로 지정, 멤버변수, 상수
	public static String Circle_name = "원형"; //따로 관리하는 애들은 이탤릭체, 클래스변수
	
	//메소드 : 행위 ===================================================
	//생성자 메소드
//	public Circle(){}	//Default 생성자
	public Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
	} // 위의 name과 radius와는 다른것이기 때문에 파란색으로 나오지 않음
	//일반 메소드
	double getArea() {return PI * radius * radius;}
	static double getArea(double radious) {return PI * radius * radius;} //지역변수가 먼저 전역변수가 나중!
	//main Method															static에는 static만 써야됨.
	public static void main(String args[]) {
//		Circle c = new Circle();
//		Circle c1 = new Circle("원1", 3); // 원1의 radious는 3이라고 선언.
//		System.out.printf("%.2f", c1.getArea());
		
		Circle pizza = new Circle("피자", 10);
		Circle donut = new Circle("도넛", 2);
		System.out.println(Circle.Circle_name); //Circle 클래스의 Circle_name 호출
		System.out.println("피자의 크기는 " + pizza.getArea());
		System.out.println("도넛의 크기는 " + donut.getArea());
		System.out.println(Circle.getArea(3.0)); //static 달려있는 area라서 이탤릭체로 바뀜.
	}
	
}
	


	

