<%-- 
    Document   : HelloPage
    Created on : 23-Feb-2017, 11:50:37 PM
    Author     : Elritmico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Spring MVC</h1>
        <h2>
            <%
                String[] requests = (String[])request.getAttribute("msg");
                for(int i=0;i<requests.length;i++){
                    out.print(requests[i] + " ");
                }
            %>
        </h2>
    </body>
</html>
