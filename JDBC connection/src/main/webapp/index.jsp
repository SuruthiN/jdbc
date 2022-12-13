<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DbController" method="post">    
         <div> 
              
 User_Name : <input type="text" name="username" id="username">  
          </div>        
    <br /> <br />        

            <div>      
         Email : <input type="text" name="email" id="email">       
     </div>       
     <br /> <br />     
       <div>                   
     password : <input type="text" name="password" id="password">   
         </div>       
     <br /> <br />         
       <div> 

           <button type="submit">OK</button>         
     </div>        
 </form>

</body>
</html>