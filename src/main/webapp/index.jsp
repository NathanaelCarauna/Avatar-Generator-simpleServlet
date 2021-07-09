<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Avatar Generator</title>
</head>
<body>
	<h1>Avatar Generator</h1>
	<form action="http://localhost:8080/avatar/gerar" method="post">
		<label for="name">Informe seu nome:</label><br> 
		<input type="text" id="name" name="name"><br> 
		<input type="radio" id="robo" name="type" value="set3">
		<label for="robo">Robo</label><br>
        <input type="radio" id="gato" name="type" value="set4">
        <label for="gato">Gato</label><br>
        <input type="radio" id="monstro" name="type" value="set2">
        <label for="monstro">Monstro</label>
		<input type="submit" value="Submit">
	</form>
</body>
</html>