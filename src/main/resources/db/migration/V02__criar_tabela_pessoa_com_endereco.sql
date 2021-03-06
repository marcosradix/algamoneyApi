CREATE TABLE pessoa(
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
ativo BOOLEAN NOT NULL,
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

INSERT INTO pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
values ("Severino", false, "rua teodoro de castro", "645", "casa","Granja Portugal","60545274","Fortaleza","Ceará");

INSERT INTO pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
values ("Ferreira", false, "rua das oiticicas", "40", null,"Granja Lisboa","60710705","Guagirú","São Paulo");
