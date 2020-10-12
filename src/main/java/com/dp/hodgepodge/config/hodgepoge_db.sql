/*
Navicat MySQL Data Transfer

Source Server         : hodgepoge
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : hodgepoge_db

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2020-10-12 17:45:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `news_title` varchar(255) CHARACTER SET utf8 DEFAULT '' COMMENT '标题',
  `news_links` varchar(255) DEFAULT NULL COMMENT '文章链接/播放地址，',
  `news_plays` int(11) DEFAULT '0' COMMENT '播放次数',
  `news_type_id` int(11) NOT NULL COMMENT '类型ID',
  `news_rhesis_ch` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '中文',
  `news_rhesis_en` varchar(255) CHARACTER SET utf8 DEFAULT '' COMMENT '英语',
  `news_author` varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '作者',
  `news_production` varchar(20) CHARACTER SET utf8 DEFAULT '' COMMENT '作品名称',
  `news_img` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '图片',
  `news_variety` int(11) NOT NULL DEFAULT '0' COMMENT '类型，音乐，视频，金句',
  `news_lives` int(11) DEFAULT '0' COMMENT '点赞数，',
  `news_collects` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`news_id`),
  KEY `news_type_id` (`news_type_id`),
  CONSTRAINT `news_type_id` FOREIGN KEY (`news_type_id`) REFERENCES `news_type` (`news_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('3', '', '', '0', '1', '世界上最短暂和最漫长的时间都在考场上。 ', '', '八月长安', '《你好，旧时光》', 'a2.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('4', '', '', '0', '1', '空气污染使威尼斯的石像患石癌，现在海枯石烂也快。 ', '', '安意如', '《人生若只如初见》', 'a2.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('5', '', '', '0', '1', '每个人都会有多重性格，会在不同的环境下，表现不同的自我。或开朗，或冷漠；或单纯，或世故。', '', '八月长安', '《你好，旧时光》', 'yi.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('6', '', '', '0', '1', ' 世界上，来路便是归途，归途也成来路', '', '冰心', '《灯塔》', 'ak.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('8', '', '', '0', '1', '世界上最短暂和最漫长的时间都在考场上。 ', '', '八月长安', '《你好，旧时光》', 'as.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('9', '', '', '0', '1', '世界上最短暂和最漫长的时间都在考场上。 ', '', '八月长安', '《你好，旧时光》', 'q1.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('10', '', '', '0', '1', '秋意正浓，骤雨初歇。寂静的江面落满红叶，在夕阳的映照下化为连绵的金色。雨后的阳光透过船窗，照亮了他的侧容。 ', '', '步非烟 ', '《无冕之后》', 'q12.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('11', '', '', '0', '1', '周围的一切笼罩着一种不安的平静，一种世界仍在继续成长，继续创造的平静，那世界似乎知道它得继续赶路，勇往直前，即便有时大地震或是致命风暴会让人感觉它的残酷无情，但这便是沧海桑田，世界也在游历，寻找着它的启示。', '', '保罗·戈埃罗', '', 'q23.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('12', '', '', '0', '1', '古今中外有学问的人，有成绩的人，总是十分留意积累的。知识就是积累起来的。我们对什么事都不应当像过眼烟云。 ', '', '邓拓', '', 'r3.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('13', '', '', '0', '1', '女人终究不是男人，后者死亡是最大的障碍，前者却必须在死亡之前面对贞洁这道森严门槛。', ' ', '烽火戏诸侯 ', '《雪中悍刀行》', 'sa2.jpg', '0', '123123', '12312');
INSERT INTO `news` VALUES ('14', '', '', '0', '1', '世界上最短暂和最漫长的时间都在考场上。 ', '', '八月长安', '《你好，旧时光》', 'w1.jpg', '0', '123123', '12312');

-- ----------------------------
-- Table structure for news_type
-- ----------------------------
DROP TABLE IF EXISTS `news_type`;
CREATE TABLE `news_type` (
  `news_type_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '类型ID',
  `news_type_name` varchar(10) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名字',
  `news_type_desc` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`news_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of news_type
-- ----------------------------
INSERT INTO `news_type` VALUES ('1', '名句', null);
INSERT INTO `news_type` VALUES ('2', '台词', null);
INSERT INTO `news_type` VALUES ('3', '英语', null);
