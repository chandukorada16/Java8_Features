package com.optionalclass;

import java.util.Optional;

public class OptionalWith {
	public Optional<String> withOpt(int id){
		String name=null;
		if(id==100) {
			name="Chandu";
		}else if(id==101) {
			name="Ramu";
		}else if(id==102) {
			name="Somu";
		}
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {
		OptionalWith ow=new OptionalWith();
		System.out.println(ow.withOpt(100));
	}

}
