package chap01;

/* �������� 2���� input parameter�� �Է¹��� ��
�� ū ���� return �ϴ� Max �޼ҵ带 �ۼ��϶� */

public class Mission2 {
	public static int max(int d, int e){
		if(d>e) 
			return d; 
		else
			return e; 
}
// �� ���� ����ϱ�	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("�� ū ���� : "+max(x,y));
	}

}
