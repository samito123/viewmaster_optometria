<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="vmApp">
	<head>
		<%@include  file="../includes/head/login_head.jsp" %>
	</head>
	<body ng-controller="ViewMaster as vm">
		
		<%@include  file="../includes/loading/loading.jsp" %>
		<%@include  file="../includes/popup/mensagem_modal.jsp" %>
			
		<div class="container"> 
			<div class="box_login">			
				<img src="imagens/icones/logo_icon.png"/>	
				<p class=titulo_login_animacao>View Master</p>
				<hr width="98%"/>
				<div class="titulo_box_login">
					Entre com os seus dados corretamente para acessar o sistema			
				</div>
				<form ng-submit="vm.ValidaUsuarioForm()" name="form">		
				
					<input type="text" id="itLogin" style="margin: 15px 20% 15px 20%; width: 60%;" 
					placeholder="Digite seu login..." class="form-control" ng-model="vm.login" required maxlength="50">		
					
					<input type="password" id="itSenha" style="margin: 15px 20% 15px 20%; width: 60%;" 
					placeholder="Digite sua senha..." class="form-control" ng-model="vm.senha" required maxlength="50">
					
					<div>
						<button type="submit" id="btnEntrar" style="width: 30%; margin: 0 0 15px 0;" 
						class="btn btn-primary">Entrar</button>
					</div>
					
					<div>
						<a href="RecuperarSenhaPassoUm" ng-click="vm.Loading()"> 
				 			Recuperar Senha	
					 	</a>
				 	</div>		
				</form>		
			</div>
		</div>
		
	</body>
</html>