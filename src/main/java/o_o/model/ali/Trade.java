package o_o.model.ali;

import java.util.Date;
import java.util.List;

import o_o.model.BaseEntity;

public class Trade extends BaseEntity {
	private static final long serialVersionUID = 6248157881735294164L;

	// ("acookie_id")
	private String acookieId;

	// ("adjust_fee")
	private String adjustFee;

	// ("alipay_id")
	private Long alipayId;

	// ("alipay_no")
	private String alipayNo;

	// ("alipay_point")
	private Long alipayPoint;

	// ("alipay_url")
	private String alipayUrl;

	// ("alipay_warn_msg")
	private String alipayWarnMsg;

	// ("area_id")
	private String areaId;

	// ("arrive_cut_time")
	private String arriveCutTime;

	// ("arrive_interval")
	private Long arriveInterval;

	// ("assembly")
	private String assembly;

	// ("async_modified")
	private Date asyncModified;

	// ("available_confirm_fee")
	private String availableConfirmFee;

	// ("buyer_alipay_no")
	private String buyerAlipayNo;

	// ("buyer_area")
	private String buyerArea;

	// ("buyer_cod_fee")
	private String buyerCodFee;

	// ("buyer_email")
	private String buyerEmail;

	// ("buyer_flag")
	private Long buyerFlag;

	// ("buyer_ip")
	private String buyerIp;

	// ("buyer_memo")
	private String buyerMemo;

	// ("buyer_message")
	private String buyerMessage;

	// ("buyer_nick")
	private String buyerNick;

	// ("buyer_obtain_point_fee")
	private Long buyerObtainPointFee;

	// ("buyer_rate")
	private Boolean buyerRate;

	// ("can_rate")
	private Boolean canRate;

	// ("cod_fee")
	private String codFee;

	// ("cod_status")
	private String codStatus;

	// ("commission_fee")
	private String commissionFee;

	// ("consign_interval")
	private Long consignInterval;

	// ("consign_time")
	private Date consignTime;

	// ("coupon_fee")
	private Long couponFee;

	// ("created")
	private Date created;

	// ("credit_card_fee")
	private String creditCardFee;

	// ("cross_bonded_declare")
	private Boolean crossBondedDeclare;

	// ("discount_fee")
	private String discountFee;

	// ("end_time")
	private Date endTime;

	// ("es_date")
	private String esDate;

	// ("es_range")
	private String esRange;

	// ("est_con_time")
	private String estConTime;

	// ("et_plate_number")
	private String etPlateNumber;

	// ("et_ser_time")
	private String etSerTime;

	// ("et_shop_id")
	private Long etShopId;

	// ("et_shop_name")
	private String etShopName;

	// ("et_type")
	private String etType;

	// ("et_verified_shop_name")
	private String etVerifiedShopName;

	// ("eticket_ext")
	private String eticketExt;

	// ("eticket_service_addr")
	private String eticketServiceAddr;

	// ("express_agency_fee")
	private String expressAgencyFee;

	// ("has_buyer_message")
	private Boolean hasBuyerMessage;

	// ("has_post_fee")
	private Boolean hasPostFee;

	// ("has_yfx")
	private Boolean hasYfx;

	// ("hk_birthday")
	private String hkBirthday;

	// ("hk_card_code")
	private String hkCardCode;

	// ("hk_card_type")
	private String hkCardType;

	// ("hk_china_name")
	private String hkChinaName;

	// ("hk_en_name")
	private String hkEnName;

	// ("hk_flight_date")
	private String hkFlightDate;

	// ("hk_flight_no")
	private String hkFlightNo;

	// ("hk_gender")
	private String hkGender;

	// ("hk_pickup")
	private String hkPickup;

	// ("hk_pickup_id")
	private String hkPickupId;

	// ("iid")
	private String iid;

	// ("invoice_kind")
	private String invoiceKind;

	// ("invoice_name")
	private String invoiceName;

	// ("invoice_type")
	private String invoiceType;

	// ("is_3D")
	private Boolean is3D;

	// ("is_brand_sale")
	private Boolean isBrandSale;

	// ("is_daixiao")
	private Boolean isDaixiao;

