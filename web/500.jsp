<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<html>
    <head> 
        <!-- Stylesheet file -->
        <link type="text/css" rel="stylesheet" href="/novaSOS/app/css/bootstrap.min.css"/>
        <!--        <link type="text/css" rel="stylesheet" href="/novaSOS/app/css/jquery-ui-1.10.3.custom.min.css"/>-->
        <link type="text/css" rel="stylesheet" href="/novaSOS/app/css/bootstrap-datepicker.css"/>
        <link type="text/css" rel="stylesheet" href="/novaSOS/app/css/grid.css"/>
        <link type="text/css" rel="stylesheet" href="/novaSOS/app/css/app.css"/>
        <link type="text/css" rel="stylesheet" href="/novaSOS/app/css/footable.paginate.css"/>

        <!-- JAVASCRIPT FILES -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery-1.8.3.min.js"></script>
<!--        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery-1.10.1.min.js"></script>-->
<!--        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery-ui-1.10.3.custom.min.js"></script>-->
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery.maskedinput.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/bootstrap.min.js"></script>        
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/footable.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/footable.paginate.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/app/js/config.js"></script>
        <title>Erro 500</title>
    </head>
    <style>
        .center {text-align: center; margin-left: auto; margin-right: auto; margin-bottom: auto; margin-top: auto;}
    </style>
    <body>
        <div class="hero-unit center">
            <h2><font face="Tahoma" color="red">Erro 500</font></h2>
            <h3> Ops! Há algo de errado com o sistema, Entre em contato com o Administrador :)<br />
            </h3>
            <br />   

            Clique aqui para voltar
            <a href="javascript:history.back(0);" class="btn btn-primary"><i class="icon-arrow-left icon-white"></i> Voltar !</a><br />
            Voltar ao Inicio?
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/"><i class="icon-home icon-white"></i> Inicio</a>
        </div>
    </body>
</html>



