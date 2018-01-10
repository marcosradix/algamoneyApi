CREATE TABLE pessoa(
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
ativo TINYINT(1) NOT NULL,
logradouro VARCHAR(50),
numero VARCHAR(10),
complemento VARCHAR(30),
bairro VARCHAR(20),
cep VARCHAR(20),
cidade VARCHAR(20),
estado VARCHAR(20)

)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
values ("Marcos", true, "rua dos coelhos", "115", "B","Maraponga","60710705","Fortaleza","Ceará");