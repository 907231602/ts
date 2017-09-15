/*
Navicat MySQL Data Transfer

Source Server         : ee
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : mldn

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-09-15 13:14:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'pp', 'pp');
INSERT INTO `user` VALUES ('2', 'qq', 'qq');
INSERT INTO `user` VALUES ('3', 'ww', 'ww');
