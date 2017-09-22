<%-- 
New_customer.jsp: This page will allow the user to register for online banking 
services. It should have a form with a submit button that collects the following
information. FirstName,LastName,Phone,Address,City,State,Zipcode,Email
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    
    <h1>New Customer Sign Up</h1>
    
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
            <input type="text" name="zip" value="${user.zip}"><br>
            <br>
            <label>Email:</label>
            <input type="email" name="email" value="${user.email}"><br>
            <br>
            <label>&nbsp;</label>
            <input type="submit" value="Sign Up">
        </form>
            
  <c:import url="/includes/footer.jsp" />
