<%-- 
    Document   : welcome
    Created on : 27/11/2023, 11:21:41 PM
    Author     : bibek
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dao.Product"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>User Page</title>
    </head>
    <body>
        <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("index.html");
            }

            ArrayList<Product> products = (ArrayList < Product >) session.getAttribute("productList");

            for(Product p : products) {
//                System.out.println(p.price);
//            }

%>

<p><%p.getName();%></p>
<%
}

%>

        <p>This is user page</p>
        <h1>Welcome ${username} </h1><br>
        <form action="Logout" method="post">
            <input type="submit" value="Logout" class="btn btn-danger"/>
        </form>

<c:forEach var="window" items="${productList}">
    <c:out value="${window.name}"/>
</c:forEach>

</body>

</html>
