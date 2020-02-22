DROP TABLE IF EXISTS user;

CREATE TABLE `user`(
  `id` int(11) AUTO_INCREMENT NOT NULL,
  `email` varchar(255),
  `name` varchar(30),
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1000000 DEFAULT CHARSET=utf8mb4;
