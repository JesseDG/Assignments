<%-- 
    Document   : index
    Created on : 25-Feb-2017, 10:28:59 PM
    Author     : Elritmico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css?family=Mr+Dafoe" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"/>

 <spring:url value="/resources/css/main.css" var="mainCSS" />
<link href="${mainCSS}" rel="stylesheet" />


        <title>S-talk</title>
    </head>
    <!--<img src="/resources/images/logo.jpg" />-->
    <body>

        <div id="login">
            <div class="row">
                <div class="col-sm-6">
                    <div id="logo">
                        <p>S-Talk <i class="fa fa-share-alt" style="color:rgb(44, 62, 80);"></i></p>

                    </div>
                </div>               
                <div class="col-sm-6">
                    <div class="top-bar">
                        <form method="POST" action="">
                            <table>
                                <tbody>
                                    <tr>
                                        <td><label>Email</label></td>
                                        <td><label>Password</label></td>
                                    </tr>
                                    <tr>
                                        <td><input type="text" name="Email" class="form-control"/></td>
                                        <td><input type="password" name="Pwd" class="form-control"/></td>
                                        <td><button type="submit"><span class="glyphicon glyphicon-log-in"></span> Login</button></td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>               
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-6">

                </div>
                <div class="col-sm-6">
                     <form action="" method="POST">
                        <label>Email</label>
                        <input type="text" name="Email_SignUp" class="form-control"/>
                        <label>Password</label>
                        <input type="password" name="Pwd_SignUp" class="form-control"/>
                        <label>First Name</label>
                        <input type="text" name="fname" class="form-control"/>
                        <label>Last Name</label>
                        <input type="text" name="lname" class="form-control"/>
                        <label>Middle Name</label>
                        <input type="text" name="mname" class="form-control"/>
                        <label>Country</label>
                        <select class="form-control">
                            <option>United States</option>
                            <option>Canada</option>
                        </select>
                        <label>City</label>
                        <select class="form-control">
                            <option>United States</option>
                            <option>Canada</option>
                        </select>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
