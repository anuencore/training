package com;

//import java.text.SimpleDateFormat;
//import java.util.Date;


//import java.io.*;

public abstract class Person {
	 
String name;
int age;
 int mob;
 String email;
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

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	



	public Person(String name,int age,int mob,String email)
	{
		this.name=name;
		this.age=age;
		this.mob=mob;
		this.email=email;
	}
public abstract void display();

}
 



