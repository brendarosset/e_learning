<html>
	<body>
		<form action="/addFeedback">
		<input type="hidden" name="user_id" value="${user_id}"></input>
			Name:<input type="text" name="name"></input><br>
			Feedback:<input type="text" name="feedback"></input><br>				
			Email:<input type="text" name="email"></input><br>
			<input type="submit" value="Add"></input>
		</form>
	</body>
</html>