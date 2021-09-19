<html>
	<body>
		<form action="/addContact/${name}" method="post">
			<input type="hidden" name="user_id" value="${user_id}"></input>
			Name:<input type="text" name="name"></input>
			Address:<input type="text" name="adress"></input>
			Email:<input type="text" name="email"></input>
			Phone"<input type="number" name="phone"></input>
			Message:<input type="text" name="message"></input>
			<input type="submit" value="Add"></input>
		</form>
	</body>
</html>