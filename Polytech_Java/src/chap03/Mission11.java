package chap03;

import java.util.Scanner;
public class Mission11 { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.print(">>");
			String text = scan.nextLine();
			if(text.equals("exit")) // "exit"�� �ԷµǸ� �ݺ� ����
				break; // while ���� ���
		}
		System.out.println("�ݺ����� �����մϴ�.");
	}	
}
