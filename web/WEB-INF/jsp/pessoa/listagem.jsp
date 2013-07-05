<head>
    <title>BSOS | Cliente [lista]</title>
    <script>
        $("#busca").autocomplete('<c:url value="/pessoa/busca"/>', {
            dataType: "json",
            parse: function(pessoa) {
                return $.map(pessoa, function(pessoa) {
                    return  {
                        data: pessoa,
                        value: pessoa.nome,
                        result: pessoa.nome
                    };
                });
            },
            formatItem: function(pessoa) {
                return pessoa.nome + "(" + pessoa.telefone + ")";
            }

        });
    </script>
</head>
<body>
    <fieldset>      
        <div id="legend">
            <legend class=""> 
                Cliente
                <small> lista </small>
                <form class="navbar-form pull-right" action="<c:url value="/pessoa/busca"/>">                  

                    <input type="text" class="search-query" name="nome" placeholder="Buscar Clientes"/>
                    <button type="submit" class="btn"><i class="icon-search"></i>Submit</button>

                </form>
            </legend>  

        </div>
        <!--        <div class="control-group">
                    <div class="controls">
                        <form action="<c:url value="/pessoa/busca"/>">
                            <div class="input-prepend">
                                <span class="add-on"><i class="icon-search"></i></span>
                                <input id="busca" type="text" class="input-xxlarge" name="nome" placeholder="Buscar Clientes"/>                       
                            </div>
                        </form>
                    </div>
                </div>-->

        <table cellpadding="1" cellspacing="1" class="footable" data-page-navigation="#pagination" data-page-size="2">
            <c:forEach items="${pessoaList }" var="pessoa">
                <tr>
                    <td>
                        <!--                        <h4>
                                                    <span >Nome: ${pessoa.nome} Tipo: ${pessoa.tipo} </span>
                                                    <br>
                                                    <span> Fone: ${pessoa.telefone}</span>
                                                </h4>
                                                <br/>-->
                        <table class="table table-bordered table-hover table-striped">
                            <thead>
                                <tr>
                                    <th >Nome:</th>
                                    <th >Fone:</th>
                                    <th >Tipo</th>
                                    

                                </tr>
                            </thead>
                            <tbody>

                                <tr>
                                    <td>${pessoa.nome}</td>
                                    <td>${pessoa.telefone} - ${pessoa.celular}
                                    </td>
                                    <td>${pessoa.tipo}</td>

                                </tr>

                            </tbody>
                        </table>
                        <div class="">
                            <form action="${pageContext.request.contextPath}/pessoa/${pessoa.id}/editar" method="get">
                                <button class="btn btn-small" type="submit" value="Editar">
                                    <i class=" icon-edit"></i> Editar
                                </button>
                            </form>
                        </div>
                        <div class="">
                            <form action="${pageContext.request.contextPath}/pessoa/${pessoa.id}" method="post">
                                <input type="hidden" name="_method" value="delete"/>
                                <button class="btn btn-small" type="submit" value="remover" onclick="message()">
                                    <i class=" icon-remove"></i> Remover
                                </button>
                            </form>  
                        </div>

                        <div class="inline">
                            <a class="btn btn-small" href="${pageContext.request.contextPath}/chamadoServico/${pessoa.id}/novoChamado">                                                               
                                <i class="icon-forward"></i>
                                Gerar Chamado
                            </a>
                        </div>
                        <br class="clearBoth" />
                    </c:forEach> 
                </td>
            </tr>
        </table>
    </fieldset> 
    <div style="border-top: 1px solid gray; padding-bottom: 0px">
        <ul id="pagination" class="footable-nav"><span>Páginas: </span></ul>
    </div>
</body>