-- --------------------------------------------------------
-- 主机:                           192.168.2.185
-- 服务器版本:                        5.5.53-0+deb8u1 - (Debian)
-- 服务器操作系统:                      debian-linux-gnu
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 dashboard 的数据库结构
CREATE DATABASE IF NOT EXISTS `dashboard` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `dashboard`;

-- 导出  表 dashboard.t_tmall_trade 结构
CREATE TABLE IF NOT EXISTS `t_tmall_trade` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CONTENT` longtext,
  `CREATE_TIME` timestamp NULL DEFAULT NULL,
  `DATA_STATUS` tinyint(2) NOT NULL DEFAULT '0',
  `LAST_MODIFY_TIME` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
