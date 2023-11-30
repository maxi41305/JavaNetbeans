-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 29-06-2021 a las 18:42:29
-- Versión del servidor: 5.7.26
-- Versión de PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clubpapel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alquiler`
--

DROP TABLE IF EXISTS `alquiler`;
CREATE TABLE IF NOT EXISTS `alquiler` (
  `hora` time NOT NULL,
  `fecha` date NOT NULL,
  `hora_fija` varchar(2) NOT NULL,
  `idsocio` int(3) NOT NULL,
  `precio` int(10) NOT NULL,
  `idalquiler` int(3) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `borrado` int(3) NOT NULL,
  PRIMARY KEY (`fecha`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alquiler`
--

INSERT INTO `alquiler` (`hora`, `fecha`, `hora_fija`, `idsocio`, `precio`, `idalquiler`, `nombre`, `direccion`, `telefono`, `borrado`) VALUES
('02:00:00', '2021-05-06', 'no', 1, 2000, 1, 'maxi', 'lomas', '3743591444', 0),
('10:00:00', '2021-06-18', 'no', 0, 300, 1, 'asd', 'dasdas', '374356', 0),
('12:00:00', '2021-06-19', 'no', 0, 300, 1, 'max', 'lomas', '3743', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gastos`
--

DROP TABLE IF EXISTS `gastos`;
CREATE TABLE IF NOT EXISTS `gastos` (
  `cuanto_gasto` int(20) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `fecha` date NOT NULL,
  `idgastos` int(3) NOT NULL,
  PRIMARY KEY (`cuanto_gasto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `gastos`
--

INSERT INTO `gastos` (`cuanto_gasto`, `descripcion`, `fecha`, `idgastos`) VALUES
(200, 'Nafta', '2021-05-21', 1),
(1000, 'nafta', '2021-06-15', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos`
--

DROP TABLE IF EXISTS `ingresos`;
CREATE TABLE IF NOT EXISTS `ingresos` (
  `cuanto_ingreso` int(10) NOT NULL,
  `fecha` date NOT NULL,
  `descripcion` varchar(40) NOT NULL,
  `idingreso` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ingresos`
--

INSERT INTO `ingresos` (`cuanto_ingreso`, `fecha`, `descripcion`, `idingreso`) VALUES
(200, '2021-05-21', 'aportes', 1),
(390, '2021-06-15', 'socio', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidosocio`
--

DROP TABLE IF EXISTS `pedidosocio`;
CREATE TABLE IF NOT EXISTS `pedidosocio` (
  `hora` time(6) NOT NULL,
  `fecha` date NOT NULL,
  `idsocio` int(3) NOT NULL,
  `idalquiler` int(3) NOT NULL,
  KEY `idsocio` (`idsocio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resumen`
--

DROP TABLE IF EXISTS `resumen`;
CREATE TABLE IF NOT EXISTS `resumen` (
  `totall` int(10) NOT NULL,
  `ingreso` int(10) NOT NULL,
  `gasto` int(10) NOT NULL,
  `mess` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socios`
--

DROP TABLE IF EXISTS `socios`;
CREATE TABLE IF NOT EXISTS `socios` (
  `idsocio` int(3) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` int(10) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `idlocalidad` varchar(30) NOT NULL,
  `idpadre` int(3) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `correo_electronico` varchar(30) NOT NULL,
  `borrado` int(3) NOT NULL,
  PRIMARY KEY (`idsocio`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `socios`
--

INSERT INTO `socios` (`idsocio`, `nombre`, `apellido`, `dni`, `direccion`, `telefono`, `idlocalidad`, `idpadre`, `fecha_nacimiento`, `correo_electronico`, `borrado`) VALUES
(1, 'Maxi', 'Torales', 41305572, 'barrio lomas de jardin', '3743591444', 'Jardin', 0, '2019-10-15', 'maxiitorales41305@gmail.com', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_alquiler`
--

DROP TABLE IF EXISTS `tipo_alquiler`;
CREATE TABLE IF NOT EXISTS `tipo_alquiler` (
  `idalquiler` int(3) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`idalquiler`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_alquiler`
--

INSERT INTO `tipo_alquiler` (`idalquiler`, `nombre`) VALUES
(1, 'Cancha'),
(2, 'Salon');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `idsocio` int(3) NOT NULL,
  `contraseña` varchar(11) NOT NULL,
  `tipo_usuario` varchar(20) NOT NULL,
  KEY `idsocio` (`idsocio`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idsocio`, `contraseña`, `tipo_usuario`) VALUES
(1, '1234asdf', 'administrador');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
