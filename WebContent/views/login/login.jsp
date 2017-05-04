<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="control.Teste"%>
<%@ page import="model.classes.Usuario"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="vmApp">
	<head>
		<%@include  file="../includes/head/head_login.jsp" %>
	</head>
	<body ng-controller="ViewMaster as vm">
		
		<%@include  file="../includes/loading/loading.jsp" %>
		
		<%
			String p = "";
		%>
		
		<div class="container"> 
			<script type="text/javascript">
				sessionStorage.clear();
			</script>
			
			<div class="box_login">			
				<img src="imagens/icones/logo_icon.png"/>	
				<p class=titulo_login_animacao>View Master</p>
				<hr width="98%"/>
				<div class="titulo_box_login">
					Entre com os seus dados corretamente para acessar o sistema			
				</div>
				<form action="LoginServlet" method="post">		
				
					<input type="text" id="login" style="margin: 15px 20% 15px 20%; width: 60%;" 
					placeholder="Digite seu login..." class="form-control" ng-model="vm.login" required maxlength="50">		
					
					<input  type="password" id="senha" style="margin: 15px 20% 15px 20%; width: 60%;" 
					placeholder="Digite sua senha..." class="form-control" ng-model="vm.senha" required maxlength="50">
					
					<div>
						<button type="submit" id="entrar" style="width: 30%; margin: 0 0 15px 0;" 
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

<!-- ANGULAR JS -->
	<script type="text/javascript">
		var app = angular.module('vmApp',[] )
		app.controller('ViewMaster', ['$http',function($http){
			var acess = this;
			var a = '<%=p%>';
			if(a === "")
			alert(a);
			
			acess.VerificaLoginDeUsuario = function(){
				AbrirLoading();
				var variaveis = "?chave=ValidaLogin&login="+acess.login+"&senha="+acess.senha;
				$http.post('LoginServlet'+variaveis)
	            .success(function (data, status, headers, config) {
	            	console.log(data);
            	}).error(function (data, status, header, config) {		            	
            		console.log("erro: "+status);
            	});
				FecharLoading();
			};
				
			FecharLoading();
		}]);	
	</script>
<!-- ANGULAR JS -->