<!DOCTYPE html>
<html lang="en">

<head>
<script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
<link href="css/styles-CadastroTreinos.css" rel="stylesheet" type="text/css"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  <meta charset="UTF-8">

  <header>
      <div class="menu-content">
          <img src="Imagem/teste.png"> <h1 class="logo"> GYM-CENTER</h1>
          <nav class="list-itens">
                      <li> <a href="#" onclick="event.preventDefault(); document.getElementById('formTelaInicial').submit();">Tela inicial</a>
                          </li>
                          <form id="formTelaInicial" action="/TelaInicialLogada" method="post"></form>
          <li><form action="/create-treino" method="post"><button class="btn-primary" type="submit">CADASTRAR TREINO</button></form></li>

        </nav>
          <nav class="dropdown hover">
                  <a class="primeiro-item"> ${nome}</a>
                  <img src="Imagem/usuario.png" >
                  <img src="Imagem/peso.png" >
                  <ul>
                    <li><form id="formAtualizaCadastro" action="/atualizaCadastroUsuario" method="post"></form></li>
                 <li><a href="teste" onclick="event.preventDefault(); document.getElementById('formAtualizaCadastro').submit();" title="Html5">Atualizar Cadastro</a>                             </li>
                 <li><a href="/logout" title="Css3">Logout</a></li>

                </ul>
                </nav>



  </div>

  </header>

  <body>
<div class="h1">
<h1>TREINOS DOS DIAS</h1>
</div>
  <table id="tabela">
  <thead>
  		<tr><th>Dia da semana</th>
  				<th>Exercicio</th>
  				<th>Repeticao</th>
  				<th>Carga</th>
  				<th>Apagar</th>

  			</tr>
  		</thead>
  		<tbody>

<c:forEach var="TreinosCad" items="${TreinosCad}">

<tr>       <td><text value="${TreinosCad.diaSemana}">${TreinosCad.diaSemana}</text></td>
        <td><text value="${TreinosCad.exercicio}">${TreinosCad.exercicio}</text></td>
       <td><text value="${TreinosCad.repeticao}">${TreinosCad.repeticao}</text></td>
       <td><text value="${TreinosCad.carga}">${TreinosCad.carga}</text></td>
<td>
                    <form action="/deleteTreino" method="post">
                    <input type="hidden" id="id" name="id" value="${TreinosCad.id}">
                    <button class= "btn-primary" type="submit">Delete</button>
                    </form>
                    </td>
                    </tr>
                    </c:forEach>
        </tbody>
</table>

<div class="frases">
<h1>Gerencie seus treinos a qualquer momento</h1>
</div>
  </body>
</html>