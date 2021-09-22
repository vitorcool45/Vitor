CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
id bigint auto_increment,
tipo varchar (255),
modalidade varchar (255),
semestre varchar (255),
primary key (id) );

CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varbinary (255),
matricula int,
nChamada int,
nomeEscola varchar (255),
valor decimal (8,2),
id_categoria bigint,
primary key (id), foreign key(id_categoria) REFERENCES tb_categoria (id) );

INSERT INTO tb_categoria(tipo, modalidade, semestre) VALUES
("Eng Civil", "EAD", "10 semestres"),
("ADS", "semi presencial", "5 semestres"),
("Gestao comercial", "presencial", "4 semestres"),
("Medicina", "presencial", "10 semestres"),
("Comunicação", "EAD", "8 semestres");

INSERT INTO tb_produtos(nome, matricula, nChamada, nomeEscola, valor, id_categoria) VALUES
("Eduardo Menezes", 1234, 7, "UnicSul", 2500.00, 1), 
("Pedro Augusto", 4321, 27, "Uninove", 550.00, 2),
("Marcela Albuquerque", 2341, 32, "Anhembi Morumbi", 700.00, 3),
("Lucas Fonseca", 4125, 28, "PUC", 15000.00, 4);

SELECT * FROM tb_produtos WHERE valor > 50.00;

SELECT * FROM tb_produtos WHERE valor BETWEEN 3.00 AND 60.00;

SELECT * FROM tb_produtos WHERE nome LIKE "%j%";

 SELECT *
 FROM tb_produtos INNER JOIN tb_categoria 
 on tb_categoria.id = tb_produtos.id_categoria;
 
SELECT *
FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.id_categoria
WHERE tb_categoria.id = 1;
