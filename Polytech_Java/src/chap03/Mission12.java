package chap03;

public class Mission12 {

	public static void main(String[] args) {
		int lotto_num[] = new int [7];
		String names[] = {"엄남경", "정성호", "이유진"};
		//배열에 값 입력
		for (int i=0; i<7; i++) {//2줄 이상이면 {}로 묶어줘야 됨
			lotto_num[i] = 1 + (int)(Math.random() * 45);
			for(int j=0; j<i; j++)
				if(lotto_num[i] == lotto_num[j]) i--;
	
		}
		//배열에 값 출력
//		for (int i=0; i<7; i++)
//			System.out.printf("%5d", lotto_num[i]);

		//for each문을 이용한 값 출력
		for (int num : lotto_num)
			System.out.printf("%5d", num);
		
		System.out.println();
		
		for (String name : names)
			System.out.print(" " + name + " ");
	}

}
