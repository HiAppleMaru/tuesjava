package chap02;
import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >>");
		int res;
		int money = scan.nextInt(); //won �ݾ�
		int ���� = money/50000; // = 5������
		res = (money%50000);  // 5������ ȯ�� �� ������
		int �� = res/10000;  // = ������
		res = (money%10000); // ������ ȯ�� �� ������
		int õ = res/1000; // = õ����
		res = (money%1000); // õ���� ȯ�� �� ������
		int �� = res/100; // = �����
		res = (money%100); // ����� ȯ�� �� ������
		int ���� = res/50; // = 50����
		res = (money%50); // 50���� ȯ�� �� ������
		int �� = res/10; // = 10����
		res = (money%10); // =10���� ȯ�� �� ������
		int �� = res/1; // = 1����
		
			
		System.out.println("�������� : " + ���� + "��");
		System.out.println("������ : " + �� + "��");
		System.out.println("õ���� : " + õ + "��");
		System.out.println("����� : " + �� + "��");
		System.out.println("���ʿ��� : " + ���� + "��");
		System.out.println("�ʿ��� : " + �� + "��");
		System.out.println("�Ͽ��� : " + �� + "��");
		scan.close();
		
		
	}

}
