CREATE DATABASE IF NOT EXISTS pontodelivery;
USE pontodelivery;

-- Usuários para Login:

-- Admin
-- Login: admin
-- Senha: senha123

-- Funcionário
-- Login: funcionario
-- Senha: senha456

-- Tabela usuario
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `login` varchar(30) NOT NULL,
  `senha` varchar(60) NOT NULL,
  `tipo` varchar(25) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_UNIQUE` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Inserir usuários exemplo (importante para login funcionar)
INSERT INTO usuario (nome, login, senha, tipo) VALUES
('Admin', 'admin', 'senha123', 'admin'),
('Funcionário', 'funcionario', 'senha456', 'funcionario');

-- Tabela produtos
DROP TABLE IF EXISTS `produtos`;
CREATE TABLE `produtos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `preco` decimal(10,2) NOT NULL,
  `estoque` int NOT NULL,
  `categoria` varchar(255) DEFAULT 'Geral',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Inserir produtos exemplo
INSERT INTO `produtos` (`id`, `nome`, `preco`, `estoque`, `categoria`) VALUES
(1,'wwwqe',123.00,1,'asd'),
(2,'faf',3.00,12,'das'),
(3,'sada',31.00,1,'dsad'),
(4,'dddsdf',312.00,3,'efg'),
(5,'huv',1.00,1,'1'),
(6,'dasdd',123.00,1,'aaaaaaaa'),
(7,'ddsa',13.00,2,'ffffffffffff'),
(8,'awaf',4234.00,22,'gggggggggggg');

-- Tabela pedidos
DROP TABLE IF EXISTS `pedidos`;
CREATE TABLE `pedidos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cliente` varchar(100) NOT NULL,
  `data` datetime NOT NULL,
  `status` varchar(30) NOT NULL,
  `total` decimal(12,2) NOT NULL,
  `usuario_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pedidos_usuario_idx` (`usuario_id`),
  CONSTRAINT `fk_pedidos_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Tabela itens_pedido
DROP TABLE IF EXISTS `itens_pedido`;
CREATE TABLE `itens_pedido` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pedido_id` int NOT NULL,
  `produto_id` int NOT NULL,
  `quantidade` int NOT NULL,
  `preco_unitario` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_itens_pedido_pedidos_idx` (`pedido_id`),
  KEY `fk_itens_pedido_produtos_idx` (`produto_id`),
  CONSTRAINT `fk_itens_pedido_pedidos` FOREIGN KEY (`pedido_id`) REFERENCES `pedidos` (`id`),
  CONSTRAINT `fk_itens_pedido_produtos` FOREIGN KEY (`produto_id`) REFERENCES `produtos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE USER 'pontouser'@'localhost' IDENTIFIED BY 'SuaSenhaForteAqui';
GRANT ALL PRIVILEGES ON pontodelivery.* TO 'pontouser'@'localhost';
FLUSH PRIVILEGES;

-- Usuários para Login:

-- Admin
-- Login: admin
-- Senha: senha123

-- Funcionário
-- Login: funcionario
-- Senha: senha456