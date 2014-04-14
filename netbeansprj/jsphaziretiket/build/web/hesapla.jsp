<%-- 
    Document   : hesapla
    Created on : Dec 15, 2013, 10:51:57 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="www.csd.org/matematik" prefix="m"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String st1 = request.getParameter("sayi1");
            String st2 = request.getParameter("sayi2");
            double sayi1 = 0, sayi2 = 0;
            if (st1 != null) {
                sayi1 = Double.parseDouble(st1);
            }
            if (st2 != null) {
                sayi2 = Double.parseDouble(st2);
            }
        %>
        Toplam : <m:topla sayi1="<%=sayi1%>" sayi2="<%=sayi2%>"/>
    </body>
</html>
