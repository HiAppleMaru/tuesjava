package chap03;

public class homework0321 {

	public static void main(String[] args) {
		int x = 0;	
		
		for (x = 1; x <=99; x++) {
			int one = x % 10; //���� �ڸ�
			int ten = x / 10; //���� �ڸ�
			
			if (x < 10) {
                if (x % 3 == 0)
                    System.out.println(x + " �ڼ� ¦");} // 3, 6, 9 �̾Ƴ� 
            else {
                if ((ten % 3 == 0) && (x % 10 == 0))            // 30, 60, 90
                    System.out.println(x + " �ڼ� ¦");
                else if ((one % 3 == 0) && (ten % 3 == 0))     // ���� �ڸ�, ���� �ڸ� �Ѵ� 3�� ���
                    System.out.println(x + " �ڼ� ¦¦");
                else if ((one % 3 == 0) || (ten % 3 == 0))     
                    if (x % 10 != 0)        				// 3�� ����� 1���̸鼭 10�� ��� �Ÿ���
                        System.out.println(x + " �ڼ� ¦");
				}
			}
			}
			}
			
	

	

