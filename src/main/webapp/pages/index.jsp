<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="cache-control" content="no-cache" />
	<title>Página em construção</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	
	
	<!-- 
	<form action="#">
		<label>CEP:</label> <input type="text" id="cep" required="true" placeholder="CEP"  class="form-control" > 
		<button id="limpar" class="btn btn-default">Limpar</button>
		<button id="pesquisar" class="btn btn-default">Procurar</button>
	</form>
	 -->
	<br/><br/>

	<form action="/pessoa" method="post">
		<fieldset>
			<legend>Informações pessoais</legend>
			<label>Nome:</label>
			<input type="text" name="nome" class="form-control" required="true">
			
			<label>Email:</label>
			<input type="text" name="email" class="form-control" required="true">
			
			<label>Telefone:</label>
			<input type="text" name="telefone" class="form-control" required="true">
		</fieldset>
		
		<fieldset>
			<legend>Informaçoes de endereço</legend>
			<label>Logradouro:</label> 
			<input type="text" id="logradouro" name="logradouro" class="form-control">
			
			<label>Numero:</label> 
			<input type="text" id="numero" name="numero" class="form-control">
			
			<label>Complemento:</label> 
			<input type="text" id="complemento" name="complemento" class="form-control">
			
			<form class="form-inline">
				<label>CEP:</label> 
				<input type="text" id="cep" class="form-control" name="cep" required="true" placeholder="CEP">
				<button id="pesquisar">Pesquisar</button>
			</form> 
			<br/>
			<label>Bairro:</label> 
			<input type="text" id="bairro" name="bairro" class="form-control">
			
			<label>Localidade:</label> 
			<input type="text" id="localidade" name="cidade" class="form-control">
			
			<label>UF:</label> 
			<input type="text" id="uf" name="estado" class="form-control">
			
			<!-- 
			<label>IBGE:</label> 
			<input type="text" id="ibge"  class="form-control">
			<label>GIA:</label> 
			<input type="text" id="gia"  class="form-control">
			 -->
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</fieldset>
		
	</form>
	
	<!-- 
	<div>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>CEP</th>
					<th>LOGRADOURO</th>
					<th>BAIRRO</th>
					<th>LOCALIDADE</th>
					<th>UF</th>
					<th>IBGE</th>
					<th>GIA</th>
				</tr>
			</thead>
			<tbody>
				
			</tbody>
		</table>
	</div>
	 -->
</div>
</body>
</html>
<script>

$("#pesquisar").click(function(){
	var cep = $("#cep").val();
	$("p").append("<p>Appended item</p>");
	alert("Pesquisando cep: " + cep  + " ...");

		$.getJSON("http://localhost:8080/cep/" + cep.replace("-", "") + "", function(data, status){
			$("#logradouro").val(data.logradouro);
			$("#bairro").val(data.bairro);
			$("#localidade").val(data.localidade);
			$("#uf").val(data.uf);
			$("#ibge").val(data.ibge);
			$("#gia").val(data.gia);

			$("tbody").append("<tr>"+
					"<td>"+ cep +"</td>"+
					"<td>" + data.logradouro + "</td>"+
					"<td>"+ data.bairro +"</td>"+
					"<td>" + data.localidade + "</td>"+
					"<td>" + data.uf + "</td>"+
					"<td>" + data.ibge + "</td>"+
					"<td>" + data.gia + "</td>"+
				"</tr>"
				);
			});
		});

	$("#limpar").click(function(){
		$("#logradouro").val("");
		$("#bairro").val("");
		$("#localidade").val("");
		$("#uf").val("");
		$("#ibge").val("");
		$("#gia").val("");
		$("#cep").val("");
		});



	</script>

	<style>
	form {width: 50%; margin: auto}
	</style>