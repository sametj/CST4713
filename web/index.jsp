<%-- 
    Document   : index
    Created on : Dec 12, 2022, 11:38:52 AM
    Author     : mosesjames
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    </head>
    <body>
      <h1> Asteroid Database Application</h1>
        <form action = "BuildAsteroids" method = "POST">
         Type: <input type = "text" name = "type" size="10" />
         Designation : <input type = "text" name = "Designation" size="10" />
         <br/><br/>
         <input type = "submit" value = "Submit" />
      </form>
        
    </body>
</html>
