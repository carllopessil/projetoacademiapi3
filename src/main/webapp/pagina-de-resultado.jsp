  <!DOCTYPE html>

  <head>
  <script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
  <link href="css/styles-CadastroTreino.css" rel="stylesheet" type="text/css"/>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <meta charset="UTF-8">

<html>
<head>
    <title>Página de Resultado</title>
</head>
<body>
    <h1>Resultados da Busca:</h1>
    <c:forEach var="treinos" items="${resultados}">
        <p>exercicio: ${treinos.exercicio}</p>
        <p>repeticao: ${treinos.repeticao}</p>
         <p>Carga: ${exercicio.carga}</p>
         <p>repeticao: ${treinos.diaSemana}</p>
        <hr>
    </c:forEach>
    <c:if test="${empty resultados}">
        <p>Nenhum resultado encontrado.</p>
    </c:if>
</body>
</html>