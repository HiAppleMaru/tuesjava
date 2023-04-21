package homeWork0418;

class Point_7 {
	private int x,y;
	public Point_7(int x, int y) {this.x = x; this.y =y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

class Point3D extends Point_7{
	private int z;
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;}
	public void move(int x, int y, int z) {
		move(x,y);
		this.z = z;}
	
	public void moveUp() {
		z++;}
	public void moveDown () {
		z--;}
	public int getZ() {return z;}
	public String toString() {
		return "(" + getX() + "," + getY() + "," + getZ() + ")�� ��";}
	}

public class homework0418_7 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // 1, 2, 3�� ���� x, y, z���� ��.
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveUp(); // z ������ ���� �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		p.moveDown(); // z ������ �Ʒ��� �̵�
		p.move(10,10); // x, y ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100, 200, 300); // x, y, z ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
	}

}
