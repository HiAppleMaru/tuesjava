package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ppt52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scan.nextInt(); //���� �Է�
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scan.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				i--; // �ε����� �������� �ʵ��� �̸� ����
				continue; // ���� ����
			}
			sum += n; //���ϱ�
		}
		System.out.println("���� " + sum);
		scan.close();
	}

}
