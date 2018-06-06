<%--
  Created by IntelliJ IDEA.
  User: mskrobiszewski
  Date: 30.05.18
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.sda.library.entity.Borrower" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1 shrink-to-fit=no">
    <title>Start application</title>
    <link rel="script" href="webjars/jquery/3.3.1/jquery.min.js"/>
    <link rel="script" href="webjars/bootstrap/4.1.0/js/bootstrap.bundle.min.js"/>
    <link rel="stylesheet" href="webjars/bootstrap/4.1.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="webjars/bootstrap/4.1.0/css/bootstrap-grid.min.css"/>
</head>
<body>
<link rel="script" href="webjars/bootstrap/4.1.0/webjars-requirejs.js"/>
<div class="container justify-content-center mt-3">
    <div class="row align-content-center ">
        <div class="col-12">
            <jsp:include page="WEB-INF/headers.jsp" />
        </div>
    </div>
    <div class="row align-content-stretch">
        <div class="col-12">
            <jsp:include page="login_content.jsp" />
        </div>
    </div>
    <div class="row align-content-end">
        <div class="col-12">
            <%@ include file="WEB-INF/footer.jsp" %>
        </div>
    </div>
</div>
</body>
</html>
