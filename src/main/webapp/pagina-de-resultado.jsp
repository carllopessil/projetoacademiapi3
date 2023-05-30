  <!DOCTYPE html>

  <head>
  <script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
  <link href="css/styles-CadastroTreinos.css" rel="stylesheet" type="text/css"/>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <meta charset="UTF-8">

<html>
<head>
    <title>Página de Resultado</title>
</head>
<body>
    <h1>Resultados da Busca:</h1>
    <c:forEach var="Agua" items="${resultados}">
        <p>Exercicio: ${Agua.exercicio}</p>
        <p>repeticao: ${Agua.repeticao}</p>
        <p>Carga: ${Agua.carga}</p>
        <p>Dia da semana: ${Agua.diaSemana}</p>
        <hr>
    </c:forEach>
    <c:if test="${empty resultados}">
        <p>Nenhum resultado encontrado.</p>
    </c:if>
</body>
</html>