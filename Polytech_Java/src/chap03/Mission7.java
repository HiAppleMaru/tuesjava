package chap03;

import java.util.Scanner;
public class Mission7 {

	public static void main(String[] args) {
		int count = 0 , sum = 0; //������ ����, ����
		double average = 0.0;    //���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϰ� ����ÿ� -1�� �Է��Ͻÿ� : ");
		int n = scan.nextInt();
		
		while(n != -1) { //-1�� �ԷµǸ� while �� ���
			sum = sum + n; // sum += n;
			count++;
			n = scan.nextInt(); // ���� �Է�
		}
		if(count == 0) System.out.println("������ �Է���");
		else {
			System.out.println("������ ������ " + count + "���̸�");
			average = (double)sum / count;
			System.out.println("����� " + average + "�Դϴ�.");
		}
		scan.close();
	}
	
}
