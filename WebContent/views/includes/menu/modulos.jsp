<nav class="pushy pushy-left">
    <ul>
        <li class="pushy-link">
        	<a href="agenda">
        		<img width="20" class="simple-tooltip" 
		  		src="imagens/icones/appointment_book_ico.png" 
		  		title="Nesse modulo � poss�vel consultar, editar, excluir e adicionar agendamentos!"/> 
	  			Agendamentos
			</a>
		</li>
		<li class="pushy-link">
        	<a href="clientes">
        		<img width="20" class="simple-tooltip" 
		  		src="imagens/icones/patients_ico.png" 
		  		title="Nesse modulo � poss�vel consultar, editar, excluir e adicionar clientes!"/> 
	  			Pacientes
			</a>
		</li>
		<li class="pushy-link">
        	<a href="receitas">
        		<img width="20" class="simple-tooltip" 
		  		src="imagens/icones/recipes_ico.png" 
		  		title="Nesse modulo � poss�vel consultar, editar, excluir e adicionar receitas!"/> 
	  			Receitas
			</a>
		</li>
		<li class="pushy-link">
        	<a href="#">
        		<img width="20" class="simple-tooltip" 
		  		src="imagens/icones/config_ico.png" 
		  		title="Nesse modulo � poss�vel editar configura��es pessoais do sistema!"/> 
	  			Configura��es
			</a>
		</li>
		<li class="pushy-link">
        	<a href="Login">
        		<img width="20" class="simple-tooltip" 
		  		src="imagens/icones/logout_ico.png" 
		  		title="Sair do sistema!"/> 
	  			Logout
			</a>
		</li>
    </ul>
</nav>
<!-- Site Overlay -->
<div class="site-overlay"></div>

<header>
	<div style="padding: 8px">	
				
		<button class="btn btn-primary menu-btn botao_de_menu">
			&#9776;
		</button>
		
		<p class="titulo_de_menu titulo_menu_animacao">
			 {{vm.tituloDoMenu}}
		</p>
		
		<a href="Login">
			<img width="30" src="imagens/icones/logout_ico.png" title="Logout" />
	  	</a> 	
		<a href="Login">
			<img width="30" src="imagens/icones/user_ico.png" title="{{vm.user}}" />
	  	</a> 	
	</div>
</header>

