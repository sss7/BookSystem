<%--
  Created by IntelliJ IDEA.
  User: psushenko
  Date: 13.09.2017
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html lang="ru">
<head>
    <title>Главная</title>
</head>
<body>
<nav>
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Spring Boot</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="${pageContext.request.contextPath}/">Главная</a></li>
                <%--<li><a href="${pageContext.request.contextPath}/books/">books</a></li>--%>
                <li><a href="${pageContext.request.contextPath}/books/book">books/book</a></li>
                <li><a href="${pageContext.request.contextPath}/books/book/get/1">books/book/get/1</a></li>
                <li><a href="${pageContext.request.contextPath}/books/book/list">books/book/list</a></li>
            </ul>
        </div>

        <div class="body">
            <h1>Добро пожаловать в BS</h1>
            <p>Чтобы приступить к работе выберите нужный пункт в меню сверху</p>
        </div>
    </div>
</nav>
</body>
</html>
