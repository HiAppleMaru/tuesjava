package chap03;

public class Mission14 {

	// makeArray 메소드 : int형 배열을 생성한후 데이터를 넣어 리턴하는 메소드
	static int[] makeArray() {  //makeArray는 static으로 선언해야 됨.(삼성 전략기획실?을 예로.. 회장직속)
		int temp[] = new int[4];
		for(int i=0; i<temp.length; i++)
			temp[i] = i;
		return temp;
	}

	public static void main(String[] args) {
		int intArray[] = makeArray();
		for(int n : intArray)
			System.out.print(n + " ");
	}
}

