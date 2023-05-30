<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Other/html.html to edit this template
-->
<html>
<head>
        <script src="\js\scripCadastro.js"></script>

    <link href="css/styles-cadastroCliente.css" rel="stylesheet" type="text/css"/>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700;900&display=swap" rel="stylesheet">
    <title>Cadastro Cliente</title>

    <style>
     .testeButton {
                                        background-color: red;
                                        border: none;
                                        border-radius: 5px;
                                        color: #FFF;
                                        cursor: pointer;
                                        font-weight: bold;
                                        padding: 0.5rem 1rem;
                                        margin-left: 38%;
                                        margin-bottom:0%;
                                        position: relative;

                                    }
    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="container">
<div class="header">
        <a href="TelaPrincipal.jsp"><button class="testeButton" type="submit">Inicio</button></a>
</div>
    <div class="header">
        <h2>Criar uma conta<span class="badge badge-secondary"></span></h2>
    </div>
    <form action="/senac" method="post" id="form" class="form">
        <div class="form-control">
            <label for="name">Nome</label>
            <input
                    required="required"
                    name="name"
                    type="text"
                    id="name"
                    placeholder="Digite seu nome"
            />
            <small>Mensagem de erro</small>
        </div>
        <div class="form-control">
            <label for="Sobrenome">sobrenome</label>

            <input
                    required="required"
                    name="sobrenome"
                    type="text"
                    id="sobrenome"
                    placeholder="Digite seu sobrenome"
            />
            <small>Mensagem de erro</small>
        </div>

        <div class="form-control">
            <div>
                <label for = "sexo">Sexo</label>
            </div>
            <select
                    name="sexo"
                    id=sexo
                    required="required">
                <option>selecione seu sexo</option>
                <option>masculino</option>
                <option>feminino</option>
                <option>prefiro não declarar</option>
            </select>
        </div>


        <div class="form-control">
            <label for="DateBirth">Data de Nascimento</label>

            <input  required="required"
                    name="DateBirth"
                    type="date"
                    id="DateBirth"
            />
            <small>Mensagem de erro</small>
        </div>



        <div class="form-control">
            <label for="email">Email</label>

            <input
                    required="required"
                    name="email"
                    type="text"
                    id="Email"
                    placeholder="Digite seu email"
            />
            <small>Mensagem de erro</small>
        </div>

        <div class="form-control">
            <label for="cpf">cpf</label>

            <input
                    required="required"
                    name="cpf"
                    type="text"
                    id="cpf"
                    placeholder="Digite seu cpf"
            />
            <small>Mensagem de erro</small>
        </div>



        <div class="form-control">
            <label for="Senha">Senha</label>
            <input
                    required="required"
                    name="senha"
                    type="password"
                    id="senha"
                    placeholder="Digite sua senha"
            />
            <small>Mensagem de erro</small>
        </div>

       <button type="submit">Register</button>
    </form>

</div>
</body>
</html>
