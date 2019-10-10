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
	<c:forEach items="${songs}" var="song">
        
            <p>
            <c:out value="${song.rating}"/> 
            <c:out value="${song.title}"/>
            <c:out value="${song.artist}"/>
          </p>
            
        </c:forEach>
</body>
</html>