/* 
 Navicat Premium Data Transfer

 Source Server         : Local Mysql 1
 Source Server Type    : MySQL
 Source Server Version : 50632
 Source Host           : localhost:3306
 Source Schema         : hello

 Target Server Type    : MySQL
 Target Server Version : 50632
 File Encoding         : 65001

 Date: 29/05/2023 22:41:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(30) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'zhang3');
INSERT INTO `user` VALUES ('2', 'li4');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
