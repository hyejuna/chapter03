package com.javaex.ex06;
//String 클래스 메소드 설명
public class StringApp02 {
	
	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";
		
		System.out.println(a.toUpperCase()); // 대문자를 소문자로
		
		System.out.println(a.concat(b)); // a + b
		System.out.println(b.concat(a)); // b + a
		
		a = a.concat(b);
		System.out.println(a); //" abcd,efg "
		
		a = a.trim();
		System.out.println("--"+a+"--"); //"abcd,efg" -> 앞,뒤 공백제거(중간 공백 제거 안 됨)
		
		a = a.replace("ab", "가나다"); // ab를 가나다로 바꿔라ㅣ
		System.out.println(a);
		
		String[] sArray = a.split(","); // , 기준으로 잘라서 배열 생김 (String[]으로 return) -> 원본(a class)은 안바뀜
		//for (int i=0; i<sArray.length; i++) {
		//	System.out.println(sArray[i]);
		//}
		System.out.println("0번:" + sArray[0]);
		System.out.println("1번:" + sArray[1]);
		
		String str = "Hello JAVA!";
		
		String r01 = str.substring(3); // 배열 번호 3번 이후 저장
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3, 8);
		System.out.println(r03); // 배열번호 3~7번 저장
	
		
	}
	

}