	// ("is_force_wlb")
	private Boolean isForceWlb;

	// ("is_lgtype")
	private Boolean isLgtype;

	// ("is_part_consign")
	private Boolean isPartConsign;

	// ("is_sh_ship")
	private Boolean isShShip;

	// ("is_wt")
	private Boolean isWt;

	// ("lg_aging")
	private String lgAging;

	// ("lg_aging_type")
	private String lgAgingType;

	// ("mark_desc")
	private String markDesc;

	// ("market")
	private String market;

	// ("modified")
	private Date modified;

	// ("num")
	private Long num;

	// ("num_iid")
	private Long numIid;

	// ("nut_feature")
	private String nutFeature;

	// ("o2o")
	private String o2o;

	// ("o2o_delivery")
	private String o2oDelivery;

	// ("o2o_et_order_id")
	private String o2oEtOrderId;

	// ("o2o_guide_id")
	private String o2oGuideId;

	// ("o2o_guide_name")
	private String o2oGuideName;

	// ("o2o_out_trade_id")
	private String o2oOutTradeId;

	// ("o2o_shop_id")
	private String o2oShopId;

	// ("o2o_shop_name")
	private String o2oShopName;

	// ("o2o_snatch_status")
	private String o2oSnatchStatus;

	// ("obs")
	private String obs;

	// ("omni_attr")
	private String omniAttr;

	// ("omni_param")
	private String omniParam;

	// ("omnichannel_param")
	private String omnichannelParam;

	// ("order_tax_fee")
	private String orderTaxFee;

	// ("orders")
	// ("order")
	private List<Order> orders;

	// ("os_date")
	private String osDate;

	// ("os_range")
	private String osRange;

	// ("paid_coupon_fee")
	private String paidCouponFee;

	// ("pay_time")
	private Date payTime;

	// ("payment")
	private String payment;

	// ("pcc_af")
	private Long pccAf;

	// ("pic_path")
	private String picPath;

	// ("point_fee")
	private Long pointFee;

	// ("post_fee")
	private String postFee;

	// ("post_gate_declare")
	private Boolean postGateDeclare;

	// ("price")
	private String price;

	// ("promotion")
	private String promotion;

	// ("promotion_detail")
	private List<PromotionDetail> promotionDetails;

	// ("real_point_fee")
	private Long realPointFee;

	// ("received_payment")
	private String receivedPayment;

	// ("receiver_address")
	private String receiverAddress;

	// ("receiver_city")
	private String receiverCity;

	// ("receiver_country")
	private String receiverCountry;

	// ("receiver_district")
	private String receiverDistrict;

	// ("receiver_mobile")
	private String receiverMobile;

	// ("receiver_name")
	private String receiverName;

	// ("receiver_phone")
	private String receiverPhone;

	// ("receiver_state")
	private String receiverState;

	// ("receiver_town")
	private String receiverTown;

	// ("receiver_zip")
	private String receiverZip;

	// ("rx_audit_status")
	private String rxAuditStatus;

	// ("seller_alipay_no")
	private String sellerAlipayNo;

	// ("seller_can_rate")
	private Boolean sellerCanRate;

	// ("seller_cod_fee")
	private String sellerCodFee;

	// ("seller_email")
	private String sellerEmail;

	// ("seller_flag")
	private Long sellerFlag;

	// ("seller_memo")
	private String sellerMemo;

	// ("seller_mobile")
	private String sellerMobile;

	// ("seller_name")
	private String sellerName;

	// ("seller_nick")
	private String sellerNick;

	// ("seller_phone")
	private String sellerPhone;

	// ("seller_rate")
	private Boolean sellerRate;

	// ("send_time")
	private String sendTime;

	// ("service_orders")
	// ("service_order")
	private List<ServiceOrder> serviceOrders;

	// ("service_tags")
	// ("logistics_tag")
	private List<LogisticsTag> serviceTags;

	// ("shipping_type")
	private String shippingType;

	// ("shop_code")
	private String shopCode;

	// ("shop_pick")
	private String shopPick;

	// ("sid")
	private String sid;

	// ("snapshot")
	private String snapshot;

