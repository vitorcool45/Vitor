CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
id bigint auto_increment,
tipo varchar (255),
classificacao varchar (255),
primary key (id) );

CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varchar (255),
quantidade decimal (6,2),
peso varchar (255),
tamanho varchar (255),
valor decimal (6,2),
id_categoria bigint,
primary key (id), foreign key(id_categoria) REFERENCES tb_categoria (id) );

INSERT INTO tb_categoria(tipo, classificacao) VALUES
("natural", "auxiliar"),
("artificial", "auxiliar"),
("combinados", "revestimento"),
("natural", "hidraulica"),
("ferro", "fixacao");

INSERT INTO tb_produtos(nome, quantidade, peso, tamanho, valor, id_categoria) VALUES
("areia", 5, "100kg", "1.30m", 120.00, 1), 
("pedra", 400, "75kg", "1m", 55.00, 2),
("concreto", 3, "150kg", "2m", 200.00, 3),
("agua", 5, "20 litros", "1m", 50.00, 4);

SELECT * FROM tb_produtos WHERE valor > 50.00;

SELECT * FROM tb_produtos WHERE valor BETWEEN 3.00 AND 60.00;

SELECT * FROM tb_produtos WHERE nome LIKE "%c%";

 SELECT *
 FROM tb_produtos INNER JOIN tb_categoria 
 on tb_categoria.id = tb_produtos.id_categoria;
 
SELECT *
FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.id_categoria
WHERE tb_categoria.id = 4;


