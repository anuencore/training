package conn;

public class Stex {
	
	public static void main(String arg[])
	{
		String str="anu mohan";
		String out="";
		
		int counter[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(counter[ch]==0)
			{
				counter[ch]=1;
				
			}
			else
			{
				counter[ch]+=1;
				
			}
		}
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(counter[ch]>1)
			{
				out+='*';
				
				
			
			}
			else
			{
				out+=ch;
		
			}
			
		}
		System.out.println(out);
		
	}
}