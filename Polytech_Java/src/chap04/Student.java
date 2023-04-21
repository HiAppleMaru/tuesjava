package chap04;

class Student { //public으로 써버려서 같은 패키지에서만 사용 가능함.. 그래서 public 없애고 디폴트 상태로 만들어서 사용가능하게 함.
	//필드 선언
	String dept;
	int id;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.dept = "스마트소프트웨어학과";
		student.id = 2023000015;
		System.out.println(student.dept + " : " + student.id);
	} 
}
