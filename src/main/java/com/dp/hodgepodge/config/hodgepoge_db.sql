/*
Navicat MySQL Data Transfer

Source Server         : hodgepoge
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : hodgepoge_db

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2020-10-15 18:01:57
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
  `news_musci_path` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '音乐路径',
  `news_time` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '时间',
  `news_musci_author` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '音乐作者',
  `news_music_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '音乐名称',
  `news_variety` int(11) NOT NULL DEFAULT '0' COMMENT '类型，0,句子，1，文章，2，音乐',
  `news_lives` int(11) DEFAULT '0' COMMENT '点赞数，',
  `news_collects` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`news_id`),
  KEY `news_type_id` (`news_type_id`),
  CONSTRAINT `news_type_id` FOREIGN KEY (`news_type_id`) REFERENCES `news_type` (`news_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('3', '', '', '0', '1', '世界上最短暂和最漫长的时间都在考场上。 ', '', '八月长安', '《你好，旧时光》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('4', '', '', '0', '1', '空气污染使威尼斯的石像患石癌，现在海枯石烂也快。 ', '', '安意如', '《人生若只如初见》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('5', '', '', '0', '1', '每个人都会有多重性格，会在不同的环境下，表现不同的自我。或开朗，或冷漠；或单纯，或世故。', '', '八月长安', '《你好，旧时光》', 'yi.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('6', '', '', '0', '1', ' 世界上，来路便是归途，归途也成来路', '', '冰心', '《灯塔》', 'ak.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('8', '洞穴', 'http://m.wufazhuce.com/article/4472', '0', '1', '我再没有办法对任何人讲出有关它的话语，也没有勇气对他人诉说内心的期待。', '', '消失', '', 'as.jpg', null, null, null, null, '1', '123123', '12312');
INSERT INTO `news` VALUES ('9', '曾经很长，一切难讲', '', '0', '1', '原来无论我在那里，都只是个孤独的异乡人而已。 ', '', '谢馆', '', 'q1.jpg', 'nsn.mp4', null, '排骨教主', '南山南', '2', '123123', '12312');
INSERT INTO `news` VALUES ('10', '', '', '0', '1', '秋意正浓，骤雨初歇。寂静的江面落满红叶，在夕阳的映照下化为连绵的金色。雨后的阳光透过船窗，照亮了他的侧容。 ', '', '步非烟 ', '《无冕之后》', 'q12.jpg', null, null, null, null, '1', '123123', '12312');
INSERT INTO `news` VALUES ('11', '', '', '0', '1', '周围的一切笼罩着一种不安的平静，一种世界仍在继续成长，继续创造的平静，那世界似乎知道它得继续赶路，勇往直前，即便有时大地震或是致命风暴会让人感觉它的残酷无情，但这便是沧海桑田，世界也在游历，寻找着它的启示。', '', '保罗·戈埃罗', '', 'q23.jpg', null, null, null, null, '1', '123123', '12312');
INSERT INTO `news` VALUES ('12', '', '', '0', '1', '古今中外有学问的人，有成绩的人，总是十分留意积累的。知识就是积累起来的。我们对什么事都不应当像过眼烟云。 ', '', '邓拓', '', 'r3.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('13', '', '', '0', '1', '女人终究不是男人，后者死亡是最大的障碍，前者却必须在死亡之前面对贞洁这道森严门槛。', ' ', '烽火戏诸侯 ', '《雪中悍刀行》', 'sa2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('14', '', '', '0', '1', '世界上最短暂和最漫长的时间都在考场上。 ', '', '八月长安', '《你好，旧时光》', 'w1.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('15', '', '', '0', '1', '笼屉啊笼屉，谁是世界上最尴尬的人？。 ', '', '叔本华', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('16', '', '', '0', '1', '不怕变成自己厌恶的人，我怕的是，过的还不如他们。。 ', '', '八月长安', '《你好，旧时光》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('17', '', '', '0', '1', '拼了命地不让身边的人难过，却发现，受伤的原来是我自己 ', '', '八月长安', '《你好，旧时光》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('18', '', '', '0', '1', '世界很小，城市很大，欠缺缘分的人也许终生也不会再见了 ', '', '闲人有闲', '《绝版空少》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('19', '', '', '0', '1', '在每个星光陨落的晚上，一遍一遍数我的寂寞。 ', '', '郭敬明', '《小时代》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('20', '', '', '0', '1', '爱情是鸟，有两张翅膀，折了一张便会坠地。 ', '', '方克强', '《爱有两张翅膀》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('21', '', '', '0', '1', '想不问归期的寻你，又怕风尘仆仆的深情扰了你，你看得到我眼里的银河，可我却只能看到你。 ', '', '网易云热评', '《万水》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('22', '', '', '0', '1', '凡永恒伟大的爱，都要绝望一次，消失一次，一度死，才会重获爱，重新知道生命的价值。 ', '', '木心', '《文学回忆录》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('23', '', '', '0', '1', '你要储蓄你的可爱，眷顾你的善良，变得勇敢。当这个世界越来越坏时，只希望你能越来越好。 ', '', '', '《南山南》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('24', '', '', '0', '1', '如果要给美好的人生一个定义，那就是惬意。如果要给惬意一个定义，那就是三五知己，谈笑风生。 ', '', '刘瑜', '《送你一颗子弹》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('25', '', '', '0', '1', '人生的旅程就是这样，用大把的时间迷茫，在几个瞬间成长 ', '', '瑞卡斯', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('26', '', '', '0', '1', '暗恋成了一种习惯，卑微已经根植在了骨子里，刮骨疗毒都抹不干净 ', '', '八月长安', '《暗恋》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('27', '', '', '0', '1', '月遇从云，花遇和风，今晚上的夜空很美，我又想你了。 ', '', '太宰治', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('28', '', '', '0', '1', '翻过高山，正遇江海。行过雪原，恰逢花期。这大概就是行走的意义。 ', '', '辉姑娘', '《这世界偷偷爱着你》', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('29', '', '', '0', '3', '言语非箭，却能刺破人心。。 ', 'A word is no arrow,but it can pierce the heart.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('30', '', '', '0', '2', '人偶尔会失足、迷失方向，但不等于会永远迷失下去。 ', 'Just because someone stumbles and loses their path,doesn`t mean they`re lost forever.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('31', '', '', '0', '2', '一个频频回头的人，是走不了远路的。 ', 'One who frequently looks back can·t go far.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('32', '', '', '0', '2', '越是睿智的人，越愿意读书，最有智慧的人读的书也最多。', 'The wiser a man becomes,the more he will read, and those who are wisest read most.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('33', '', '', '0', '2', '理性和非理性是互补的。两者分开的话，力量就会小很多。', 'The rational and the irrational complement each other.Individually,they are far less powerful.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('34', '', '', '0', '2', '因为不完美，所以才强大。因为有疑虑，所以才睿智。 ', 'You are strong because you are imperfect.You are wise because you have doubts.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('35', '', '', '0', '2', '书籍是灵魂的镜子。 ', 'Books are the mirrors of the soul.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('36', '', '', '0', '2', '胜利是不会向我们走来的，我必须自己走向胜利。 ', 'Victory won`t come to me unless I go to it.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('37', '', '', '0', '2', '沉重的担子是由那些有着坚强的肩膀的人来挑的。 ', 'Burdens are for shoulders strong enough to carry them.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('38', '', '', '0', '2', '我们为什么会跌倒？因为这样才能学会站起来！ ', 'Why do we fall ? So we can learn to pick ourselves up.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');
INSERT INTO `news` VALUES ('39', '', '', '0', '2', '人生的目标是唯一值得发现的财富。追求你的目标，无论它是什么，都将是稳定和不屈不挠。 ', 'An aim in life is the only fortune worth finding.Pursue your object, be it what it will, steadily and indefatigable.', '', '', 'a2.jpg', null, null, null, null, '0', '123123', '12312');

-- ----------------------------
-- Table structure for news_type
-- ----------------------------
DROP TABLE IF EXISTS `news_type`;
CREATE TABLE `news_type` (
  `news_type_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '类型ID',
  `news_type_name` varchar(255) CHARACTER SET utf8 DEFAULT '' COMMENT '名字',
  `news_type_desc` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`news_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of news_type
-- ----------------------------
INSERT INTO `news_type` VALUES ('1', '金句', null);
INSERT INTO `news_type` VALUES ('2', '台词', null);
INSERT INTO `news_type` VALUES ('3', '英语', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 NOT NULL COMMENT '用户名',
  `user_phone` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '手机号码',
  `user_pwd` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '密码',
  `user_mail` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '邮箱',
  `user_image` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '图片',
  `user_sex` varchar(2) CHARACTER SET utf8 DEFAULT NULL,
  `user_desc` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `user_state` int(11) NOT NULL DEFAULT '0' COMMENT '用户状态0，正常，1，账号停封',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '17611111111', '111111', '118172300@qq.com', null, '男', '备注', '0');
INSERT INTO `user` VALUES ('2', '李四', '17234451142', '111111', '1183949592@qq.com', null, '女', null, '0');
INSERT INTO `user` VALUES ('3', 'admin', '17620462376', 'admin', '1181620038@qq,com', null, '男', '管理员', '0');
INSERT INTO `user` VALUES ('4', '123123123', '187733', '187733', null, null, null, null, '0');
INSERT INTO `user` VALUES ('5', '1231231123', '1817733', '187733', null, null, null, null, '0');
INSERT INTO `user` VALUES ('6', '12312311123', '18177331', '123aa', null, null, null, null, '0');
INSERT INTO `user` VALUES ('7', 'zhangsn', '181773311', '1877qwe33', null, null, null, null, '0');
INSERT INTO `user` VALUES ('8', 'zhangsn', '1817733111', '1877qwe33', null, null, null, null, '0');
