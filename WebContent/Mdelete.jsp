<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.util.*" %>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="login.DBconn"%>
 
<head>
<link rel="stylesheet" type="text/css" href="css/java4s.css" />
<jsp:include page="result.jsp"></jsp:include>
<br>

<script type="text/javascript">
function deleteRecord(val)
{
document.fom.action="delete.action?fid="+val+"&flag=delete";
document.fom.submit();
}

function edit(val)
{
document.fom.action="edit.action?fid="+val+"&flag=edit";
document.fom.submit();
}

function deleteRecordPermanent(val)
{
document.fom2.action="delete.action?fid="+val+"&flag=delperm";
document.fom.submit();
}

function editPermanent(val)
{
document.fom2.action="edit.action?fid="+val+"&flag=editperm";
document.fom.submit();
}

</script>

</head>
 <body 
bgcolor="lightblue"
>

<br>
 
 <hr>
 
 <center>
 <h1>Permanent Table</h1>
<form name="fom2" method="post">
<center>
           <table border=\"1\" cellspacing=1 cellpadding=1>
                  <th>S.N. </th>
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
                <th>Action</th>
                 
                
                
<% 
if (session.getAttribute("role").equals("maker"))
{
Connection con=DBconn.getConn();
java.sql.Statement st=con.createStatement();
String n=request.getParameter("val1"); 
System.out.println(n);
ResultSet rs=null;
rs = st.executeQuery("SELECT * FROM CUS717 ");
int count=0;
while(rs.next())
{
 count++;
%>

 <tr>
<td><%= count %></td>
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
<td><a href="javascript:deleteRecordPermanent('<%= rs.getString(2) %>')">Delete</a>
<br><a href="javascript:editPermanent('<%= rs.getString(2) %>')">Edit</a>
</td>
</tr>
 
<%
}
}
else {response.sendRedirect("errorPage.jsp");}

%>

</table>
 
</form>
 <br>
 <br>
 </center>
 
<h1>Temporay Table</h1>
<form name="fom" method="post">
<center>
           <table border=\"1\" cellspacing=1 cellpadding=1>
                <th>S.N. </th>
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
                <th>Action</th>
          
<% 

if (session.getAttribute("role").equals("maker"))
{
Connection con=DBconn.getConn();
java.sql.Statement st=con.createStatement();


String n=request.getParameter("val1"); 
System.out.println(n);
ResultSet rs=null;
rs = st.executeQuery("SELECT * FROM CUStemp717 ");
int count=0;
while(rs.next())
{
 count++;
%>

 <tr>

<td><%= count %></td>
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
<td><a href="javascript:deleteRecord('<%= rs.getString(2) %>')">Delete</a>
<br><a href="javascript:edit('<%= rs.getString(2) %>')">Edit</a>

	
</td>
</tr>
 
<%
}
}
else {response.sendRedirect("errorPage.jsp");}

%>

</table>
 
</form>
</body>