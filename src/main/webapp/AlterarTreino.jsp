<!DOCTYPE html>
<html lang="en">

<head>
<script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
<link href="css/styles-CadastroTreino.css" rel="stylesheet" type="text/css"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  <meta charset="UTF-8">
  <body>
  <h1>TREINOS CADASTRADOS</h1>
  <table id="tabela">
  <thead>
  		<tr>
  				<th>Exercicio</th>
  				<th>Repeticao</th>
  				<th>Carga</th>
  				<th>Dia da semana</th>
  			</tr>
  		</thead>
  		<tbody>

<c:forEach var="TreinosCad" items="${TreinosCad}">

<tr>
        <td><text value="${TreinosCad.exercicio}">${TreinosCad.exercicio}</text></td>
       <td><text value="${TreinosCad.repeticao}">${TreinosCad.repeticao}</text></td>
       <td><text value="${TreinosCad.carga}">${TreinosCad.carga}</text></td>
       <td><text value="${TreinosCad.diaSemana}">${TreinosCad.diaSemana}</text></td>

<td>
<form action="/deleteTreino" method="post">
                    <input type="hidden" id="id" name="id" value="${TreinosCad.id}">
                    <button class= "btn-primary" type="submit">Delete</button>
                <span> | </span>
                <a href="index.jsp?id=${TreinosCad.id}&name=${TreinosCad.Exercicio}">Update</a>
                </form>
                </td>
                </tr>

 </c:forEach>
</tbody>

</table>


  <body>
</html>