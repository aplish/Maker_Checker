
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<STYLE type="text/css">  
.errorMessage{color:red;}  
</STYLE> 
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" type="text/css" href="css/java4s.css" />

<%--<script type="text/javascript">
function viewNewRecord()
{
//document.fom.action="viewNewTemp";
document.fom.action="CviewNewRecord.jsp";
document.fom.submit();
}
function viewModRequest()
{
document.fom.action="CviewModRequest.jsp";
document.fom.submit();
}
function viewDelRequest()
{
document.fom.action="CviewDelRequest.jsp";
document.fom.submit();
}
function viewAllRequest()
{
document.fom.action="CviewAllRequests.jsp";
document.fom.submit();
}
</script> --%>

<script src="js/jquery-2.1.4.js"></script>
<jsp:include page="result.jsp"></jsp:include>

</head>
<br><br>
 <body bgcolor="lightblue">
<input type="button" value="View New Records" onclick="location.href='CviewNewRecord.jsp?val1=viewnew'">
<input type="button" value="View Modification Requests" onclick="location.href='CviewNewRecord.jsp?val1=viewmod'">
<input type="button" value="View Delete Requests" onclick="location.href='CviewNewRecord.jsp?val1=viewdel'">
<input type="button" value="View All Requests" onclick="location.href='CviewNewRecord.jsp?val1=viewall'">


<%-- <ul>
  <li><a href="javascript:user()">Users</a></li>
  <li><a href="javascript:add()">Add</a></li>
  <li><a href="javascript:search()">Search</a></li>
  <li><a href="#about">Logout</a></li>
</ul>
--%>


</body>
</html>