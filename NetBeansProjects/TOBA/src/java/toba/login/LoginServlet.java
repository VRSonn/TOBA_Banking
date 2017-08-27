/*
 * LoginServlet – Code the servlet to retrieve the username and password from 
the form we added to login.html. Have the servlet check that the username is 
equal to HYPERLINK "mailto:jsmith@toba.com" jsmith@toba.com and the password is 
equal to “letmein”. Make sure you use these values or I can’t test your work. 
If the username and password match, the servlet to forward the request to the 
account_activity.html page. If it is incorrect, it should forward the request 
to the login_failure.html page.
 */
package toba.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet {
    
    // override the default post and link to the login page
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/customerLogin";
    }
      
    //get parameters and set to strings
    String userName = request.getParameter("username"); //get user input username
    String passWord = request.getParameter("password"); // get user input password
    
    // Validate the parameters, compare to the correct uname a pword
    String s1 = "jsmith@toba.com"; //correct username
    String s2 = "letmein";   // correct password // correct password // correct password // correct password
    
   //if they match go to url
    if (s1.equals(userName) && s2.equals(passWord))
        url = "/Account_activity.html";
    
    // if they dont match go to url
    else
        url = "/Login_failure.html";
        
 
  
}