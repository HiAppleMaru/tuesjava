//      while(true){            unit1.attack(500);
//         unit2.attack(50);
//       …}}
package Game;

import java.util.Random;
import java.util.Scanner;

//게임 시나리오 클래스
public class GameUnit2 extends MyWeapon {
	static int bossPower = 10000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;

	//생성자 메소드 구현
	public GameUnit2(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	//attack 메소드 구현
	void attack(int power) {
		GameUnit2.bossPower = bossPower - power;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();					    // 랜덤=>ran
		
		GameUnit2 unit1 = new GameUnit2("unit1");
		GameUnit2 unit2 = new GameUnit2("unit2");
		System.out.println("Player 1의 이름을 입력하세요 : ");
		String unname1 = scan.nextLine();
		System.out.println("Player 1의 이름은 " + unname1 + "입니다.");
		System.out.println("Player 2의 이름을 입력하세요 : ");
		String unname2 = scan.nextLine();
		System.out.println("Player 2의 이름은 " + unname2 + "입니다.");
		
		while(true) {
//			ran.setSeed(System.currentTimeMillis()); // 컴퓨터의 진행이 너무 빨라서 같은 숫자만 계속 나오길래 주석처리함.
			int atr1 = 1+ran.nextInt(500); // 1~500까지 랜덤
			unit1.attack(atr1);
			System.out.println(unname1 + "이(가) 공격합니다." + unname1 + "의 공격력 : " + atr1);
			if(GameUnit2.bossPower <= 0) {
				System.out.println(unname1 + "의 막타 성공. - 오늘 저녁은 치킨이닭!");
				System.exit(0);}
			
			else
				System.out.println("남겨진 bossPower : " + GameUnit2.bossPower);
			
//			ran.setSeed(System.currentTimeMillis()); // 컴퓨터의 진행이 너무 빨라서 같은 숫자만 계속 나오길래 주석처리함.
			int atr2 = 1+ran.nextInt(500); // 1~500까지 랜덤
			unit2.attack(atr2);
			System.out.println(unname2 + "이(가) 공격합니다. " + unname2 + "의 공격력 : " + atr2);
			
			if(GameUnit2.bossPower <= 0) {
				System.out.println(unname2 + "의 막타 성공. - 오늘 저녁은 치킨이닭!");
				System.exit(0);}
			
			else
				System.out.println("남겨진 bossPower : " + GameUnit2.bossPower);
		}
			
	}
}


