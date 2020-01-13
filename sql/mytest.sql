# --------------------------------------------------------
# Host:                         localhost
# Server version:               5.5.60-log
# Server OS:                    Win32
# HeidiSQL version:             6.0.0.3603
# Date/time:                    2018-11-15 16:36:45
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping database structure for my_new_ptt
DROP DATABASE IF EXISTS `my_new_ptt`;
CREATE DATABASE IF NOT EXISTS `my_new_ptt` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `my_new_ptt`;


# Dumping structure for table my_new_ptt.organization
DROP TABLE IF EXISTS `organization`;
CREATE TABLE IF NOT EXISTS `organization` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(64) NOT NULL COMMENT '组织名',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `code` varchar(64) NOT NULL COMMENT '编号',
  `icon` varchar(32) DEFAULT NULL COMMENT '图标',
  `pid` bigint(19) DEFAULT NULL COMMENT '父级主键',
  `seq` tinyint(2) NOT NULL DEFAULT '0' COMMENT '排序',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='组织机构';

# Dumping data for table my_new_ptt.organization: ~4 rows (approximately)
DELETE FROM `organization`;
/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
INSERT INTO `organization` (`id`, `name`, `address`, `code`, `icon`, `pid`, `seq`, `create_time`) VALUES
	(1, '总经办', '王家桥', '01', 'fi-social-windows', NULL, 0, '2014-02-19 01:00:00'),
	(3, '技术部', '', '02', 'fi-social-github', NULL, 1, '2015-10-01 13:10:42'),
	(5, '产品部', '', '03', 'fi-social-apple', NULL, 2, '2015-12-06 12:15:30'),
	(6, '测试组', '', '04', 'fi-social-snapchat', 3, 0, '2015-12-06 13:12:18');
/*!40000 ALTER TABLE `organization` ENABLE KEYS */;


