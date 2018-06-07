<%--
  Created by IntelliJ IDEA.
  User: smaciej
  Date: 30.05.18
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<header>

    <script src="webjars/popper.js"></script>
    <script src="webjars/bootstrap/4.1.0/js/bootstrap.bundle.min.js"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Menu</a>
    <ul class="navbar-nav mr-auto" >
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Book
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <button type="button" class="dropdown-item" data-toggle="modal" data-target="#addBookModal">Add book</button>
                <button class="dropdown-item" href="#">Edit book</button>
                <button class="dropdown-item" href="#">Delete book</button>
            </div>
        </li>
    </ul>

</nav>

  <jsp:include page="addBookModal.jsp"/>

</header>
