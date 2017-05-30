<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="vmApp">
	<head>
		<%@include  file="../includes/head/recuperar_senha_passo_um_head.jsp" %>
	</head>
	<body ng-controller="ViewMaster as vm">
		
		<%@include  file="../includes/loading/loading.jsp" %>
		<%@include  file="../includes/popup/mensagem_modal.jsp" %>
			
		<div class="container"> 
			<div class="caixa_recuperar_senha"> 
				
					<button class="btn caixa_play" disabled>
						1° Passo
					</button>
			
					<button class="btn caixa_off" disabled>
						2° Passo
					</button>

					<button class="btn caixa_off" disabled>
						3° Passo
					</button>

					<button class="btn caixa_off" disabled>
						4° Passo
					</button>
						
				<div class="caixa_de_descricao">
					
					<h3>
						Informativo
					</h3>
					
					<p>
						Esqueceu sua senha! Sem problemas, você pode gerar uma nova senha em alguns passos:
					</p>
					<ul>
						<li>
							Passo 1: Você já está nele, é apenas um informativo!
						</li>
						<li>
							Passo 2: Você vai precisar informar o seu email e sua data de nascimento!
						</li>
						<li>
							Passo 3: Escolha o método de recuperação de senha!
						</li>
						<li>
							Passo 4.1: (Pergunta secreta) Responda a pergunta secreta e finalize o procedimento, você recebera uma nova senha!
						</li>
						<li>
							Passo 4.2: (Email) Uma nova senha será enviada para o seu email!
						</li>
					</ul>
				</div>
	
				<button id="btnAvancar" class="btn btn-primary botao_de_controle_de_fluxo_1" ng-click="vm.AvancarParaPassoDois()">
					Próximo
				</button>
				<button id="btnCancelar" class="btn btn-danger botao_de_controle_de_fluxo_2" ng-click="vm.CancelarRecuperacaoDeSenha()">
					Cancelar
				</button>
			
			</div>	
		</div>
		
	</body>
</html>