<%-- 
    Document   : success
    Created on : Sep 21, 2017, 2:28:16 PM
    Author     : valeriesonntag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

    <h1>TOBA</h1>
  
    <body>
        <h2>Success!</h2>
        <p>Your account has been created</p>
        <p>First Name: ${user.firstName}</p>
        <p>Last Name: ${user.lastName}</p>
        <p>Phone: ${user.phone}</p>
        <p>Address: ${user.address}</p>
        <p>City: ${user.city}</p>
        <p>State: ${user.state}</p>
        <p>Zip: ${user.zip}</p>
        <p>Email: ${user.email}</p>
        <p>Username: ${user.userName}</p>
        <p>Password: ${user.password}</p>

    <c:import url="/includes/footer.jsp" />
