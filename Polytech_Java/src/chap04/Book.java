package chap04;

public class Book {
	//�ʵ� : �������
	String title;
	String author;
	String name = "������";
	//�޼ҵ�
	//�����ڸ޼ҵ�
	Book(){
		System.out.println(name);
	} // �ؿ� 2���� ������ �����Ϸ��� �ڵ����� �����������, �̹� ������� �����Ƿ� ����ڰ�
			// ���� �ɷ��� �ִ°����� �Ǵ��ϰ� ������� �˷���.
	Book(String title){			//1���� ���� ���� �̰��� ����
		this("", ""); //�̷��� 2��¥���� �ҷ���. 
		this.title = title;
		this.author = "���ڹ̻�"; }
	Book(String title, String author){		//2���� �������� �̰��� ����
		this.title = title;
		this.author = author; 	}
	//�Ϲݸ޼ҵ�
	void printBook() {
		System.out.println(this.title + " : " + this.author);
	}
	
	public static void main(String args[]) {
		Book book = new Book();
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		littlePrince.printBook();
		loveStory.printBook();
		book.title = "���̿���";
		System.out.println(book.title);
		book.printBook();
	}
}
