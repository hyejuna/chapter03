package com.javaex.ex07;

public class WrapperApp {
	public static void main(String[] args) {
		
		int no = 10;
		Integer i = new Integer(10); // Integer class java에서 향후 없앨 예정이라 노란줄
		Short s = new Short((short)3); // 값을 integer로 인식해서 강제 형변환 필요
		Byte b = new Byte((byte)3);
		
		System.out.println(i);
		System.out.println(no);
		System.out.println(s);
		System.out.println(b);

		int num01 = 10;
		int num02=7;
		int intResult = num01 + num02;
		System.out.println(intResult);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01 + i02;
		System.out.println(result);
		
		Integer i03 = 99; //String처럼 new Integer 생략 가능. 99 -> new Integer(99) : 박싱(메소드 이용 가능)
		
		Integer i04 = new Integer(100);
		int num99 = i04; // 언박싱 (왼쪽 형태에 맞춤) 박싱, 언박싱 자동
		
		System.out.println("===================");
		
		//문자열 --> int (Int 클래스 메소드)
		/*
		Integer i05 = 10; // Integer를 메모리에 올리기 위해 안쓰는데 만든거
		int r01 = i05.parseInt("12345");
		System.out.println(r01);
		*/ 
		// -> parseInt가 static이라 아래와 같이 씀
		int r01 = Integer.parseInt("12345");
		System.out.println(r01);  //~.에서 ~ 첫글자가 대문자면 해당 메소드는 static에 있는거
		
		System.out.println("===================");
		
		//int --> 문자열
		String a = "안녕하세요";
		String snum = a.valueOf(555);
		System.out.println(snum);
		//-> 얘도 위와 동일하게 static 메소드라 String.valueOf(555)로 변경 가

		System.out.println(""+1234); //강제형변환으로 int -> 문자열
	}

}
