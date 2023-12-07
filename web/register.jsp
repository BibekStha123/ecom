<%-- 
    Document   : register
    Created on : 28/11/2023, 4:19:15 PM
    Author     : bibek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <div class="h-100 d-flex align-items-center justify-content-center">
            <form action="Register" method="post">
                <div class="form-group">
                    <label>Name</label>
                    <input type="text" class="form-control" placeholder="Enter User Name" name="name">
                </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="text" class="form-control" placeholder="Enter Email Address" name="email">
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" placeholder="Enter Password" name="password">
                </div>
                <div class="form-group">
                    <label>Postal Address</label>
                    <input type="text" class="form-control" placeholder="Enter Postal Address" name="address">
                    <small class="form-text text-muted">This address will be used for delivering products.</small>
                </div>
                <div class="form-group">
                    <label>Contact NO.</label>
                    <input type="number" class="form-control" placeholder="Enter Contact Number" name="contact">
                </div>
                <button type="submit" class="btn btn-primary">Register</button>
                <a href="index.html" class="btn btn-primary">Login</a>
            </form>
        </div>
    </body>
</html>
