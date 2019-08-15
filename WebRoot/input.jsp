<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>


  </head>
  
  <body>
    <FORM action="TriangleServlet" Method="post">
		<P>
			输入三角形三边： <BR>边A:<Input type=text name="sideA" value=0>
			 <BR>边B:<Input type="text" name="sideB" value=0> 
			 <BR>边C:<Input type=text name="sideC" value=0>
			<br> <Input type=submit value="提交">
	</FORM>
  </body>
</html>
