package chap02;
// user �� com �� �ִ�.
// user�� 1,2,3 - ���� ���� ��
// com�� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�

import java.util.Random; 
// Random Ŭ���� ���� �߰�
import java.util.Scanner;

public class Mission10_1 {

	public static void main(String[] args) {
		// 1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ����
		// int com = (int)(1 + Math.random()*3);
		
		// 2) Random() Ŭ������ nextInt, nextDouble...
		Random rand = new Random();
		int com = 1+ rand.nextInt(3);

		Scanner scan = new Scanner(System.in);
		System.out.println("1(����), 2(����), 3(��) �� �ϳ��� �Է� >>");
		int user = scan.nextInt();
		if (com == 1)
			System.out.println("com : ����");
		else if (com == 2) 
			System.out.println("com : ����");
		else
			System.out.println("com : ��");
		
		int result = user - com;
		if(result==0) System.out.println("���º�!");
		else if(result == -1 || result == 2 ) System.out.println("��ǻ�� ��!");
		else System.out.println("����� ��!");
		}
		}

	
