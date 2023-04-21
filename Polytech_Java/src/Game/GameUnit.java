//      while(true){            unit1.attack(500);
//         unit2.attack(50);
//       …}}
package Game;

import java.util.Random;
import java.util.Scanner;

//게임 시나리오 클래스
public class GameUnit extends MyWeapon {
	static int bossPower = 10000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;

	//생성자 메소드 구현
	public GameUnit(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	//attack 메소드 구현
	void attack(int power) {
		GameUnit.bossPower = bossPower - power;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();					    // 랜덤=>ran
		
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		System.out.println("Player 1의 이름을 입력하세요 : ");
		unit1.name = scan.nextLine();
		System.out.println("Player 1의 이름은 " + unit1.name + "입니다.");
		System.out.println("Player 2의 이름을 입력하세요 : ");
		unit2.name = scan.nextLine();
		System.out.println("Player 2의 이름은 " + unit2.name + "입니다.");
		
		while(true) {
			ran.setSeed(System.currentTimeMillis()); 
			int atr1 = 1+ran.nextInt(500); // 1~500까지 랜덤
			System.out.println(unit1.name +"의 행동을 선택하세요. (1:장풍, 다른키:기모으기) > ");
			int act1 = scan.nextInt();
			if(act1 == 1) {unit1.attack(atr1);
			System.out.println(unit1.name + "이(가) 공격합니다." + unit1.name + 
					"의 공격력은 : " + atr1 + "이고 남은 파워는 : " + unit1.name);} //unit1.charge
			else unit1.charge(atr1);
			System.out.println(unit1.name + "이(가) 기를 모읍니다." + unit1.name + "의 현재 ");			
			if(GameUnit.bossPower <= 0) {
				System.out.println(unit1.name + "의 막타 성공. - 오늘 저녁은 치킨이닭!");
				System.exit(0);}
			
			else
				System.out.println("남겨진 bossPower : " + GameUnit.bossPower);
			
			ran.setSeed(System.currentTimeMillis()); 
			int atr2 = 1+ran.nextInt(500); // 1~500까지 랜덤
			unit2.attack(atr2);
			System.out.println(unit2.name + "이(가) 공격합니다. " + unit2.name + "의 공격력 : " + atr2);
			
			if(GameUnit.bossPower <= 0) {
				System.out.println(unit2.name + "의 막타 성공. - 오늘 저녁은 치킨이닭!");
				System.exit(0);}
			
			else
				System.out.println("남겨진 bossPower : " + GameUnit.bossPower);
		}
			
	}
}


