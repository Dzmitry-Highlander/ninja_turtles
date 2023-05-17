<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
  <meta charset="UTF-8">
  <title>Вход и регистрация</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ui/css/style.css">
</head>
<body>
<header>
  <h1>NinjaChat</h1>
  <c:if test="${not empty user}">
    <h2>Мастерская бойца</h2>
  </c:if>
</header>
<c:if test="${not empty user}">
  <nav>
    <ul>
      <li><a class="button" href="${pageContext.request.contextPath}/ui/user/messages">Home</a></li>
      <li><a class="button" href="${pageContext.request.contextPath}/ui/user/message">Отправить сообщение</a></li>
      <li><a class="button" href="${pageContext.request.contextPath}/ui/user/messages">Полученные</a></li>
      <li><a class="button" href="${pageContext.request.contextPath}/ui/user/messages">Отправленные</a></li>
      <li><a class="button" href="${pageContext.request.contextPath}/ui/user/messages">Все пользователи</a></li>
      <li><a class="button" href="${pageContext.request.contextPath}/ui/logout.jsp">Выход</a></li>
    </ul>
  </nav>
</c:if>
</body>
</html>