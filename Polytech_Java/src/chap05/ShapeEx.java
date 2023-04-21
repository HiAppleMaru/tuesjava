package chap05;

class Shape{
	void draw() {System.out.println("Shape");}
}

class Line extends Shape{
	@Override //달아주는게 국룰...
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
		c.draw(); //draw가 Shape와 Circle 두군데 있지만 Circle에서 오버라이드를 해버렸기 때문에
		//Circle의 속성을 사용해서 Circle 결과값 나옴
		System.out.println("---------------------");
		Shape shape = new Line();
		shape.draw();
		//Line이 부모쪽을 무시하고 오버라이딩한 메소드를 출력함. 
	}

}
