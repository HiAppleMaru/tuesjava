package chap04;

public class Book {
	//필드 : 멤버변수
	String title;
	String author;
	String name = "이태형";
	//메소드
	//생성자메소드
	Book(){
		System.out.println(name);
	} // 밑에 2개가 없으면 컴파일러가 자동으로 만들어주지만, 이미 만든것이 있으므로 사용자가
			// 만들 능력이 있는것으로 판단하고 오류라고 알려줌.
	Book(String title){			//1개를 받은 것은 이것을 찍음
		this("", ""); //이러면 2개짜리를 불러옴. 
		this.title = title;
		this.author = "작자미상"; }
	Book(String title, String author){		//2개를 받은것은 이것을 찍음
		this.title = title;
		this.author = author; 	}
	//일반메소드
	void printBook() {
		System.out.println(this.title + " : " + this.author);
	}
	
	public static void main(String args[]) {
		Book book = new Book();
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		Book loveStory = new Book("춘향전");
		littlePrince.printBook();
		loveStory.printBook();
		book.title = "북이예요";
		System.out.println(book.title);
		book.printBook();
	}
}
