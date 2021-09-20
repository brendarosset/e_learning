<html>
	<h1>Look for a course to add</h1><br>
	<body>
		<form action="/addCourse">
		<input type="hidden" name="userId" value="${user_id}"></input>
			Type course ID<input type="number" name="courseId" ></input><br>		
			<input type="submit" value="search">
		</form>
	</body>
</html>