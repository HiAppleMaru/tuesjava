package chap05;

class Person{
	String name;
	int id;
	public Person(String name) {this.name = name;}
}
class Student extends Person{
	String grade;
	String depart;
	public Student(String name) {super(name);}
}

public class UpcastingEx {
	public static void main(String[] args) {
		//Upcasting�� �ڽ��� ���� �θ� ���� �ִ°�...
		Person p = new Student("������");
		System.out.println(p.name); //name���� �� ������ �س��� ������ super�� �޾Ƽ� �ö�...
		System.out.println("----------------");
		//		System.out.println(p.grade); //����ȵ�.
		Student s = new Student("������"); //���� ������ ���ٰ���...
		System.out.println(s.name);
		System.out.println(s.grade);
		System.out.println("----------------");
		//Downcasting
		Student s2 = (Student)p; //������ Ȯ���Ǿ�� �ٿ�ĳ������ �ؼ� �� �� ����...
		System.out.println(s2.name);
		s2.depart = "������ũ";
		System.out.println(s2.depart);//���డ��
		System.out.println("----------------");
		if(p instanceof Person) System.out.println("Person");
		else 					System.out.println("����� �ƴϹ��̴�...");
		
	}
}
