package chap03;

import java.util.Scanner;
public class Mission9 { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = 1;
		char x = 'a';
	
	do {
		System.out.print(x);
		System.out.print(t);
		x = (char)(x + 1);
		t++;
		}
	while(x <= 'z');
		scan.close();
	}	
}
