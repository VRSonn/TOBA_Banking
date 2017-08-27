<%-- 
    Document   : New_customer
    Created on : Aug 26, 2017, 12:44:43 PM
    Author     : valeriesonntag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TOBA :: New Customer</title>
    </head>
    
    <h1>New Customer Sign Up</h1>
    
    <nav>
        <a href="index.html">Home</a>
        <a href="login.html">Login</a>
    </nav>
    
    <br>
    
    <body>
        <p>Sign up for TOBA by filling out the form below.</p>
        
        <p><i>${message}</i></p> 
        
        <form action="NewCustomer" method="post">
            <input type="hidden" name="action" value="add">        
            <label>First Name:</label>
            <input type="text" name="firstName" value="${user.firstName}"><br>
            <br>
            <label>Last Name:</label>
            <input type="text" name="lastName" value="${user.lastName}"><br> 
            <br>
            <label>Phone:</label>
            <input type="text" name="phone" value="${user.phone}"><br>
            <br>
            <label>Address:</label>
            <input type="text" name="address" value="${user.address}"><br>
            <br>
            <label>City:</label>
            <input type="text" name="city" value="${user.city}"><br>
            <br>
            <label>State:</label>
            <input type="text" name="state" value="${user.state}"><br>
            <br>
            <label>Zip Code:</label>
            <input type="text" name="zip" value="${user.Zip}"><br>
            <br>
            <label>Email:</label>
            <input type="email" name="email" value="${user.email}"><br>
            <br>
            <label>&nbsp;</label>
            <input type="submit" value="Sign Up">
        </form>
    </body>
    
</html>
