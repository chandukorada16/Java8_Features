package com.optionalclass;

public class OptionalDemo {//without Optional Class
	public String m1(int id) {
		if(id==100) {
			return "chandu";
		}else if(id==101) {
			return "Ramu";
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		OptionalDemo od=new OptionalDemo();
		System.out.println(od.m1(200));
		
	}

}
