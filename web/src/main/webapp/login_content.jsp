<%--
  Created by IntelliJ IDEA.
  User: mskrobiszewski
  Date: 30.05.18
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<link rel="stylesheet" href="resources/floating-labels.css"/>
<div class="form-control">
    <form action="/authenticate" method="post" class="form-signin">
        <div class="form-label-group">

            <input type="text" class="form-control" name="username" aria-labelledby="usernameInput"
                   id="usernameInput" placeholder="Enter username" required autofocus style="background-position: 98% 50% ;background-repeat:  no-repeat; box-shadow: none;">
            <label for="usernameInput">Username</label>
        </div>

        <div class="form-label-group">

            <input type="password" class="form-control" name="password" aria-labelledby="passwordInput"
                   id="passwordInput" placeholder="Enter password">
            <label for="passwordInput">Password</label>
        </div>

        <div class="check-box mb-3 ">
            <input type="checkbox" class="form-check-input" name="lostpass">
            <label class="form-check-label">I lost my password</label>
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-lg btn-dark btn-block">Submit</button>
        </div>
    </form>
</div>