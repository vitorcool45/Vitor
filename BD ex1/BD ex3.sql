create database db_escola;

USE db_escola;

create table tb_alunes(
id bigint auto_increment,
nome varchar (255) not null,
idade int,
periodo varchar (10),
turma varchar (20),
media decimal (4,2),
primary key (id) );

INSERT INTO tb_alunes(nome, idade, periodo, turma, media) VALUES
("Alexandre", 16, "tarde", "1 TURMA A", 7.0),
("Marcos", 15, "manha", "1 TURMA C", 8.5),
("Carolina!", 17, "noite", "3 TURMA B", 9.0),
("Mariana", 16, "noite", "3 TURMA B", 8.0),
("Hermione", 15, "manha", "2 TURMA A", 10.0),
("Ronald", 16, "manha", "2 TURMA A", 5.5),
("Harry", 15, "manha", "2 TURMA A", 8.0),
("Draco", 17, "noite", "3 TURMA C", 7.5);

SELECT * FROM tb_alunes WHERE media > 7;

SELECT * FROM tb_alunes WHERE media < 7;

UPDATE tb_alunes SET nome = Claudio WHERE id = 4;








