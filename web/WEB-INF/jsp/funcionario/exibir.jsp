<head>
	<title>BSOS | Funcionario [exibir]</title>
</head>
<body>
	<h2>${funcionario.nome}</h2>	

	<form action="${pageContext.request.contextPath}/funcionario/${funcionario.id}" method="get">
		<input type="submit" value="exibir"/>
	</form>

	<form action="${pageContext.request.contextPath}/funcionario/${funcionario.id}/editar" method="get">
		<input type="submit" value="editar"/>
	</form>

	<form action="${pageContext.request.contextPath}/funcionario/${funcionario.id}" method="post">
		<input type="hidden" name="_method" value="delete"/>

		<input type="submit" value="remover"/>
	</form>
</body>