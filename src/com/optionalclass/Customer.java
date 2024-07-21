package com.optionalclass;

import java.util.Optional;

public class Customer {
	int id;
	String name;
	String email;
//if you are the sure for the object you are passing is never null,then you should go for Optional.of	
	public Customer(int id,String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public static void main(String[] args) {
		Customer c=new Customer(101,"Chandu","chandukorada@gmail.com");
		Optional<String> emailOptional=Optional.ofNullable(c.getEmail());
		if(emailOptional.isPresent()) {
			System.out.println(emailOptional.get());
		}
		else {
		System.out.println("No Email data found");
		}
		
	}

}
