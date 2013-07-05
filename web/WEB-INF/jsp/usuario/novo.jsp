<head>
    <title>BSOS | Usuario [novo]</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/usuario" method="post">
        <input type="hidden" name="usuario.id" value="${usuario.id}"/>

        <label>Nome:</label>
        <input class="input" type="text" required="true" name="usuario.nome" value="${usuario.nome}"/><br/>

        <label>E-mail:</label>
        <input class="input" type="text" required="true" style="text-transform: lowercase;" name="usuario.email" value="${usuario.email}"/><br/>

        <label>Senha:</label>
        <input class="input" type="password" required="true" name="usuario.senha" value="${usuario.senha}"/><br/>

        <label>Perfil:</label>
        <select name="usuario.perfil">
            <option value="" selected="selected">--selecione--</option>
            <c:forEach items="${tipoPerfilList}" var="perfil">
                <option value="${perfil}"
                        <c:if test="${usuario.perfil eq perfil}">selected="selected"</c:if>
                        >${perfil.label}</option>
            </c:forEach>
        </select><br/><br/>

        <input class="btn" type="submit" value="salvar"/>
    </form>
</body>