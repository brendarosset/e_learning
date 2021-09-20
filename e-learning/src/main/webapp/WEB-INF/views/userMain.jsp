<html>
	<body>
		<h1>Welcome ${user.getName()}</h1>
			<ul>
				<li><a href="/contacts/${user.getUser_id()}/${user.getName()}" >Contacts</a></li><br>
				<li><a href="/addFeedback/${user.getUser_id()}/${user.getName()}">Add feedback</a></li><br>
				<li><a href="/courses/${user.getUser_id()}/${user.getName()}">Courses</a></li><br>
			</ul>
	</body>
</html>