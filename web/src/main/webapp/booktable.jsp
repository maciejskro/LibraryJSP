<%--
  Created by IntelliJ IDEA.
  User: mskrobiszewski
  Date: 05.06.18
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/webjars/bootstrap/4.1.0/css/bootstrap.min.css" type="text/css">
</head>
<body>
    <div class="container">
        <form action="/homeservlet" type="post">
            <table class="table table-hover">
                <thead>
                <th> lp</th>
                <th> Title</th>
                </thead>
                <tbody>
                 <c:forEach items="${requestScope.book}" var="book" varStatus="loop">
                     <tr>
                         <td>$(loop.index) +1</td>
                         <td>$(book.title)</td>
                     </tr>
                 </c:forEach>
                </tbody>
            </table>
        </form>

    </div>
</body>
</html>
