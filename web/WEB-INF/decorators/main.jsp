<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
        <link type="image/x-icon" rel="shortcut icon" href="/novaSOS/app/img/favicon2.png"/>

        <meta name="description" content="Projeto Ordem de Serviço" />
        <meta name="author" content="Bruno Luiz Mella"/>


        <!-- Stylesheet file -->
        <link type="text/css" rel="stylesheet" href="/app-bsos/app/css/bootstrap.min.css"/>
<!--        <link type="text/css" rel="stylesheet" href="/novaSOS/app/css/li-scroller.css"/>-->
        <link type="text/css" rel="stylesheet" href="/app-bsos/app/css/bootstrap-datepicker.css"/>
        <link type="text/css" rel="stylesheet" href="/app-bsos/app/less/datepicker.less"/>
        <link type="text/css" rel="stylesheet" href="/app-bsos/app/css/grid.css"/>
        <link type="text/css" rel="stylesheet" href="/app-bsos/app/css/app.css"/>
        <link type="text/css" rel="stylesheet" href="/app-bsos/app/css/footable.paginate.css"/>

        <!-- JAVASCRIPT FILES -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery-1.8.3.min.js"></script>
<!--        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery.li-scroller.1.0.js"></script>-->
<!--        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery-ui-1.10.3.custom.min.js"></script>-->
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery.maskedinput.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/bootstrap.min.js"></script>        
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery.autocomplete.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/footable.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/footable.paginate.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/config.js"></script>
        

        <title><decorator:title default="Bruno | Sistema de Ordem de Servico"/></title>
    </head>
    <body>
        <div class="container-fluid" id=""><jsp:include page="../../topo.jsp" /></div>
        <div class="container-fluid" id="menu"><jsp:include page="../../menu.jsp" /></div>

        <div class="container-fluid" id="conteudo">



            <decorator:body/>
        </div>

        <div class="container-fluid" id="rodape"><jsp:include page="../../rodape.jsp" /></div>
    </body>
</html>