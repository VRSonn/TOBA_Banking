<%-- 
Error_java.jsp: Displays a message that java has thrown an exception.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    
    <h1>Java Error</h1>
    
    <body>
        <p>Oops! Something went horribly wrong. Java threw an exception. Please 
            don't panic.</p>
   
         <c:import url="/includes/footer.jsp" />