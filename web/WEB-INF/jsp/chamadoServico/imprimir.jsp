<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>

    <script type="text/javascript">
        function imprimir() {
            var pagina = document.getElementById("conteudo2").innerHTML;
            var novaJanela = window.open('', '_blank', 'status=no,toolbar=no,scrollbars=yes,titlebar=no,menubar=no,resizable=yes,width=640,height=480,directories=no,location=no');
            novaJanela.document.write("<head>");
            novaJanela.document.write("<meta http-equiv='content-type' content='text/html; charset=iso-8859-1' />");
            novaJanela.document.write("<style tyle='text/css' media='print'>button{display: none;}</style>");
            novaJanela.document.write("<style tyle='text/css' media='all'>a{color: #0000FF;}</style>");
            novaJanela.document.write("</head>");
            novaJanela.document.write("<button type='button' onclick='javascript:window.print();'>Imprimir Página</button>");
            novaJanela.document.write(pagina);
            novaJanela.document.write("<button type='button' onclick='javascript:window.print();'>Imprimir Página</button>");
        }
    </script>
    <title>Imprimir</title>
    <style type="text/css" media="all">

        body{
            text-align: center;
        }
        a{
            color: blue;
            text-decoration: none;
        }
        a:hover{
            text-decoration: underline;
        }

        button{

        }

        #conteudo2{
            text-align: center;
            margin: 0 auto;
            width: 980px;
        }
        #rodape2{
            margin: 100px;
        }
        table thead {



        }

        table tbody tr:nth-child(even) {

        }
        table tbody td {

        }
        table tfoot th {

        }

    </style>
</head>
<body>    
    <div id="conteudo2">
        <h3>Chamados para Impressão</h3>      
        <p>
            <strong>Esta é uma versão de impressão provisoria...(ainda nao Implementado)</strong>
        <h4>  
            <br>
            -------------------------------------------------------Cliente-------------------------------------------------------<br>
            <br>
            <!--            <table>
                            <caption>Cliente</caption>
                            <thead>
                                <tr>
                                    <th> Nome/Razão:</th>
                                    <th>Tipo:</th>
                                    <th>RG/IE:</th>
                                    <th>CPF/CNPJ:</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>${chamadoServico.pessoa.nome}</td>
                                    <td>${chamadoServico.pessoa.tipo}</td>
                                    <td>${chamadoServico.pessoa.rg}</td>
                                    <td>${chamadoServico.pessoa.cpf}</td>
                                </tr>
                            </tbody>
                        </table>-->


            Nome/Razão: ${chamadoServico.pessoa.nome}  <br>
            Tipo:${chamadoServico.pessoa.tipo}<br>

            RG/IE: ${chamadoServico.pessoa.rg}  <br>
            CPF/CNPJ:${chamadoServico.pessoa.cpf}<br>
            <br>
            Telefone: ${chamadoServico.pessoa.telefone} - ${chamadoServico.pessoa.celular}<br>
            <br>
            -------------------------------------------------------Endereco-------------------------------------------------------<br>
            <br>
            Rua:${chamadoServico.endereco.rua} Numero:${chamadoServico.endereco.numero} Complemento:${chamadoServico.endereco.complemento}<br>
            <br> 
            Bairro: ${chamadoServico.endereco.bairro}<br> 
            <br>
            -------------------------------------------------------Chamado-------------------------------------------------------<br>
            <br>
            Defeito: ${chamadoServico.defeito}<br>
            <br>
            Observacão: ${chamadoServico.observacao}<br>
            <br>
            Data: ${chamadoServico.dataEntradaServico}<br>

        </h4>


        <!--        <span style="padding-left: 190px;float: left;">---------------------------------------</span><span style="padding-right: 180px;float: right;">---------------------------------------</span>
                    <span style="padding-left: 270px;float: left;">Ass Cliente</span>                      <span style="padding-right: 260px;float: right;">Ass Técnico</span>
        -->
    </p>
</div>
<div id="rodape2"
     <div class="control-group">
        <div class="controls">
            <div class="inline">
                <button onclick="javascript:history.back(0);" class="btn btn-primary">
                    <i class="icon-arrow-left icon-white"></i> Voltar !</button>
                <!--    <button type="button" onclick="javascript:window.print();">Imprimir Página Completa</button>-->
                &nbsp; &nbsp; &nbsp; 
                <button class="btn btn-info" type="button" onclick="javascript:imprimir();" >
                    <i class=" icon-print"></i>
                    Imprimir  
                </button>
                <!--                onclick="javascript:imprimir();"-->
                <!--                onclick="javascript:window.print();"-->
            </div>
        </div>
    </div>
</div>

</body>
