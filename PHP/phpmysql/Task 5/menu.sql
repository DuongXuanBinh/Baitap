-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th2 22, 2021 lúc 04:29 PM
-- Phiên bản máy phục vụ: 10.4.17-MariaDB
-- Phiên bản PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `coffeeshop`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `menu`
--

CREATE TABLE `menu` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `size` char(1) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `menu`
--

INSERT INTO `menu` (`id`, `name`, `size`, `price`, `image`) VALUES
(1, 'chocolate', 'L', 50000, '<img src=\"24d0961b7dba35-chocolatephclong.png\" height=\"250\" width=\"250\"/>'),
(2, 'black coffee', 'M', 40000, '<img src=\"02e2fb0aa87a0a-cphphclong.png\" height=\"250\" width=\"250\"/>'),
(3, 'creamy halzenut', 'M', 45000, '<img src=\"87f7b201a02874-trenhazelnutkemsaphclong.png\" height=\"250\" width=\"250\"/>'),
(4, 'expresso almond', 'L', 55000, '<img src=\"58fd43b11d4701-espressoraspberryalmond.png\" height=\"250\" width=\"250\"/>'),
(5, 'black tea', 'M', 50000, '<img src=\"a2975ae4e99cd5-trsenhazelnutkemsa.png\" height=\"250\" width=\"250\"/>');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
