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
        <link rel="stylesheet" href="style.css">
    
    </head>
    <body>
       <div class ="asteroid_gui_container">
      <h1> Asteroid Database Application</h1>
      <div class = "gif">
      <img src="https://media3.giphy.com/media/W5g5W5hMkzrJQDpN3P/giphy.gif?cid=6c09b95217dg4jbaxj2tva2mmjw0u0os9ewc0uex7jhkqdjc&ep=v1_gifs_search&rid=giphy.gif&ct=g" alt="Asteroid Gif"/>
      </div>
         <form action = "BuildAsteroids" method = "POST">
             <div class="gui">
                 
             <p>Type:</p> <input type = "text" name = "type" size="10" class="text" />
             <p>Designation :</p> <input type = "text" name = "Designation" size="10" class="text" />
                    <br/><br/>
                  <input type = "submit" value = "Submit" class = "btn"/>
             </div>
          </form>
        </div>
    </body>
</html>
