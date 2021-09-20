<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<h1></h1><br>
		<ul>
			<c:forEach items="${items}" var="item">
		        	<li><c:out value="${item.toString()}"/></li> 
			</c:forEach>

		</ul>
		<a href="/adminMain/${admin_id}">Come back</a>
		
	<body>
</html>