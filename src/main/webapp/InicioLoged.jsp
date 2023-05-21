<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
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
        }
        .semana {
            background-color: #000;
            border-radius: 10px;
            color: #FFF;
            margin-bottom: 1rem;
            padding: 1rem;
            width: 280px;
        }
        .semana h2 {
            color: red;
            font-size: 20px;
            font-weight: bold;
            margin-bottom: 8px;
        }
        .semana p {
            color: blue;
            font-size: 25px;
            font-weight: bold;
            margin: 0;
        }
        button {
            background-color: blue;
            border: none;
            border-radius: 5px;
            color: #FFF;
            cursor: pointer;
            font-weight: bold;
            padding: 0.5rem 1rem;
        }
    </style>
</head>
<body>
<header>
    <h1>GYM-CENTER</h1>
    <h1>CARLOS</h1>
</header>
<div class="container">
    <div class="semana">
        <h2>SEGUNDA</h2>
        <p>3X Peck-Deck</p>
        <p>3X Remada</p>
        <p>4X Desenvolvimento</p>
        <button>Treino Completo</button>
    </div>
    <!-- Add more semana divs as needed -->
</div>
<div class="container">
    <div class="semana">
        <h2>TERÇA</h2>
        <p>4X LEG PRESS</p>
        <p>3X ABDUTORA</p>
        <p>3X EXTENSORA</p>
        <button>Treino Completo</button>
    </div>
    <!-- Add more semana divs as needed -->
</div>
<div class="container">
    <div class="semana">
        <h2>QUARTA</h2>
        <p>3X Peck-Deck</p>
        <p>3X Remada</p>
        <p>4X Desenvolvimento</p>
        <button>Treino Completo</button>
    </div>
    <!-- Add more semana divs as needed -->
</div>


<h1>CPF do Usuário</h1>
<p>O CPF do usuário logado é: <%= session.getAttribute("cpf") %></p>

</body>


<form action="/create-treino" method="post">
    <button type="submit">IR PARA CADASTRAR TREINO</button>

</form>
</html>