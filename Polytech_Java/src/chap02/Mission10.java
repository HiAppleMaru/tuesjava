package chap02;
// user 와 com 이 있다.
// user는 1,2,3 - 가위 바위 보
// com은 random 하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
// if 또는 switch 중에 결정해서 프로그램 작성

// import java.util.Random; 
// Random 클래스 사용시 추가
import java.util.Scanner;

public class Mission10 {

	public static void main(String[] args) {
		// 1) Math.random() 메소드를 활용해서 난수를 생성
		int com = (int)(1 + Math.random()*3);
		
		// 2) Random() 클래스의 nextInt, nextDouble...
		// Random rand = new Random();
		// int com = 1+ rand.nextInt(3);

		Scanner scan = new Scanner(System.in);
		System.out.println("1(가위), 2(바위), 3(보) 중 하나를 입력 >>");
		int user = scan.nextInt();
		
//		if (user == 1) {
//			if (com == 1) System.out.println("비겼습니다. com의 값은 " + com + "입니다." );
//			if (com == 2) System.out.println("com이 이겼습니다. com의 값은 " + com + "입니다.");
//			if (com == 3) System.out.println("user가 이겼습니다.com의 값은 " + com + "입니다.");
//			}
//		if (user == 2) {
//			if (com == 2) System.out.println("비겼습니다. com의 값은 " + com + "입니다.");
//			if (com == 3) System.out.println("com이 이겼습니다. com의 값은 " + com + "입니다.");
//			if (com == 1) System.out.println("user가 이겼습니다. com의 값은 " + com + "입니다.");
//			}
//		if (user == 3) {
//			if (com == 3) System.out.println("비겼습니다. com의 값은 " + com + "입니다.");
//			if (com == 1) System.out.println("com이 이겼습니다.com의 값은 " + com + "입니다.");
//			if (com == 2) System.out.println("user가 이겼습니다.com의 값은 " + com + "입니다.");
//			}
		switch (user) { //{ swich 사용해보기, case마다 break 주의
		case 1 : if (com == 2) System.out.println("com이 이겼습니다.com의 값은 " + com + "입니다.");
		    else if (com == 3) System.out.println("user가 이겼습니다.com의 값은 " + com + "입니다.");
		    else     System.out.println("비겼습니다. com의 값은 " + com + "입니다.");
			break;
			
		case 2 : if (com == 3) System.out.println("com이 이겼습니다.com의 값은 " + com + "입니다.");
		else if (com == 1) System.out.println("user가 이겼습니다.com의 값은 " + com + "입니다.");
		else     System.out.println("비겼습니다. com의 값은 " + com + "입니다.");
		break;
		
		case 3 : if (com == 1) System.out.println("com이 이겼습니다.com의 값은 " + com + "입니다.");
		else if (com == 2) System.out.println("user가 이겼습니다.com의 값은 " + com + "입니다.");
		else     System.out.println("비겼습니다. com의 값은 " + com + "입니다.");
		break;
		}
	}
}



				
	


