package chap03;

import java.util.Random; 
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int count = 0;
		final int TRY_NUMBER = 10; //���, TRY_NUMBER�� �����Ͽ�
								   //     ������ ���
		boolean state = true; // ���°� �������� ����
		
		
		while(true) {
			count++; // count = count + 1 -> 3ȸ�ݺ� �� ����
			if(count > TRY_NUMBER) {
				state = false; // Ƚ�� �Ѿ�� state�� false�� ����
				break;
			}//if�� Ƚ���ʰ��� break(Ż�����)
			int com = 1+ rand.nextInt(3);
	
			System.out.println("1(����), 2(����), 3(��) �� �ϳ��� �Է� >>");
			int user = scan.nextInt();
			
			if (com == 1)			System.out.println("com : ����");
			else if (com == 2) 		System.out.println("com : ����");
			else 					System.out.println("com : ��");
			
			int result = user - com;
			if(result==0) 							System.out.println("���º�!");
			else if(result == -1 || result == 2 )   System.out.println("��ǻ�� ��!");
//			else 									System.out.println("����� ��!");
			else { System.out.println("����� ��!"); break;} //�̰��� ��� ������ ����ڰ� �̱�� ���α׷� ����   			
		} //while��
		System.out.println("======================");
		if(state) System.out.println("����� �¸�!");
		else 	  System.out.println("�õ�Ƚ�� �ʰ�!");
		
	scan.close();	
	} //main��
} //class��

	

