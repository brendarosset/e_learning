<html>
	<body>
		<table>
			<tr><th>Name |</th><th>Resource |</th><th>Description </th></tr>
			<tr><td>${course.getCourse_name()}</td><td>${course.getCourse_resource()}</td><td>${course.getCourse_desc()}</td></tr>
		</table>
		<a href="/courseAdded/${user_id}/${course.getCourseId()}">Add Course</a>
	</body>
</html>