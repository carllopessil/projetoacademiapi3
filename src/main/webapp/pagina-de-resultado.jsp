<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <title>Página de Resultado</title>
    <script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <%@ page contentType="text/html; charset=UTF-8" %>
    <style>
        body {
            background: linear-gradient(rgba(17, 17, 17, 0.8), rgba(20, 20, 20, 1)), url('https://www.webrun.com.br/wp-content/uploads/2017/06/AdobeStock_288854123-768x512.jpeg');
            background-position: center center;
            background-size: cover;
            background-position-y: 0px;
            background-repeat: no-repeat;
            color: white;
            font-family: Arial, sans-serif;
        }

        h1 {
            text-align: center;
            font-size: 2rem;
            font-weight: bold;
            padding: 1rem 0;
            color: red;
            position: fixed;
            top: 0;
            left: 50%;
            transform: translate(-50%, 0);
        }
        .testeTex{
         text-align: center;
                    font-size: 2rem;
                    font-weight: bold;
                    color: red;
                                                margin-top:-2rem;
        }

        main {
            text-align: center;
            width: 100%;
            display: flex;
            color: white;
        }

        .result-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            max-width: 800px;
            margin: 0 auto;
            margin-top: 0rem;
            padding: 1rem;
            background-color: rgba(0, 0, 0, 2);
            border-radius: 10px;
        }
        button {
                            background-color: blue;
                            border: none;
                            border-radius: 5px;
                            color: #FFF;
                            cursor: pointer;
                            font-weight: bold;
                            padding: 0.5rem 1rem;
                            margin-left: 28%;
                            margin-top:2rem;
                            position: relative;
                            margin-bottom: 1px;
                        }

        .result-item {
            background-color: #000;
            border-radius: 5px;
            padding: 1rem;
            margin-bottom: 1rem;
            width: 100%;
        }

        .result-item p {
                    color: blue;
                    font-size:25px;
                    font-weight: bold;
        }

        .no-results {
            font-size: 1.2rem;
            font-weight: bold;
        }

    </style>
</head>

<body>

 <form action="/TelaInicialLogada" method="post">

        <button type="submit">Voltar</button>
            <c:set var="diaDaSemana" value="${resultados[0].diaSemana}" />
            <p class="testeTex">${diaDaSemana}</p>

</form>
    <main>


        <div class="result-container">
            <c:forEach var="exercicio" items="${resultados}">
                <div class="result-item">
                    <p>${exercicio.carga}x ${exercicio.exercicio}</p>
                    <p>${exercicio.repeticao} repetições</p>

                </div>
            </c:forEach>
            <c:if test="${empty resultados}">
                <p class="no-results">Nenhum resultado encontrado.</p>
            </c:if>
        </div>
    </main>
</body>

</html>