package conn;

public class Pattern 
{
	   public static void main(String[] args) 
	   {

	     Student model  = retriveStudentFromDatabase();
	     StudentView view = new StudentView();
	     StudentController controller = new StudentController(model, view);
	     controller.updateView();
	     controller.setStudentName("John");
	     controller.setStudentRollNo("11");
	     controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase()
	   {
	      Student student = new Student();
	      student.setName("Robin");
	      student.setRollNo("17");
	      return student;
	   }
}
