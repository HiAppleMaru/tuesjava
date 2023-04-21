package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
//		String data = "홍길동,010-1234-5678,서울시,학생";
//		StringTokenizer st = new StringTokenizer(data,",");
//		
//		while(st.hasMoreTokens()) {
//			System.out.println("이름 : " + st.nextToken());
//			System.out.println("전화 : " + st.nextToken());
//			System.out.println("주소 : " + st.nextToken());
//			System.out.println("직업 : " + st.nextToken());

// "홍길동,남,65,170/김새영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미용,여,64,165" 
// 남자들의 체중의 평균을 구하라
		String data = "홍길동,남,65,170/김새영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미용,여,64,165";	
		StringTokenizer st = new StringTokenizer(data,"/");
		int sum = 0;
		int count = 0;
		while(st.hasMoreTokens()) {
			StringTokenizer st1 = new StringTokenizer(st.nextToken(),","); //st(홍길동,남,65,170/김새영,여,57,164 이런식으로 나오는데... nextToken으로 이름 삭제...
			while(st1.hasMoreTokens()) {								   //즉 남,65,170/여,57,164 이런식으로 데이터 나옴
				if(st1.nextToken().equals("남"))                           //그리고 "남"과 일치하는 데이터를 만날때마다...
				{														
						count++;										   //count++ 시키고
						sum+=Integer.parseInt(st1.nextToken());			   //"남"의 다음 데이터를 계속 sum에 누적...
					}
				}
			
			}
				System.out.println("남자들의 평균 체중 : " + ((double)sum / count)); //누적된 sum을 count로 나누면 평균.
				
			
			}
}
