
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<STYLE type="text/css">  
.errorMessage{color:red;}  
</STYLE> 

<link rel="stylesheet" type="text/css" href="css/java4s.css" />
<script type="text/javascript">
function viewRecord()
{
document.fom.action="CviewPermanentRecords.jsp?val=perm";
document.fom.submit();
}
function searchRecord()
{
document.fom.action="#";
document.fom.submit();
}

</script>
<jsp:include page="result.jsp"></jsp:include>
<br>
<br>
<hr>

</head>
 <body 
bgcolor="lightblue"
>
<form name="fom" method="post">
<input type="button" value="View Authorised Records" onclick="viewRecord();">

<input type="button" value="Search Records" onclick="searchRecord();">
</form>

<form id="searchBC" name="searchBC" action="CsearchPermanent.jsp" method="post">
<table class="wwFormTable">
 <center>
            <table border="1" width="70%" cellpadding="1">
                <thead>
                    <tr>
                        <th colspan="2">Enter Customer Code to be searched Here</th>
                    </tr>
                </thead>
  
                <tbody>
  <tr>              
<tr>
    <td class="tdLabel"><label for="searchBC_searchCode" class="label">Customer Code:</label></td>
    <td
><input type="text" name="searchCode" value="" id="searchCode" type="text"/></td>
</tr>


<tr>
<tr>
    <td colspan="2"><div align="right"><input type="submit" id="searchBC_0" value="Submit"/>
</div></td>
</tr>

<tr>
    <td colspan="2"><div align="right"><input type="reset" value="Reset"/>
</div></td>
</tr>



 </tbody>
            </table>
            </center>
</table></form>


</body>
</html>