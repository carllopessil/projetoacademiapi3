<!DOCTYPE html>
<html>
<head>
    <title>Tela do Usuário</title>
    <style>
        .usuario {
            display: inline-block;
            cursor: pointer;
            position: relative;
            left: 90%;
        }

        .usuario-popup {
            display: none;
            position: absolute;
            top: 20px;
            right: 5;
            left: 100;
            padding: 10px;
            background-color: #B22222; //
            border: 1px solid transparent;
             font-family: Arial Bold;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
        }

        .usuario:hover .usuario-popup {
            display: block;
        }

        .usuario-popup a {
            display: block;
            margin-bottom: 5px;
            color: white;
            text-decoration: none;

        }.btn-primary{
        background-color: #B22222;
          padding: 0;
            margin: 0;
                        border: 1px solid transparent;


        }
       .button-list li a {
       display: block;
       padding: 10px;
       text-decoration: none;
       color: #000;
       background-color: transparent;
       border: none;
       cursor: pointer;
       }
    </style>
</head>
<body>
     <form action="/logout" method="Get">

     <button type="submit" >Logout</button>

                 </form>
</body>
</html>