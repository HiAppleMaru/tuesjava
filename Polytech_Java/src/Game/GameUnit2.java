//      while(true){            unit1.attack(500);
//         unit2.attack(50);
//       ��}}
package Game;

import java.util.Random;
import java.util.Scanner;

//���� �ó����� Ŭ����
public class GameUnit2 extends MyWeapon {
	static int bossPower = 10000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;

	//������ �޼ҵ� ����
	public GameUnit2(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	//attack �޼ҵ� ����
	void attack(int power) {
		GameUnit2.bossPower = bossPower - power;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();					    // ����=>ran
		
		GameUnit2 unit1 = new GameUnit2("unit1");
		GameUnit2 unit2 = new GameUnit2("unit2");
		System.out.println("Player 1�� �̸��� �Է��ϼ��� : ");
		String unname1 = scan.nextLine();
		System.out.println("Player 1�� �̸��� " + unname1 + "�Դϴ�.");
		System.out.println("Player 2�� �̸��� �Է��ϼ��� : ");
		String unname2 = scan.nextLine();
		System.out.println("Player 2�� �̸��� " + unname2 + "�Դϴ�.");
		
		while(true) {
//			ran.setSeed(System.currentTimeMillis()); // ��ǻ���� ������ �ʹ� ���� ���� ���ڸ� ��� �����淡 �ּ�ó����.
			int atr1 = 1+ran.nextInt(500); // 1~500���� ����
			unit1.attack(atr1);
			System.out.println(unname1 + "��(��) �����մϴ�." + unname1 + "�� ���ݷ� : " + atr1);
			if(GameUnit2.bossPower <= 0) {
				System.out.println(unname1 + "�� ��Ÿ ����. - ���� ������ ġŲ�̴�!");
				System.exit(0);}
			
			else
				System.out.println("������ bossPower : " + GameUnit2.bossPower);
			
//			ran.setSeed(System.currentTimeMillis()); // ��ǻ���� ������ �ʹ� ���� ���� ���ڸ� ��� �����淡 �ּ�ó����.
			int atr2 = 1+ran.nextInt(500); // 1~500���� ����
			unit2.attack(atr2);
			System.out.println(unname2 + "��(��) �����մϴ�. " + unname2 + "�� ���ݷ� : " + atr2);
			
			if(GameUnit2.bossPower <= 0) {
				System.out.println(unname2 + "�� ��Ÿ ����. - ���� ������ ġŲ�̴�!");
				System.exit(0);}
			
			else
				System.out.println("������ bossPower : " + GameUnit2.bossPower);
		}
			
	}
}


