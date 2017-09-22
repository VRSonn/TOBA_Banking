/*
On the servlet side, retrieve the user from the session and change the password 
to the password entered on the reset form. retrieve from the Password_reset.jsp

Save the User object in session scope.

Redirect the user to the account_activity page.
 */

package resetPassword;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import userJavaBean.User; // import the java bean

public class ResetPasswordServlet extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
     // declare the url variable to the url of this servlet   
     String url = "/ResetPassword"; 
     
     //retrieve the user from the session
     //get the session
     HttpSession session = request.getSession();
     //declare a var for password that will hold the current temp password
      String password = request.getParameter("password");
     //get the user
     User user = (User) session.getAttribute("user");
     //set the new password
     user.setPassword(password);
     //save the user in the session
     session.setAttribute("user", user);
     
     
     
     //forward to the url page in the above url strings 
        getServletContext()
           .getRequestDispatcher("/Account_activity.jsp") 
           .forward(request, response);
   
     
     
     
        
        
        
        
        
        
        
        
        
    }
    
}
