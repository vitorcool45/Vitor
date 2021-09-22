CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
id bigint auto_increment,
classe varchar (20),
arma varchar (20),
elemento varchar (20),
primary key(id) );

CREATE TABLE tb_personagem(
id bigint auto_increment,
nome varchar (25),
idade int,
raca varchar (25),
ataque int,
defesa int,
id_classe bigint,
primary key (id), foreign key(id_classe) references tb_classe (id));

INSERT INTO tb_classe (classe, arma, elemento) VALUES
("Mago", "Cajado", "Fogo"),
("Necromante", "Cetro", "Trevas"),
("Espadachim", "Espada", "Agua"),
("Arqueiro", "Arco e flecha", "Vento"),
("Barbaro", "Clave", "Terra");


INSERT INTO tb_personagem (nome, idade, raca, ataque, defesa, id_classe) VALUES
 ("Dumbledore", 122, "elfo", 3200, 1500, 1),
 ("Voldemort", 87, "anao", 2900, 2000, 2),
 ("Percy", 17, "humano", 1900, 1200, 3),
 ("Eragon", 25, "meio elfo", 3000, 2000, 4),
 ("Todou", 17, "gigante", 4000, 2500, 5),
 ("Will", 32, "demonio", 3100, 1000, 4);
 
 SELECT * FROM tb_personagem WHERE ataque > 2000;
 
 SELECT * FROM tb_personagem WHERE defesa BETWEEN 1000 AND 2000;
 
 SELECT * FROM tb_personagem WHERE nome LIKE "%c%";
 
 SELECT *
 FROM tb_personagem INNER JOIN tb_classe 
 on tb_classe.id = tb_personagem.id_classe;
 
SELECT *
FROM tb_personagem INNER JOIN tb_classe 
ON tb_classe.id = tb_personagem.id_classe
WHERE tb_classe.id = 4;
 