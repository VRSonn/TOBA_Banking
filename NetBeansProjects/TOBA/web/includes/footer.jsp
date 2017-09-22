<%-- 
    Document   : footer
    Created on : Sep 21, 2017, 12:54:36 PM
    Author     : valeriesonntag
--%>

<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%  
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>
<p>&copy; Copyright <%= currentYear %> Valerie Sonntag &amp; Friends</p>

</body>
</html>
