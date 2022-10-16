-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Okt 2022 pada 13.19
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lib`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `lib`
--

CREATE TABLE `lib` (
  `id` int(15) NOT NULL,
  `img` varchar(250) NOT NULL,
  `judul` varchar(250) NOT NULL,
  `penulis` varchar(50) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `link` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `lib`
--

INSERT INTO `lib` (`id`, `img`, `judul`, `penulis`, `genre`, `link`) VALUES
(23, '1CPvdtivn63bJ5BOmSOngFFiMqII6UwCU', 'Algorithm & DS C1', 'ipul', 'Science', '1GgzISEDwLQKtqZ-eW1-9-f6dGiu6P4vq'),
(28, '111g9ruR3cyQ8ipUlVlARn9VeI9jJkNFs', 'Algorithm & DS C02', 'Unknown', 'Science', '1GaQHgEGrtN9XMxkV0RgD4tCZTTBLNh_s'),
(31, '14weGd2_3Cm2W_Im2jlaNWkxAjrRJaoIN', 'Software Engineer A Practitioner Approach', 'Roger S. PRESSMAN', 'Technology', '103us_ucVXtLJzEZt8x9vD-BGKd0cqWta'),
(41, '1B-ArJGWI-WP2lXJi9MhtJjihdTM7ssnA', 'JSF HIBERNATE TUTORIAL', 'TOM', 'Technology & Information', '1Mtjty1ZtVQJ3RJgum3_aJV9sn84r5f40'),
(46, '1yaP3lKqinTLYn1feru_1tI2AqHmOyEND', 'SELAMATKAN MAKHLUK HIDUP', 'Erlangga', 'Social', '1yaP3lKqinTLYn1feru_1tI2AqHmOyEND');

-- --------------------------------------------------------

--
-- Struktur dari tabel `librarians`
--

CREATE TABLE `librarians` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `librarians`
--

INSERT INTO `librarians` (`id`, `name`, `username`, `password`) VALUES
(2, 'Farhan Dwi O', 'farhan', 'farhan'),
(3, 'Reza Hans L', 'reza', 'reza'),
(5, 'admin', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `lib`
--
ALTER TABLE `lib`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `librarians`
--
ALTER TABLE `librarians`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `lib`
--
ALTER TABLE `lib`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT untuk tabel `librarians`
--
ALTER TABLE `librarians`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
