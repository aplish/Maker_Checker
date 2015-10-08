<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.util.*" %>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="login.DBconn"%>
 
<head>
<link rel="stylesheet" type="text/css" href="css/java4s.css" />
<jsp:include page="CtempMainPage.jsp"></jsp:include>
<br>

<script type="text/javascript">
function deleteRecord()
{
document.fom.action="del.action";
document.fom.submit();
}
function accept(val)
{
	
//document.fom.action="approve.action?fid="+val+"&flag=new";
document.fom.action="approve.action?fid="+val;
document.fom.submit();
}
function reject(val)
{
document.fom.action="reject.action?fid="+val;
document.fom.submit();
}
</script>

</head>
 <body 
bgcolor="lightblue"
>

<br>
 
 <hr>

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

if (session.getAttribute("role").equals("checker"))
{
Connection con=DBconn.getConn();
java.sql.Statement st=con.createStatement();


String n=request.getParameter("val1"); 
System.out.println(n);
ResultSet rs=null;
if(n.equalsIgnoreCase("viewnew")){
 rs = st.executeQuery("SELECT * FROM CUStemp717 where RECSTATUS='N' ");}
else if (n.equalsIgnoreCase("viewmod")){
	 rs = st.executeQuery("SELECT * FROM CUStemp717 where RECSTATUS='M' ");
}
else if (n.equalsIgnoreCase("viewdel")){
	 rs = st.executeQuery("SELECT * FROM CUStemp717 where RECSTATUS='D' ");
}
//else if (n.equalsIgnoreCase("viewall")){
else{
	 rs = st.executeQuery("SELECT * FROM CUStemp717 ");
}


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
<td><a href="javascript:accept('<%= rs.getString(2) %>')">Approve</a>
<br><a href="javascript:reject('<%= rs.getString(2) %>')">Reject</a>

	
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