//      while(true){            unit1.attack(500);
//         unit2.attack(50);
//       ��}}
package Game;

import java.util.Random;
import java.util.Scanner;

//���� �ó����� Ŭ����
public class GameUnit extends MyWeapon {
	static int bossPower = 10000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;

	//������ �޼ҵ� ����
	public GameUnit(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	//attack �޼ҵ� ����
	void attack(int power) {
		GameUnit.bossPower = bossPower - power;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();					    // ����=>ran
		
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		System.out.println("Player 1�� �̸��� �Է��ϼ��� : ");
		unit1.name = scan.nextLine();
		System.out.println("Player 1�� �̸��� " + unit1.name + "�Դϴ�.");
		System.out.println("Player 2�� �̸��� �Է��ϼ��� : ");
		unit2.name = scan.nextLine();
		System.out.println("Player 2�� �̸��� " + unit2.name + "�Դϴ�.");
		
		while(true) {
			ran.setSeed(System.currentTimeMillis()); 
			int atr1 = 1+ran.nextInt(500); // 1~500���� ����
			System.out.println(unit1.name +"�� �ൿ�� �����ϼ���. (1:��ǳ, �ٸ�Ű:�������) > ");
			int act1 = scan.nextInt();
			if(act1 == 1) {unit1.attack(atr1);
			System.out.println(unit1.name + "��(��) �����մϴ�." + unit1.name + 
					"�� ���ݷ��� : " + atr1 + "�̰� ���� �Ŀ��� : " + unit1.name);} //unit1.charge
			else unit1.charge(atr1);
			System.out.println(unit1.name + "��(��) �⸦ �����ϴ�." + unit1.name + "�� ���� ");			
			if(GameUnit.bossPower <= 0) {
				System.out.println(unit1.name + "�� ��Ÿ ����. - ���� ������ ġŲ�̴�!");
				System.exit(0);}
			
			else
				System.out.println("������ bossPower : " + GameUnit.bossPower);
			
			ran.setSeed(System.currentTimeMillis()); 
			int atr2 = 1+ran.nextInt(500); // 1~500���� ����
			unit2.attack(atr2);
			System.out.println(unit2.name + "��(��) �����մϴ�. " + unit2.name + "�� ���ݷ� : " + atr2);
			
			if(GameUnit.bossPower <= 0) {
				System.out.println(unit2.name + "�� ��Ÿ ����. - ���� ������ ġŲ�̴�!");
				System.exit(0);}
			
			else
				System.out.println("������ bossPower : " + GameUnit.bossPower);
		}
			
	}
}


