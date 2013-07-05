<head>
    <title>Sistema de Ordem de Servico | Funcionario [novo]</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/funcionario" method="post">

        <input type="hidden" name="funcionario.id" value="${funcionario.id}"/>
        <input type="hidden" name="chamadoServico.id" value="${chamadoServico.id}"/>
        <label>Nome:</label>
        <input type="text" name="funcionario.nome" value="${funcionario.nome}"/><br/>			              

        <input type="submit" value="salvar"/>
    </form>
</body>