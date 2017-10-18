<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<s:actionerror/>
<s:form action="verify" >
<s:textfield name="username" key="enter.user"/>
<s:textfield name="password" key="enter.pass"/>
<s:submit value="submit" align="center"/>
</s:form>

</body>
</html>