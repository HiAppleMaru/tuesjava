package homeWork0418;


class Point_5 {
	private int x,y;
	public Point_5(int x, int y) {this.x = x; this.y =y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

class ColorPoint_5 extends Point_5{
	private String color; // 점의 색
	public ColorPoint_5(int x, int y, String color) {
			super(x, y);
			this.color = color;}
	public void setXY (int x, int y) {
			move(x, y);	}
	public void setColor(String color) {
		this.color = color;	}
	public String toString() {
		return this.color + "색의 (" + getX() + "," + getY() + ")의 점";}
}
public class homework0418_5 {

	public static void main(String[] args) {
		ColorPoint_5 cp = new ColorPoint_5(5,5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
