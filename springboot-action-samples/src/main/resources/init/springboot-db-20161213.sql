CREATE DATABASE /*!32312 IF NOT EXISTS*/`springboot_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `springboot_db`;

DROP TABLE IF EXISTS `t_author`;

CREATE TABLE `t_author` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `real_name` varchar(32) NOT NULL COMMENT '用户名称',
  `nick_name` varchar(32) NOT NULL COMMENT '用户匿名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;