<%-- 
    Document   : login
    Created on : Sep 21, 2017, 1:22:10 PM
    Author     : valeriesonntag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    
    <h1>Customer Login</h1>
 
    <body>
        <form action="customerLogin" method="post">
            <label>Username:</label>
            <input type="text" name="username" required><br><br>
            <label>Password:</label>
            <input type="password" name="password" required><br><br>
            <input type="submit" value="Login"/>
        </form>
        
    <br>    
         
    <a href="New_customer.jsp">New Customer Sign Up Page</a>
    
    <br>    
    <br>  
    
    <a href="Password_reset.jsp">Reset Password</a>

    <c:import url="/includes/footer.jsp" />
