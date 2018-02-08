package conn;
//import java.lang.*;

public class Encore {
	public static void main(String[] args)
	{
		String str="Welcome to Encore!!";
		 String st="to";
		 String s="!";
		int i=0;
		int le=str.length();
		
		try
		{
			//1st Question
			
		System.out.println("String in to the uppercase is:\n"+str.toUpperCase());
		
		//2nd Question
		
		System.out.println("After removing the empty space:");
		for(i=0;i<=le;i++)
		{
		if(str.charAt(i)!=' ' && str.charAt(i)!='\t')
		{
	System.out.print(str.charAt(i));
	
		}
		}
		}
	catch(StringIndexOutOfBoundsException e)
		{
			
			System.out.println(e);
		}
		
		//3rd Question
		
		System.out.println("Print the last word:"+str.substring(11, 19));
		
		
		//4th Question
	
	   System.out.println("Enter the position of 'to' in the string:"+str.indexOf(st));
	
	    //5th Question
	   
	   System.out.println("Enter the letter from the 4 th position:"+str.charAt(4));
	   
	   //6th Question
	   
	   System.out.println("Enter the position of '!' in the string:"+str.indexOf(s));
	   
	   //7th Question
	   
	   System.out.println("Enter the position of  2nd '!' in the string:"+str.lastIndexOf(s));
	   
	   //8th Question
	   
	  String si=str.concat(" Family");
	   System.out.println("Enter the word Family to  end of the given sentence:"+si);

	   //9th Question
	   
	   System.out.println("Enter the word Family to before the !! symbol:"+str.substring(0, 17)+"Family"+str.substring(17, 19));


	   
		
	}	
	
	

}
