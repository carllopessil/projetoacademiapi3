# projetoacademiapi3



Para Iniciar o projeto, precisamos ter ativo confirgurado após a ativação do TomCatRun:

1° abrir no navegador a pagina: http://localhost:8080/console
Executar o login com as seguintes informações:
User Name: sa
Password: sd

2° na pagina que abrir, execute na caixa em branco, insira o seguinte texto:
CREATE TABLE GYMUSER(ID INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(255), SEXO VARCHAR(255), DATEBIRTH VARCHAR(255), EMAIL VARCHAR(255), CPF VARCHAR(255), SENHA VARCHAR(255))

clique em run para executar e concluir essa etapa.

3° Limpe a caixa onde inseriu o texto anterior, e insira o seguinte comando:
CREATE TABLE TREINOSCADASTRO(
ID INT AUTO_INCREMENT,
EXERCICIO VARCHAR(100) NOT NULL,
REPETICAO VARCHAR(100) NOT NULL,
CARGA VARCHAR(100) NOT NULL,
PRIMARY KEY(ID));

clique em run para executar e concluir essa etapa.

4° Limpe a caixa onde inseriu o texto anterior, e insira o seguinte comando:
CREATE TABLE TREINO(
ID INT AUTO_INCREMENT,
EXERCICIO VARCHAR(100) NOT NULL,
REPETICAO VARCHAR(100) NOT NULL,
CARGA VARCHAR(100) NOT NULL,
PRIMARY KEY(ID));

clique em run para executar e concluir essa etapa.

5° Limpe a caixa onde inseriu o texto anterior, e insira o seguinte comando:
INSERT INTO TREINO (EXERCICIO, REPETICAO, CARGA) VALUES ('Agachamento', 5, 10),('Esteira', 10, 20),('Leg-Press', 10, 20);

clique em run para executar e concluir essa etapa.
(essa etapa 5° ela está sendo feita dessa forma, pois temos uma tela que entrara em desenvolvimento para criar e inserir no banco de dados exercicios posiveis.);

6° agora acesse e você vera tela de cadastro: 
http://localhost:8080/senac
preencha os campos para criar o seu cadastro.

7° acesse para consultar a criação de seu cadastro:
http://localhost:8080/console 
na caixa em branco insira o comando:
SELECT * FROM GYMUSER 
agora você conseguiu visualizar todos e inclusive o seu cadastro inserido no banco de dados do sistema.

8° Acesse para ver a tela que será para cadastrar treinos na rotina do usuario: (Tela em desenvolvimento, ele busca no banco os treinos dispoiveis, e traz para o usuario selecionar.)
http://localhost:8080/CadastroTreino


9° acesse para ver a tela inicial sem login executado.
http://localhost:8080/TelaPrincipal.html
essa tela está com a parte front end em processo de desenvolvimento e com quase 80% do objetivo concluido, após isso, será feito o trabalho de validação em java e conexão com o banco para a area de login.

Observações/status de desenvolvimento:

1° TelaInicialLoged está em fase prematura de desenvolvimento, foi feito apenas uma base .html e arquivos .css para testes, além de criar as classes de validação .java (Servlet, DAO, Model) dedicadas a está tela, também de forma embreonaria para testes.

2° TelaPrincipal está em fase de desenvolvimento avançada no front end, e tera como foco a partir do dia 29/04 desenvolver a parte estrutural java e conexão com o Banco de dados.

3° CadastroCliente está com toda a estrutura frontEnd, Validação .java e conexão com o banco completa.

4° CadastroTreino está com o desenvolvimento frontEnd em aproximadamente 60% com as classes .css ativas, e com apenas detalhes visuais para serem modificados, e foi feita algumas partes de conexão com o banco e validação no .java.



as telas não foram feitos os links para chamada de outras tela por hora. apenas na fase final será feito isso para não amarrar os testes de desenvolvimento.




[PROJETO INTEGRADOR III - Turma B]

projeto integrador do 3° semestre do curso analise e desenvolvimento de sistemas no senac


![image](https://user-images.githubusercontent.com/104398219/225457870-35c5fde0-a9a0-4688-9ae8-c15ffd43ae8d.png)

![image](https://user-images.githubusercontent.com/104398104/225458719-cc1c571e-b75a-423f-9a25-29027cccb9f6.png)

![telaCadastro](https://user-images.githubusercontent.com/104325185/225460401-569ea19e-49da-45a8-826c-b6942b98e2ea.png)

![cadastrarTreino](https://user-images.githubusercontent.com/104325185/225461349-86ee9d46-f8b9-471c-93ad-3578ba13295c.png)

![MER](https://user-images.githubusercontent.com/92448981/225489024-8105245b-adc1-4c81-b638-3d4ae2230e60.png)
