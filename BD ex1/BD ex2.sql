create database db_produtos;

USE db_produtos;

create table tb_cosmeticos(
id bigint auto_increment,
nome varchar (30) not null,
cor varchar (10),
material varchar (15),
preco decimal (6,2),
qualidade varchar (10),
primary key (id) );

INSERT INTO tb_cosmeticos(nome, cor, material, preco, qualidade) VALUES
("Esmalte", "bordo", "vidro", 50.00, "duvidosa"),
("Shampoo", "branco", "plastico", 30.00, "boa"),
("Condicionador", "verde", "plastico", 35.00, "muito boa"),
("Sabonete", "amarelo", "plastico", 4.50, "excelente"),
("Creme dental", "azul", "plastico", 2.75, "boa"),
("Escova de cabelo a laser", "preto", "metal", 749.99, "excelente"),
("Enxaguante bocal", "amarelo", "vidro", 8.00, "boa"),
("Fio dental", "branco", "plastico", 3.45, "muito boa");

SELECT * FROM tb_cosmeticos WHERE preco > 500.00;

SELECT * FROM tb_cosmeticos WHERE preco < 500.00;

UPDATE tb_cosmeticos SET material = vidro WHERE id = 4;