# Dumping structure for table my_new_ptt.resource
DROP TABLE IF EXISTS `resource`;
CREATE TABLE IF NOT EXISTS `resource` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(64) NOT NULL COMMENT '资源名称',
  `url` varchar(100) DEFAULT NULL COMMENT '资源路径',
  `open_mode` varchar(32) DEFAULT NULL COMMENT '打开方式 ajax,iframe',
  `description` varchar(255) DEFAULT NULL COMMENT '资源介绍',
  `icon` varchar(32) DEFAULT NULL COMMENT '资源图标',
  `pid` bigint(19) DEFAULT NULL COMMENT '父级资源id',
  `seq` tinyint(2) NOT NULL DEFAULT '0' COMMENT '排序',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '状态',
  `opened` tinyint(2) NOT NULL DEFAULT '1' COMMENT '打开状态',
  `resource_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '资源类别',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `method` varchar(10) DEFAULT NULL COMMENT '请求方法：get、post......',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=232 DEFAULT CHARSET=utf8 COMMENT='资源';

# Dumping data for table my_new_ptt.resource: ~32 rows (approximately)
DELETE FROM `resource`;
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
INSERT INTO `resource` (`id`, `name`, `url`, `open_mode`, `description`, `icon`, `pid`, `seq`, `status`, `opened`, `resource_type`, `create_time`, `method`) VALUES
	(1, '权限管理', '', NULL, '系统管理', 'fi-folder', NULL, 0, 0, 1, 0, '2014-02-19 01:00:00', 'post'),
	(11, '资源管理', '/resource/manager', 'ajax', '资源管理', 'fi-database', 1, 1, 0, 1, 0, '2014-02-19 01:00:00', 'post'),
	(12, '角色管理', '/role/manager', 'ajax', '角色管理', 'fi-torso-business', 1, 2, 0, 1, 0, '2014-02-19 01:00:00', 'post'),
	(13, '用户管理', '/user/manager', 'ajax', '用户管理', 'fi-torsos-all', 1, 3, 0, 1, 0, '2014-02-19 01:00:00', 'post'),
	(14, '部门管理', '/organization/manager', 'ajax', '部门管理', 'fi-results-demographics', 1, 4, 0, 1, 0, '2014-02-19 01:00:00', 'post'),
	(111, '列表', '/resource/treeGrid', 'ajax', '资源列表', 'fi-list', 11, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(112, '添加', '/resource/add', 'ajax', '资源添加', 'fi-page-add', 11, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(113, '编辑', '/resource/edit', 'ajax', '资源编辑', 'fi-page-edit', 11, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(114, '删除', '/resource/delete', 'ajax', '资源删除', 'fi-page-delete', 11, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(121, '列表', '/role/dataGrid', 'ajax', '角色列表', 'fi-list', 12, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(122, '添加', '/role/add', 'ajax', '角色添加', 'fi-page-add', 12, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(123, '编辑', '/role/edit', 'ajax', '角色编辑', 'fi-page-edit', 12, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(124, '删除', '/role/delete', 'ajax', '角色删除', 'fi-page-delete', 12, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(125, '授权', '/role/grant', 'ajax', '角色授权', 'fi-check', 12, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(131, '列表', '/user/dataGrid', 'ajax', '用户列表', 'fi-list', 13, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(132, '添加', '/user/add', 'ajax', '用户添加', 'fi-page-add', 13, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(133, '编辑', '/user/edit', 'ajax', '用户编辑', 'fi-page-edit', 13, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(134, '删除', '/user/delete', 'ajax', '用户删除', 'fi-page-delete', 13, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(141, '列表', '/organization/treeGrid', 'ajax', '用户列表', 'fi-list', 14, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(142, '添加', '/organization/add', 'ajax', '部门添加', 'fi-page-add', 14, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(143, '编辑', '/organization/edit', 'ajax', '部门编辑', 'fi-page-edit', 14, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(144, '删除', '/organization/delete', 'ajax', '部门删除', 'fi-page-delete', 14, 0, 0, 1, 1, '2014-02-19 01:00:00', 'post'),
	(221, '日志监控', '', NULL, NULL, 'fi-folder', NULL, 3, 0, 0, 0, '2015-12-01 11:44:20', 'post'),
	(222, '视频教程', '', NULL, NULL, 'fi-folder', NULL, 2, 0, 0, 0, '2015-12-06 12:40:42', 'post'),
	(223, '官方网站', 'https://www.dreamlu.net', 'iframe', NULL, 'fi-home', 222, 0, 0, 1, 0, '2015-12-06 12:42:42', 'post'),
	(224, 'jfinal视频', 'http://blog.dreamlu.net/blog/79', 'iframe', NULL, 'fi-video', 222, 1, 0, 1, 0, '2015-12-06 12:45:28', 'post'),
	(226, '修改密码', '/user/editPwdPage', 'ajax', NULL, 'fi-unlock', NULL, 4, 0, 1, 1, '2015-12-07 20:23:06', 'post'),
	(227, '登录日志', '/sysLog/manager', 'ajax', NULL, 'fi-info', 221, 0, 0, 1, 0, '2016-09-30 22:10:53', 'post'),
	(228, 'Druid监控', '/druid', 'iframe', NULL, 'fi-monitor', 221, 0, 0, 1, 0, '2016-09-30 22:12:50', 'post'),
	(229, '系统图标', '/icons.html', 'ajax', NULL, 'fi-photo', 221, 0, 0, 1, 0, '2016-12-24 15:53:47', 'post'),
	(230, '文章管理', '', 'ajax', NULL, 'fi-page-multiple', NULL, 1, 0, 0, 0, '2016-12-24 15:53:47', 'post'),
	(231, '新建文章', '/article/create', 'ajax', NULL, 'fi-page-edit', 230, 0, 0, 1, 0, '2016-12-24 15:53:47', 'post');
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;


# Dumping structure for table my_new_ptt.role
DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(64) NOT NULL COMMENT '角色名',
  `seq` tinyint(2) NOT NULL DEFAULT '0' COMMENT '排序号',
  `description` varchar(255) DEFAULT NULL COMMENT '简介',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='角色';

# Dumping data for table my_new_ptt.role: ~4 rows (approximately)
DELETE FROM `role`;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`id`, `name`, `seq`, `description`, `status`) VALUES
	(1, 'admin', 0, '超级管理员', 0),
	(2, 'de', 0, '技术部经理', 0),
	(7, 'pm', 0, '产品部经理', 0),
	(8, 'test', 0, '测试账户', 0);
/*!40000 ALTER TABLE `role` ENABLE KEYS */;


# Dumping structure for table my_new_ptt.role_resource
DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE IF NOT EXISTS `role_resource` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_id` bigint(19) NOT NULL COMMENT '角色id',
  `resource_id` bigint(19) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`),
  KEY `idx_role_resource_ids` (`role_id`,`resource_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=481 DEFAULT CHARSET=utf8 COMMENT='角色资源';

