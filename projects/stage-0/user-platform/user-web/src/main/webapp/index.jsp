<head>
<jsp:directive.include
	file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
<title>My Home Page</title>
</head>
<body>
	<div class="container-lg">
		<!-- Content here -->
		Hello,please register！
		<form action="/register/add" method="post">
			<p>name: <input type="text" name="name" /></p>
			<p>password: <input type="password" name="password" /></p>
			<p>emal: <input type="text" name="email" /></p>
			<p>phone: <input type="text" name="phoneNumber" /></p>
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>