<%-- 
Create a password_reset.jsp
Using EL, bind the User object password to a form field in a page.
Allow the user to change their password.
On the servlet side(on the login servlet?), retrieve the user from the session 
and change the password 
to the password entered on the reset form.
Save the User object in session scope.
Redirect the user to the account_activity page.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

    <h1>Password Reset</h1>
    
    <body>
        <p>Change password</p>
        
        <p>Username: ${user.userName}</p>
        
        <form action="ResetPassword" method="post">
            
            <label>Password:</label>
            <input type="text" name="password" value="${user.password}"><br> 
            <br>
            <label>&nbsp;</label>
            <input type="submit" value="Reset">
        </form>
            
  <c:import url="/includes/footer.jsp" />
