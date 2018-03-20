package conn;

import java.io.IOException; 
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; 
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 


//@WebServlet(description = "ExampleServlet", urlPatterns = {"/ExampleServlet"})
public class ExampleServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String username = request.getParameter("user_name");
     System.out.println("username"+username);
        String password = request.getParameter("pass_word");
        System.out.println("password"+password);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "root");

            String sql = "insert into employe(name,password) values (?,?)";
            PreparedStatement prep = con.prepareStatement(sql);

            prep.setString(1, username);
            
            prep.setString(2, password);
            prep.executeUpdate();
            prep.close();

            System.out.println(" data inserted!");
        } catch (Exception E) {
            System.out.println("The error is an error "  +E.getMessage()+ " "+E.getStackTrace());
        }
}
}