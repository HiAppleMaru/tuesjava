package chap04;

public class ArrayParameterEx {
	
	static void printCharArray(char a[]) {
//		for(int i=0; i<a.length; i++)
//			System.out.println(a[i]);
		for(char aa : a)
			System.out.print(aa); //이렇게 바꿀수도 있다.
		System.out.println();
	}
	
	static void replaceSpace(char a[]){
		for(int i=0; i<a.length; i++)
			if(a[i] == ' ')
				a[i] = '♥';
	}
	
	public static void main(String[] args) {
		char c[] = {'I',' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U', '.'};
		//static이 아니면 객체를 만들어 접근해야 된다.
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
