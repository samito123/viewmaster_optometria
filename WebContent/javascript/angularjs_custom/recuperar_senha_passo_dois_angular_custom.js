
var acess;
var http;
var detalhes;

var app = angular.module('vmApp',[] )
app.controller('ViewMaster', ['$http',function($http){
	
	acess = this;
	http = $http;
	
	sessionStorage.removeItem("usuario_id");
	sessionStorage.removeItem("login");
	sessionStorage.removeItem("nome");

	acess.CancelarRecuperacaoDeSenha = function() {
		AbrirLoading();
		window.location.href="Login";
	};
	acess.AlertDetalhes = function(){
		alert(detalhes);
	};
	acess.AvancarParaPassoDois = function() {
		AbrirLoading();
		window.location.href="RecuperarSenhaPassoDois";
	};
	acess.VoltarParaPassoUm = function() {
		AbrirLoading();
		window.location.href="RecuperarSenhaPassoUm";
	};
	acess.ValidaEmailDataDeNascimentoForm = function(){
		ValidaEmailDataDeNascimento();
	};
	FecharLoading();
}]);

function ValidaEmailDataDeNascimento() { 
	AbrirLoading();
	var variaveis = "?chave=ValidaEmailDataDeNascimento&email="+acess.email+"&dataDeNascimento="+acess.dataDeNascimento.toLocaleDateString();
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
		SalvarSessaoDeRecuperacaoDeSenha(usuario);
	}
}

function ChaveInvalida(){
	RetornaErroPopUp("Ação de servidor inválido!");
	detalhes = "Chave de servidor da requisição http do servlet não existe!";
}

function UsuarioInvalido(){
	RetornaErroPopUp("Email ou data de nascimento inválido!");
	detalhes = "Email ou data de nascimento utilizados não são válidos para acesso ao sistema.\n" +
			"Verifique se o email e a data de nascimento de usuário está digitado corretamente e tente " +
			"novamente.";
}

function SalvarSessaoDeRecuperacaoDeSenha(usuario){
	sessionStorage.setItem("usuario_id", usuario.usuarioId);
	sessionStorage.setItem("nome", usuario.nome);
	sessionStorage.setItem("email", usuario.email);
	sessionStorage.setItem("rc_step_3", "Y");
	window.location.href="RecuperarSenhaPassoTres"
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