<%--
  Created by IntelliJ IDEA.
  User: mskrobiszewski
  Date: 30.05.18
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.sda.library.entity.Borrower" %>
<link rel="stylesheet" href="webjars/bootstrap/4.1.0/css/bootstrap.min.css"/>
<link rel="script" href="webjars/jquery/3.3.1/jquery.min.js"/>
<link rel="script" href="webjars/bootstrap/4.1.0/js/bootstrap.bundle.min.js"/>
<link rel="stylesheet" href="webjars/bootstrap/4.1.0/css/bootstrap-grid.min-jsf.css"/>
<html>
<head>
    <title>Start application</title>

</head>
<body>
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
