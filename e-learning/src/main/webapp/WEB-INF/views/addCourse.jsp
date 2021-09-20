<html>
	<body>
		<table>
			<tr><th>Name</th><th>Resource</th><th>Description</th></tr>
			<tr><th>${course.getCourse_name()}</th><th>${course.getCourse_resource()}</th><th>${course.getCourse_desc()}</th></tr>
		</table>
		<a href="/courseAdded/${user_id}/${course.getCourseId()}">Add Course</a>
	</body>
</html>