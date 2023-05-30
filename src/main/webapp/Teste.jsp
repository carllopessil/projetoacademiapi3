<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>30 Slots</title>
    <style>
        .slot {
            width: 30px;
            height: 30px;
            border: 1px solid black;
            display: inline-block;
        }
    </style>
</head>
<body>
    <div id="container">
        <!-- Os slots serão preenchidos pelo JavaScript -->
    </div>

    <script>
        const container = document.getElementById('container');

        // Crie 30 elementos .slot e adicione-os ao container
        for (let i = 0; i < 30; i++) {
            const slot = document.createElement('div');
            slot.classList.add('slot');
            container.appendChild(slot);
        }

        fetch('/HistoryServlet')
            .then(response => response.json())
            .then(data => {
                const slots = document.querySelectorAll('.slot');
                data.forEach((status, index) => {
                    slots[index].style.backgroundColor = status ? 'green' : 'red';
                });
            });
    </script>
</body>
</html>