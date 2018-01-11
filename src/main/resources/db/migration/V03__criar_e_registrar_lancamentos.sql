CREATE TABLE lancamento(
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
descricao VARCHAR(50) NOT NULL,
data_vencimento DATE NOT NULL,
data_pagamento DATE,
valor DECIMAL(10,2) NOT NULL,
observacao VARCHAR(100),
tipo_lancamento VARCHAR(20) NOT NULL,
codigo_categoria BIGINT(20) NOT NULL,
codigo_pessoa BIGINT(20) NOT NULL,
FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo),
FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO lancamento (descricao, data_vencimento, data_pagamento, valor, observacao, tipo_lancamento, codigo_categoria, codigo_pessoa)
values ("Top club", "2018-01-10","2018-01-10",6500.00,"pagamento efetuado","RECEITA",1, 1);
INSERT INTO lancamento (descricao, data_vencimento, data_pagamento, valor, observacao, tipo_lancamento, codigo_categoria, codigo_pessoa)
values ("Natação", "2018-01-11","2018-01-11",500.00,"pagamento efetuado","DESPESA",2, 2);
