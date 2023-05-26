<!DOCTYPE html>

<html>
<head>

    <link href="css/styles-cadastroCliente.css" rel="stylesheet" type="text/css"/>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700;900&display=swap" rel="stylesheet">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <title>Atualizar Conta</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>


<div class="container">
    <div class="header">
        <h2>Atualizar Conta<span class="badge badge-secondary"></span></h2>
    </div>
    <form action="atualiza" method="post" id="form" class="form">
        <div class="form-control">
            <label for="name">Nome de usuário</label>
            <input
                    required="required"
                    name="name"
                    type="text"
                    id="name"
                    placeholder="Digite seu novo nome de usuário"
            />
            <small>Mensagem de erro</small>
        </div>

            <div class="form-control">
            <label for="sobrenome">Email</label>

            <input
                    required="required"
                    name="sobrenome"
                    type="text"
                    id="sobrenome"
                    placeholder="sobrenome"
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
                    <label for="senha">senha</label>

                    <input
                            required="required"
                            name="senha"
                            type="password"
                            id="senha"
                            placeholder="Digite sua senha"
                    />
                    <small>Mensagem de erro</small>
                </div>



        <button type="submit">Atualizar</button>
    </form>

</div>
<div var= "nome" items = "Sexo">
                <h1></h1>
                <h2>aaaaaaaaaa${nome}aaaaaaaaa</h2>
</div>

</body>

</html>
<script src="\js\scripCadastro.js"></script>