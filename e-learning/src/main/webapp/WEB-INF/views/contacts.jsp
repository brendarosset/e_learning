<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<h1>${name}'s contacts:</h1><br>
		<ul>
			<c:forEach items="${contacts}" var="contact">
		        	<li><c:out value="${contact.getName()}"/></li> 
			</c:forEach>

		</ul>
		<a href="/addContact/${user_id}/${name}">Add Contact</a>
		
	<body>
</html>