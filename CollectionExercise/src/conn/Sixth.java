package conn;


	import java.util.*;
	public class Sixth {
	    private String name;
	    private int id;
	   

	    public Sixth(int id, String name) {
	        this.id = id;
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
	    
		 public static Comparator<Sixth> StuRollno = new Comparator<Sixth>() {

				public int compare(Sixth s1, Sixth s2) {

				   int id1 = s1.getId();
				   int id2 = s2.getId();
                   return id1-id2;
			   }};

			   public String toString() {
			        return "[ id=" +id + ", name=" + name + "]";
			    }
			   
			   
			   public static void main(String args[]){
				   ArrayList<Sixth> arraylist = new ArrayList<Sixth>();
				   arraylist.add(new Sixth(101, "Anu"));
				   arraylist.add(new Sixth(505, "Arun"));
				   arraylist.add(new Sixth(809, "Venki"));
				   System.out.println("Id Sorting:");
				   Collections.sort(arraylist, Sixth.StuRollno);
				   for(Sixth  str: arraylist){
						System.out.println(str);
				   }
				}

}
