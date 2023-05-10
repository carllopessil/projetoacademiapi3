<!DOCTYPE html>
<html lang="en">
<head>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


  <meta charset="UTF-8">
  <table>
    <tr>
      <th>ID</th>
      <th>exercicio</th>
    </tr>
    <c:forEach var="car" items="${cars}">
      <tr>
        <td>${car.id}</td>
        <td>${car.exercicio}</td>

        <form action="/delete-treino" method="post">
                            <input type="hidden" id="id" name="id" value="${car.id}">
                            <button type="submit">Delete</button>
                        </form>

      </tr>
    </c:forEach>
  </table>
</html>