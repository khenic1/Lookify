<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="/search">
  		<input type="text" name="q">
  		<button type="submit">New Search</button>
	</form>
	<c:forEach items="${songs}" var="song">
       <p>
            <c:out value="${song.title}"/>
           <c:out value="${song.rating}"/>
           	<a href="#">delete</a>
        </p>
        </c:forEach>
</body>
</html>