<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
	<P>
		三角形的三边是： <BR>
		边A：${Triangle.a}<BR>
		边B：${Triangle.b}<BR>
		边C：${Triangle.c}<BR>
	</P>
	<p>
		<c:if test="${Triangle.istriangle==true}">
		这三条边能构成三角形<BR>
		面积是：${Triangle.area}
		</c:if>
		<c:if test="${Triangle.istriangle==false}">
		这三条边不能能构成三角形
		</c:if>	
	</p>
  </body>
</html>
