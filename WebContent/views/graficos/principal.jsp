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
			<%@include  file="../includes/menu/modulos.jsp" %>
			
			<div class="conteiner_grande">
			    <div class="caixa_com_borda_redonda">
			      	<div class="borda_branca">               
						
						<ul class="nav nav-tabs">
						  	<li class="active">
							  	<a data-toggle="tab" style="color:#536376" href="#sessaoTab1">
							  		Sessões
						  		</a>
				  			</li>
						  	<li>
						  		<a data-toggle="tab" style="color:#536376" href="#sessaoTab2">
						  			Legendas
					  			</a>
				  			</li>
						</ul>
						
						<div class="tab-content">
							<div id="sessaoTab1" class="tab-pane fade in active cor_de_fundo_do_corpo_da_caixa">	             
                 				<div class="conteudo_de_corpo_da_caixa">
	                 				<div class="titulo_da_caixa">
	               						<h4>
					              			Sessões do usuário - {{vm.anoCorrente}}         		
							            </h4>
	                 				</div>
	                 				<div class="conteudo_de_corpo_da_caixa">
							            
			                           <div id="GraficoSessoes" class="caixa_de_grafico">                      	
		                               </div>
		                           							
		                          	</div>
		                          	<div class="rodape_da_caixa">
	                 				</div>	    
                 				</div>          			
	                 		</div>
	                 		
	                 		<div id="sessaoTab2" class="tab-pane fade cor_de_fundo_do_corpo_da_caixa">
								<div class="conteudo_de_corpo_da_caixa">
									<div class="titulo_da_caixa">
	               						<h4>
					              			Sessões do usuário       		
							            </h4>
	                 				</div>
	                 				<div>
	                 					<cite title="Source Title">
		                 					<div class="bloco_de_texto_de_corpo_da_caixa">
										 		<span class="quadrado_azul_para_legenda">
										  		</span>
								  				Sessões no ano de {{vm.anoCorrente}}: {{vm.totalDeSessoesAnoCorrente}}.
										  	</div>	
											<div class="bloco_de_texto_de_corpo_da_caixa">
										 		<span class="quadrado_laranja_para_legenda">
										  		</span>
								  				Total de sessões do usuário: {{vm.totalDeSessoes}}.		
										  	</div>  	
					                   				  						  
									        <div class="bloco_de_texto_de_corpo_da_caixa">							        
								          		- Porcentagem correspondente ao ano de 
								          		{{vm.anoCorrente}}: {{vm.porcentagemDoAnoCorrenteSessoes}}%.							          
								          	</div>
							          	</cite>				  					  					  	 						  	 													
		                          	</div>
		                          	<div class="rodape_da_caixa">
	                  				</div>	
                  				</div>
							</div>	             		
						</div>					       				
                   	</div>			               	
				</div>		
			</div>
			
		</div>
		
	</body>
</html>

<script type="text/javascript" src="javascript/menu/pushy.min.js" charset="UTF-8"></script>