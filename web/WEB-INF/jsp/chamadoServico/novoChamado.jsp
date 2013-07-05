<head>
    <title>BSOS | Usuario [novo]</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/chamadoServico" method="POST">
        <table class="table table-bordered table-hover table-striped">
            <thead>
                <tr>
                    <th >Cliente</th>
                    <th >Telefone</th>
                    <th >Tipo</th>
                    <th >Status</th>

                </tr>
            </thead>
            <tbody>

                    <tr>
                        <td>${pessoa.nome}</td>
                        <td>${pessoa.telefone} -
                            ${pessoa.celular}
                        </td>
                        <td>${pessoa.tipo}</td>
                        <td>${chamadoServico.status}
                    </tr>

            </tbody>
        </table>
        <br/>
        <legend>Cadastrar Chamado de Servico</legend>            
        <div class="control-group">    
            <input type="hidden" name="pessoa.id" value="${pessoa.id}" />
            <input type="hidden" name="pessoa.nome" value="${pessoa.nome}" />               
            <input type="hidden" name="pessoa.cpf" value="${pessoa.cpf}" />                   
            <input type="hidden" name="pessoa.rg" value="${pessoa.rg}" />    
            <input type="hidden" name="pessoa.celular" value="${pessoa.celular}" />
            <input type="hidden" name="pessoa.telefone" value="${pessoa.telefone}" />	
            <input type="hidden" name="pessoa.email" value="${pessoa.email}">
            <input type="hidden" name="pessoa.tipo" value="${pessoa.tipo}" />

            <input type="hidden" name="chamadoServico.id" value="${chamadoServico.id}" />

            <label for="defeito">Defeito:</label>            
            <input id="defeito" type="text" name="chamadoServico.defeito" value="${chamadoServico.defeito}" />

            <label for="observacao">Observacao:</label> 
            <input id="observacao" type="text" name="chamadoServico.observacao" value="${chamadoServico.observacao}" />
        </div>
        <div class="control-group">  
            <div class="datepicker">
                <label for="dataEntradaServico">Data Entrada:</label>
                <input id="datepicker"  data-format="dd/MM/yyyy" type="text" name="chamadoServico.dataEntradaServico" value="${chamadoServico.dataEntradaServico}"></input>
            </div>
        </div>
        <label>Status:</label>
        <div class="control-group">
            <select name="chamadoServico.status">
                <option value="">--SELECIONE--</option>
                <option  value="Concluido">Concluido</option>
                <option  value="Aberto">Aberto</option>
                <option  value="Cancelado">Cancelado</option>
            </select>
        </div>
        <div class="control-group">
            <select name="funcionario.nome">
                <option value="" selected="selected">--selecione--</option>
                <c:forEach items="${funcList}" var="funcionario">
                    <option value="${funcionario.nome}"
                            <c:if test="${funcionario.nome eq nome}">selected="selected"</c:if>
                            >${funcionario.nome}</option>
                </c:forEach>
            </select>




            <a class="btn" style="margin-bottom: 10px;" href="${pageContext.request.contextPath}/funcionario/novo">Novo Funcionario</a><br><br>

        </div>
        <div class="control-group">        

            <!-- Button -->
            <button class="btn btn-small" type="submit" value="salvar">
                <i class=" icon-ok"></i>Salvar
            </button>
        </div>
    </form>
</body>