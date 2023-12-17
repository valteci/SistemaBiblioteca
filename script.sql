CREATE TABLE autor (
	idAutor SERIAL PRIMARY KEY,
	nome TEXT
);

CREATE TABLE editora (
	idEditora SERIAL PRIMARY KEY,
	nome TEXT NOT NULL,
	localalizacao TEXT NULL 
);

CREATE TABLE areaDireito (
	idAreaDireito SERIAL PRIMARY KEY,
	nome TEXT NOT NULL
);

CREATE TABLE livro (
	isbn TEXT PRIMARY KEY,
	titulo TEXT NOT NULL,
	anoPublicacao DATE NOT NULL,
	edicao INTEGER NOT NULL,
	idEditora INTEGER NOT NULL,
	idAreaDireito INTEGER NOT NULL,
	estaAbsoleto BOOLEAN NOT NULL,
	FOREIGN KEY (idEditora) REFERENCES editora(idEditora),
	FOREIGN KEY (idAreaDireito) REFERENCES areaDireito(idAreaDireito)
);

CREATE TABLE colaborador (
	matricula TEXT PRIMARY KEY,
	email TEXT NOT NULL,
	nome TEXT NOT NULL,
	telefone TEXT NOT NULL,
	status VARCHAR(8) CHECK (status IN ('ativo', 'inativo')) NOT NULL,
	numeroOAB TEXT NULL
);

CREATE TABLE exemplar (
	idExemplar SERIAL PRIMARY KEY,
	preco NUMERIC(10, 2) NOT NULL,
	status VARCHAR(8) CHECK (status IN ('ativo', 'inativo')) NOT NULL,
	dataAquisicao DATE NOT NULL,
	isbnLivro TEXT NOT NULL,
	matriculaColaborador_reserva TEXT NULL,
	dataReserva DATE NULL,
	diasReserva INTEGER NULL,
	FOREIGN KEY(isbnLivro) REFERENCES livro(isbn),
	FOREIGN KEY(matriculaColaborador_reserva) REFERENCES colaborador(matricula)
);

CREATE TABLE livros_excluidos(
	idExemplar INTEGER PRIMARY KEY,
	motivo TEXT NOT NULL,
	FOREIGN KEY(idExemplar) REFERENCES exemplar(idExemplar)
);


CREATE TABLE emprestimo (
	idExemplar INTEGER NOT NULL,
	matriculaColaborador TEXT NOT NULL,
	multa NUMERIC(10, 2) NOT NULL,
	dataDevolucao DATE NULL,
	dataEmprestimo DATE NOT NULL,
	PRIMARY KEY(idExemplar, matriculaColaborador), 
	FOREIGN KEY(idExemplar) REFERENCES exemplar(idExemplar),
	FOREIGN KEY(matriculaColaborador) REFERENCES colaborador(matricula)
);

CREATE TABLE autor_livros(
	idAutor INTEGER NOT NULL,
	isbn TEXT NOT NULL,
	PRIMARY KEY(idAutor, isbn),
	FOREIGN KEY(idAutor) REFERENCES autor(idAutor),
	FOREIGN KEY(isbn) REFERENCES livro(isbn)
);