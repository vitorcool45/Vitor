CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
id bigint auto_increment,
tamanho varchar (255),
massa varchar (255),
embalagem varchar (255),
primary key (id) );

CREATE TABLE tb_pizza(
id bigint auto_increment,
saboreSal varchar (255),
saborDoce varchar (255),
borda varchar (255),
cebola varchar (255),
valor decimal (6,2),
id_categoria bigint,
primary key (id), foreign key(id_categoria) REFERENCES tb_categoria (id));

INSERT INTO tb_categoria(tamanho, massa, embalagem) VALUES
("Grande", "grossa", "reciclavel"),
("Grande", "fina", "reciclavel"),
("Tradicional", "grossa", "reciclavel"),
("Tradicional", "fina", "reciclavel"),
("Broto", "fina", "reciclavel");

INSERT INTO tb_pizza(saboreSal, saborDoce, borda, cebola, valor, id_categoria) VALUES
("Franco com catupiry", null, null, null, 65.00, 1),
("Calabresa", null, "recheada com cheddar", "com cebola", 55.00, 2),
(null, "Nutella com morango", null, null, 70.00, 3),
("Meia calabresa", "meia morango com nutella", null, "cebola na metade calabresa", 80.00, 4);

SELECT * FROM tb_pizza WHERE valor > 45.00;

SELECT * FROM tb_pizza WHERE valor BETWEEN 29.00 AND 60.00;

SELECT * FROM tb_pizza WHERE saboreSal LIKE "%c%";

 SELECT *
 FROM tb_pizza INNER JOIN tb_categoria 
 on tb_categoria.id = tb_pizza.id_categoria;
 
SELECT *
FROM tb_pizza INNER JOIN tb_categoria
ON tb_categoria.id = tb_pizza.id_categoria
WHERE tb_categoria.id = 3;



