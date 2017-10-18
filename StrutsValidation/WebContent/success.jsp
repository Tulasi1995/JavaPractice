<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<s:head theme="ajax" debug="true"/>
</head>
<body>
<s:actionerror/>
<h1>You are successfully validated that </h1>
<s:property value="username"/>
<s:tabbedPanel id="test">
<s:div id="tab1" theme="ajax" label="tab1">
<h2>Tulai test</h2>
</s:div>
<s:div id="tabb2" label="tab2" theme="ajax"></s:div>
</s:tabbedPanel>
</body>
</html>