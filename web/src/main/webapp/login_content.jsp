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

<div class="form-control">
    <form action="authenticate" method="post">
        <div class="form-group">
            <label for="usernameInput">Username</label>
            <input type="text" class="text-secondary" name="username" aria-labelledby="usernameInput"
                   id="usernameInput" required autofocus>
        </div>
        <div class="form-group">
            <label for="passwordInput">Password</label>
            <input type="password" class="text-secondary" name="password" aria-labelledby="passwordInput"
                   id="passwordInput">
        </div>
        <div class="form-check">
            <input type="checkbox" class="form-check-input" name="lostpass">
            <label class="form-check-label">I lost my password</label>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-dark">Submit</button>
        </div>
    </form>
</div>