INSERT INTO TB_CARGO (CAR_NOME, CAR_SALARIO, CAR_VERSAO) VALUES
	('Cargo 1', 1000, 0),
	('Cargo 2', 2000, 0),
	('Cargo 3', 3000, 0),
	('Cargo 4', 4000, 0),
	('Cargo 5', 5000, 0),
	('Cargo 6', 6000, 0),
	('Cargo 7', 7000, 0),
	('Cargo 8', 8000, 0),
	('Cargo 9', 9000, 0),
	('Cargo 10', 10000, 0);
	
INSERT INTO TB_CHEFE (CHE_NOME, CHE_VERSAO) VALUES
	('Chefe 1', 0),
	('Chefe 2', 0),
	('Chefe 3', 0);
	
INSERT INTO TB_TAREFA (TAR_DESCRICAO, TAR_VERSAO) VALUES
	('Tarefa 1', 0),
	('Tarefa 2', 0),
	('Tarefa 3', 0);
	
INSERT INTO TB_EMP (EMP_NOME, EMP_RUA, EMP_NUMERO, EMP_COMPLEMENTO, EMP_CEP, CAR_ID, CHE_ID, EMP_VERSAO) VALUES
	('Empregado 1', 'Rua 1', 1, 'Apto. 1', 89000001, 1, 1, 0),
	('Empregado 2', 'Rua 2', 2, 'Apto. 2', 89000002, 2, 1, 0),
	('Empregado 3', 'Rua 3', 3, 'Apto. 3', 89000003, 3, 1, 0),
	('Empregado 4', 'Rua 4', 4, 'Apto. 4', 89000004, 4, 2, 0),
	('Empregado 5', 'Rua 5', 5, 'Apto. 5', 89000005, 5, 3, 0);
	
INSERT INTO TB_EMP_TAR (EMP_ID, TAR_ID) VALUES
	(1, 1),
	(1, 2),
	(2, 2),
	(2, 3),
	(3, 1),
	(3, 3);