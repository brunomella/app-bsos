<head>
    <title>BSOS | Chamados de Servico [lista]</title>
</head>
<body>
    <fieldset>      
        <div id="legend">
            <legend class=""> 
                Mostrar Chamados
                <small> lista </small>
                <form class="navbar-form pull-right" action="<c:url value="/chamadoServico/busca"/>">                  

                    <input type="text" class="search-query" name="status" placeholder="Buscar Chamados"/>
                    <button type="submit" class="btn"><i class="icon-search"></i>Submit</button>

                </form>
            </legend>  
        </div>
        <table cellpadding="1" cellspacing="1" class="footable" data-page-navigation="#pagination" data-page-size="2">       
            <c:forEach items="${chamadoServicoList }" var="chamadoServico">              
                <tr>
                    <td>
                        <table class="table table-bordered table-hover table-striped">
                            <thead>
                                <tr>
                                    <th >defeito</th>
                                    <th >observacao</th>
                                    <th >dataEntradaServico</th>
                                    <th >status</th>

                                </tr>
                            </thead>
                            <tbody>

                                <tr>
                                    <td>${chamadoServico.defeito}</td>
                                    <td>${chamadoServico.observacao}
                                    </td>
                                    <td>${chamadoServico.dataEntradaServico}</td>
                                    <td>${chamadoServico.status}</td>
                                </tr>

                            </tbody>
                        </table>                       
                        <div class="control-group">
                            <div class="controls">
                                <div class="inline">
                                    <form action="${pageContext.request.contextPath}/chamadoServico/${chamadoServico.id}" method="post">
                                        <input type="hidden" name="_method" value="delete"/>
                                        <button class="btn btn-small" type="submit" value="remover">
                                            <i class=" icon-remove"></i>Remover
                                        </button>
                                    </form>  
                                </div>

                                <div class="inline">

                                    <a  href="${pageContext.request.contextPath}/chamadoServico/imprimir/${chamadoServico.id}" class="btn btn-small"  style="margin-right: 5px;">                            
                                        <i class=" icon-print"></i>
                                        Gerar Impressão
                                    </a>
                                </div>
                                <br class="clearBoth" />
                            </div>
                        </div>
                    </c:forEach>    
                </td>
            </tr>
        </table>
    </fieldset> 
    <div style="border-top: 1px solid gray; padding-bottom: 0px">
        <ul id="pagination" class="footable-nav"><span>Páginas: </span></ul>
    </div>
</body>