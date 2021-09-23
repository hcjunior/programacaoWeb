<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<form action='servletCadastro1'>
		<p>Nome:<input type='text' name='nome'></p>
		<p>Sobrenome<input type='text' name='sobrenome'></p>
		<p>Rua<input type='text' name='rua'></p>
		<p>Complemento<input type='text' name='complemento'></p>
		<p>Cidade<input type='text' name='cidade'></p>
		<p>Cep<input type='text' name='cep'></p>
		<p>Estado<input type='text' name='estado'></p>
		<p><input type='submit' value='enviar'></p>
	</form>
</body>
</html>