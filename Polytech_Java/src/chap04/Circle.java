package chap04;

public class Circle {
	//�ʵ� : �Ӽ� ====================================================
	public static int radius; //�������
	public String name; //�������
	public static final double PI = 3.14; //å���� ������ ���Ƿ� �������. ���ϸ� �ȵǱ� ������
								   //final�� ����, �������, ���
	public static String Circle_name = "����"; //���� �����ϴ� �ֵ��� ���Ÿ�ü, Ŭ��������
	
	//�޼ҵ� : ���� ===================================================
	//������ �޼ҵ�
//	public Circle(){}	//Default ������
	public Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
	} // ���� name�� radius�ʹ� �ٸ����̱� ������ �Ķ������� ������ ����
	//�Ϲ� �޼ҵ�
	double getArea() {return PI * radius * radius;}
	static double getArea(double radious) {return PI * radius * radius;} //���������� ���� ���������� ����!
	//main Method															static���� static�� ��ߵ�.
	public static void main(String args[]) {
//		Circle c = new Circle();
//		Circle c1 = new Circle("��1", 3); // ��1�� radious�� 3�̶�� ����.
//		System.out.printf("%.2f", c1.getArea());
		
		Circle pizza = new Circle("����", 10);
		Circle donut = new Circle("����", 2);
		System.out.println(Circle.Circle_name); //Circle Ŭ������ Circle_name ȣ��
		System.out.println("������ ũ��� " + pizza.getArea());
		System.out.println("������ ũ��� " + donut.getArea());
		System.out.println(Circle.getArea(3.0)); //static �޷��ִ� area�� ���Ÿ�ü�� �ٲ�.
	}
	
}
	


	

