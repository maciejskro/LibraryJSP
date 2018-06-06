<%--
  Created by IntelliJ IDEA.
  User: smaciej
  Date: 06.06.18
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Book list</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.1.0/css/bootstrap.min.css"/>
    <link rel="script" href="${pageContext.request.contextPath}/webjars/jquery/3.3.1/jquery.min.js"/>
    <link rel="script" href="${pageContext.request.contextPath}/webjars/bootstrap/4.1.0/js/bootstrap.bundle.min.js"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/popper.js"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.1.0/css/bootstrap-grid.min-jsf.css"/>
</head>
<div class="container justify-content-center mt-3">
    <div class="row align-content-center ">
        <div class="col-12">
            <jsp:include page="WEB-INF/headers.jsp" />
        </div>
    </div>
    <div class="row align-content-stretch">
        <div class="col-12">
            <jsp:include page="booktable.jsp" />
        </div>
    </div>
    <div class="row align-content-end">
        <div class="col-12">
            <%@ include file="WEB-INF/footer.jsp" %>
        </div>
    </div>
</div>
</html>
