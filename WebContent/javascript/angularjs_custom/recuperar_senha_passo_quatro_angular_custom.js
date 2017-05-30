
var acess;
var http;
var detalhes;

var app = angular.module('vmApp',[] )
app.controller('ViewMaster', ['$http',function($http){
	
	acess = this;
	http = $http;
	acess.nome = sessionStorage.getItem("nome");
	acess.email = sessionStorage.getItem("email");
	
	if(sessionStorage.getItem("rc_step_4") != "Y"){
		window.location.assign("Login");
	}
	sessionStorage.setItem("rc_step_4", "N");
	
	acess.CancelarRecuperacaoDeSenha = function() {
		AbrirLoading();
		window.location.href="Login";
	};
	acess.AlertDetalhes = function(){
		alert(detalhes);
	};
	acess.VoltarParaPassoTres = function() {
		AbrirLoading();
		window.location.href="RecuperarSenhaPassoTres";
	};
	acess.VoltarParaPassoDois = function() {
		AbrirLoading();
		window.location.href="RecuperarSenhaPassoDois";
	};
	acess.VoltarParaPassoUm = function() {
		AbrirLoading();
		window.location.href="RecuperarSenhaPassoUm";
	};
	acess.EnviarSenhaPorEmail = function() {
		ValidaEnvioDeEmailComNovaSenha();
	};
	FecharLoading();
}]);

function ValidaEnvioDeEmailComNovaSenha() { 
	AbrirLoading();
	var variaveis = "?chave=ValidaEnvioDeEmailComNovaSenha&usuario_id="+sessionStorage.getItem("usuarioId");
	http.post('LoginServlet'+variaveis)
    .success(function (data, status, headers, config) {
       	//VerificaUsuario(data)
	}).error(function (data, status, header, config) {	
		//RetornaErroPopUp(acess, "Ocorreu um erro: +"+status);
	});
};

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