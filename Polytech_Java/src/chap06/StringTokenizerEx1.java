package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
//		String data = "ȫ�浿,010-1234-5678,�����,�л�";
//		StringTokenizer st = new StringTokenizer(data,",");
//		
//		while(st.hasMoreTokens()) {
//			System.out.println("�̸� : " + st.nextToken());
//			System.out.println("��ȭ : " + st.nextToken());
//			System.out.println("�ּ� : " + st.nextToken());
//			System.out.println("���� : " + st.nextToken());

// "ȫ�浿,��,65,170/�����,��,57,164/���屺,��,80,190/����,��,77,167/ȫ�̿�,��,64,165" 
// ���ڵ��� ü���� ����� ���϶�
		String data = "ȫ�浿,��,65,170/�����,��,57,164/���屺,��,80,190/����,��,77,167/ȫ�̿�,��,64,165";	
		StringTokenizer st = new StringTokenizer(data,"/");
		int sum = 0;
		int count = 0;
		while(st.hasMoreTokens()) {
			StringTokenizer st1 = new StringTokenizer(st.nextToken(),","); //st(ȫ�浿,��,65,170/�����,��,57,164 �̷������� �����µ�... nextToken���� �̸� ����...
			while(st1.hasMoreTokens()) {								   //�� ��,65,170/��,57,164 �̷������� ������ ����
				if(st1.nextToken().equals("��"))                           //�׸��� "��"�� ��ġ�ϴ� �����͸� ����������...
				{														
						count++;										   //count++ ��Ű��
						sum+=Integer.parseInt(st1.nextToken());			   //"��"�� ���� �����͸� ��� sum�� ����...
					}
				}
			
			}
				System.out.println("���ڵ��� ��� ü�� : " + ((double)sum / count)); //������ sum�� count�� ������ ���.
				
			
			}
}
