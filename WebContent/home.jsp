<%@page import="org.tms.model.Traineecls"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>tms</title>
</head>
<body>
  user details are:
  
<%
    Traineecls tr=(Traineecls)request.getAttribute("userobj");

	out.println(tr.getUserid()+"\t"+tr.getHiredate());

%>
 
 </body>
</html>