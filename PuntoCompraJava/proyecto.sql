-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2022 at 02:07 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyecto`
--
CREATE DATABASE IF NOT EXISTS `proyecto` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `proyecto`;

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
CREATE TABLE IF NOT EXISTS `categoria` (
  `codCategoria` int(12) NOT NULL AUTO_INCREMENT,
  `nombreCategoria` varchar(20) NOT NULL,
  PRIMARY KEY (`codCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`codCategoria`, `nombreCategoria`) VALUES
(100, 'Carne'),
(101, 'Pescado'),
(102, 'Congelado'),
(103, 'Fruta'),
(104, 'Verdura'),
(105, 'Lacteos'),
(106, 'Panaderia'),
(107, 'Pasteleria'),
(108, 'Dulce'),
(109, 'Despensa'),
(110, 'Postre'),
(111, 'Colacion'),
(112, 'Bebida'),
(113, 'Agua'),
(114, 'Licores'),
(115, 'Aseo');

-- --------------------------------------------------------

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
CREATE TABLE IF NOT EXISTS `compra` (
  `idCompra` int(11) NOT NULL AUTO_INCREMENT,
  `fechaCompra` date NOT NULL,
  `total` int(6) NOT NULL,
  `descuentoTotal` int(6) DEFAULT NULL,
  `totalFinal` int(6) NOT NULL,
  `codUsuario` int(8) NOT NULL,
  `codMedioPago` int(4) NOT NULL,
  `numRutEmpleado` int(8) NOT NULL,
  `numRazonSocialEmpresa` int(8) NOT NULL,
  PRIMARY KEY (`idCompra`),
  KEY `codUsuario` (`codUsuario`),
  KEY `codMedioPago` (`codMedioPago`),
  KEY `numRutEmpleado` (`numRutEmpleado`),
  KEY `numRazonSocialEmpresa` (`numRazonSocialEmpresa`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `compra`
--

INSERT INTO `compra` (`idCompra`, `fechaCompra`, `total`, `descuentoTotal`, `totalFinal`, `codUsuario`, `codMedioPago`, `numRutEmpleado`, `numRazonSocialEmpresa`) VALUES
(1000, '2022-11-20', 2950, NULL, 2950, 1, 102, 18612264, 79547632),
(1001, '2022-11-21', 750, NULL, 750, 2, 100, 18612264, 79547632);

-- --------------------------------------------------------

--
-- Table structure for table `comuna`
--

DROP TABLE IF EXISTS `comuna`;
CREATE TABLE IF NOT EXISTS `comuna` (
  `codComuna` int(4) NOT NULL AUTO_INCREMENT,
  `nomComuna` varchar(30) NOT NULL,
  `codProvincia` int(4) NOT NULL,
  `codRegion` int(4) NOT NULL,
  PRIMARY KEY (`codComuna`),
  KEY `FK_comuna_provincia` (`codProvincia`),
  KEY `FK_comuna_region` (`codRegion`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `comuna`
--

INSERT INTO `comuna` (`codComuna`, `nomComuna`, `codProvincia`, `codRegion`) VALUES
(100, 'Viña del Mar', 100, 10);

-- --------------------------------------------------------

--
-- Table structure for table `detallecompra`
--

DROP TABLE IF EXISTS `detallecompra`;
CREATE TABLE IF NOT EXISTS `detallecompra` (
  `idCompra` int(12) NOT NULL,
  `codProducto` int(12) NOT NULL,
  `cantidad` int(2) NOT NULL,
  KEY `idCompra` (`idCompra`),
  KEY `codProducto` (`codProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detallecompra`
--

INSERT INTO `detallecompra` (`idCompra`, `codProducto`, `cantidad`) VALUES
(1000, 12653276, 1),
(1000, 32457698, 1),
(1000, 43126587, 1),
(1001, 32457698, 0),
(1000, 12653276, 1),
(1000, 32457698, 1),
(1000, 43126587, 1),
(1001, 32457698, 1);

-- --------------------------------------------------------

--
-- Table structure for table `detallesello`
--

DROP TABLE IF EXISTS `detallesello`;
CREATE TABLE IF NOT EXISTS `detallesello` (
  `codProducto` int(12) NOT NULL,
  `codSello` int(5) DEFAULT NULL,
  KEY `codProducto` (`codProducto`),
  KEY `codSello` (`codSello`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detallesello`
--

INSERT INTO `detallesello` (`codProducto`, `codSello`) VALUES
(12653276, 103),
(12653276, 101),
(12653276, 102),
(43126587, NULL),
(32457698, 100),
(32457698, 103),
(76436598, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `numRutEmpleado` int(8) NOT NULL,
  `dvRutEmpleado` varchar(1) NOT NULL,
  `pNombreEmpleado` varchar(15) NOT NULL,
  `pApellidoEmpleado` varchar(15) NOT NULL,
  `sApellidoEmpleado` varchar(15) NOT NULL,
  `emailEmpleado` varchar(25) NOT NULL,
  `celularEmpleado` int(12) NOT NULL,
  `fechaNacEmpleado` date NOT NULL,
  `direccionEmpleado` varchar(25) NOT NULL,
  `codRegion` int(4) NOT NULL,
  `codProvincia` int(4) NOT NULL,
  `codComuna` int(4) NOT NULL,
  `usuarioEmpleado` varchar(25) NOT NULL,
  `contraseñaEmpleado` varchar(25) NOT NULL,
  `numRazonSocialEmpresa` int(8) NOT NULL,
  PRIMARY KEY (`numRutEmpleado`),
  KEY `numRazonSocialEmpresa` (`numRazonSocialEmpresa`),
  KEY `codComuna` (`codComuna`),
  KEY `codProvincia` (`codProvincia`),
  KEY `codRegion` (`codRegion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `empleado`
--

INSERT INTO `empleado` (`numRutEmpleado`, `dvRutEmpleado`, `pNombreEmpleado`, `pApellidoEmpleado`, `sApellidoEmpleado`, `emailEmpleado`, `celularEmpleado`, `fechaNacEmpleado`, `direccionEmpleado`, `codRegion`, `codProvincia`, `codComuna`, `usuarioEmpleado`, `contraseñaEmpleado`, `numRazonSocialEmpresa`) VALUES
(18612264, 'K', 'Gabriel', 'Serrano', 'Mena', 'gab@hola.cl', 98765432, '1993-11-17', 'Jorge Ross 234', 10, 100, 100, 'gabSerrano', 'pass1234', 79547632);

-- --------------------------------------------------------

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
CREATE TABLE IF NOT EXISTS `empresa` (
  `numRazonSocialEmpresa` int(8) NOT NULL,
  `dvRazonSocialEmpresa` varchar(1) NOT NULL,
  `nombreEmpresa` varchar(15) NOT NULL,
  `emailEmpresa` varchar(25) NOT NULL,
  `direccionEmpresa` varchar(15) NOT NULL,
  `codRegion` int(4) NOT NULL,
  `codProvincia` int(4) NOT NULL,
  `codComuna` int(4) NOT NULL,
  `telefonoEmpresa` int(12) NOT NULL,
  PRIMARY KEY (`numRazonSocialEmpresa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `empresa`
--

INSERT INTO `empresa` (`numRazonSocialEmpresa`, `dvRazonSocialEmpresa`, `nombreEmpresa`, `emailEmpresa`, `direccionEmpresa`, `codRegion`, `codProvincia`, `codComuna`, `telefonoEmpresa`) VALUES
(79547632, 'K', 'La mercadona', 'lamercadona@negocio.cl', '1 Norte 678', 0, 0, 0, 325476);

-- --------------------------------------------------------

--
-- Table structure for table `mediopago`
--

DROP TABLE IF EXISTS `mediopago`;
CREATE TABLE IF NOT EXISTS `mediopago` (
  `codMedioPago` int(5) NOT NULL AUTO_INCREMENT,
  `nombreMedioPago` varchar(20) NOT NULL,
  PRIMARY KEY (`codMedioPago`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mediopago`
--

INSERT INTO `mediopago` (`codMedioPago`, `nombreMedioPago`) VALUES
(100, 'Efectivo'),
(101, 'Credito'),
(102, 'Debito'),
(103, 'Prepago');

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `codProducto` int(12) NOT NULL,
  `descripcionProducto` varchar(25) NOT NULL,
  `precioUnitario` int(6) NOT NULL,
  `stock` int(6) NOT NULL,
  `codCategoria` int(12) NOT NULL,
  `numRazonSocialProv` int(8) NOT NULL,
  `porcentajeDescuento` double(5,5) DEFAULT NULL,
  PRIMARY KEY (`codProducto`),
  KEY `numRazonSocialProv` (`numRazonSocialProv`),
  KEY `codCategoria` (`codCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`codProducto`, `descripcionProducto`, `precioUnitario`, `stock`, `codCategoria`, `numRazonSocialProv`, `porcentajeDescuento`) VALUES
(12653276, 'Papas Lay\'s 250g', 950, 50, 109, 72546766, NULL),
(32457698, 'Bebida Pepsi 500ml', 750, 50, 112, 72546798, NULL),
(43126587, 'Cachantun 1L', 1250, 45, 113, 72546744, NULL),
(76436598, 'Yogurt Surlat Natural Sin', 490, 34, 105, 72546744, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE IF NOT EXISTS `proveedor` (
  `numRazonSocialProv` int(8) NOT NULL,
  `dvRazonSocialProv` varchar(1) NOT NULL,
  `nombreProv` varchar(15) NOT NULL,
  `emailProv` varchar(25) NOT NULL,
  `direccionProv` varchar(25) NOT NULL,
  `regionProv` varchar(25) NOT NULL,
  `provinciaProv` varchar(25) NOT NULL,
  `comunaProv` varchar(25) NOT NULL,
  `telefonoProv` int(12) DEFAULT NULL,
  PRIMARY KEY (`numRazonSocialProv`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`numRazonSocialProv`, `dvRazonSocialProv`, `nombreProv`, `emailProv`, `direccionProv`, `regionProv`, `provinciaProv`, `comunaProv`, `telefonoProv`) VALUES
(72546744, '5', 'Coca-cola', 'coca_cola@cocacola.cl', 'direccion cocacola1234', 'RM', 'Santiago', 'Santiago', 1234565),
(72546766, '3', ' Evercrisp', ' evercrisp@evercrisp.cl', 'direccion evercrisp 1234', 'RM', 'Santiago', 'Santiago', 3456876),
(72546798, '5', 'CCU', 'ccu@ccu.cl', 'direccion ccu 1234', 'RM', 'Santiago', 'Santiago', 234567);

-- --------------------------------------------------------

--
-- Table structure for table `provincia`
--

DROP TABLE IF EXISTS `provincia`;
CREATE TABLE IF NOT EXISTS `provincia` (
  `codProvincia` int(4) NOT NULL AUTO_INCREMENT,
  `nomProvincia` varchar(30) NOT NULL,
  `codRegion` int(4) NOT NULL,
  PRIMARY KEY (`codProvincia`),
  KEY `FK_provincia_region` (`codRegion`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `provincia`
--

INSERT INTO `provincia` (`codProvincia`, `nomProvincia`, `codRegion`) VALUES
(100, 'Valparaiso', 10),
(101, 'Marga-Marga', 10),
(103, 'Talca', 13),
(104, 'Putre', 12);

-- --------------------------------------------------------

--
-- Table structure for table `region`
--

DROP TABLE IF EXISTS `region`;
CREATE TABLE IF NOT EXISTS `region` (
  `codRegion` int(4) NOT NULL AUTO_INCREMENT,
  `nomRegion` varchar(20) NOT NULL,
  PRIMARY KEY (`codRegion`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `region`
--

INSERT INTO `region` (`codRegion`, `nomRegion`) VALUES
(10, 'Valparaiso'),
(11, 'RM'),
(12, 'Arica'),
(13, 'Maule');

-- --------------------------------------------------------

--
-- Table structure for table `sello`
--

DROP TABLE IF EXISTS `sello`;
CREATE TABLE IF NOT EXISTS `sello` (
  `codSello` int(5) NOT NULL AUTO_INCREMENT,
  `tipoSello` varchar(20) NOT NULL,
  PRIMARY KEY (`codSello`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sello`
--

INSERT INTO `sello` (`codSello`, `tipoSello`) VALUES
(100, 'Alto en azucares'),
(101, 'Alto en grasas satur'),
(102, 'Alto en sodio'),
(103, 'Alto en calorias');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `codUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `numRutUsuario` int(8) DEFAULT NULL,
  `dvRutUsuario` varchar(1) DEFAULT NULL,
  `pNombreUsuario` varchar(15) DEFAULT NULL,
  `pApellidoUsuario` varchar(15) DEFAULT NULL,
  `sApellidoUsuario` varchar(15) DEFAULT NULL,
  `emailUsuario` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`codUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`codUsuario`, `numRutUsuario`, `dvRutUsuario`, `pNombreUsuario`, `pApellidoUsuario`, `sApellidoUsuario`, `emailUsuario`) VALUES
(1, NULL, NULL, NULL, NULL, NULL, NULL),
(2, 12345677, '6', 'David', 'Mallma', 'Valverde', 'da.mallma@hola.cl');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`codUsuario`) REFERENCES `usuario` (`codUsuario`),
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`codMedioPago`) REFERENCES `mediopago` (`codMedioPago`),
  ADD CONSTRAINT `compra_ibfk_3` FOREIGN KEY (`numRutEmpleado`) REFERENCES `empleado` (`numRutEmpleado`),
  ADD CONSTRAINT `compra_ibfk_4` FOREIGN KEY (`numRazonSocialEmpresa`) REFERENCES `empresa` (`numRazonSocialEmpresa`);

--
-- Constraints for table `comuna`
--
ALTER TABLE `comuna`
  ADD CONSTRAINT `FK_comuna_provincia` FOREIGN KEY (`codProvincia`) REFERENCES `provincia` (`codProvincia`),
  ADD CONSTRAINT `FK_comuna_region` FOREIGN KEY (`codRegion`) REFERENCES `region` (`codRegion`);

--
-- Constraints for table `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`),
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`codProducto`) REFERENCES `producto` (`codProducto`);

--
-- Constraints for table `detallesello`
--
ALTER TABLE `detallesello`
  ADD CONSTRAINT `detallesello_ibfk_1` FOREIGN KEY (`codProducto`) REFERENCES `producto` (`codProducto`),
  ADD CONSTRAINT `detallesello_ibfk_2` FOREIGN KEY (`codSello`) REFERENCES `sello` (`codSello`);

--
-- Constraints for table `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`numRazonSocialEmpresa`) REFERENCES `empresa` (`numRazonSocialEmpresa`),
  ADD CONSTRAINT `empleado_ibfk_2` FOREIGN KEY (`codComuna`) REFERENCES `comuna` (`codComuna`),
  ADD CONSTRAINT `empleado_ibfk_3` FOREIGN KEY (`codProvincia`) REFERENCES `provincia` (`codProvincia`),
  ADD CONSTRAINT `empleado_ibfk_4` FOREIGN KEY (`codRegion`) REFERENCES `region` (`codRegion`);

--
-- Constraints for table `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`numRazonSocialProv`) REFERENCES `proveedor` (`numRazonSocialProv`),
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`codCategoria`) REFERENCES `categoria` (`codCategoria`);

--
-- Constraints for table `provincia`
--
ALTER TABLE `provincia`
  ADD CONSTRAINT `FK_provincia_region` FOREIGN KEY (`codRegion`) REFERENCES `region` (`codRegion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;