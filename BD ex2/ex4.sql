CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);


CREATE TABLE tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal(6,2) not null,
qtproduto int not null,
dtvalidade date,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

INSERT INTO tb_categoria (descricao, ativo) VALUES
("Bovino",true),
("Suino",true),
("Aves",true);

INSERT INTO tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) VALUES
("Picanha",20.00,30, "2021-11-08", 1),
("coxa de frango",20.00,30, "2021-11-07", 3),
("Bacon",30.00,30, "2021-11-09", 1),
("hamburguer",60.00,30, "2021-09-07", 5),
("Cupim",20.00,30, "2021-11-10", 1),
("Peito de frango",25.00,30, "2021-11-09", 3);

SELECT * FROM tb_produtos WHERE preco > 50.00;

SELECT * FROM tb_produtos WHERE preco BETWEEN 3.00 AND 60.00;

SELECT * FROM tb_produtos WHERE nome LIKE "%c%";

SELECT *
 FROM tb_produtos INNER JOIN tb_categoria 
 on tb_categoria.id = tb_produtos.categoria_id;
 
SELECT *
FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.categoria_id
WHERE tb_categoria.id = 1;
