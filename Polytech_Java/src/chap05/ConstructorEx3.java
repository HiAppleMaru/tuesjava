package chap05;

class A{
	public A() {System.out.println("기본생성자A");}
	public A(int x) {System.out.println(x + ": 정수값생성자A");}
}
//생성자 메소드 오버로딩..
class B extends A{
	public B() {
		super(100); //부모쪽에 100을 호출...
		System.out.println("기본생성자B");}
	public B(int x) {System.out.println(x + ": 정수값생성자A");}
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		B b = new B(); // B를 호출했지만... B는 A를 호출했고, A실행후 B실행...
	}
}
