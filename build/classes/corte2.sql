-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-04-2023 a las 20:13:51
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `corte2`
--
CREATE DATABASE IF NOT EXISTS `corte2` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `corte2`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `envios`
--

CREATE TABLE `envios` (
  `idEnvio` int(11) NOT NULL,
  `empaque` text NOT NULL,
  `peso` text NOT NULL,
  `descripcion` text NOT NULL,
  `destino` text NOT NULL,
  `envia` text NOT NULL,
  `transporte` text NOT NULL,
  `empleados` text NOT NULL,
  `suministros` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `envios`
--

INSERT INTO `envios` (`idEnvio`, `empaque`, `peso`, `descripcion`, `destino`, `envia`, `transporte`, `empleados`, `suministros`) VALUES
(4, 'caja', '23', 'caja', 'medellin', 'andres', 'Camion', '2', '50000'),
(5, 'caja', '25', 'caja', 'bogota', 'andres', 'Camioneta', '2', '30000'),
(6, 'caja', '25', 'caja', 'bogota', 'sergio', 'Camioneta', '2', '30000'),
(7, 'caja', '29', 'caja', 'barranquilla', 'andres', 'Moto', '1', '10000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombreCompleto` text NOT NULL,
  `nombreUsuario` text NOT NULL,
  `origen` text NOT NULL,
  `cedula` text NOT NULL,
  `contrasena` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombreCompleto`, `nombreUsuario`, `origen`, `cedula`, `contrasena`) VALUES
(1, 'andres', 'sars', 'bogota', '12345', 0x73617273),
(2, 'andres', 'sars1', 'medellin', '123456', 0x73617273),
(3, 'sergio', 'sars2', 'barranquilla', '98765', 0x73617273),
(4, 'andres', 'sars3', 'apartado', '7654', 0x73617273);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `envios`
--
ALTER TABLE `envios`
  ADD PRIMARY KEY (`idEnvio`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `envios`
--
ALTER TABLE `envios`
  MODIFY `idEnvio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;