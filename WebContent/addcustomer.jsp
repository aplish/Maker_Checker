<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>adding customer by maker</title>
<STYLE type="text/css">  
.errorMessage{color:red;}  
</STYLE> 
</head>
<body bgcolor="lightblue">

<%@ taglib uri="/struts-tags" prefix="s" %>

<jsp:include page="index.jsp"></jsp:include>
<br>
<center><h1>Adding New Record</h1></center>
<s:form action="EntryValidator" >
 <center>
 
            <table border="1" width="70%" cellpadding="10">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
  
                <tbody>
  <tr>              
<s:textfield type="text" name="CustomerCode" label ="Customer Code"></s:textfield></tr>
<tr><s:textfield type="text" name="CustomerName" label="Customer Name"></s:textfield></tr>
<tr><s:textarea type="text" name="CustomerAddr1" label="Customer Address 1"></s:textarea></tr>
<tr><s:textarea type="text" name="CustomerAddr2" label="Customer Address 2" ></s:textarea></tr>
<tr><s:textfield type="text" name="CustomerPinCode"  label="Customer Pin Code"></s:textfield></tr>
<tr><s:textfield type="email" name="email"  label="Email" ></s:textfield></tr>
<tr><s:textfield type="text" name="number" label="Contact Number" ></s:textfield></tr>
<tr><s:textfield type="text" name="PrimaryContactPerson" label="Primary Contact Person" ></s:textfield></tr>
<tr><s:textfield type="text" name="RecordStatus" value="N" label="Record Status" ></s:textfield ></tr>
<tr><s:textfield type="text" name="Flag" value="A" label="Active/Inactive Flag"></s:textfield></tr>
<%--<tr><sx:datetimepicker name="date1" label="Creation Date Picker" 
displayFormat="dd-MMM-yyyy" value="todayDate" /> </tr> --%>
<%--<tr><s:textfield type="text" name="CreationDate" label="Creation Date"></s:textfield></tr> --%>

 <%-- <s:textfield name="CreatedBy" label="createdby" value="%{#session.role}" readonly="true" ></s:textfield>  --%>
 <tr><s:textfield type="text" name="CreatedBy" value= "%{#session.myId}"  label="Created By"></s:textfield></tr> 


<tr>
<s:submit></s:submit>

<s:reset></s:reset>
</tr>

 </tbody>
            </table>
            </center>
</s:form>


</body>
</html>