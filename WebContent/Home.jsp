
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

<STYLE type="text/css">  
.errorMessage{color:red;}  
</STYLE> 
<!--<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/jquery-2.1.4.js"></script>  -->
</head>
 <body 
bgcolor="lightblue"
>
 <jsp:include page="index.jsp"></jsp:include>
<center>
<h1> Login Page </h1>
<%@ taglib uri="/struts-tags" prefix="s" %>


<s:form action="profile">  
<s:textfield name="name" label="Name"></s:textfield>  
<s:password name="password" label="Password"></s:password>  
<s:submit value="login"></s:submit>  
</s:form>   

<%  // go back button of browser gives blank fieldszz
response.setHeader("Cache-Control","no-store");   
response.setHeader("Pragma","no-cache");   
response.setHeader ("Expires", "0"); //prevents caching at the proxy server  
%> 
</center>
</body>
</html>