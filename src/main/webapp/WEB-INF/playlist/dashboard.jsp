<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<a href="/songs/new">Add New</a>
	<a href="/search/topTen">Top Songs</a>
	<form method="get" action="/search">
  		<input type="text" name="q">
  		<button type="submit">Search Artists</button>
	</form>
	
	<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Rating</th>
      <th scope="col">actions</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items="${songs}" var="song">
        <tr>
            <td><c:out value="${song.title}"/></td>
            <td><c:out value="${song.rating}"/></td>
           	<td><a href="#">delete</a></td>
        </tr>
        </c:forEach>
  </tbody>
</table>

</body>
</html>