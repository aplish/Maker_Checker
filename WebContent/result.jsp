<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%-- <script src="js/jquery-2.1.4.js"></script>--%>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           <%--<script type="text/javascript">
function user(){
    $.ajax({url: "viewAll.jsp", success: function(result){
        $("#container").html(result);
    }});
}
function add(){
    $.ajax({url: "addCust.jsp", success: function(result){
        $("#container").html(result);
    }});
}
function search(){
    $.ajax({url: "search.jsp", success: function(result){
        $("#container").html(result);
    }});
}
</script> 
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
--%>
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
<jsp:include page="index.jsp"></jsp:include>
<%--<jsp:include page="header.jsp"></jsp:include> --%>

<%-- <h1>Welcome <%   
 String message=(String)session.getAttribute("message");  
if (!message.equals(null)){
out.print(message);  }
%></h1>--%>

<% 
if(session.getAttribute("role").toString().equals("maker"))
{
%>
<h1>Welcome <%   
 String name=(String)session.getAttribute("role");  
out.print(" " +name);  
%></h1>

<input type="button" value="Add New Record" onclick="location.href='addcustomer.jsp'">
<input type="button" value="Search Record " onclick="location.href='MviewAll.jsp'">
<input type="button" value="modify Records" onclick="location.href='#'">
<input type="button" value="delete Records" onclick="location.href='Mdelete.jsp'">

<%--<ul>
  <li><a href="javascript:user()">Users</a></li>
  <li><a href="javascript:add()">Add</a></li>
  <li><a href="javascript:search()">Search</a></li>
  <li><a href="#about">Logout</a></li>
</ul>
<div id="container">
<c:if test="">

</c:if>

<c:choose>
      <c:when test="${requestScope.mode == 'edit'}">
      <jsp:include page="edit.jsp"></jsp:include>
		
      </c:when>
      <c:otherwise>
          <jsp:include page="addCust.jsp"></jsp:include>
    
      </c:otherwise>
    </c:choose>

</div> --%>

<%} else if(session.getAttribute("role").toString().equals("checker"))  {%>
<h1>Welcome <%   
 String name=(String)session.getAttribute("role");  
String username=(String)session.getAttribute("username");  
out.print(" " +name+ " " + username);  
%></h1>

<a href="CtempMainPage.jsp">View All requests</a>|
<a href="CviewAll.jsp">View All Permanent Records</a>
<%--<ul>
  <li><a href="javascript:pending()">Users</a></li>
  <li><a href="javascript:user()">Add</a></li>
  <li><a href="javascript:search()">Search</a></li>
  <li><a href="#about">Logout</a></li>
</ul> --%>

<%}else response.sendRedirect("Home.jsp"); %>

</body>
</html>




