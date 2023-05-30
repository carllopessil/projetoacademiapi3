<!DOCTYPE html>
<html lang="pt-BR">
<head>

    <script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
    <meta charset="UTF-8">
        <%@ page contentType="text/html; charset=UTF-8" %>
          <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GYM-CENTER</title>
    <style>
        body {
                    background-color: #3D3D3D;
                    font-family: Arial, sans-serif;
                    margin: 0;
                }

                header {
                    background-color: #090E1D;
                    display: flex;
                    justify-content: space-between;
                    padding: 1rem 2rem;
                }

                header h1 {
                    color: red;
                    font-weight: bold;
                    margin: 0;
                }

                header span {
                    color: red;
                    font-weight: bold;
                    font-size: 20px;
                    margin-top: 16px;
                }

                .container {
                    display: flex;
                    flex-wrap: wrap;
                    justify-content: space-between;
                    margin: 2rem;
                    display: inline-block;
                }

                .semana {
                    background-color: #000;
                    border-radius: 10px;
                    color: #FFF;
                    padding: 1rem;
                    width: calc(22% - 2rem);
                    height: 320px;
                    position: relative;
                    display: flex;
                    flex-direction: column;
                    justify-content: space-between;
                    margin: 1rem;
                }

                .semana h2 {
                    text-align: center;
                    color: red;
                    font-size: 20px;
                    font-weight: bold;
                    margin-top: 4px;
                }

                .semana p {
                    color: blue;
                    font-size:25px;
                    font-weight: bold;
                    margin-left: 10px;
                    margin-top: 10px;
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
                    position: relative;
                    margin-bottom: 1px;
                }

                .teste {
                    display: flex;
                    flex-wrap: wrap;
                    align-items: flex-start;
                    margin-left: 5%;
                }

                .cadas {
                    margin-left: 44%
                }

                .ccc {
                    height: 30px;
                }
    </style>
</head>
<body>
<header Var="nome" items="nome">
    <h1>GYM-CENTER</h1>
    <h1>${nome}</h1>
</header>
<header class="ccc">
<div>
<form action="/atualizaCadastroUsuario" method="post">
<button type="submit" name="enviar">atualizar cadastro<//button>
</form>
</div>

<form  class="cadas" action="/create-treino" method="post">
    <button type="submit">CADASTRAR TREINO</button>
</form>
</header>
<div class="teste">

    <div class="semana">
        <h2>SEGUNDA</h2>
        <c:forEach var="treinos" items="${resultadosSeg}">
        <p>${treinos.carga}x     ${treinos.exercicio}</p>
        </c:forEach>
            <c:if test="${empty resultadosSeg}">
                <p>Nenhum resultado encontrado.</p>
            </c:if>

       <form action="MeuServlet" method="post">
            <button type="submit" name="dia" value="segunda">Treino Completo</button>
       </form>
    </div>
    <div class="semana">
        <h2>TERÇA</h2>
         <c:forEach var="treinos" items="${resultadosTer}">
                <p>${treinos.carga}x     ${treinos.exercicio}</p>
                </c:forEach>
                <c:if test="${empty resultadosSeg}">
                                <p>Nenhum resultado encontrado.</p>
                            </c:if>
            <form action="MeuServlet" method="post">
                <button type="submit" name="dia" value="terca">Treino Completo</button>
        </form>
    </div>

    <div class="semana">
        <h2>QUARTA</h2>
         <c:forEach var="treinos" items="${resultadosQua}">
                <p>${treinos.carga}x     ${treinos.exercicio}</p>
                </c:forEach>
                <c:if test="${empty resultadosSeg}">
                                <p>Nenhum resultado encontrado.</p>
                            </c:if>
       <form action="MeuServlet" method="post">
                       <button type="submit" name="dia" value="quarta">Treino Completo</button>
               </form>
    </div>


    <div class="semana">
        <h2>QUINTA</h2>
        <c:forEach var="treinos" items="${resultadosQui}">
               <p>${treinos.carga}x     ${treinos.exercicio}</p>
               </c:forEach>
               <c:if test="${empty resultadosSeg}">
                               <p>Nenhum resultado encontrado.</p>
                           </c:if>
       <form action="MeuServlet" method="post">
                       <button type="submit" name="dia" value="quinta">Treino Completo</button>
               </form>
    </div>

</div>
<div class="teste">

    <div class="semana">
        <h2>SEXTA</h2>
         <c:forEach var="treinos" items="${resultadosSex}">
                <p>${treinos.carga}x ${treinos.exercicio}</p>
                </c:forEach>
                <c:if test="${empty resultadosSeg}">
                                <p>Nenhum resultado encontrado.</p>
                            </c:if>
       <form action="MeuServlet" method="post">
                       <button type="submit" name="dia" value="sexta">Treino Completo</button>
               </form>
    </div>

    <div class="semana">
        <h2>SABADO</h2>
         <c:forEach var="treinos" items="${resultadosSab}">
                <p>${treinos.carga}x ${treinos.exercicio}</p>
                </c:forEach>
                <c:if test="${empty resultadosSeg}">
                                <p>Nenhum resultado encontrado.</p>
                            </c:if>
       <form action="MeuServlet" method="post">
                       <button type="submit" name="dia" value="sabado">Treino Completo</button>
               </form>
    </div>

    <div class="semana">
        <h2>DOMINGO</h2>
         <c:forEach var="treinos" items="${resultadosDom}">
                <p>${treinos.carga}x ${treinos.exercicio}</p>
                </c:forEach>
                <c:if test="${empty resultadosSeg}">
                                <p>Nenhum resultado encontrado.</p>
                            </c:if>
       <form action="MeuServlet" method="post">
                       <button type="submit" name="dia" value="domingo">Treino Completo</button>
               </form>
    </div>

     <div class="semana">
            <h2>MES</h2>
            <p>3X Peck-Deck</p>
            <p>3X Remada</p>
            <p>4X Desenvolvimento</p>
           <form action="MeuServlet" method="post">
                           <button type="submit" name="dia" value="domingo">Treino Completo</button>
                   </form>
        </div>
</div>
</body>



</html>