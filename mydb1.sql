-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Jan 2023 pada 17.08
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 8.1.10

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
-- Struktur dari tabel `detail_table`
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
-- Struktur dari tabel `feedback`
--

CREATE TABLE `feedback` (
  `ID_Feedback` int(11) NOT NULL,
  `Nama_Pemesan` varchar(255) NOT NULL,
  `Ulasan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `feedback`
--

INSERT INTO `feedback` (`ID_Feedback`, `Nama_Pemesan`, `Ulasan`) VALUES
(1, 'Salsa', 'Makanannya enak!'),
(2, 'Koko', 'Cafenya bagus!');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login_table`
--

CREATE TABLE `login_table` (
  `id` int(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login_table`
--

INSERT INTO `login_table` (`id`, `nama`, `username`, `password`, `role`) VALUES
(5, 'Dika', 'andhika2000', '123', 'Admin'),
(7, 'meja1', 'pelanggan', '321', 'Customer'),
(10, 'belinda', 'belin', '123', 'kasir'),
(11, 'imam', 'imam', '123', 'owner');

-- --------------------------------------------------------

--
-- Struktur dari tabel `menu_table`
--

CREATE TABLE `menu_table` (
  `id` int(255) NOT NULL,
  `nama_menu` varchar(255) NOT NULL,
  `harga` int(255) NOT NULL,
  `jumlah` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `menu_table`
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
-- Struktur dari tabel `pesanan`
--

CREATE TABLE `pesanan` (
  `Id_detail` int(11) NOT NULL,
  `ID_Pesanan` int(255) NOT NULL,
  `Nama_menu` varchar(255) NOT NULL,
  `Qty` int(11) NOT NULL,
  `Harga` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pesanan`
--

INSERT INTO `pesanan` (`Id_detail`, `ID_Pesanan`, `Nama_menu`, `Qty`, `Harga`) VALUES
(2, 1111, 'Roti bakar', 1, 18000),
(3, 1111, 'Kentang goreng', 1, 18000),
(4, 1111, 'Dimsum', 1, 20000),
(5, 1111, 'Waffle', 2, 20000),
(95, 1111, 'Roti bakar', 1, 18000),
(96, 1111, 'Kentang goreng', 1, 18000),
(97, 1111, 'Dimsum', 1, 20000),
(98, 1111, 'Waffle', 2, 20000),
(99, 1111, 'Nasi Goreng', 1, 18000),
(100, 1111, 'Roti bakar', 1, 18000),
(101, 1111, 'Kentang goreng', 1, 18000),
(102, 1111, 'Dimsum', 1, 20000),
(103, 1111, 'Waffle', 2, 20000),
(104, 1111, 'Roti bakar', 1, 18000),
(105, 1111, 'Kentang goreng', 1, 18000),
(106, 1111, 'Dimsum', 1, 20000),
(107, 1111, 'Waffle', 2, 20000),
(108, 1111, 'Nasi Goreng', 1, 18000),
(109, 1111, 'Nasi Goreng', 1, 18000),
(110, 1111, 'Roti bakar', 1, 18000),
(111, 1111, 'Kentang goreng', 1, 18000),
(112, 1111, 'Dimsum', 1, 20000),
(113, 1111, 'Waffle', 2, 20000),
(114, 1111, 'Roti bakar', 1, 18000),
(115, 1111, 'Kentang goreng', 1, 18000),
(116, 1111, 'Dimsum', 1, 20000),
(117, 1111, 'Waffle', 2, 20000),
(118, 1111, 'Nasi Goreng', 1, 18000),
(119, 1112, 'Kentang Goreng', 1, 18000),
(120, 1112, 'Roti Bakar       ', 1, 20000),
(121, 1112, 'Indomie Goreng', 1, 15000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesanan_table`
--

CREATE TABLE `pesanan_table` (
  `ID_Pesanan` int(255) NOT NULL,
  `Nama_Pemesan` varchar(255) NOT NULL,
  `Nomor_Meja` varchar(255) NOT NULL,
  `Catatan` varchar(255) NOT NULL,
  `Jenis_Pesanan` varchar(255) NOT NULL,
  `Sub_Total` double NOT NULL,
  `Tax` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pesanan_table`
--

INSERT INTO `pesanan_table` (`ID_Pesanan`, `Nama_Pemesan`, `Nomor_Meja`, `Catatan`, `Jenis_Pesanan`, `Sub_Total`, `Tax`, `Total`) VALUES
(1111, 'Belinda', '10', '-', 'Dine In', 114000, 4560, 118560),
(1112, 'Belin', 'Meja 2', 'nananna', 'Makan di tempat (Dine in)', 54000, 2160, 56160);

-- --------------------------------------------------------

--
-- Struktur dari tabel `searchrating`
--

CREATE TABLE `searchrating` (
  `code` int(9) NOT NULL,
  `namamenu` varchar(100) NOT NULL,
  `rating` float NOT NULL,
  `komentar` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `searchrating`
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
-- Indeks untuk tabel `detail_table`
--
ALTER TABLE `detail_table`
  ADD PRIMARY KEY (`ID_pesanan`),
  ADD KEY `ID_Menu` (`ID_Menu`);

--
-- Indeks untuk tabel `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`ID_Feedback`);

--
-- Indeks untuk tabel `login_table`
--
ALTER TABLE `login_table`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indeks untuk tabel `menu_table`
--
ALTER TABLE `menu_table`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`Id_detail`),
  ADD KEY `ID_Pesanan` (`ID_Pesanan`);

--
-- Indeks untuk tabel `pesanan_table`
--
ALTER TABLE `pesanan_table`
  ADD PRIMARY KEY (`ID_Pesanan`);

--
-- Indeks untuk tabel `searchrating`
--
ALTER TABLE `searchrating`
  ADD PRIMARY KEY (`code`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `detail_table`
--
ALTER TABLE `detail_table`
  MODIFY `ID_pesanan` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `feedback`
--
ALTER TABLE `feedback`
  MODIFY `ID_Feedback` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `login_table`
--
ALTER TABLE `login_table`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `menu_table`
--
ALTER TABLE `menu_table`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `Id_detail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;

--
-- AUTO_INCREMENT untuk tabel `pesanan_table`
--
ALTER TABLE `pesanan_table`
  MODIFY `ID_Pesanan` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1113;

--
-- AUTO_INCREMENT untuk tabel `searchrating`
--
ALTER TABLE `searchrating`
  MODIFY `code` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  ADD CONSTRAINT `pesanan_ibfk_1` FOREIGN KEY (`ID_Pesanan`) REFERENCES `pesanan_table` (`ID_Pesanan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
