CREATE TABLE Clientes (
			 id INT primary key,
			 nome VARCHAR (250),
			 email VARCHAR (250),
			 telefone VARCHAR (20)
);

CREATE TABLE Produtos (
			 id INT primary key,
			 nome VARCHAR (250),
			 preço VARCHAR (250),
			 categoria VARCHAR (20)
);

CREATE TABLE Pedidos (
			 id_pedido INT PRIMARY KEY,
			 id INT,
			 nome VARCHAR (250),
			 preço VARCHAR (250),
			 categoria VARCHAR (20),
			 FOREIGN KEY (id)
			 REFERENCES Clientes (id)
);

CREATE TABLE DetalhesDoPedido (
			 id_Detalhe INT PRIMARY KEY,
			 id INT,
			 id2 INT,
			 FOREIGN KEY (id)
			 REFERENCES Pedidos (id_pedido),
			 FOREIGN KEY (id2)
			 REFERENCES Produtos (id),
			 quantidade INT
);

INSERT INTO Clientes (id, nome, email, telefone)
VALUES
  (1, 'João Silva', 'joao@email.com', '123-456-7890'),
  (2, 'Maria Oliveira', 'maria@email.com', '987-654-3210'),
  (3, 'Carlos Santos', 'carlos@email.com', '111-222-3333');


INSERT INTO Produtos (id, nome, preço, categoria)
VALUES
  (1, 'Produto A', '29.99', 'Eletrônicos'),
  (2, 'Produto B', '19.99', 'Roupas'),
  (3, 'Produto C', '49.99', 'Livros');

INSERT INTO Pedidos (id_pedido, id, nome, preço, categoria)
VALUES
  (101, 1, 'Pedido João', '29.99', 'Eletrônicos'),
  (102, 2, 'Pedido Maria', '19.99', 'Roupas'),
  (103, 3, 'Pedido Carlos', '49.99', 'Livros');

INSERT INTO DetalhesDoPedido (id_Detalhe, id, id2, quantidade)
VALUES
  (1001, 101, 1, 2),
  (1002, 102, 2, 1),
  (1003, 103, 3, 3);

  CREATE TABLE Funcionários (
    id_funcionario INT PRIMARY KEY,
    nome VARCHAR(250),
    cargo VARCHAR(250),
    data_contratacao DATE
  );

  INSERT INTO Funcionários (id_funcionario, nome, cargo, data_contratacao)
  VALUES
    (1, 'José Silva', 'Analista de Vendas', '2022-01-15'),
    (2, 'Ana Oliveira', 'Desenvolvedor Front-end', '2021-09-20'),
    (3, 'Carlos Santos', 'Gerente de Projetos', '2020-05-10');



SELECT c.nome, COUNT(p.id_pedido) AS total_pedidos
FROM Clientes c
JOIN Pedidos p ON c.id = p.id
GROUP BY c.nome
HAVING COUNT(p.id_pedido) > 3;


SELECT c.nome, SUM(CAST(p.preço AS DECIMAL(10, 2))) AS total_valor_pedidos
FROM Clientes c
JOIN Pedidos p ON c.id = p.id
GROUP BY c.nome;


UPDATE Produtos
SET preço = CAST(preço AS DECIMAL(10, 2)) * 1.10;


SELECT p.nome, COUNT(d.id_Detalhe) AS total_pedidos
FROM Produtos p
JOIN DetalhesDoPedido d ON p.id = d.id2
GROUP BY p.nome
ORDER BY total_pedidos DESC;


SELECT AVG(CAST(preço AS DECIMAL(10, 2))) AS media,
       PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY CAST(preço AS DECIMAL(10, 2))) AS mediana,
       STDDEV(CAST(preço AS DECIMAL(10, 2))) AS desvio_padrao
FROM Produtos;


SELECT *
FROM Pedidos
WHERE data_pedido BETWEEN '2023-01-01' AND '2023-06-30';


SELECT c.nome
FROM Clientes c
LEFT JOIN Pedidos p ON c.id = p.id
WHERE p.data_pedido IS NULL OR p.data_pedido < DATE_SUB(CURDATE(), INTERVAL 6 MONTH);


SELECT nome, preço
FROM Produtos
ORDER BY CAST(preço AS DECIMAL(10, 2)) DESC;


SELECT p.categoria, SUM(CAST(d.quantidade AS DECIMAL(10, 2)) * CAST(p.preço AS DECIMAL(10, 2))) AS total_vendas
FROM Produtos p
JOIN DetalhesDoPedido d ON p.id = d.id2
GROUP BY p.categoria;
