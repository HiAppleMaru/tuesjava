package chap05;

class A{
	public A() {System.out.println("�⺻������A");}
	public A(int x) {System.out.println(x + ": ������������A");}
}
//������ �޼ҵ� �����ε�..
class B extends A{
	public B() {
		super(100); //�θ��ʿ� 100�� ȣ��...
		System.out.println("�⺻������B");}
	public B(int x) {System.out.println(x + ": ������������A");}
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		B b = new B(); // B�� ȣ��������... B�� A�� ȣ���߰�, A������ B����...
	}
}
