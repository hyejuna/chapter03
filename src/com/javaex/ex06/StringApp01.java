package com.javaex.ex06;

public class StringApp01 {

	public static void main(String[] args) {

		/* 원래 클래스 문법으로는 이렇게 쓰는게 맞음
		String str = new String("안녕하세요"); 
		Scanner sc = new Scanner(System.in);
		Point p01 = new Point(3, 2);
		*/
		
		//String은 기본자료형처럼 다음의 형태가 가능
		//String str = "안녕하세요";

		//오류 안나는거 보면 이런 생성자들 있는것.
		String str = new String(); 
		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01 == str02); // 주소 비교 하는 것임-> false(== 스택 영역에 있는 값. 기본자료형은 주소가 아니라 값이 들어가 있어 true임)
		
		System.out.println(str01.hashCode()); // 주소 대변 하지만 재정의 해서 글자 같으면 같은 값 나옴. 글자로 hashcode 만드는듯.
		System.out.println(str02.hashCode());
		
		System.out.println("======================");
		
		String str03 = "hello"; // 이렇게 약식으로 쓸 경우 새로 instance화 하기 전에 먼저 메모리에 hello 문자열 있는지 확인 후 있으면 그 주소 입력해놓음.
		String str04 = "hello";
		
		System.out.println(str03  == str04);
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		
		str03 = "hello!!!!!"; // 인스턴스 값 못바꾸게 코딩 됨. -> 값 변경 안하고 새로 인스턴스 만듬(새 주소 생김). 따라서 str04는 그대로 hello
		System.out.println(str03);
		System.out.println(str04);
		
		System.out.println(str03 == str04);
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		System.out.println(str04.toString()); // asdf@asd456이런게 아니라 값이 나오는거 보니 toString 재정의 되었음 확인!!
		System.out.println(str04); // 주소가 들어가면 자동으로 주소.toString print 함
		
		
		System.out.println("======================");
		
		// ????????????????
		String str05 = new String("abc");
		String str06 = "abc";
		System.out.println(str05==str06);
		System.out.println(str05.hashCode());
		System.out.println(str06.hashCode());
		
	}

}
