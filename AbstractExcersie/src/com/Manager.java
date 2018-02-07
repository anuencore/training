package com;
import com.Employe;

//import java.io.*;

public class  Manager extends Employe {
	
 String tename;
 int tesize;
 public Manager(String name,int age,int mob,String email,int empid,String dept,String tename,int tesize)
 {
super(name,age,mob,email,empid,dept);
this.tename=tename;
this.tesize=tesize;
}
 public void dispaly()
 {
	 System.out.println("Enter the Name:"+name);
	 System.out.println("Enter the age:"+age);
	 System.out.println("Enter the Mobile No:"+mob);
	 System.out.println("Enter the Email:"+email);
	 System.out.println("Enter the Dept:"+dept);
	 System.out.println("Enter the empid:"+empid);
	 System.out.println("Enter the team name:"+tename);
	 System.out.println("Enter the team size:"+tesize);

	 
	 
}
}
	