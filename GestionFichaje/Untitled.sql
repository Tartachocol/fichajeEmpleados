CREATE TABLE `fichajes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_entrada` datetime NOT NULL,
  `fecha_salida` datetime DEFAULT NULL,
  codigo int(4) not null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `empleados` (
  `idEmpleado` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `salario` float NOT NULL DEFAULT '900',
  `email` varchar(100) DEFAULT NULL,
  `codigo` int DEFAULT '0',
  PRIMARY KEY (`idEmpleado`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `fichajes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_entrada` datetime NOT NULL,
  `fecha_salida` datetime DEFAULT NULL,
  `codigo` int NOT NULL,
  PRIMARY KEY (`id`)
) ;
CREATE TABLE `empleados` (
  `idEmpleado` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `salario` float NOT NULL DEFAULT '900',
  `email` varchar(100) DEFAULT NULL,
  `codigo` int NOT NULL,
  PRIMARY KEY (`idEmpleado`)
) ;



