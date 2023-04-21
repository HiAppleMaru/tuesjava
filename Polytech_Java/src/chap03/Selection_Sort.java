package chap03;

public class Selection_Sort {
//	IU�� Ȱ���� �������� �˰���
	public static void main(String[] args) {
	// 1�ܰ�� �̷��� �̷������. �� 7�ܰ踦 ���ľ� �ǹǷ�
		//          index  [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};

		System.out.print("���� ��: ");
		for(int iu : iu_height)
			System.out.print(iu + " "); // �����-> ���� ��: 180 165 175 170 160 171 150 162 
		System.out.println();
		//3. �ܰ躰�� �ݺ��ϱ�
		for(int i=0; i<7; i++)
	{
		// 1. �ּҰ� �˰���
		System.out.print("�ּҰ� ã��: ");
		int max = iu_height[i];
		int max_index = i;
		for(int j=i+1; j<8; j++) //������ 8��
			if(max < iu_height[j]) {
				max = iu_height[j];
				max_index = j;
			}
		System.out.print(max);
		System.out.print("[" + max_index + "]"); //����� -> �ּҰ� ã��: 150[6]
		System.out.println();
		
		// 2. ��ȯ �˰���
		int temp = iu_height[max_index];       // /
		iu_height[max_index] = iu_height[i];   // /
		iu_height[i] = temp;                   // \ 
		
		System.out.print(i+1 + "��° ���� ��: " );
		for(int iu : iu_height)
			System.out.print(iu + " "); //����� -> ���� ��: 150 165 175 170 160 171 180 162 
		System.out.println();
	}
	System.out.print("���� ���� ��: ");
		for(int iu : iu_height)
	System.out.print(iu + " ");
	
}

}

////          index  [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]
//int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
//
//System.out.print("���� ��: ");
//for(int iu : iu_height)
//	System.out.print(iu + " "); // �����-> ���� ��: 180 165 175 170 160 171 150 162 
//System.out.println();
//
//// �ּҰ� �˰���
//System.out.print("�ּҰ� ã��: ");
//int min = iu_height[0];
//int min_index = 0;
//for(int j=1; j<8; j++) //������ 8��
//	if(min > iu_height[j]) {
//		min = iu_height[j];
//		min_index = j;
//	}
//System.out.print(min);
//System.out.print("[" + min_index + "]"); //����� -> �ּҰ� ã��: 150[6]
//System.out.println();
//
////��ȯ �˰���
//int temp = iu_height[min_index];       // /
//iu_height[min_index] = iu_height[0];   // /  2�ܰ���ʹ� 0->i
//iu_height[0] = temp;                   // \  2�ܰ���ʹ� 0->i
//
//System.out.print("���� ��: ");
//for(int iu : iu_height)
//	System.out.print(iu + " "); //����� -> ���� ��: 150 165 175 170 160 171 180 162 
//System.out.println();
