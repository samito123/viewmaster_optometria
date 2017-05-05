
sessionStorage.clear();
var acess;
var http;
var detalhes;

var app = angular.module('vmApp',[] )
	app.controller('ViewMaster', ['$http',function($http){	
		acess = this;
		http = $http;
		acess.ValidaUsuarioForm = function(){
			ValidaUsuario()
		};
		acess.AlertDetalhes = function(){
			alert(detalhes);
		};
		FecharLoading();
	}]);	

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
	}else if(usuario.login == undefined){
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
	sessionStorage.setItem("usuario_id", usuario.id_usuario);
	sessionStorage.setItem("nome", usuario.nome_usuario);
	sessionStorage.setItem("usuario_logado", "Y");
	console.log("Sessão salva");
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