<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="vmApp">
	<head>
		<%@include  file="../includes/head/recuperar_senha_passo_quatro_head.jsp" %>
	</head>
	<body ng-controller="ViewMaster as vm">
		
		<%@include  file="../includes/loading/loading.jsp" %>
		<%@include  file="../includes/popup/mensagem_modal.jsp" %>
			
		<div class="container"> 
			<div class="caixa_recuperar_senha"> 
				
				<button class="btn caixa_ok" ng-click="vm.VoltarParaPassoUm()">
					1° Passo
				</button>
		
				<button class="btn caixa_ok" ng-click="vm.VoltarParaPassoDois()">
					2° Passo
				</button>

				<button class="btn caixa_ok" ng-click="vm.VoltarParaPassoTres()">
					3° Passo
				</button>

				<button class="btn caixa_play" disabled>
					4° Passo
				</button>
				
				<form name="form">		
					<div class="caixa_de_descricao">
						<h3>
							Confirmar envio
						</h3>
						
						<p style="margin: 50px 10px 50px 10px">Atenção usuário 
							{{vm.nome}}, para confirmar o envio da nova senha para o email 
							{{vm.email}} clique em finalizar e aguarde!
						</p>		
					</div>
					<button class="btn btn-success botao_de_controle_de_fluxo_1" ng-click="vm.EnviarSenhaPorEmail()">
						Finalizar
					</button>
				</form>
				
				<button class="btn btn-primary botao_de_controle_de_fluxo_2" ng-click="vm.VoltarParaPassoTres()">
					Anterior
				</button>
				<button class="btn btn-danger botao_de_controle_de_fluxo_2" ng-click="vm.CancelarRecuperacaoDeSenha()">
					Cancelar
				</button>
				
			</div>
		</div>
		
	</body>
</html>