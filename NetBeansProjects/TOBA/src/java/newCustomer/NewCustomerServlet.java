/*
NewCustomerServlet – Code the servlet to retrieve the new customer form data 
and just redirect to the success.html page. 

Server Side Validation – Code the NewCustomerServlet to validate the user has 
entered in values for all the form fields. If not, assign a message variable 
such as “Please fill out all the form fields” and display the message on the 
new_customer.jsp page.

Assignment 2 add on
In the NewCustomerServlet, create an instance of the User bean from the new 
customer form data. The username should consist of their last name combined with
their zipcode. Give them a temporary password of welcome1.

Assignment 3 add on
In the NewCustomerServlet, modify the code to add the new customer to the 
database using the UserDB class.
 */
package newCustomer;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import userJavaBean.User; // import the java bean
import data.UserDB;


public class NewCustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
     // declare the url variable to the url of this servlet   
     String url = "/NewCustomer"; 
        
     // get current action??
     String action = request.getParameter("action");
     if (action == null){ //if action is null
         action = "signup"; // default set action to sign up
     }
     
     //perform the default action and set url to the login page??
     if (action.equals("signup")){
         url = "/New_customer.jsp"; //the url for the jsp page where you sign up
     }
    
     else if (action.equals("add")){
     // get all the info that was entered into the text box and assign to string
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String email = request.getParameter("email"); 
        
      
         // validate that all parameters were entered
        String message; // message out so it can be here or for else statement
        if(firstName == null || lastName == null || phone == null || address == 
                null || city == null || state == null || zip == null || email ==
                null || firstName.isEmpty() || lastName.isEmpty() || 
                phone.isEmpty() || address.isEmpty() || city.isEmpty() || 
                zip.isEmpty() || email.isEmpty()){
                message = "Please fill out all boxes in the form.";
                url = "/New_customer.jsp";
        }
        
        else{
            message = "";
            url = "/success.jsp";
        }
        
        // Create temp username & password
        String username = (lastName + zip);
        String password = "welcome1";
        
        //get session
        HttpSession session = request.getSession();
        
         // store data in User object in java bean
        User user; //declaration
         user = new User (firstName, lastName, phone, address, city, state, 
                 zip, email, username, password); // assignment
        
        //set user as an attribute of the session
        session.setAttribute("user", user);
        
        //insert the user to the userDB 
        UserDB.insert(user);
     }
     
     
    //forward to the url page in the above url strings 
    getServletContext()
           .getRequestDispatcher(url) 
           .forward(request, response);
      
    }   
}
