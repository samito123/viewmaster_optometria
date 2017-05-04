function ValidaUsuario(acess, http) { 
	AbrirLoading();
	var variaveis = "?chave=ValidaLogin&login="+acess.login+"&senha="+acess.senha;
	
	$http.post('LoginServlet'+variaveis)
		.success(function (data, status, headers, config) {
			console.log(data);
		}).error(function (data, status, header, config) {		            	
			console.log("erro: "+status);
	});
	FecharLoading();
};

function AbrirLoading() { 
	$("#loading").show();
}
			
function FecharLoading() { 
	$("#loading").hide();
}