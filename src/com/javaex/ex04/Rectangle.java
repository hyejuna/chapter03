package com.javaex.ex04;

public class Rectangle {
	
	private int width;
	private int height;
	
	
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(this.width == r.width && this.height == r.height) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
