
package chap03;

public class Selection_Sort_2 {
//	IU를 활용한 선택정렬 알고리즘
	public static void main(String[] args) {
	// 1단계는 이렇게 이루어진다. 총 7단계를 거쳐야 되므로
		//          index  [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};

		System.out.print("정렬 전: ");
		for(int iu : iu_height)
			System.out.print(iu + " "); // 결과값-> 정렬 전: 180 165 175 170 160 171 150 162 
		System.out.println();
		//3. 단계별로 반복하기
		for(int i=0; i<7; i++)
	{
		// 1. 최소값 알고리즘
		System.out.print("최소값 찾기: ");
		int min = iu_height[i];
		int min_index = i;
		for(int j=i+1; j<8; j++) //데이터 8개
			if(min > iu_height[j]) {
				min = iu_height[j];
				min_index = j;
			}
		System.out.print(min);
		System.out.print("[" + min_index + "]"); //결과값 -> 최소값 찾기: 150[6]
		System.out.println();
		
		// 2. 교환 알고리즘
		int temp = iu_height[min_index];       // /
		iu_height[min_index] = iu_height[i];   // /
		iu_height[i] = temp;                   // \ 
		
		System.out.print(i+1 + "번째 정렬 후: " );
		for(int iu : iu_height)
			System.out.print(iu + " "); //결과값 -> 정렬 후: 150 165 175 170 160 171 180 162 
		System.out.println();
	}
	System.out.print("최종 정렬 후: ");
		for(int iu : iu_height)
	System.out.print(iu + " ");
	
}

}

////          index  [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]
//int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
//
//System.out.print("정렬 전: ");
//for(int iu : iu_height)
//	System.out.print(iu + " "); // 결과값-> 정렬 전: 180 165 175 170 160 171 150 162 
//System.out.println();
//
//// 최소값 알고리즘
//System.out.print("최소값 찾기: ");
//int min = iu_height[0];
//int min_index = 0;
//for(int j=1; j<8; j++) //데이터 8개
//	if(min > iu_height[j]) {
//		min = iu_height[j];
//		min_index = j;
//	}
//System.out.print(min);
//System.out.print("[" + min_index + "]"); //결과값 -> 최소값 찾기: 150[6]
//System.out.println();
//
////교환 알고리즘
//int temp = iu_height[min_index];       // /
//iu_height[min_index] = iu_height[0];   // /  2단계부터는 0->i
//iu_height[0] = temp;                   // \  2단계부터는 0->i
//
//System.out.print("정렬 후: ");
//for(int iu : iu_height)
//	System.out.print(iu + " "); //결과값 -> 정렬 후: 150 165 175 170 160 171 180 162 
//System.out.println();
