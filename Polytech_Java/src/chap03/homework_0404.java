package chap03;

import java.util.Random;
import java.util.Scanner;

public class homework_0404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();					    // ����=>ran
		boolean state = true;	                        // ���º��� (�����̶�� ����)

		
		while(state) {
			ran.setSeed(System.currentTimeMillis());        // �õ带 ����� �ٸ����� �����ϵ��� ����
			int goal = ran.nextInt(100);                    // ��=> goal(0~99����)
			int t = 1;										// �õ�Ƚ��=> t 
			int min = 0, max = 99;							// min=> �ּҰ�, max=> �ִ밪
			
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");

			while(state){
				System.out.println(min + "~" + max);
				System.out.print(t + ">>");
				int in = scan.nextInt();                        // ����� �Է°�=> in 
					if(in>goal) 	 {System.out.println("�� ����");
										max = in; t++;}			// max�� �Է°� ����
					else if(in<goal) {System.out.println("�� ����");
						 				min = in; t++;}			// min�� �Է°� ����
					else break;
						}	
			System.out.println("�¾ҽ��ϴ�.");		
			System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
			String text = scan.next();
				if(text.equals("n")) break; 					// n�� �Է��ϸ� ����
					}
	}
}

