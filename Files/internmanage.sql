-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2021 at 05:04 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `internmanage`
--

-- --------------------------------------------------------

--
-- Table structure for table `dtr`
--

CREATE TABLE `dtr` (
  `Date` varchar(20) NOT NULL,
  `TimeIn` varchar(20) NOT NULL,
  `TimeOut` varchar(20) NOT NULL,
  `Total` varchar(10) NOT NULL,
  `Proof` varchar(400) NOT NULL,
  `Validate` varchar(20) NOT NULL,
  `StudID` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dtr`
--

INSERT INTO `dtr` (`Date`, `TimeIn`, `TimeOut`, `Total`, `Proof`, `Validate`, `StudID`) VALUES
('19/5/2021', '13:13:39', '13:14:0', '9', 'YEAH I DID SOMETHING', 'Validated', '2020-12345'),
('19/6/2021', '15:26:9', '15:27:38', '9', 'YEAH I DID SOMETHING', 'Validated', '2021-103455'),
('19/6/2021', '22:48:36', '22:49:24', '9', 'YEAH I DID SOMETHING', 'Validated', '2020-103235'),
('19/6/2021', '23:7:51', '23:7:59', '6000', 'YEAH I DID SOMETHING', 'Validated', '2020-323112'),
('20/6/2021', '14:29:14', '14:30:32', '6000', 'YEAH I DID SOMETHING', 'Validated', '2020-323112'),
('20/6/2021', '14:30:51', '14:30:53', '9', 'YEAH I DID SOMETHING', 'Validated', '2021-103455'),
('20/6/2021', '15:10:19', '16:15:53', '1', 'I did yeah', 'Validated', '2020-12345'),
('20/6/2021', '22:5:3', '', '', '', 'Invalid', '2020-098765'),
('20/6/2021', '22:45:56', '', '', '', 'Invalid', '2020-567987'),
('21/6/2021', '9:56:27', '9:58:30', '6000', 'Naglaba', 'Validated', '2020-323112'),
('21/6/2021', '21:17:50', '21:19:16', '2789', 'blah', 'Validated', '2020-098765'),
('21/6/2021', '21:19:43', '22:27:31', '68', 'yowwwwwwww', 'Validated', '2020-123678'),
('22/6/2021', '9:33:24', '9:34:1', '1', 'LMAO', 'Not Validated', '2020-098765'),
('22/6/2021', '10:57:45', '10:58:2', '6000', 'yay', 'Not Validated', '2020-323112'),
('27/6/2021', '16:52:37', '16:53:1', '1', 'yeah', 'Not Validated', '2020-098765'),
('27/6/2021', '16:52:37', '16:53:1', '1', 'yeah', 'Not Validated', '2020-098765'),
('27/6/2021', '17:8:3', '17:9:5', '1', 'yoiwwww', 'Not Validated', '2021-103455');

-- --------------------------------------------------------

--
-- Table structure for table `eval`
--

CREATE TABLE `eval` (
  `StudID` varchar(20) NOT NULL,
  `Q1` varchar(10) NOT NULL,
  `Q2` varchar(10) NOT NULL,
  `Q3` varchar(10) NOT NULL,
  `Q4` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `eval`
--

INSERT INTO `eval` (`StudID`, `Q1`, `Q2`, `Q3`, `Q4`) VALUES
('2020-098765', '5', '5', '5', '5');

-- --------------------------------------------------------

--
-- Table structure for table `logincredentials`
--

CREATE TABLE `logincredentials` (
  `First` varchar(50) NOT NULL,
  `Surname` varchar(50) NOT NULL,
  `Course/Department` varchar(50) NOT NULL,
  `Section` varchar(50) NOT NULL,
  `Stud_ID` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `logincredentials`
--

INSERT INTO `logincredentials` (`First`, `Surname`, `Course/Department`, `Section`, `Stud_ID`, `Email`, `Password`, `Type`) VALUES
('Frank', 'Vincent', 'BSIT', 'INF202', '2020-103235', 'frankgesmundo', '123', 'Student'),
('Frank', 'Gesmundo', 'BSIT', 'INF202', '2020-323112', 'frankie', '123', 'Student'),
('Keene', 'Gesmundo', 'CCIT', 'inf202', '2021-103455', 'keene', '098', 'Student'),
('Bernie', 'Fabito', 'CCIT', '', '', 'berniefabs', 'qwe', 'Teacher'),
('Frank', 'Gesmundo', 'BSIT', 'INF202', '2020-12345', 'Frankgesmundo@gmail.com', '123', 'Student'),
('Trisha Joy', 'Gesmundo', 'HRM', 'INF204', '2020-098765', 'joy@gmail.com', '123', 'Student'),
('Kelsey', 'Sumusoka', 'BSIT', 'INF202', '2020-567987', 'frankvgesmundo@gmail.com', '12345', 'Student'),
('yea', 'yea', 'yea', 'yea', '2020-123678', 'frankgesmundo@protonmail.com', '123', 'Student');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
