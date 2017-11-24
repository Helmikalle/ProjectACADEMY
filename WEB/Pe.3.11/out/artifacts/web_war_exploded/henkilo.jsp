<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3.11.2017
  Time: 11.22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="henkilo" class="fi.academy.pavut.Henkilo" scope="session">
</jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST">
    <p><input name="enimi" value="<%=henkilo.getEtunimi() %>"/></p>
    <p><input name="snimi" value="<%=henkilo.getSukunimi() %>"/></p>
    <p><input name="ika" value="<%=henkilo.getIka()%>"/></p>
    <p><input type="submit"/></p>
</form>

</body>
</html>
