<html>
<head>
    <link rel="stylesheet" href="css/styles-TelaPrincipal.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700;900&display=swap" rel="stylesheet">


    <title>Tela Principal</title>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body bgcolor="#23282B">
<header>
    <h1><img src="Imagem/">GYM-Center</h1>
    <span><a href="#openModal"><h2>Login</h2></a></span>

    <div id="openModal" class="modalDialog">

        <div>
            <a class="close" href="/TelaPrincipal.jsp">&times;</a>
            <form action="/login" method="post" class="form-container">
<h3>${requestScope.message}</h3>
            <h3>Login</h3>


                    <label for="username"><b>Email</b></label>
                    <input type="text" placeholder="Entre com seu Email" name="username" required>

                    <label for="password"><b>Password</b></label>
                    <input type="password" placeholder="Entre com sua password" name="password" required>

                <button type="submit" class="btn">Login</button>

            </form>
            <a href="CadastroCliente.jsp"><button class="btnCAD" >Registra-se</button></a>

        </div>
    </div>
</header>

<section class="secao4" id="sobre">
    <div class="secao4-div">

        <div class="secao4-div-1">
            <div class="secao4-div-1-coluna">

                <img decoding="async" loading="lazy" src="Imagem/academia-app.png" width="100%" height="100">
                <h3>GYM CENTER</h3>
                <p>GYM CENTER é um aplicativo de academia abrangente e intuitivo projetado para fornecer todas as ferramentas necessárias para atingir suas metas de condicionamento físico de maneira conveniente e eficiente.</p>
            </div>
        </div>

        <div class="secao4-div-2">
            <div class="secao4-div-2-coluna">

                <img decoding="async" loading="lazy" src="Imagem/cadastro.png" width="100%" height="80">
                <h3>TREINOS E PROGRAMAS DE EXERCÍCIOS</h3>
                <p>Monte você mesmo sua rotina de treino de acordo com seus objetivos e disponibilidade. </p>
            </div>
        </div>

        <div class="secao4-div-3">
            <div class="secao4-div-3-coluna">

                <img decoding="async" loading="lazy" src="Imagem/treino.png" width="100%" height="80">
                <h3>SUAS SEMANAS DE TREINO</h3>
                <p> Aqui você pode visualizar seus treinos atribuídos para cada dia da semana, ajudando você a planejar melhor seus objetivos.</p>
            </div>
        </div><div class="secao4-div-3">
        <div class="secao4-div-3-coluna">

            <img decoding="async" loading="lazy" src="Imagem/academia%203.jpg" width="100%" height="80">
            <h3>PLANOS DE TREINO PERSONALIZADOS</h3>
            <p> Nossos planos de treinos são projetado para ajudar você a alcançar metas específicas, como perda de peso, ganho de massa muscular, aumento da resistência ou melhoria do condicionamento de forma segura e eficaz. </p>
        </div>
    </div>
        <div class="secao4-div-3">
            <div class="secao4-div-3-coluna">

                <img decoding="async" loading="lazy" src="Imagem/image.png" width="100%" height="80">
                <h3>REGISTROS E ACOMPANHAMENTOS</h3>
                <p> O registros e acompanhamentos do nosso app  faz você chegar nos seus objetivos e nas necessidades  de forma segura e equilibrada é mantendo  um registro detalhado do seu progresso.  </p>
            </div>
        </div>

        <div class="secao4-div-3">
            <div class="secao4-div-3-coluna">

                <img decoding="async" loading="lazy" src="Imagem/controle.png" width="100%" height="80">
                <h3>MONITORAMENTO DE PROGRESSO</h3>
                <p>Ao implementar o monitoramento de progresso em seu programa de treinamento, você pode registrar e rastrear uma variedade de informações para avaliar seu desenvolvimento ao longo do tempo. </p>
            </div>
        </div>

    </div>
</section>

</form>

</body>
</html>