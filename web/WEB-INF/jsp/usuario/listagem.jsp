<head>
    <title>BSOS | Usuario [lista]</title>
</head>
<body>           
    
    <a class="btn" href="${pageContext.request.contextPath}/usuario/novo">Novo Funcionario</a><br><br>
    
    <table class="table table-bordered table-hover table-striped table-condensed">
        <thead>
            <tr>
                <th width="40">ID</th>
                <th width="100">Nome</th>
                <th width="100">Email</th>
                <th width="100">Senha</th>
                <th width="100">Perfil</th>  
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${usuarioList }" var="usuario">
                <tr>
                    <td align="center">${usuario.id }</td>
                    <td align="center">${usuario.nome}</td>
                    <td align="center">${usuario.email}</td>
                    <td  align="center">******</td>
                    <td align="center">${usuario.perfil}</td>

            <form action="${pageContext.request.contextPath}/usuario/${usuario.id}/editar" method="get">
                <td>  <input class="_btn btn btn-primary" type="submit" value="editar"/> </td>
            </form>
            
            <form action="${pageContext.request.contextPath}/usuario/${usuario.id}" method="post">
                <td>  <input type="hidden" name="_method" value="delete"/>
                    <input class="_btn btn btn-danger" type="submit" value="remover"/> </td>
            </form>
        </tr>
    </c:forEach>
</tbody>
</table> 
</body>