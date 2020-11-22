/*
 Navicat Premium Data Transfer

 Source Server         : connect1
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : reddotbus

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 21/11/2020 10:22:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bus
-- ----------------------------
DROP TABLE IF EXISTS `bus`;
CREATE TABLE `bus`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '汽车编号',
  `driver_id` int(11) NULL DEFAULT NULL,
  `status` int(255) NULL DEFAULT NULL COMMENT '0为维护中，1为可使用',
  `type` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bus
-- ----------------------------
INSERT INTO `bus` VALUES (1, '津A1234', 2, 1, NULL);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户id',
  `start_time` datetime(0) NOT NULL COMMENT '出发时间',
  `end_time` datetime(0) NULL DEFAULT NULL COMMENT '完成时间',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '订单创建时间',
  `finished` tinyint(3) UNSIGNED ZEROFILL NOT NULL DEFAULT 000 COMMENT '0没完成，1完成',
  `bus_id` bigint(20) NULL DEFAULT NULL COMMENT '车辆id',
  `assigned` tinyint(3) NULL DEFAULT 0 COMMENT '0未分配，1已分配',
  `money` float(11, 0) NULL DEFAULT 1 COMMENT '支付金额',
  `start_location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `end_location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `passenger_number` int(100) NOT NULL,
  `token` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '电子票据字段',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, 2, '2020-11-10 20:40:50', NULL, '2020-11-04 20:40:47', 000, 0, 0, 9, 'uguyi', '90u87t8gy', 11, NULL);
INSERT INTO `order` VALUES (2, 2, '2020-11-10 20:40:50', NULL, '2020-11-04 20:40:47', 000, 0, 0, 9, 'uguyi', '90u87t8gy', 11, NULL);
INSERT INTO `order` VALUES (3, 1, '2018-09-18 18:11:11', NULL, '2020-11-19 20:58:37', 000, 0, 0, 2, '天津', '北京', 11, NULL);
INSERT INTO `order` VALUES (4, 1, '2018-09-18 18:11:11', NULL, '2020-11-19 20:59:59', 001, 0, 0, 3, '天津', '北京', 11, NULL);
INSERT INTO `order` VALUES (5, 1, '2018-09-18 18:11:11', NULL, '2020-11-19 21:07:49', 001, 0, 0, 3, '天津', '北京', 11, NULL);
INSERT INTO `order` VALUES (6, 1, '2018-09-18 18:11:11', NULL, '2020-11-21 09:57:20', 000, 8, 0, 3, '天津', '北京', 0, NULL);
INSERT INTO `order` VALUES (7, 1, '2018-09-18 18:11:11', NULL, '2020-11-21 10:09:39', 001, 8, 0, 3, '天津', '北京', 0, '1db9eb27-a51d-4119-8428-b247862cdbce');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` tinyint(3) NULL DEFAULT NULL COMMENT '0为用户，1为司机，2为管理员',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'testuser', '123456', NULL, 0);
INSERT INTO `user` VALUES (2, 'testdriver', '123456', NULL, 1);
INSERT INTO `user` VALUES (3, 'testadmin', '123456', NULL, 2);
INSERT INTO `user` VALUES (4, 'test111', '123456', NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;
