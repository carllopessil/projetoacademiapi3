<html>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Create Car</h2>

<form action="/create-treino" method="post">
    <button type="submit">IR PARA CADASTRAR TREINO</button>

</form>


<form action="/buscatreinos123" method="get">
    <button type="submit">IR PARA TREINO</button>
</form>


<head>
    <title>Tela de Consulta</title>
</head>
<body>
    <h1>Consulta</h1>
    <form action="MeuServlet" method="post">
        <button type="submit" name="dia" value="segunda">Segunda-feira</button>
<button type="submit" name="dia" value="terca">Terça-feira</button>
<button type="submit" name="dia" value="quarta">Quarta-feira</button>
</form>

</body>
</html>
