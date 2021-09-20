<html>
	<body>
		<form action="/addContact/${name}" method="post">
			<input type="hidden" name="user_id" value="${user_id}"></input>
			To:<input type="text" name="name"></input><br>
			Address:<input type="text" name="adress"></input><br>
			Email:<input type="text" name="email"></input><br>
			Phone:<input type="number" name="phone"></input><br>
			Message:<input type="text" name="message"></input><br>
			<input type="submit" value="Connect"></input>
		</form>s
	</body>
</html>