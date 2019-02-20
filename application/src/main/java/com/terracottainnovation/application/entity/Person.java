/**
 * 
 */
package com.terracottainnovation.application.entity;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ram
 *
 */
//@Document (collection="Person")
public class Person {

//	@Id
	private int pno;
	
	private String name;
	
	private int age;
	
	private Address address;
	

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
}
