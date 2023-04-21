package homeWork0418;

class Point_8 {
	private int x,y;
	public Point_8(int x, int y) {this.x = x; this.y =y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

class PositivePoint extends Point_8 {
	public PositivePoint() {
		super(0, 0);}
	public PositivePoint(int x, int y) {super(0, 0);
		if(x > 0 && y > 0) {
			super.move(x, y);}}
	
	@Override
	public void move(int x, int y) {if(x > 0 && y > 0) 
		    super.move(x, y);}

	public String toString() {
			return "(" + super.getX() + "," + super.getY() + ")의 점";}
	}
public class homework0418_8 {
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}
