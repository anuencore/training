package conn;
import java.util.*;
public class Fifh1 implements Comparable<Fifh1> {
    private String name;
    private int id;
   

    public Fifh1(int id, String name) {
        this.id=id;
        this.name = name;
        
    }
   
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 public int compareTo(Fifh1 comparestu) {
	        int compareid=((Fifh1)comparestu).getId();
	        /* For Ascending order*/
	        return this.id-compareid;
	 }
    @Override
    public String toString() {
        return "[ id=" + id + ", name=" + name +  "]";
    }
    
    public static void main(String args[]){
 	   ArrayList<Fifh1> arraylist = new ArrayList<Fifh1>();
 	   arraylist.add(new Fifh1(223, "Annu"));
 	   arraylist.add(new Fifh1(245, "Meera"));
 	   arraylist.add(new Fifh1(209, "Treesa"));

 	   Collections.sort(arraylist);

 	   for(Fifh1 str: arraylist){
 			System.out.println(str);
 	   }
 	}
 }