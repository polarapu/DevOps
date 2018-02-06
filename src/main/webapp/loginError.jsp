<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SCM DS</title>
</head>
<body>
<h2 style="color:red;"> You entered incorrect Username or Password</h2>
<a href="<%=request.getContextPath() %>/index.jsp">Please click here to login again</a>  <!--${pageContext.request.contextPath}  -->
</body>
</html>