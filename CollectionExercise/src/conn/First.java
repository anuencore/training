package conn;

import java.util.*;

public class First {
	public static void main(String str[])
	{
		Employe e1=new Employe("Anna");
		Employe e2=new Employe("Anna");
		Employe e3=new Employe("Akku");
		List<Employe> l=new ArrayList <Employe>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		for(Employe e:l) 
		{
			System.out.println(e.name);
		}
	}
	   			}

	


