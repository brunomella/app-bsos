<head>
    <title>BSOS | Chamado de Servico [novo]</title>

    <script type="text/javascript">
        $(document).ready(function() {
            $('#data').datepicker();
        });
    </script>


</head>
<body> 
    <form action="${pageContext.request.contextPath}/ordemServico/save" method="POST">
        <legend>Cadastrar Chamado de Servico</legend>         
        <input type="hidden" name="ordemServico.id" value="${ordemServico.id}" />

        <label for="defeito">Defeito:</label>            
        <input id="defeito" type="text" name="ordemServico.defeito" value="${ordemServico.defeito}" />

        <label for="observacao">Observacao:</label> 
        <input id="observacao" type="text" name="ordemServico.observacao" value="${ordemServico.observacao}" />

        <label for="dataEntradaServico">Data Entrada:</label>	
        <input class="_datepicker input-append date" id="data" data-date-format="dd-mm-yyyy" 
               type="text" name="ordemServico.dataEntradaServico" value="${ordemServico.dataEntradaServico}" />	

        <label for="dataSaidaServico">Data Saida:</label>	
        <input class="_datepicker" id="data" type="text" name="ordemServico.dataSaidaServico" value="${ordemServico.dataEntradaServico}" />	
       
        <input class="btn _btn btn-primary" type="submit" value="ENVIAR"/>

    </form>
</body>