//5������

package chap02;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ� >>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a > b && a > c) { 
			if (a<b+c) System.out.println("�ﰢ���� �˴ϴ�.");
			else       System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");;
		}
		if (b > a && b > c) { 
			if (b<a+c) System.out.println("�ﰢ���� �˴ϴ�.");
			else       System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");;
		}
		if (c > b && c > a) { 
			if (c<a+b) System.out.println("�ﰢ���� �˴ϴ�.");
			else       System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");;
		scan.close();}
	}

}
