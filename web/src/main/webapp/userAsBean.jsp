<%--
  Created by IntelliJ IDEA.
  User: mskrobiszewski
  Date: 29.05.18
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="user" class="pl.sda.library.entity.Borrower" scope="session" />
<%-- jeżeli pola w formularzu mają taką samą nazwę jak pola w obiekcie--%>
<%--jsp:setProperty name="user" property="*" / --%>

<%-- w przypadku różnicy nazw --%>
<jsp:setProperty name="user" property="username" param="username" />
<jsp:setProperty name="user" property="password" param="password" />
<jsp:setProperty name="user" property="lostpassword" param="lostpass" />

<%--jeżeli chcemy przypisać stałe wartości--%>
<%--jsp:setProperty name="user" property="login" value="SuperUser2000" /--%>
<%--jsp:setProperty name="user" property="password" value="123456" /--%>

<jsp:forward page="../java/pl/sda/library/controller/HomeServlet.java" />