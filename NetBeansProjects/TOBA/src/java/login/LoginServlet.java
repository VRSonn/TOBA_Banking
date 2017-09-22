/*
 * LoginServlet – Code the servlet to retrieve the username and password from 
the form we added to login.html. Have the servlet check that the username is 
equal to HYPERLINK "mailto:jsmith@toba.com" jsmith@toba.com and the password is 
equal to “letmein”. Make sure you use these values or I can’t test your work. 
If the username and password match, the servlet to forward the request to the 
account_activity.html page. If it is incorrect, it should forward the request 
to the login_failure.html page.
 */
package login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import userJavaBean.User; // import the java bean


public class LoginServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // the login page that we came here from
        String url = "/login.jsp"; 
        
        // get the username and password and assign them to variables from the
        //login page
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Validate the parameters, compare to the correct username a password
        String s1 = "jsmith@toba.com"; //correct username
        String s2 = "letmein";   // correct password 
        
        
        // Gets the session user from java bean
        //HttpSession session = request.getSession();
        //User user = (User) session.getAttribute("user");
        
        //for the current if statement?
        //String s1 = user.getUserName(); //correct username
        //String s2 = user.getPassword();   // correct password 
        
        
        // if the user input matches the secret login go to account activity
        if (s1.equals(username) && s2.equals(password)){
        //if (user.getUserName().equals(username) && user.getPassword().equals(password)){
            url = "/Account_activity.jsp";
        }
        // if it doesnt go to failure page
        else {
            url = "/Login_failure.jsp";
        }
        
        //forward to the url page in the above url strings 
        getServletContext()
           .getRequestDispatcher(url) 
           .forward(request, response);
   
        
    }    
}
