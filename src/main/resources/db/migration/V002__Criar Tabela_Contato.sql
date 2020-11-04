CREATE TABLE contato (
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
codigo_pessoa BIGINT(20) NOT NULL,
nome VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL,
telefone VARCHAR(20) NOT NULL,
FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (1, 1, 'Marcos Henrique', 'marcos@marcos.com', '00 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (2, 2, 'Edivaldo', 'edi88@bol.com', '01 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (3, 3, 'Leonardo', 'leo@gmail.com', '02 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (4, 4, 'João Marcos', 'joãomarcos@gmail.com', '03 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (5, 5, 'João Vitor', 'jaovito@gmail.com', '04 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (6, 6, 'Tiago', 'tiago@gmail.com', '05 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (7, 7, 'Bidu', 'bidulandia@gmail.com', '06 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (8, 8, 'Ronan', 'ronanzenatti@gmail.com', '07 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (9, 9, 'Luis Fernando', 'luisfernando@gmail.com', '08 0000-0000');
insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (10, 10, 'Enciclopédia', 'wikipedia@gmail.com', '09 0000-0000');