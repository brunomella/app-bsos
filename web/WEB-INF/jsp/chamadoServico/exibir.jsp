<head>
	<title>BSOS | Cliente [exibir]</title>
</head>
<body>
    <h2>${pessoa.nome}</h2>

	(${pessoa.cpf} - ${pessoa.tipo})<br/>
    
	<form action="${pageContext.request.contextPath}/pessoa/${pessoa.id}" method="get">
		<input type="submit" value="exibir"/>
	</form>

	<form action="${pageContext.request.contextPath}/pessoa/${pessoa.id}/editar" method="get">
		<input type="submit" value="editar"/>
	</form>

	<form action="${pageContext.request.contextPath}/pessoa/${pessoa.id}" method="post">
		<input type="hidden" name="_method" value="delete"/>

		<input type="submit" value="remover"/>
	</form>
</body>