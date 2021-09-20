<html>
	<body>
		<h1>Welcome ${admin.getName()}</h1>
			<ul>
				<li><a href="/users/${admin.getAdmin_id()}" >Users</a></li><br>
				<li><a href="/feedback/${admin.getAdmin_id()}">Feedback</a></li><br>
				<li><a href="/courses/${admin.getAdmin_id()}">Courses</a></li><br>
				<li><a href="/contact/${admin.getAdmin_id()}">Contact</a></li><br>
			</ul>
	</body>
</html>