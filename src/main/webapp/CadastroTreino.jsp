<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
    <link href="css/styles-CadastroTreino.css" rel="stylesheet" type="text/css"/>
    <title>Page Academia</title>
</head>

<header>
    <div class="menu-content">
        <img src="Imagem/ff.png"> <h1 class="logo"> GYM-CENTER</h1>

            <nav class="list-itens">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="AlterarTreino.jsp">Todos os treinos</a></li>
                <li><a href="#">Sobre</a></li>
                <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                  <li><img src="Imagem/peso.png"></i></a></li>
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

        <label>Escolha a quantidade de carga:</label>
        <select class="custom-select" name="carga" id="carga" >
            <c:forEach var="car" items="${cars}">
                <option value="${car.carga}">${car.carga}</option>

            </c:forEach>
        </select>
                <label>Escolha a quantidade de carga:</label>
                <select class="custom-select" name="diaSemana" id="diaSemana" >
                    <c:forEach var="car" items="${cars}">
                        <option value="${car.diaSemana}">${car.diaSemana}</option>
                    </c:forEach>
                </select>
            <button class="btn btn-primary" type="submit" value="Submit">Register</button>

    </form>

    <div class="second-text">
    <h1>O corpo alcanca o que a mente acredita</h1>

    </div>



</div>
</body>
</html>