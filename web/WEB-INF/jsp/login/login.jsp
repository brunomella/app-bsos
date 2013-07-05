<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
        <title>BSOS | Sistema de Chamado de Servico</title>

        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/app/css/bootstrap.min.css"/>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/app/css/bootstrap.datepicker.css"/>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/app/css/grid.css"/>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/app/css/app.css"/>
        <!-- JAVASCRIPT FILES -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery-1.8.3.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery.maskedinput-1.3.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/bootstrap-dropdown.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/bootstrap-datapicker.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/app.js"></script>
    </head>
    <body>
        <div class="container">
            <form class="form-horizontal" action='<c:url value="/autenticar"/>' method="POST">

                <div>
                    <img src="/novaSOS/app/img/logobeta.jpg" alt="BSOS" title="BSOS" />
                </div>
                <div id="">
                    <legend class=""> 
                        BSOs | Sistema de Chamado de Servicos                         
                    </legend>  
                </div>  
                <div id="login">
                    <div class="control-group">
                        <!-- E-Mail -->                
                        <div class="controls">
                            <div class="input-prepend">
                                <span class="add-on"><i class="icon-envelope"></i></span>
                                <input type="email" required="true" id="email" name="usuario.email" style="text-transform: lowercase;" placeholder="usuario@dominio.com.br" class="input-xlarge">
                            </div>
                        </div>

                    </div>

                    <div class="control-group">
                        <!-- Senha -->                   
                        <div class="controls">
                            <div class="input-prepend">
                                <span class="add-on"><i class="icon-lock"></i></span>
                                <input type="password" required="true" id="password" name="usuario.senha" placeholder="******" class="input-xlarge">
                            </div>
                        </div>
                    </div>

                    <div class="control-group">
                        <!-- Acessar -->
                        <div class="controls">   
                            <button class="btn btn-small" type="submit" value="acessar">
                                <i class=" icon-ok-sign"></i>Entrar
                            </button>
                            
                        </div>
                    </div>
                </div>
                <div id="error">
                    <c:if test="${not empty error}"><span class="label label-important">${error}</span></c:if>
                    <c:if test="${not empty message}"><span class="label label-success">${message}</span></c:if>
                </div>                
            </form> 
        </div>            
    </body>
</html>