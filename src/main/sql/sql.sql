CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `age` int(255) NOT NULL DEFAULT '0',
  `sex` int(4) NOT NULL DEFAULT '0' COMMENT '0为女，1为男',
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `photopath` varchar(255) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL,
  `user_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

