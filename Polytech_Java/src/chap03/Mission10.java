package chap03;

import java.util.Scanner;
public class Mission10 { //Mission 7 -> do while������ ����

	public static void main(String[] args) {
		int count = 0 , sum = 0; //������ ����, ����
		double average = 0.0;    //���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϰ� ����ÿ� -1�� �Է��Ͻÿ� : ");
		int n = 0;
		do {
			sum = sum + n; // sum += n;
			count++;
			n = scan.nextInt();
			}
		while(n != -1); //-1�� �ԷµǸ� while �� ���, ��Ƽ��, ���ʰ� -1
		count = count -1;
		if(count > 0) {
			System.out.println("������ ������ " + count + "���̸�");
			average = (double)sum / count;
			System.out.printf("����� %.2f", average);
		}
		else 
			System.out.println("������ �Է���");
		
			
		
		scan.close();
	}
	
}
