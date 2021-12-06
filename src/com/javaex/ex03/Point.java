package com.javaex.ex03;



public class Point {
	// 필드
		private int x;
		private int y;

		// 생성자
		public Point() {
		}

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		// 메소드 gs
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		// 메소드 일반

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			Point p = (Point)obj; // 가려진 클래스의 x 사용하기 위해 obj 다운캐스팅
			
			/*
			System.out.println("a.x=" + this.x);
			System.out.println("a.y=" + this.y);
			
			System.out.println("b.x=" + p.x);
			System.out.println("b.y=" + p.y);
			*/
			
			if(this.x==p.x  && this.y==p.y) {
				return true;
			}else {
				return false;
			}
		}

}
