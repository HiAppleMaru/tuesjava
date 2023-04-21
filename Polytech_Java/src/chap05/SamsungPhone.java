package chap05;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	abstract void sendCall();
	abstract void receiveCall();
	default void printlogo() {
		System.out.println("**Phone**");} //default �Ⱦ��� �⺻���� abstract�� �Ǵµ�, sysout���� ������
										  //�Ǿ������Ƿ� ��Ģ�������� �������� �����.
}

public class SamsungPhone implements PhoneInterface {
	//��ӹ޴´ٰ� �ߴµ� Ŭ���� �ȿ� �����ؾ� �� å���� �ִ� �޼ҵ尡 ���� ������ ���� ��... 
	@Override
	public void sendCall() {
		System.out.println("�츮������~~~");	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�."); }

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.printlogo();
		System.out.println(phone.TIMEOUT);
	}
}
//������ ��� �����ٰŸ� interface�� ���� ���� abstract�� ��ߵ�.