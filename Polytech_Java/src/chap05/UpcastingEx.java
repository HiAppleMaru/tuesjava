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
		//Upcasting은 자식을 만들어서 부모를 끼워 넣는것...
		Person p = new Student("이태형");
		System.out.println(p.name); //name으로 딱 지정을 해놨기 때문에 super를 받아서 올라감...
		System.out.println("----------------");
		//		System.out.println(p.grade); //실행안됨.
		Student s = new Student("삼태형"); //새로 만들어야 접근가능...
		System.out.println(s.name);
		System.out.println(s.grade);
		System.out.println("----------------");
		//Downcasting
		Student s2 = (Student)p; //영역이 확보되어야 다운캐스팅을 해서 쓸 수 있음...
		System.out.println(s2.name);
		s2.depart = "하이테크";
		System.out.println(s2.depart);//실행가능
		System.out.println("----------------");
		if(p instanceof Person) System.out.println("Person");
		else 					System.out.println("사람이 아니무이다...");
		
	}
}
