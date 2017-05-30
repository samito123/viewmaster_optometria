
var acess;
var http;
var detalhes;

var app = angular.module('vmApp',[] )
app.controller('ViewMaster', ['$http',function($http){
	
	acess = this;
	http = $http;
	acess.nome = sessionStorage.getItem("nome");
	
	if(sessionStorage.getItem("rc_step_3") != "Y"){
		window.location.assign("Login");
	}
	sessionStorage.removeItem("rc_step_3");
	
	acess.CancelarRecuperacaoDeSenha = function() {
		AbrirLoading();
		window.location.href="Login";
	};
	acess.AlertDetalhes = function(){
		alert(detalhes);
	};
	acess.VoltarParaPassoDois = function() {
		AbrirLoading();
		window.location.href="RecuperarSenhaPassoDois";
	};
	acess.VoltarParaPassoUm = function() {
		AbrirLoading();
		window.location.href="RecuperarSenhaPassoUm";
	};
	acess.RecuperaSenhaPorMetodoSelecionado = function(){
		VerificaMetodoSelecionado();
    };	
	FecharLoading();
}]);

function VerificaMetodoSelecionado(){
	AbrirLoading();
	if(acess.metodoSelecionado == 0){
		RecuperaMensagemPorEmail();
	}else if(acess.metodoSelecionado == 1){
		RecuperaMensagemPorPerguntaSecreta();
	}else{
		MetodoInvalido();
	}		
}

function RecuperaMensagemPorEmail() {
	sessionStorage.setItem("rc_step_4", "Y");
	sessionStorage.setItem("rc_step_3", "Y");
	window.location.href="RecuperarSenhaPassoQuatroEmail";
}	

function RecuperaMensagemPorPerguntaSecreta() {
	sessionStorage.setItem("rc_step_4", "Y");	
	sessionStorage.setItem("rc_step_3", "Y");
	window.location.href="RecuperarSenhaPassoQuatroPerguntaSecreta";
}	

function MetodoInvalido(){
	RetornaErroPopUp("Nenhuma opção foi selecionada!");
	detalhes = "O usuário precisa selecionar o método de envio de sua preferência!";
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