package conn;
import java.util.*;

public class Fourth
{
    public static void main( String[] args )
    {
    	System.out.println("List values are");
    	List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");

        for (String temp : list){
        	System.out.println(temp);
        }

        Set<String> set = new HashSet<String>(list);

        System.out.println("Set values are");
        for (String temp : set){
        	System.out.println(temp);
        }
    }
}