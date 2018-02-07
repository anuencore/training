package com;
 
import com.Person;

 public class Employe extends Person{
	
 int empid;
	 String dept;
	public Employe(String name,int age,int mob,String email,int empid,String dept)
	{
		super(name,age,mob,email);
		this.dept=dept;
		this.empid=empid;
	}
	public void display()
    {
System.out.println("Enter the name:"+name);
System.out.println("Enter the age:"+age);
System.out.println("Enter the Mobile No:"+mob);
System.out.println("Enter the Email:"+email);
System.out.println("Enter the Dept:"+dept);
System.out.println("Enter the empid:"+empid);

    }
	//String[] skill=new String[20];
	
/*
public int getEmpid();
public void setEmpid(int empid);


public String getDept();
public void setDept(String dept);


public abstract void display();
*/

}