<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<h1>${name}'s courses:</h1><br>
		<ul>
			<c:forEach items="${courses}" var="course">
		        	<li><c:out value="${course.getCourse_name()}"/></li> 
			</c:forEach>

		</ul>
		<br>
		<a href="/searchCourse/${user_id}/${name}">Add Course</a>
		
	<body>
</html>