	// ("snapshot_url")
	private String snapshotUrl;

	// ("status")
	private String status;

	// ("step_paid_fee")
	private String stepPaidFee;

	// ("step_trade_status")
	private String stepTradeStatus;

	// ("tid")
	private Long tid;

	// ("timeout_action_time")
	private Date timeoutActionTime;

	// ("title")
	private String title;

	// ("top_hold")
	private Long topHold;

	// ("total_fee")
	private String totalFee;

	// ("trade_attr")
	private String tradeAttr;

	// ("trade_ext")
	private TradeExt tradeExt;

	// ("trade_from")
	private String tradeFrom;

	// ("trade_memo")
	private String tradeMemo;

	// ("trade_source")
	private String tradeSource;

	// ("type")
	private String type;

	// ("yfx_fee")
	private String yfxFee;

	// ("yfx_id")
	private String yfxId;

	// ("yfx_type")
	private String yfxType;

	// ("zero_purchase")
	private Boolean zeroPurchase;

	public String getAcookieId() {
		return this.acookieId;
	}

	public void setAcookieId(String acookieId) {
		this.acookieId = acookieId;
	}

	public String getAdjustFee() {
		return this.adjustFee;
	}

	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public Long getAlipayId() {
		return this.alipayId;
	}

	public void setAlipayId(Long alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public Long getAlipayPoint() {
		return this.alipayPoint;
	}

	public void setAlipayPoint(Long alipayPoint) {
		this.alipayPoint = alipayPoint;
	}

	public String getAlipayUrl() {
		return this.alipayUrl;
	}

	public void setAlipayUrl(String alipayUrl) {
		this.alipayUrl = alipayUrl;
	}

	public String getAlipayWarnMsg() {
		return this.alipayWarnMsg;
	}

	public void setAlipayWarnMsg(String alipayWarnMsg) {
		this.alipayWarnMsg = alipayWarnMsg;
	}

	public String getAreaId() {
		return this.areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getArriveCutTime() {
		return this.arriveCutTime;
	}

	public void setArriveCutTime(String arriveCutTime) {
		this.arriveCutTime = arriveCutTime;
	}

	public Long getArriveInterval() {
		return this.arriveInterval;
	}

	public void setArriveInterval(Long arriveInterval) {
		this.arriveInterval = arriveInterval;
	}

	public String getAssembly() {
		return this.assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public Date getAsyncModified() {
		return this.asyncModified;
	}

	public void setAsyncModified(Date asyncModified) {
		this.asyncModified = asyncModified;
	}

	public String getAvailableConfirmFee() {
		return this.availableConfirmFee;
	}

	public void setAvailableConfirmFee(String availableConfirmFee) {
		this.availableConfirmFee = availableConfirmFee;
	}

	public String getBuyerAlipayNo() {
		return this.buyerAlipayNo;
	}

	public void setBuyerAlipayNo(String buyerAlipayNo) {
		this.buyerAlipayNo = buyerAlipayNo;
	}

	public String getBuyerArea() {
		return this.buyerArea;
	}

	public void setBuyerArea(String buyerArea) {
		this.buyerArea = buyerArea;
	}

	public String getBuyerCodFee() {
		return this.buyerCodFee;
	}

	public void setBuyerCodFee(String buyerCodFee) {
		this.buyerCodFee = buyerCodFee;
	}

	public String getBuyerEmail() {
		return this.buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public Long getBuyerFlag() {
		return this.buyerFlag;
	}

	public void setBuyerFlag(Long buyerFlag) {
		this.buyerFlag = buyerFlag;
	}

	public String getBuyerIp() {
		return this.buyerIp;
	}

	public void setBuyerIp(String buyerIp) {
		this.buyerIp = buyerIp;
	}

	public String getBuyerMemo() {
		return this.buyerMemo;
	}

	public void setBuyerMemo(String buyerMemo) {
		this.buyerMemo = buyerMemo;
	}

	public String getBuyerMessage() {
		return this.buyerMessage;
	}

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getBuyerObtainPointFee() {
		return this.buyerObtainPointFee;
	}

	public void setBuyerObtainPointFee(Long buyerObtainPointFee) {
		this.buyerObtainPointFee = buyerObtainPointFee;
	}

	public Boolean getBuyerRate() {
		return this.buyerRate;
	}

	public void setBuyerRate(Boolean buyerRate) {
		this.buyerRate = buyerRate;
	}

	public Boolean getCanRate() {
		return this.canRate;
	}

	public void setCanRate(Boolean canRate) {
		this.canRate = canRate;
	}

	public String getCodFee() {
		return this.codFee;
	}

	public void setCodFee(String codFee) {
		this.codFee = codFee;
	}

	public String getCodStatus() {
		return this.codStatus;
	}

	public void setCodStatus(String codStatus) {
		this.codStatus = codStatus;
	}

	public String getCommissionFee() {
		return this.commissionFee;
	}

	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
	}

	public Long getConsignInterval() {
		return this.consignInterval;
	}

	public void setConsignInterval(Long consignInterval) {
		this.consignInterval = consignInterval;
	}

	public Date getConsignTime() {
		return this.consignTime;
	}

	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}

	public Long getCouponFee() {
		return this.couponFee;
	}

	public void setCouponFee(Long couponFee) {
		this.couponFee = couponFee;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreditCardFee() {
		return this.creditCardFee;
	}

	public void setCreditCardFee(String creditCardFee) {
		this.creditCardFee = creditCardFee;
	}

	public Boolean getCrossBondedDeclare() {
		return this.crossBondedDeclare;
	}

	public void setCrossBondedDeclare(Boolean crossBondedDeclare) {
		this.crossBondedDeclare = crossBondedDeclare;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}

	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEsDate() {
		return this.esDate;
	}

	public void setEsDate(String esDate) {
		this.esDate = esDate;
	}

	public String getEsRange() {
		return this.esRange;
	}

	public void setEsRange(String esRange) {
		this.esRange = esRange;
	}

	public String getEstConTime() {
		return this.estConTime;
	}

	public void setEstConTime(String estConTime) {
		this.estConTime = estConTime;
	}

	public String getEtPlateNumber() {
		return this.etPlateNumber;
	}

	public void setEtPlateNumber(String etPlateNumber) {
		this.etPlateNumber = etPlateNumber;
	}

	public String getEtSerTime() {
		return this.etSerTime;
	}

	public void setEtSerTime(String etSerTime) {
		this.etSerTime = etSerTime;
	}

	public Long getEtShopId() {
		return this.etShopId;
	}

	public void setEtShopId(Long etShopId) {
		this.etShopId = etShopId;
	}

	public String getEtShopName() {
		return this.etShopName;
	}

	public void setEtShopName(String etShopName) {
		this.etShopName = etShopName;
	}

	public String getEtType() {
		return this.etType;
	}

	public void setEtType(String etType) {
		this.etType = etType;
	}

	public String getEtVerifiedShopName() {
		return this.etVerifiedShopName;
	}

	public void setEtVerifiedShopName(String etVerifiedShopName) {
		this.etVerifiedShopName = etVerifiedShopName;
	}

	public String getEticketExt() {
		return this.eticketExt;
	}

	public void setEticketExt(String eticketExt) {
		this.eticketExt = eticketExt;
	}

	public String getEticketServiceAddr() {
		return this.eticketServiceAddr;
	}

	public void setEticketServiceAddr(String eticketServiceAddr) {
		this.eticketServiceAddr = eticketServiceAddr;
	}

	public String getExpressAgencyFee() {
		return this.expressAgencyFee;
	}

	public void setExpressAgencyFee(String expressAgencyFee) {
		this.expressAgencyFee = expressAgencyFee;
	}

	public Boolean getHasBuyerMessage() {
		return this.hasBuyerMessage;
	}

	public void setHasBuyerMessage(Boolean hasBuyerMessage) {
		this.hasBuyerMessage = hasBuyerMessage;
	}

	public Boolean getHasPostFee() {
		return this.hasPostFee;
	}

	public void setHasPostFee(Boolean hasPostFee) {
		this.hasPostFee = hasPostFee;
	}

	public Boolean getHasYfx() {
		return this.hasYfx;
	}

	public void setHasYfx(Boolean hasYfx) {
		this.hasYfx = hasYfx;
	}

	public String getHkBirthday() {
		return this.hkBirthday;
	}

	public void setHkBirthday(String hkBirthday) {
		this.hkBirthday = hkBirthday;
	}

	public String getHkCardCode() {
		return this.hkCardCode;
	}

	public void setHkCardCode(String hkCardCode) {
		this.hkCardCode = hkCardCode;
	}

	public String getHkCardType() {
		return this.hkCardType;
	}

	public void setHkCardType(String hkCardType) {
		this.hkCardType = hkCardType;
	}

	public String getHkChinaName() {
		return this.hkChinaName;
	}

	public void setHkChinaName(String hkChinaName) {
		this.hkChinaName = hkChinaName;
	}

	public String getHkEnName() {
		return this.hkEnName;
	}

	public void setHkEnName(String hkEnName) {
		this.hkEnName = hkEnName;
	}

	public String getHkFlightDate() {
		return this.hkFlightDate;
	}

	public void setHkFlightDate(String hkFlightDate) {
		this.hkFlightDate = hkFlightDate;
	}

	public String getHkFlightNo() {
		return this.hkFlightNo;
	}

	public void setHkFlightNo(String hkFlightNo) {
		this.hkFlightNo = hkFlightNo;
	}

	public String getHkGender() {
		return this.hkGender;
	}

	public void setHkGender(String hkGender) {
		this.hkGender = hkGender;
	}

	public String getHkPickup() {
		return this.hkPickup;
	}

	public void setHkPickup(String hkPickup) {
		this.hkPickup = hkPickup;
	}

	public String getHkPickupId() {
		return this.hkPickupId;
	}

	public void setHkPickupId(String hkPickupId) {
		this.hkPickupId = hkPickupId;
	}

	public String getIid() {
		return this.iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}

	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceName() {
		return this.invoiceName;
	}

	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}

	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public Boolean getIsBrandSale() {
		return this.isBrandSale;
	}

	public void setIsBrandSale(Boolean isBrandSale) {
		this.isBrandSale = isBrandSale;
	}

	public Boolean getIsDaixiao() {
		return this.isDaixiao;
	}

	public void setIsDaixiao(Boolean isDaixiao) {
		this.isDaixiao = isDaixiao;
	}

	public Boolean getIsForceWlb() {
		return this.isForceWlb;
	}

	public void setIsForceWlb(Boolean isForceWlb) {
		this.isForceWlb = isForceWlb;
	}

	public Boolean getIsLgtype() {
		return this.isLgtype;
	}

	public void setIsLgtype(Boolean isLgtype) {
		this.isLgtype = isLgtype;
	}

	public Boolean getIsPartConsign() {
		return this.isPartConsign;
	}

	public void setIsPartConsign(Boolean isPartConsign) {
		this.isPartConsign = isPartConsign;
	}

	public Boolean getIsShShip() {
		return this.isShShip;
	}

	public void setIsShShip(Boolean isShShip) {
		this.isShShip = isShShip;
	}

	public Boolean getIsWt() {
		return this.isWt;
	}

	public void setIsWt(Boolean isWt) {
		this.isWt = isWt;
	}

	public String getLgAging() {
		return this.lgAging;
	}

	public void setLgAging(String lgAging) {
		this.lgAging = lgAging;
	}

	public String getLgAgingType() {
		return this.lgAgingType;
	}

	public void setLgAgingType(String lgAgingType) {
		this.lgAgingType = lgAgingType;
	}

	public String getMarkDesc() {
		return this.markDesc;
	}

	public void setMarkDesc(String markDesc) {
		this.markDesc = markDesc;
	}

	public String getMarket() {
		return this.market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getNum() {
		return this.num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getNutFeature() {
		return this.nutFeature;
	}

	public void setNutFeature(String nutFeature) {
		this.nutFeature = nutFeature;
	}

	public String getO2o() {
		return this.o2o;
	}

	public void setO2o(String o2o) {
		this.o2o = o2o;
	}

	public String getO2oDelivery() {
		return this.o2oDelivery;
	}

	public void setO2oDelivery(String o2oDelivery) {
		this.o2oDelivery = o2oDelivery;
	}

	public String getO2oEtOrderId() {
		return this.o2oEtOrderId;
	}

	public void setO2oEtOrderId(String o2oEtOrderId) {
		this.o2oEtOrderId = o2oEtOrderId;
	}

	public String getO2oGuideId() {
		return this.o2oGuideId;
	}

	public void setO2oGuideId(String o2oGuideId) {
		this.o2oGuideId = o2oGuideId;
	}

	public String getO2oGuideName() {
		return this.o2oGuideName;
	}

	public void setO2oGuideName(String o2oGuideName) {
		this.o2oGuideName = o2oGuideName;
	}

	public String getO2oOutTradeId() {
		return this.o2oOutTradeId;
	}

	public void setO2oOutTradeId(String o2oOutTradeId) {
		this.o2oOutTradeId = o2oOutTradeId;
	}

	public String getO2oShopId() {
		return this.o2oShopId;
	}

	public void setO2oShopId(String o2oShopId) {
		this.o2oShopId = o2oShopId;
	}

	public String getO2oShopName() {
		return this.o2oShopName;
	}

	public void setO2oShopName(String o2oShopName) {
		this.o2oShopName = o2oShopName;
	}

	public String getO2oSnatchStatus() {
		return this.o2oSnatchStatus;
	}

	public void setO2oSnatchStatus(String o2oSnatchStatus) {
		this.o2oSnatchStatus = o2oSnatchStatus;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getOmniAttr() {
		return this.omniAttr;
	}

	public void setOmniAttr(String omniAttr) {
		this.omniAttr = omniAttr;
	}

	public String getOmniParam() {
		return this.omniParam;
	}

	public void setOmniParam(String omniParam) {
		this.omniParam = omniParam;
	}

	public String getOmnichannelParam() {
		return this.omnichannelParam;
	}

	public void setOmnichannelParam(String omnichannelParam) {
		this.omnichannelParam = omnichannelParam;
	}

	public String getOrderTaxFee() {
		return this.orderTaxFee;
	}

	public void setOrderTaxFee(String orderTaxFee) {
		this.orderTaxFee = orderTaxFee;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getOsDate() {
		return this.osDate;
	}

	public void setOsDate(String osDate) {
		this.osDate = osDate;
	}

	public String getOsRange() {
		return this.osRange;
	}

	public void setOsRange(String osRange) {
		this.osRange = osRange;
	}

	public String getPaidCouponFee() {
		return this.paidCouponFee;
	}

	public void setPaidCouponFee(String paidCouponFee) {
		this.paidCouponFee = paidCouponFee;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Long getPccAf() {
		return this.pccAf;
	}

	public void setPccAf(Long pccAf) {
		this.pccAf = pccAf;
	}

	public String getPicPath() {
		return this.picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Long getPointFee() {
		return this.pointFee;
	}

	public void setPointFee(Long pointFee) {
		this.pointFee = pointFee;
	}

	public String getPostFee() {
		return this.postFee;
	}

	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Boolean getPostGateDeclare() {
		return this.postGateDeclare;
	}

	public void setPostGateDeclare(Boolean postGateDeclare) {
		this.postGateDeclare = postGateDeclare;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPromotion() {
		return this.promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public List<PromotionDetail> getPromotionDetails() {
		return this.promotionDetails;
	}

	public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

	public Long getRealPointFee() {
		return this.realPointFee;
	}

	public void setRealPointFee(Long realPointFee) {
		this.realPointFee = realPointFee;
	}

	public String getReceivedPayment() {
		return this.receivedPayment;
	}

	public void setReceivedPayment(String receivedPayment) {
		this.receivedPayment = receivedPayment;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverCountry() {
		return this.receiverCountry;
	}

	public void setReceiverCountry(String receiverCountry) {
		this.receiverCountry = receiverCountry;
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}

	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverState() {
		return this.receiverState;
	}

	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public String getReceiverTown() {
		return this.receiverTown;
	}

	public void setReceiverTown(String receiverTown) {
		this.receiverTown = receiverTown;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}

	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getRxAuditStatus() {
		return this.rxAuditStatus;
	}

	public void setRxAuditStatus(String rxAuditStatus) {
		this.rxAuditStatus = rxAuditStatus;
	}

	public String getSellerAlipayNo() {
		return this.sellerAlipayNo;
	}

	public void setSellerAlipayNo(String sellerAlipayNo) {
		this.sellerAlipayNo = sellerAlipayNo;
	}

	public Boolean getSellerCanRate() {
		return this.sellerCanRate;
	}

	public void setSellerCanRate(Boolean sellerCanRate) {
		this.sellerCanRate = sellerCanRate;
	}

	public String getSellerCodFee() {
		return this.sellerCodFee;
	}

	public void setSellerCodFee(String sellerCodFee) {
		this.sellerCodFee = sellerCodFee;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public Long getSellerFlag() {
		return this.sellerFlag;
	}

	public void setSellerFlag(Long sellerFlag) {
		this.sellerFlag = sellerFlag;
	}

	public String getSellerMemo() {
		return this.sellerMemo;
	}

	public void setSellerMemo(String sellerMemo) {
		this.sellerMemo = sellerMemo;
	}

	public String getSellerMobile() {
		return this.sellerMobile;
	}

	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public Boolean getSellerRate() {
		return this.sellerRate;
	}

	public void setSellerRate(Boolean sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public List<ServiceOrder> getServiceOrders() {
		return this.serviceOrders;
	}

	public void setServiceOrders(List<ServiceOrder> serviceOrders) {
		this.serviceOrders = serviceOrders;
	}

	public List<LogisticsTag> getServiceTags() {
		return this.serviceTags;
	}

	public void setServiceTags(List<LogisticsTag> serviceTags) {
		this.serviceTags = serviceTags;
	}

	public String getShippingType() {
		return this.shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getShopCode() {
		return this.shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getShopPick() {
		return this.shopPick;
	}

	public void setShopPick(String shopPick) {
		this.shopPick = shopPick;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSnapshot() {
		return this.snapshot;
	}

	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}

	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStepPaidFee() {
		return this.stepPaidFee;
	}

	public void setStepPaidFee(String stepPaidFee) {
		this.stepPaidFee = stepPaidFee;
	}

	public String getStepTradeStatus() {
		return this.stepTradeStatus;
	}

	public void setStepTradeStatus(String stepTradeStatus) {
		this.stepTradeStatus = stepTradeStatus;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Date getTimeoutActionTime() {
		return this.timeoutActionTime;
	}

	public void setTimeoutActionTime(Date timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTopHold() {
		return this.topHold;
	}

	public void setTopHold(Long topHold) {
		this.topHold = topHold;
	}

	public String getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeAttr() {
		return this.tradeAttr;
	}

	public void setTradeAttr(String tradeAttr) {
		this.tradeAttr = tradeAttr;
	}

	public void setTradeAttrString(String tradeAttr) {
		this.tradeAttr = tradeAttr;
	}

	public TradeExt getTradeExt() {
		return this.tradeExt;
	}

	public void setTradeExt(TradeExt tradeExt) {
		this.tradeExt = tradeExt;
	}

	public String getTradeFrom() {
		return this.tradeFrom;
	}

	public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}

	public String getTradeMemo() {
		return this.tradeMemo;
	}

	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public String getTradeSource() {
		return this.tradeSource;
	}

	public void setTradeSource(String tradeSource) {
		this.tradeSource = tradeSource;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYfxFee() {
		return this.yfxFee;
	}

	public void setYfxFee(String yfxFee) {
		this.yfxFee = yfxFee;
	}

	public String getYfxId() {
		return this.yfxId;
	}

	public void setYfxId(String yfxId) {
		this.yfxId = yfxId;
	}

	public String getYfxType() {
		return this.yfxType;
	}

	public void setYfxType(String yfxType) {
		this.yfxType = yfxType;
	}

	public Boolean getZeroPurchase() {
		return this.zeroPurchase;
	}

	public void setZeroPurchase(Boolean zeroPurchase) {
		this.zeroPurchase = zeroPurchase;
	}
}