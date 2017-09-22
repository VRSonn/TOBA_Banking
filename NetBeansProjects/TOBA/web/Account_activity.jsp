<%-- 
    Document   : Account_activity
    Created on : Sep 21, 2017, 12:10:36 PM
    Author     : valeriesonntag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

    <h1>Account Activity</h1>
    
    <body>
        
        <c:if test="${user == null}">
            <p>You are not logged in.</p>
        </c:if>
        <c:if test="${user != null}">
           <p>Welcome, ${user.firstName} ${user.lastName}!</p>
           <p>You have $1,000,000.00 in your account.</p>     
        </c:if>
        
           
    <c:import url="/includes/footer.jsp" />

