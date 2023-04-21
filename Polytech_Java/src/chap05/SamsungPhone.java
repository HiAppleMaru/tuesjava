package chap05;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	abstract void sendCall();
	abstract void receiveCall();
	default void printlogo() {
		System.out.println("**Phone**");} //default 안쓰면 기본값인 abstract가 되는데, sysout으로 구현이
										  //되어있으므로 규칙위반으로 빨간줄이 뜬것임.
}

public class SamsungPhone implements PhoneInterface {
	//상속받는다고 했는데 클래스 안에 구현해야 될 책임이 있는 메소드가 없기 때문에 오류 뜸... 
	@Override
	public void sendCall() {
		System.out.println("띠리리리링~~~");	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다."); }

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.printlogo();
		System.out.println(phone.TIMEOUT);
	}
}
//구현을 모두 안해줄거면 interface를 쓰지 말고 abstract로 써야됨.