
var acess;
var http;
var detalhes;

var app = angular.module('vmApp',[] )
app.controller('ViewMaster', ['$http',function($http){	
	acess = this;
	http = $http;
	acess.tituloDoMenu = "Home";
	acess.user = sessionStorage.getItem("nome");
	VerificaLoginAtivo();
	FecharLoading();
}]);	

function VerificaLoginAtivo() {
	if(sessionStorage.getItem("usuario_logado") != "Y"){
		window.location.assign("Login");
	}
}

function AbrirLoading() { 
	$("#loading").show();
}
			
function FecharLoading() { 
	$("#loading").hide();
}