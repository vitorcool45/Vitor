create database db_generation;

USE db_generation;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar (255) not null,
idade int,
cargo varchar (30) not null,
setor varchar (30) not null,
salario decimal (7,2),
primary key (id) );


INSERT INTO tb_funcionarios(nome, idade, cargo, setor, salario) VALUES
("Vitor", 25, "Dev Java Junior", "IA", 5000.00),
("Kaique", 20, "Gerente Geral", "Coordenacao", 7500.00),
("Vanessa", 21, "Aux enfermagem", "Saude", 1200.00),
("Morgana", 27, "Contadora", "Financeiro", 2000.00),
("Aurelio", 16, "Jovem Aprendiz", "Administrativo", 800.00);

SELECT * FROM tb_funcionarios WHERE salario <= 2000.00;

SELECT * FROM tb_funcionarios WHERE salario >= 2000.00;

UPDATE tb_funcionarios SET nome = Vinicius WHERE id = 1; 


