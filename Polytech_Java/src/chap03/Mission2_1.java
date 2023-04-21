package chap03;

import java.util.Random; 
import java.util.Scanner;

public class Mission2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int count = 0;
		final int TRY_NUMBER = 7; 
								  
		boolean state = true; 
		rand.setSeed(System.currentTimeMillis());       //�õ带 ����� �ٸ����� �����ϵ��� ����
		System.out.println(System.currentTimeMillis()); //���� ������ ���ڴ�
		int com = 1+ rand.nextInt(99);
		
		while(true) {
			count++; 
			if(count > TRY_NUMBER) {
				state = false; 
				count--;
				break;
			}
			
			System.out.println("1~99�� �ϳ��� �Է� >>");
			int user = scan.nextInt();
			
			if (user > com)			System.out.println("Down ����!");
			else if (user < com ) 	System.out.println("UP ����!");
			else break;
		} //while��
		
		System.out.println("======================");
		if(state) {System.out.println("�̰��!!");
				  System.out.println("�õ�Ƚ�� : " + count);}
		else 	  {System.out.println("�����ߴ�!!");
				  System.out.println("�õ�Ƚ�� : " + count);}
	
	scan.close();	
	} //main��
} //class��

	