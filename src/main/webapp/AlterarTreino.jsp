<!DOCTYPE html>
<html lang="en">
<head>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


  <meta charset="UTF-8">
  <table>
    <c:forEach var="TreinosCad" items="${TreinosCad}">
<div>
        <text value="${TreinosCad.exercicio}">${TreinosCad.exercicio}</text>
        <text value="${TreinosCad.repeticao}">${TreinosCad.repeticao}</text>
        <text value="${TreinosCad.carga}">${TreinosCad.carga}</text>
       <text value="${TreinosCad.diaSemana}">${TreinosCad.diaSemana}</text>

</div>
    </c:forEach>



  </table>
</html>