# Dumping data for table my_new_ptt.role_resource: ~89 rows (approximately)
DELETE FROM `role_resource`;
/*!40000 ALTER TABLE `role_resource` DISABLE KEYS */;
INSERT INTO `role_resource` (`id`, `role_id`, `resource_id`) VALUES
	(409, 1, 1),
	(410, 1, 11),
	(415, 1, 12),
	(421, 1, 13),
	(426, 1, 14),
	(411, 1, 111),
	(412, 1, 112),
	(413, 1, 113),
	(414, 1, 114),
	(416, 1, 121),
	(417, 1, 122),
	(418, 1, 123),
	(419, 1, 124),
	(420, 1, 125),
	(422, 1, 131),
	(423, 1, 132),
	(424, 1, 133),
	(425, 1, 134),
	(427, 1, 141),
	(428, 1, 142),
	(429, 1, 143),
	(430, 1, 144),
	(434, 1, 221),
	(431, 1, 222),
	(432, 1, 223),
	(433, 1, 224),
	(435, 1, 227),
	(436, 1, 228),
	(437, 2, 1),
	(438, 2, 13),
	(439, 2, 131),
	(440, 2, 132),
	(441, 2, 133),
	(445, 2, 221),
	(442, 2, 222),
	(443, 2, 223),
	(444, 2, 224),
	(446, 2, 227),
	(447, 2, 228),
	(158, 3, 1),
	(159, 3, 11),
	(164, 3, 12),
	(170, 3, 13),
	(175, 3, 14),
	(160, 3, 111),
	(161, 3, 112),
	(162, 3, 113),
	(163, 3, 114),
	(165, 3, 121),
	(166, 3, 122),
	(167, 3, 123),
	(168, 3, 124),
	(169, 3, 125),
	(171, 3, 131),
	(172, 3, 132),
	(173, 3, 133),
	(174, 3, 134),
	(176, 3, 141),
	(177, 3, 142),
	(178, 3, 143),
	(179, 3, 144),
	(359, 7, 1),
	(360, 7, 14),
	(361, 7, 141),
	(362, 7, 142),
	(363, 7, 143),
	(367, 7, 221),
	(364, 7, 222),
	(365, 7, 223),
	(366, 7, 224),
	(368, 7, 226),
	(448, 8, 1),
	(449, 8, 11),
	(451, 8, 12),
	(453, 8, 13),
	(455, 8, 14),
	(450, 8, 111),
	(452, 8, 121),
	(454, 8, 131),
	(456, 8, 141),
	(460, 8, 221),
	(457, 8, 222),
	(458, 8, 223),
	(459, 8, 224),
	(461, 8, 227),
	(462, 8, 228),
	(478, 8, 229),
	(479, 8, 230),
	(480, 8, 231);
/*!40000 ALTER TABLE `role_resource` ENABLE KEYS */;


# Dumping structure for table my_new_ptt.sys_log
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE IF NOT EXISTS `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_name` varchar(255) DEFAULT NULL COMMENT '登陆名',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `opt_content` varchar(1024) DEFAULT NULL COMMENT '内容',
  `client_ip` varchar(255) DEFAULT NULL COMMENT '客户端ip',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统日志';

# Dumping data for table my_new_ptt.sys_log: ~0 rows (approximately)
DELETE FROM `sys_log`;
/*!40000 ALTER TABLE `sys_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_log` ENABLE KEYS */;


# Dumping structure for table my_new_ptt.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_name` varchar(64) NOT NULL COMMENT '登陆名',
  `username` varchar(64) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `salt` varchar(36) DEFAULT NULL COMMENT '密码加密盐',
  `sex` tinyint(2) NOT NULL DEFAULT '0' COMMENT '性别',
  `age` tinyint(2) DEFAULT '0' COMMENT '年龄',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `user_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '用户类别',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '用户状态',
  `organization_id` int(11) NOT NULL DEFAULT '0' COMMENT '所属机构',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `IDx_user_login_name` (`login_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='用户';

# Dumping data for table my_new_ptt.user: ~4 rows (approximately)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `login_name`, `username`, `password`, `salt`, `sex`, `age`, `phone`, `user_type`, `status`, `organization_id`, `create_time`) VALUES
	(1, 'admin', 'admin', ' e10adc3949ba59abbe56e057f20f883e', 'test', 0, 25, '18707173376', 0, 0, 1, '2015-12-06 13:14:05'),
	(13, 'snoopy', 'snoopy', '05a671c66aefea124cc08b76ea6d30bb', 'test', 0, 25, '18707173376', 1, 0, 3, '2015-10-01 13:12:07'),
	(14, 'dreamlu', 'dreamlu', '05a671c66aefea124cc08b76ea6d30bb', 'test', 0, 25, '18707173376', 1, 0, 5, '2015-10-11 23:12:58'),
	(15, 'test', 'test', '05a671c66aefea124cc08b76ea6d30bb', 'test', 0, 25, '18707173376', 1, 0, 6, '2015-12-06 13:13:03');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


# Dumping structure for table my_new_ptt.user_role
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE IF NOT EXISTS `user_role` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(19) NOT NULL COMMENT '用户id',
  `role_id` bigint(19) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`),
  KEY `idx_user_role_ids` (`user_id`,`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8 COMMENT='用户角色';

# Dumping data for table my_new_ptt.user_role: ~7 rows (approximately)
DELETE FROM `user_role`;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` (`id`, `user_id`, `role_id`) VALUES
	(60, 1, 1),
	(61, 1, 2),
	(62, 1, 7),
	(65, 1, 8),
	(63, 13, 2),
	(64, 14, 7),
	(53, 15, 8);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
