package chap04;

class Student { //public���� ������� ���� ��Ű�������� ��� ������.. �׷��� public ���ְ� ����Ʈ ���·� ���� ��밡���ϰ� ��.
	//�ʵ� ����
	String dept;
	int id;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.dept = "����Ʈ����Ʈ�����а�";
		student.id = 2023000015;
		System.out.println(student.dept + " : " + student.id);
	} 
}
