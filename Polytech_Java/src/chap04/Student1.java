package chap04;

public class Student1 {
	private String dept;
	private int id;
	
	public Student1() { } // << 기본생성자
	
	//Constructor는 보통 이 위치
		
	public Student1(String dept, int id) { //super는 보통 삭제
		this.dept = dept; 
		this.id = id;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student1 [dept=" + dept + ", id=" + id + "]";
	}
	
	
}
