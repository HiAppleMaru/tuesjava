package chap02;
// user �� com �� �ִ�.
// user�� 1,2,3 - ���� ���� ��
// com�� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�

// import java.util.Random; 
// Random Ŭ���� ���� �߰�
import java.util.Scanner;

public class Mission10 {

	public static void main(String[] args) {
		// 1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ����
		int com = (int)(1 + Math.random()*3);
		
		// 2) Random() Ŭ������ nextInt, nextDouble...
		// Random rand = new Random();
		// int com = 1+ rand.nextInt(3);

		Scanner scan = new Scanner(System.in);
		System.out.println("1(����), 2(����), 3(��) �� �ϳ��� �Է� >>");
		int user = scan.nextInt();
		
//		if (user == 1) {
//			if (com == 1) System.out.println("�����ϴ�. com�� ���� " + com + "�Դϴ�." );
//			if (com == 2) System.out.println("com�� �̰���ϴ�. com�� ���� " + com + "�Դϴ�.");
//			if (com == 3) System.out.println("user�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
//			}
//		if (user == 2) {
//			if (com == 2) System.out.println("�����ϴ�. com�� ���� " + com + "�Դϴ�.");
//			if (com == 3) System.out.println("com�� �̰���ϴ�. com�� ���� " + com + "�Դϴ�.");
//			if (com == 1) System.out.println("user�� �̰���ϴ�. com�� ���� " + com + "�Դϴ�.");
//			}
//		if (user == 3) {
//			if (com == 3) System.out.println("�����ϴ�. com�� ���� " + com + "�Դϴ�.");
//			if (com == 1) System.out.println("com�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
//			if (com == 2) System.out.println("user�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
//			}
		switch (user) { //{ swich ����غ���, case���� break ����
		case 1 : if (com == 2) System.out.println("com�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
		    else if (com == 3) System.out.println("user�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
		    else     System.out.println("�����ϴ�. com�� ���� " + com + "�Դϴ�.");
			break;
			
		case 2 : if (com == 3) System.out.println("com�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
		else if (com == 1) System.out.println("user�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
		else     System.out.println("�����ϴ�. com�� ���� " + com + "�Դϴ�.");
		break;
		
		case 3 : if (com == 1) System.out.println("com�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
		else if (com == 2) System.out.println("user�� �̰���ϴ�.com�� ���� " + com + "�Դϴ�.");
		else     System.out.println("�����ϴ�. com�� ���� " + com + "�Դϴ�.");
		break;
		}
	}
}



				
	


