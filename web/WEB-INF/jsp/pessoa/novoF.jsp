<head>
    <title>BSOS | Cliente [novo]</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/pessoa" method="post">
        <ul class="nav nav-tabs">
            <li class="active">
                <a href="#tab_dados" title="Dados do Cliente"  data-toggle="tab">Dados Cliente</a>
            </li>
            <li>
                <a href="#tab_endereco" title="Endereco do Cliente" data-toggle="tab">Endereco</a>
            </li>
            <li>
                <a href="#salvar" title="Clique Aqui para salvar" data-toggle="tab">Salvar</a>
            </li>
        </ul>
        <%-- começo das tabs --%>
        <div id="myTabContent" class="tab-content">
            <%-- tab pessoa --%>
            <div class="tab-pane active in" id="tab_dados">
                <%-- div do formulario da pessoa fisica --%>   
                <div> 
                    <legend class=""> 
                        Pessoa Física
                        <small> (*)Campos Obrigatórios </small>
                    </legend>  

                    <input type="hidden" name="pessoa.id" value="${pessoa.id}" />
                    <label for="nome">*Nome:</label> 
                    <input title="Campo Obrigatorio" class="input span3"  required="true" id="nome" type="text"  name="pessoa.nome" value="${pessoa.nome}" />
                    <label for="cpf">cpf:</label>            
                    <input class="input _cpf span2 tips" id="cpf" type="text" name="pessoa.cpf" value="${pessoa.cpf}" />                   
                    <label for="rg">rg:</label> 
                    <input class=" input _rg span2" id="rg" type="text" name="pessoa.rg" value="${pessoa.rg}" />
                    <label  for="celular">*Celular:</label> 
                    <input title="Campo Obrigatorio" class=" input _telefone span2" required="true" id="celular" type="text" name="pessoa.celular" value="${pessoa.celular}" />
                    <label  for="telefone">*Telefone:</label>	
                    <input title="Campo Obrigatorio" class="input _telefone span2" required="true" id="telefone" type="text" name="pessoa.telefone" value="${pessoa.telefone}" />	
                    <label  for="email">Email:</label> 
                    <input class="input span3" id="email" type="text" name="pessoa.email" placeholder="seuemail@exemplo.com" value="${pessoa.email}">
                    <input id="tipo" type="hidden"  name="pessoa.tipo" value="Física" /> 
                </div>
            </div>
            <%-- tab endereco --%>
            <div class="tab-pane fade" id="tab_endereco">                
                <div class="endereco">
                    <input type="hidden" name="endereco.id" value="${endereco.id}" />
                    <label for="rua">*Rua:</label> 
                    <input title="Campo Obrigatorio" class="input span3" type="text" name="endereco.rua" required="true" value="${endereco.rua}" />                        
                    <label for="numero">*Numero:</label>            
                    <input title="Campo Obrigatorio" class="input span3" id="numero" required="true" type="text" name="endereco.numero" value="${endereco.numero}" />
                    <label for="complemento">*Complemento:</label>	
                    <input title="Campo Obrigatorio" class="input span3" id="complemento" required="true" type="text" name="endereco.complemento" value="${endereco.complemento}" />
                    <label for="bairro">*Bairro</label>
                    <input title="Campo Obrigatorio" class="input span3" type="text" name="endereco.bairro" required="true" id="bairro" value="${endereco.bairro}" />
                    <label for="cidade">Cidade</label>
                    <input type="text" class="input span3" name="endereco.cidade" id="cidade" value="${endereco.cidade}" />
                    <select name="endereco.uf" id="uf" >
                        <option>Selecione a Unidade Federal</option>
                        <option value="AC">AC</option><option value="AL">AL</option>
                        <option value="AP">AP</option><option value="AM">AM</option>
                        <option value="BA">BA</option><option value="CE">CE</option>
                        <option value="DF">DF</option><option value="ES">ES</option>
                        <option value="GO">GO</option><option value="MA">MA</option>
                        <option value="MT">MT</option><option value="MS">MS</option>
                        <option value="MG">MG</option><option value="PA">PA</option>
                        <option value="PB">PB</option><option value="PR">PR</option>
                        <option value="PE">PE</option><option value="PI">PI</option>
                        <option value="RJ">RJ</option><option value="RN">RN</option>
                        <option value="RS">RS</option><option value="RO">RO</option>
                        <option value="RR">RR</option><option value="SC">SC</option>
                        <option value="SP">SP</option><option value="SE">SE</option>
                        <option value="TO">TO</option></select>
                    <label for="cep">CEP:</label>	
                    <input class="input span2 _CEP" id="cep" type="text" name="endereco.cep" value="${endereco.cep}" />	
                    <label for="observacao">Observacao:</label> 
                    <input class="input span3" id="observacao" type="text" name="endereco.observacao" value="${endereco.observacao}">
                </div>              
            </div>
            <%-- tab salvar --%>
            <div class="tab-pane fade" id="salvar">
                <div class="control-group">
                    <!-- Button -->
                    <button class="btn btn-small" type="submit" value="salvar">
                        <i class=" icon-ok"></i>Salvar
                    </button>
                </div>
            </div>
        </div>
    </form>
</body>