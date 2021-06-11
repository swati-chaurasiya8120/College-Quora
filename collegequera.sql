

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";





CREATE TABLE `answer` (
  `aid` int(11) NOT NULL,
  `ans` varchar(3000) NOT NULL,
  `ans_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `faculty` int(11) DEFAULT NULL,
  `question` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `answer` (`aid`, `ans`, `ans_date`, `faculty`, `question`) VALUES
(1, '     java is oop\n                   \n                    ', '2021-04-04 04:49:58', 2, 2),
(2, '                        \n    c is pop\n                ', '2021-04-12 10:33:39', 2, 3),
(3, '                        \n         Java is Object oriented programming\n           ', '2021-05-01 16:38:32', 2, 2),
(4, '                        \n    Java is OOP\n               ', '2021-06-11 14:02:44', 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `documents`
--

CREATE TABLE `documents` (
  `did` int(11) NOT NULL,
  `filepath` varchar(200) NOT NULL,
  `send_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `faculty` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `msgboard`
--

CREATE TABLE `msgboard` (
  `mid` int(11) NOT NULL,
  `message` varchar(3000) NOT NULL,
  `msg_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `faculty` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `qid` int(11) NOT NULL,
  `qus` varchar(1000) NOT NULL,
  `ask_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `student` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`qid`, `qus`, `ask_date`, `student`) VALUES
(2, 'What is Java', '2021-04-04 04:37:17', 1),
(3, 'what is c', '2021-04-04 04:46:11', 1),
(4, 'What is cpp\r\n', '2021-04-12 10:33:06', 1),
(5, 'What is Android', '2021-05-01 18:12:55', 4);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userid` int(11) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(12) NOT NULL,
  `branch` varchar(10) NOT NULL,
  `type` varchar(10) NOT NULL,
  `otp` int(11) DEFAULT NULL,
  `isverify` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userid`, `user_name`, `email`, `password`, `branch`, `type`, `otp`, `isverify`) VALUES
(1, 'Swati Chaurasiya', 'swatichaurasiya8120@gmail.com', '12345', 'cs', 'student', 26928, 1),
(2, 'shubham Chaurasiya', 'shubham@gmail.com', '12345', 'cs', 'faculty', 26332, 1),
(3, 'sonu', 'sonu@gmail.com', '12345', 'cs', 'faculty', 16354, 1),
(4, 'Tushar Dhakad', 'tushar.dhakad.sbg@gmail.com', '12345', 'cs', 'student', 12699, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `answer`
--
ALTER TABLE `answer`
  ADD PRIMARY KEY (`aid`),
  ADD KEY `question` (`question`),
  ADD KEY `faculty` (`faculty`);

--
-- Indexes for table `documents`
--
ALTER TABLE `documents`
  ADD PRIMARY KEY (`did`),
  ADD KEY `faculty` (`faculty`);

--
-- Indexes for table `msgboard`
--
ALTER TABLE `msgboard`
  ADD PRIMARY KEY (`mid`),
  ADD KEY `faculty` (`faculty`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`qid`),
  ADD KEY `student` (`student`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `answer`
--
ALTER TABLE `answer`
  MODIFY `aid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `documents`
--
ALTER TABLE `documents`
  MODIFY `did` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `msgboard`
--
ALTER TABLE `msgboard`
  MODIFY `mid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `qid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `answer`
--
ALTER TABLE `answer`
  ADD CONSTRAINT `answer_ibfk_1` FOREIGN KEY (`question`) REFERENCES `question` (`qid`),
  ADD CONSTRAINT `answer_ibfk_2` FOREIGN KEY (`faculty`) REFERENCES `user` (`userid`);

--
-- Constraints for table `documents`
--
ALTER TABLE `documents`
  ADD CONSTRAINT `documents_ibfk_1` FOREIGN KEY (`faculty`) REFERENCES `user` (`userid`);

--
-- Constraints for table `msgboard`
--
ALTER TABLE `msgboard`
  ADD CONSTRAINT `msgboard_ibfk_1` FOREIGN KEY (`faculty`) REFERENCES `user` (`userid`);

--
-- Constraints for table `question`
--
ALTER TABLE `question`
  ADD CONSTRAINT `question_ibfk_1` FOREIGN KEY (`student`) REFERENCES `user` (`userid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
