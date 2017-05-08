
sessionStorage.clear();
var acess;
var http;
var detalhes;

var app = angular.module('vmApp',[] )
	app.controller('ViewMaster', ['$http',function($http){	
		acess = this;
		http = $http;
		AnimacaoTextillate();
		acess.ValidaUsuarioForm = function(){
			ValidaUsuario()
		};
		acess.AlertDetalhes = function(){
			alert(detalhes);
		};
		FecharLoading();
	}]);

function AnimacaoTextillate() { 
	$(function () {
		$('.titulo_login_animacao').textillate({      
			// enable looping
			loop: false,
			initialDelay: 0,
			autoStart: true,
			in: {
				// set the effect name
				effect: 'flash',
				// set the delay factor applied to each consecutive character
				delayScale: 1.5,
				// set the delay between each character
				delay: 50,
				// set to true to animate all the characters at the same time
				sync: false,
				// randomize the character sequence 
				// (note that shuffle doesn't make sense with sync = true)
				shuffle: true,
				// reverse the character sequence 
				// (note that reverse doesn't make sense with sync = true)
				reverse: false,
				// callback that executes once the animation has finished
				callback: function () {}
			}, 
		// set the type of token to animate (available types: 'char' and 'word')
		type: 'char'
		});

	});
};

function ValidaUsuario() { 
	AbrirLoading();
	var variaveis = "?chave=ValidaLogin&login="+acess.login+"&senha="+acess.senha;
	http.post('LoginServlet'+variaveis)
    .success(function (data, status, headers, config) {
       	VerificaUsuario(data)
	}).error(function (data, status, header, config) {		            	
		RetornaErroPopUp(acess, "Ocorreu um erro: +"+status);
	});
};

function VerificaUsuario(usuario){
	if(usuario === "Chave inválida"){
		ChaveInvalida();
	}else if(usuario.usuarioId == undefined){
		UsuarioInvalido();
	}else{
		SalvarSessao(usuario);
	}
}

function ChaveInvalida(){
	RetornaErroPopUp("Ação de servidor inválido!");
	detalhes = "Chave de servidor da requisição http do servlet não existe!";
}

function UsuarioInvalido(){
	RetornaErroPopUp("Login ou senha inválido!");
	detalhes = "Login e senha utilizados não são válidos para acesso ao sistema.\n" +
			"Verifique se o login de usuário está digitado corretamente e redigite sua senha.";
}

function SalvarSessao(usuario){
	sessionStorage.setItem("usuario_id", usuario.usuarioId);
	sessionStorage.setItem("login", usuario.login);
	sessionStorage.setItem("nome", usuario.nome);
	sessionStorage.setItem("usuario_logado", "Y");
	window.location.href="Graficos"
	
}

function RetornaErroPopUp(mensagem){
	acess.alertModal = 'alert-danger';
	acess.btnModal = 'btn-danger';
	acess.modalHeader = 'Atenção:'; 
	acess.modalBody = mensagem;
	acess.modalFooter = 'Fechar';
	$("#modal").modal('show');
	FecharLoading();
};

function AbrirLoading() { 
	$("#loading").show();
}
			
function FecharLoading() { 
	$("#loading").hide();
}