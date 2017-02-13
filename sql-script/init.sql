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

--平台订单
create table trade_platfrom (
`id` BIGINT(19) NOT NULL AUTO_INCREMENT,
`adjust_fee` varchar(20) comment '',
`alipay_id` varchar(20) comment '',
`alipay_no` varchar(20) comment '',
`alipay_point` varchar(20) comment '',
`available_confirm_fee` varchar(20) comment '',
`buyer_alipay_no` varchar(20) comment '',
`buyer_area` varchar(20) comment '',
`buyer_cod_fee` varchar(20) comment '',
`buyer_email` varchar(20) comment '',
`buyer_message` varchar(20) comment '',
`buyer_nick` varchar(20) comment '',
`buyer_obtain_point_fee` varchar(20) comment '',
`buyer_rate` varchar(20) comment '',
`cod_fee` varchar(20) comment '',
`cod_status` varchar(20) comment '',
`commission_fee` varchar(20) comment '',
`created` varchar(20) comment '',
`discount_fee` varchar(20) comment '',
`has_post_fee` varchar(20) comment '',
`invoice_name` varchar(20) comment '',
`is_3D` varchar(20) comment '',
`is_brand_sale` varchar(20) comment '',
`is_daixiao` varchar(20) comment '',
`is_force_wlb` varchar(20) comment '',
`is_lgtype` varchar(20) comment '',
`is_part_consign` varchar(20) comment '',
`is_sh_ship` varchar(20) comment '',
`is_wt` varchar(20) comment '',
`modified` varchar(20) comment '',
`num` varchar(20) comment '',
`num_iid` varchar(20) comment '',
`pay_time` varchar(20) comment '',
`payment` varchar(20) comment '',
`pcc_af` varchar(20) comment '',
`pic_path` varchar(20) comment '',
`point_fee` varchar(20) comment '',
`post_fee` varchar(20) comment '',
`price` varchar(20) comment '',
`real_point_fee` varchar(20) comment '',
`received_payment` varchar(20) comment '',
`receiver_address` varchar(20) comment '',
`receiver_city` varchar(20) comment '',
`receiver_district` varchar(20) comment '',
`receiver_mobile` varchar(20) comment '',
`receiver_name` varchar(20) comment '',
`receiver_state` varchar(20) comment '',
`receiver_town` varchar(20) comment '',
`receiver_zip` varchar(20) comment '',
`seller_alipay_no` varchar(20) comment '',
`seller_can_rate` varchar(20) comment '',
`seller_cod_fee` varchar(20) comment '',
`seller_email` varchar(20) comment '',
`seller_flag` varchar(20) comment '',
`seller_mobile` varchar(20) comment '',
`seller_name` varchar(20) comment '',
`seller_nick` varchar(20) comment '',
`seller_phone` varchar(20) comment '',
`seller_rate` varchar(20) comment '',
`shipping_type` varchar(20) comment '',
`snapshot_url` varchar(20) comment '',
`status` varchar(20) comment '',
`tid` varchar(20) comment '',
`title` varchar(20) comment '',
`total_fee` varchar(20) comment '',
`trade_from` varchar(20) comment '',
`type` varchar(20) comment '',
primary(id)
);

--平台订单行
create table trade_order (
`id` BIGINT(19) NOT NULL AUTO_INCREMENT,
`adjust_fee` varchar(20) comment '',
`buyer_rate` varchar(20) comment '',
`cid` varchar(20) comment '',
`discount_fee` varchar(20) comment '',
`is_oversold` varchar(20) comment '',
`num` varchar(20) comment '',
`num_iid` varchar(20) comment '',
`oid` varchar(20) comment '',
`order_from` varchar(20) comment '',
`outer_sku_id` varchar(20) comment '',
`payment` varchar(20) comment '',
`pic_path` varchar(20) comment '',
`price` varchar(20) comment '',
`refund_status` varchar(20) comment '',
`seller_rate` varchar(20) comment '',
`seller_type` varchar(20) comment '',
`sku_id` varchar(20) comment '',
`sku_properties_name` varchar(20) comment '',
`snapshot_url` varchar(20) comment '',
`status` varchar(20) comment '',
`store_code` varchar(20) comment '',
`title` varchar(20) comment '',
`total_fee` varchar(20) comment '',
primary(id)
);

