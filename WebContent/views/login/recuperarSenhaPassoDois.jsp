<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="vmApp">
	<head>
		<%@include  file="../includes/head/recuperar_senha_passo_dois_head.jsp" %>
	</head>
	<body ng-controller="ViewMaster as vm">
		
		<%@include  file="../includes/loading/loading.jsp" %>
		<%@include  file="../includes/popup/mensagem_modal.jsp" %>
			
		<div class="container"> 
			<div class="caixa_recuperar_senha"> 	
				<button class="btn caixa_ok" ng-click="vm.VoltarParaPassoUm()">
					1° Passo
				</button>
		
				<button class="btn caixa_play" disabled>
					2° Passo
				</button>

				<button class="btn caixa_off" disabled>
					3° Passo
				</button>

				<button class="btn caixa_off" disabled>
					4° Passo
				</button>
					
				<form ng-submit="vm.ValidaEmailDataDeNascimentoForm()" name="form">		
					<div class="caixa_de_descricao">
						<h3>
							Informe seus dados
						</h3>
						
						<div>
							<input id="itEmail" type="email" class="form-control" 
							placeholder="Email..." title="Email" ng-model="vm.email" required maxlength="50"/>
						</div>
						<div>
							<input id="itDataDeNascimento" type="date" class="form-control"
							placeholder="Data de nascimento..." title="Data de nascimento" ng-model="vm.dataDeNascimento" required>
						</div>
						
					</div>
		
					<button class="btn btn-primary botao_de_controle_de_fluxo_1" type="submit">
						Próximo
					</button>
				</form>
				
				<button class="btn btn-primary botao_de_controle_de_fluxo_2" ng-click="vm.VoltarParaPassoUm()">
					Anterior
				</button>
				<button class="btn btn-danger botao_de_controle_de_fluxo_2" ng-click="vm.CancelarRecuperacaoDeSenha()">
					Cancelar
				</button>	
			</div>	
		</div>
		
	</body>
</html>