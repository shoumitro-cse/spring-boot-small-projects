<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   
    "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <title>Home</title>  
    </head>  
    <body>  
        <h3> Hello ${pageContext.request.userPrincipal.name}, </h3>  
        <h4>Welcome to Javatpoint! </h4>  
        <a href="<c:url value='/logout' />">Click here to logout</a>  <br/>
        <a href="j_spring_security_logout">Click here to logout2</a>  
    </body>  
</html>  