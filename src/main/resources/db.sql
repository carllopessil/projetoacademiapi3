DROP TABLE IF EXISTS GYMUSER;
DROP TABLE IF EXISTS TREINO;
DROP TABLE IF EXISTS TREINOSCADASTRO;
DROP TABLE IF EXISTS history;



CREATE TABLE GYMUSER(ID INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(255), SOBRENOME VARCHAR(255), SEXO VARCHAR(255), DATEBIRTH VARCHAR(255), EMAIL VARCHAR(255), CPF VARCHAR(255), SENHA VARCHAR(255));

CREATE TABLE TREINO(ID INT AUTO_INCREMENT,
EXERCICIO VARCHAR(100) NOT NULL,
REPETICAO VARCHAR(100) NOT NULL,
CARGA VARCHAR(100) NOT NULL,
DIASEMANA VARCHAR(100) NULL,
PRIMARY KEY(ID));


CREATE TABLE TREINOSCADASTRO(
ID INT AUTO_INCREMENT,
EXERCICIO VARCHAR(100) NOT NULL,
REPETICAO VARCHAR(100) NOT NULL,
CARGA VARCHAR(100) NOT NULL,
DIASEMANA VARCHAR(100) NOT NULL,
CPF VARCHAR(11) NOT NULL,
PRIMARY KEY(ID));


CREATE TABLE history (
  id INT AUTO_INCREMENT PRIMARY KEY,
  date DATE NOT NULL,
  status BOOLEAN NOT NULL,
  CPF VARCHAR(255) NOT NULL
);



INSERT INTO
TREINO
(EXERCICIO, REPETICAO, CARGA, DIASEMANA)
VALUES
('Flexão de braços', 1, 1, 'Segunda-Feira'),
('Elevação frontal', 2, 2, 'Terça-Feira'),
('Elevação lateral', 3, 3, 'Quarta-Feira'),
('Agachamento', 4, 4, 'Quinta-Feira'),
('Flexora deitada', 5, 5, 'Sexta-Feira'),
('Flexora sentada', 6, 6, 'Sabado'),
('Cadeira flexora', 7, 7, 'Domingo'),
('Flexão de ombros no cross', 8, 8, null),
('Remada com corda na polia alta', 9, 9, null),
('Remada aberta no TRX', 10, 10, null),
('Peitoral', 11, 11, null),
('Agachamento frontal', 12, 12, null),
('Deltoide', 13, 13, null),
('Abdominais', 14, 14, null),
('Prancha frontal', 15, 15, null),
('Agachamento livre', 16, 16, null),
('Crucifixo', 17, 17, null),
('Elevação lateral', 18, 18, null),
('Supino inclinado', 19, 19, null),
('Quadrícep', 20, 20, null);




