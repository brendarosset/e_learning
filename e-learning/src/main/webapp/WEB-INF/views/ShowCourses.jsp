<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<h1></h1><br>
		<a href="/addCourse/${admin_id}">Add Course |</a>
		<a href="/adminMain/${admin_id}">Come back</a>
		<ul>
			<c:forEach items="${items}" var="item">
		        	<li><c:out value="${item.toString()}"/></li> 
			</c:forEach>

		</ul>
	
		
	<body>
</html>