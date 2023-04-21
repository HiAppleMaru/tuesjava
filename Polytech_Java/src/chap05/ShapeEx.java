package chap05;

class Shape{
	void draw() {System.out.println("Shape");}
}

class Line extends Shape{
	@Override //�޾��ִ°� ����...
	void draw() {System.out.println("Line");}
}

class Rect extends Shape{
	@Override 
	void draw() {System.out.println("Rect");}
}

class Circle extends Shape{
	@Override 
	void draw() {System.out.println("Circle");}
}

public class ShapeEx {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw(); //draw�� Shape�� Circle �α��� ������ Circle���� �������̵带 �ع��ȱ� ������
		//Circle�� �Ӽ��� ����ؼ� Circle ����� ����
		System.out.println("---------------------");
		Shape shape = new Line();
		shape.draw();
		//Line�� �θ����� �����ϰ� �������̵��� �޼ҵ带 �����. 
	}

}
