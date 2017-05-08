<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="vmApp">
	<head>
		<%@include  file="../includes/head/principal_head.jsp" %>
	</head>
	<body ng-controller="ViewMaster as vm">
		
		<%@include  file="../includes/loading/loading.jsp" %>
		<%@include  file="../includes/popup/mensagem_modal.jsp" %>
			
		<div class="container"> 
			<%@include  file="../importacoes/menu_de_opcoes_modulos.jsp" %>
		</div>
		
	</body>
</html>
