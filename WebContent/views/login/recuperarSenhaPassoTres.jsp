<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="vmApp">
	<head>
		<%@include  file="../includes/head/recuperar_senha_passo_tres_head.jsp" %>
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

				<button class="btn caixa_play" disabled>
					3° Passo
				</button>

				<button class="btn caixa_off" disabled>
					4° Passo
				</button>
			
				<form name="form">		
					<div class="caixa_de_descricao">
						<h3>
							{{vm.nome}}, selecione o método desejado
						</h3>
					
						<fieldset>
	                        <input id="itRadio" type="radio" class="inputRadio" 
	                        	value="0" ng-model="vm.metodoSelecionado"/> Email<br />
	                        <input id="itRadio" type="radio" class="inputRadio" 
	                        	value="1" ng-model="vm.metodoSelecionado"/> Pergunta secreta<br />
			        	</fieldset>	
					</div>
		
					<button class="btn btn-primary botao_de_controle_de_fluxo_1" ng-click="vm.RecuperaSenhaPorMetodoSelecionado()">
						Próximo
					</button>
				</form>
				
				<button class="btn btn-primary botao_de_controle_de_fluxo_2" ng-click="vm.VoltarParaPassoDois()">
					Anterior
				</button>
				<button class="btn btn-danger botao_de_controle_de_fluxo_2" ng-click="vm.CancelarRecuperacaoDeSenha()">
					Cancelar
				</button>
				
			</div>
		</div>
		
	</body>
</html>