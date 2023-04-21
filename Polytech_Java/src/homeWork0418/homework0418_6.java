package homeWork0418;

class Point_6 {
	private int x,y;
	public Point_6(int x, int y) {this.x = x; this.y =y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

class ColorPoint_6 extends Point_6 {
	private String color;
	public ColorPoint_6() {
		super(0,0);
		this.color = "BLACK";}
	public ColorPoint_6(int x, int y) {
		super(x,y);
	}
	public void setXY (int x, int y) {
		move(x, y); }
	public void setColor (String color) {
		this.color = color;}
	public String toString() {
		return this.color + "���� (" + getX() + "," + getY() + ")�� ��";}
	}
	
	
public class homework0418_6 {

	public static void main(String[] args) {
		ColorPoint_6 zeroPoint = new ColorPoint_6(); // (0,0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�");
		
		ColorPoint_6 cp = new ColorPoint_6(10, 10); // (10,10) ��ġ�� BLACK �� ��
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}
}
