package chap03;
import java.util.Scanner;
public class Mission1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		1. while �� ���
		System.out.println("�������� >> ");
		int toeic = scan.nextInt();
		
//		while(toeic<700) {
		while(true) { //���ѹݺ�
			if(toeic>=700) break;
			System.out.println("���θ� �ϼ���!");
			System.out.println("������ �ϼ���!");
			System.out.println("�������� >>");
			toeic = scan.nextInt();
		}
		System.out.println("���� ���� Ż��!!!");
//      while �ۿ���!
	}
}
