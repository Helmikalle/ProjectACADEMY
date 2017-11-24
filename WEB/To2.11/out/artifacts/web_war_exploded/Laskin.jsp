<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3.11.2017
  Time: 9.03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LETS LASKETAAN</title>
</head>

<body>
<h1>JSP LASKIN</h1>
<br>
<form>
    LUKU 1 <input type="text" name="nro1" /></br>
    <br>
    LUKU 2 <input type="text" name="nro2"/></br>
    <select name="homma">
        <option name="+" value="+" selected>+</option>
        <option name="-" value="-">-</option>
        <option name="/" value="/">/</option>
        <option name="*" value="*">*</option>
    </select>
    <input type="submit">JA TÄSTÄ</input>

</form>
<%
    int summa= 0;
    int num1 = 0, num2 = 0;
    String nro1 = request.getParameter("nro1");
    if (nro1 != null) {
        num1 = Integer.parseInt(nro1);
    }
    String nro2 = request.getParameter("nro2");
    if (nro2 != null) {
        num2 = Integer.parseInt(nro2);
    }
    String s=request.getParameter("homma");
    if (s.equals("+")) {
        summa = num1 + num2;
    }
    if (s.equals("-")) {
        summa = num1 - num2;
    }
    if (s.equals("/")) {
        summa = num1 / num2;
    }
    if (s.equals("*")) {
        summa = num1 * num2;
    }
%>
<%="Luvut tyhteensä: " + summa%>
</body>
</html>



