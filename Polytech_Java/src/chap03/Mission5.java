package chap03;

public class Mission5 {

	public static void main(String[] args) {
		//1. while�� Ȱ�� : 1~10������ ��(num)�� �ջ��Ͽ� �����(sum)�� ����Ͻÿ�.
//		int num = 1;
//		int sum = 0; //������ (�ʱ�ȭ�� �׻� 0)
//		while(num<=10) {
//			sum += num; // sum = sum + num
//			num++;
//		}
//		System.out.println("sum = " + sum);
		
		//2. do-while �� Ȱ�� : 1~10������ ��(num)�� �ջ��� �����(sum)�� ����Ͻÿ�.
//		int num = 1;
//		int sum = 0; //������ (�ʱ�ȭ�� �׻� 0)
//		do {
//			sum += num; // sum = sum + num
//			num++;
//		} while(num<=10); 
//		System.out.println("sum = " + sum);
//		
		//3. for�� Ȱ�� : 1~10������ ��(num)�� �ջ��� �����(sum)�� ����Ͻÿ�.
//		int sum = 0;
//		for(int num=1; num<=10; num++)
//			sum += num;
//		System.out.println("sum = " + sum);
//		
		//4. 1~100������ �� �߿��� 3�� ����� �ջ�(sum)�϶�.
//		int sum = 0;
//		for(int num = 1; num <= 100; num++)
//			 if(num %3 == 0) sum += num;

		//5. 1~100������ �� �߿��� 13�� ��� ���������� �ջ�(sum)�϶�.
//		int sum = 0;
//		 for(int num =1; num <= 100; num++){
//		 if(num %13 == 0) break;
// 		 sum += num; (break�� �ɸ��� ������)
// }

		// 6. 1~100������ �� �߿��� 13�� ����� �����ϰ�, �ջ�(sum)�϶�.
		int sum = 0;
        for(int num =1; num <= 100; num++){
           if(num %13 == 0) continue; //(continue �ϸ� �ؿ��� ���� ���ϰ� �����ٷ�)
           sum += num;		
        }
        System.out.println("sum = " + sum);
}
}
