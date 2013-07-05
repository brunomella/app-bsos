<head>
	<title>${pageContext.request.contextPath}</title>
</head>
<body>
    <h4>${pessoa.nome}</h4>

	(${pessoa.telefone} - ${endereco.cidade})<br/>
    
	 <form action="${pageContext.request.contextPath}/pessoa/${pessoa.id}/editar" method="get">
                    <td>  <input class="_btn btn btn-primary" type="submit" value="editar"/> </td>
                </form>

	<form action="${pageContext.request.contextPath}/pessoa/${pessoa.id}" method="post">
                    <td>  <input type="hidden" name="_method" value="delete"/>

                        <input class="_btn btn btn-danger" type="submit" value="remover"/> </td>
                </form>
	
</body>