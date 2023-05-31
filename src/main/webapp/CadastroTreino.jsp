<html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
    <link href="css/styles-CadastroTreinos.css" rel="stylesheet" type="text/css"/>
    <title>Page Academia</title>
</head>




<header>
    <div class="menu-content">
        <img src="Imagem/logo.png"> <h1 class="logo"> GYM-CENTER</h1>
        <nav class="list-itens">
                    <li> <a href="#" onclick="event.preventDefault(); document.getElementById('formTelaInicial').submit();">Tela inicial</a>
                        </li>
                        <form id="formTelaInicial" action="/TelaInicialLogada" method="post"></form>
            <li><form action="/buscatreinos123" method="get"><button class="btn-primary" type="submit">DELETAR TREINOS</button></form></li>

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



<div>
    <form class="form" style="text-align: center" action="/create-treino" method="post">
        <h1>CADASTRE NOVO TREINO:</h1>
        <label>Escolha o exercicio:</label>
        <select class="custom-select" name="exercicio" id="exercicio">
            <c:forEach var="car" items="${cars}">
                <option  value="${car.exercicio}">${car.exercicio}</option>
            </c:forEach>
        </select>

        <label>Escolha a quantidade de repeticao :</label>
        <select class="custom-select" name="repeticao" id="repeticao" >
            <c:forEach var="car" items="${cars}">
                <option value="${car.repeticao}">${car.repeticao}</option>
            </c:forEach>
        </select>

        <label>Escolha a quantidade de series:</label>
        <select class="custom-select" name="carga" id="carga" >
            <c:forEach var="car" items="${cars}">
                <option value="${car.carga}">${car.carga}</option>
            </c:forEach>
        </select>
         <label>Escolha o dia da semana:</label>
           <select class="custom-select" name="diaSemana" id="diaSemana" >
             <c:forEach var="car" items="${cars}">
               <option value="${car.diaSemana}">${car.diaSemana}</option>
                 </c:forEach>

                </select>
                <br><br>
                    <button class="btn-primary" type="submit" value="Submit">Register</button>
</form>

    <div class="second-text">
    <h1>O corpo alcanca o que a mente acredita</h1>
</div>

</div>

</body>
</html>