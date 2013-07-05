<head>
    <title>BSOS | Funcionario [lista]</title>
</head>
<body>        
    <a class="btn" href="${pageContext.request.contextPath}/funcionario/novo">Novo Funcionario</a><br><br>
    <table class="table table-bordered table-hover table-striped">
        <thead>
            <tr>
                <th >ID</th>
                <th >Nome</th>
                <th >Ações</th>

            </tr>
        </thead>
        <tbody>
            <c:forEach items="${funcionarioList }" var="funcionario">
                <tr>
                    <td>${funcionario.id }</td>
                    <td>${funcionario.nome}</td> 
                    <td> 
                        <form id="funcionario" action="${pageContext.request.contextPath}/funcionario/${funcionario.id}/editar" method="get">
                            <input class="btn btn-primary" type="submit" value="editar"/>
                        </form>
                        <form action="${pageContext.request.contextPath}/funcionario/${funcionario.id}" method="post">
                            <input type="hidden" name="_method" value="delete"/>
                            <input class="btn btn-danger" type="submit" value="remover"/> 
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table> 
</body>