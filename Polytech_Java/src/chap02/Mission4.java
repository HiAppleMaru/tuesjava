package chap02;
import java.util.Scanner;
public class Mission4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("2자리 수 정수 입력(10~99) >>");
	
	int twin = scan.nextInt(); //twin 정수
	int twin10 = twin/10; //twin10 = 십의자리
	int twin1 = twin%10;  //twin1 = 일의자리
	
	// 조건연산자 사용시
	/*
	 * String msg = (twin10 == twin1) ? "YES! 십의 자리와 일의 자리가 같습니다." : "NO! 같지 않습니다.";
	 * System.out.println(msg);
	 */
	
	// if문 사용시
	String msg;
		
	if (twin10 == twin1) {msg = "Yes, 10의자리 수와 1의자리 수가 같습니다.";}
	else                 {msg = "No, 10의자리 수와 1의자리 수가 다릅니다.";}
	System.out.println(msg);
	scan.close();
	
	}

}
