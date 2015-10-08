<%@page import="java.sql.PreparedStatement"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.util.*" %>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="login.DBconn"%>
 

<!-- <head>
<link rel="stylesheet" type="text/css" href="css/java4s.css" />
<br> -->
</head>
<jsp:include page="CviewAll.jsp"></jsp:include>
 <body bgcolor="lightblue">

<br>
 
 <hr>

<form name="fom" method="post">
<center>
           <table border=\"1\" cellspacing=1 cellpadding=1>
                
                <th>Customer ID </th>
                <th>Customer Code</th>
                <th>Customer Name</th>
                <th>Customer Address 1</th>
                 <th>Customer Address 2</th>
                <th>Pin Code</th>
                <th> email</th>
                <th>Contact no</th>
                <th>Contact Person</th>
               	<th>Record Status</th>
                <th>A/I Flag</th>
                <th>Creation Date</th>
                 <th>Created By</th>
                <th>Modification Date</th>
                <th>Modified By</th>
                <th>Authorozation Date</th>
                <th>Authorized By</th>
<% 

if (session.getAttribute("role").equals("checker"))
{
Connection con=DBconn.getConn();

PreparedStatement st=con.prepareStatement("select * from Cus717 where CUSTCODE=?");
st.setString(1,request.getParameter("searchCode")); 
	ResultSet rs = st.executeQuery();

while(rs.next())
{
 
%>

 <tr>

<td><%= rs.getString(1) %></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3)%></td>
<td><%= rs.getString(4) %></td>
<td><%= rs.getString(5)%></td>
<td><%= rs.getInt(6) %></td>
<td><%= rs.getString(7) %></td>
<td><%= rs.getLong(8) %></td>
<td><%= rs.getString(9) %></td>
<td><%= rs.getString(10) %></td>
<td><%= rs.getString(11) %></td>
<td><%= rs.getString(12)%></td>
<td><%= rs.getString(13)%></td>
<td><%= rs.getString(14)%></td>
<td><%= rs.getString(15)%></td>
<td><%= rs.getString(16)%></td>
<td><%= rs.getString(17)%></td>	
</td>
</tr>
 
<%
}
}
else {response.sendRedirect("error.jsp");}

%>

</table>
 
</form>
</body>