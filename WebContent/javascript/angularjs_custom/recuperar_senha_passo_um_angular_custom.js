
var acess;
var http;
var detalhes;

var app = angular.module('vmApp',[] )
app.controller('ViewMaster', ['$http',function($http){
	
	acess = this;
	http = $http;
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
	FecharLoading();
}]);

function AbrirLoading() { 
	$("#loading").show();
}
			
function FecharLoading() { 
	$("#loading").hide();
}