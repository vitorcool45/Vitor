CREATE DATABASE db_farmacia;

USE db_farmacia; 

CREATE TABLE tb_categoria(
id bigint auto_increment,
formato varchar (255),
tamanho varchar (255),
dosagem varchar (255),
primary key (id) );

CREATE TABLE tb_produtos(
id bigint auto_increment, 
embalagem varchar (255),
marca varchar (255),
indicacao varchar (255),
vitamina varchar (255),
valor decimal (6,2),
id_categoria bigint,
primary key (id), foreign key(id_categoria) REFERENCES tb_categoria (id) );

INSERT INTO tb_categoria(formato, tamanho, dosagem) VALUES
("Pomada", "media", "50mg"),
("Comprimido", "pequeno", "400mg"),
("Xarope", "grande", "100ml"),
("Pomada", "pequena", "10mg"),
("Comprimido", "medio", "750mg");

INSERT INTO tb_produtos(embalagem, marca, indicacao, vitamina, valor, id_categoria) VALUES
("Plastico", "Sanofi", "todos os publicos", "contem vitamina A e C", 7.00, 1),
("Papelao", "Eurofarma", "crianca", "nao contem vitaminas", 55.00, 3),
("Papelao", "EMS", "idoso", "vitamina de A a Z", 25.00, 2),
("Plastico", "Hypermarcas", "todos os publicos", "nao contem vitaminas", 80.00, 5);

SELECT * FROM tb_produtos WHERE valor > 50.00;

SELECT * FROM tb_produtos WHERE valor BETWEEN 3.00 AND 60.00;

SELECT * FROM tb_produtos WHERE marca LIKE "%b%";

 SELECT *
 FROM tb_produtos INNER JOIN tb_categoria 
 on tb_categoria.id = tb_produtos.id_categoria;
 
SELECT *
FROM tb_produtos INNER JOIN tb_categoria
ON tb_categoria.id = tb_produtos.id_categoria
WHERE tb_categoria.id = 2;




