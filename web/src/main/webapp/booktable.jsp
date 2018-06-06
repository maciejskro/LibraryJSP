<%--
  Created by IntelliJ IDEA.
  User: mskrobiszewski
  Date: 05.06.18
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <form action="/homeservlet" type="post">
            <table class="table table-hover">
                <thead>
                <th>Lp.</th>
                <th>Title</th>
                <th>Authors</th>
                <th>ISBN</th>
                <th>Category</th>
                <th>Release</th>
                <th>Pages</th>
                </thead>
                <tbody>
                 <c:forEach items="${requestScope.books}" var="book" varStatus="loop">
                     <tr>
                         <td>${loop.index+1}  </td>
                         <td>${book.title}</td>
                         <td>${book.authorName}</td>
                         <td>${book.ISBN}</td>
                         <td>${book.booksType}</td>
                         <td>${book.releaseDate}</td>
                         <td>${book.pages}</td>
                     </tr>
                 </c:forEach>
                </tbody>
            </table>
            <input type="hidden" value="" name=""/>
        </form>

