package chap02;
import java.util.Scanner;
public class Mission4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("2�ڸ� �� ���� �Է�(10~99) >>");
	
	int twin = scan.nextInt(); //twin ����
	int twin10 = twin/10; //twin10 = �����ڸ�
	int twin1 = twin%10;  //twin1 = �����ڸ�
	
	// ���ǿ����� ����
	/*
	 * String msg = (twin10 == twin1) ? "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�." : "NO! ���� �ʽ��ϴ�.";
	 * System.out.println(msg);
	 */
	
	// if�� ����
	String msg;
		
	if (twin10 == twin1) {msg = "Yes, 10���ڸ� ���� 1���ڸ� ���� �����ϴ�.";}
	else                 {msg = "No, 10���ڸ� ���� 1���ڸ� ���� �ٸ��ϴ�.";}
	System.out.println(msg);
	scan.close();
	
	}

}
