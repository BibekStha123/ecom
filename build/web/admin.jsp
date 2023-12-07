<%-- 
    Document   : admin
    Created on : 28/11/2023, 9:04:53 PM
    Author     : bibek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Admin Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("username") == null) {
                response.sendRedirect("index.html");
            }
            
            %>
            <p>This is admin page</p>
            <h1>Welcome ${username}</h1><br>
            <form action="Logout" method="post">
                <input type="submit" value="Logout" class="btn btn-danger"/>
            </form>
    </body>
</html>
