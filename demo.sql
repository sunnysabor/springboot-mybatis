CREATE DATABASE demo;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(500) NOT NULL,
  `name` varchar(500) DEFAULT NULL,
  `password` varchar(500) DEFAULT NULL,
	`sex` Integer DEFAULT NULL,
	`age` Integer DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;