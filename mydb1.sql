-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2023 at 06:36 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb1`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_table`
--

CREATE TABLE `detail_table` (
  `ID_pesanan` int(255) NOT NULL,
  `ID_Menu` int(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `quantity` int(255) NOT NULL,
  `harga` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login_table`
--

CREATE TABLE `login_table` (
  `id` int(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_table`
--

INSERT INTO `login_table` (`id`, `nama`, `username`, `password`, `role`) VALUES
(5, 'Dika', 'andhika2000', '123', 'Admin'),
(7, 'meja1', 'pelanggan', '321', 'Customer'),
(10, 'belinda', 'belin', '123', 'kasir'),
(11, 'imam', 'imam', '123', 'owner');

-- --------------------------------------------------------

--
-- Table structure for table `menu_table`
--

CREATE TABLE `menu_table` (
  `id` int(255) NOT NULL,
  `nama_menu` varchar(255) NOT NULL,
  `harga` int(255) NOT NULL,
  `jumlah` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu_table`
--

INSERT INTO `menu_table` (`id`, `nama_menu`, `harga`, `jumlah`) VALUES
(16, 'Kentang goreng', 18000, 9),
(17, 'Roti Bakar', 15000, 6),
(18, 'Indomie Goreng', 15000, 18),
(19, 'Dimsum', 20000, 12),
(20, 'Waffle ', 20000, 7),
(21, 'Burger', 18000, 9),
(22, 'Spagetti', 20000, 3),
(23, 'Onion Ring', 18000, 10),
(24, 'Sosis Goreng', 15000, 9),
(25, 'Nasi Goreng', 18000, 4),
(26, 'Americano Coffe', 18000, 2),
(27, 'Coffe Latte', 18000, 5),
(28, 'Lychee Tea', 15000, 20),
(29, 'Lemon Tea', 15000, 15),
(30, 'Matcha Latte', 18000, 19),
(31, 'Red Velvet Latte', 18000, 20),
(32, 'Taro Latte', 18000, 43),
(33, 'Vanilla Latte', 18000, 29),
(35, 'Choco Latte', 20000, 5);

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `code` int(200) NOT NULL,
  `namamenu` varchar(255) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`code`, `namamenu`, `quantity`) VALUES
(2, 'Roti bakar', 2),
(3, 'Kentang goreng', 7),
(4, 'Dimsum', 11),
(5, 'Waffle', 8);

-- --------------------------------------------------------

--
-- Table structure for table `pesanan_table`
--

CREATE TABLE `pesanan_table` (
  `id` int(255) NOT NULL,
  `nama_pesanan` varchar(255) NOT NULL,
  `nomeja` int(255) NOT NULL,
  `catatanpesanan` varchar(255) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `jenispesanan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `searchrating`
--

CREATE TABLE `searchrating` (
  `code` int(9) NOT NULL,
  `namamenu` varchar(100) NOT NULL,
  `rating` float NOT NULL,
  `komentar` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `searchrating`
--

INSERT INTO `searchrating` (`code`, `namamenu`, `rating`, `komentar`) VALUES
(5, 'Kentang Goreng', 4.8, 'Enak banget kentangnya renyah'),
(6, 'Roti bakar', 4.7, 'Lumer gitu'),
(7, 'Indomie goreng', 5, 'Pas banget rasanya'),
(8, 'Dimsum', 3.5, 'kurang enak'),
(9, 'Waffle', 4.2, 'enak tapi mahal'),
(10, 'Burger', 4.8, 'pas mantap');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_table`
--
ALTER TABLE `detail_table`
  ADD PRIMARY KEY (`ID_pesanan`),
  ADD KEY `ID_Menu` (`ID_Menu`);

--
-- Indexes for table `login_table`
--
ALTER TABLE `login_table`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `menu_table`
--
ALTER TABLE `menu_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `pesanan_table`
--
ALTER TABLE `pesanan_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `searchrating`
--
ALTER TABLE `searchrating`
  ADD PRIMARY KEY (`code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `detail_table`
--
ALTER TABLE `detail_table`
  MODIFY `ID_pesanan` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `login_table`
--
ALTER TABLE `login_table`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `menu_table`
--
ALTER TABLE `menu_table`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `code` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pesanan_table`
--
ALTER TABLE `pesanan_table`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `searchrating`
--
ALTER TABLE `searchrating`
  MODIFY `code` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
