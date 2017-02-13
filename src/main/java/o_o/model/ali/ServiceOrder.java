package o_o.model.ali;

import o_o.model.BaseEntity;

public class ServiceOrder extends BaseEntity {
	private static final long serialVersionUID = 1385883442119289176L;

	// ("buyer_nick")
	private String buyerNick;

	// ("et_plate_number")
	private String etPlateNumber;

	// ("et_ser_time")
	private String etSerTime;

	// ("et_shop_name")
	private String etShopName;

	// ("et_verified_shop_name")
	private String etVerifiedShopName;

	// ("item_oid")
	private Long itemOid;

	// ("num")
	private Long num;

	// ("oid")
	private Long oid;

	// ("payment")
	private String payment;

	// ("pic_path")
	private String picPath;

	// ("price")
	private String price;

	// ("refund_id")
	private Long refundId;

	// ("seller_nick")
	private String sellerNick;

	// ("service_detail_url")
	private String serviceDetailUrl;

	// ("service_id")
	private Long serviceId;

	// ("title")
	private String title;

	// ("tmser_spu_code")
	private String tmserSpuCode;

	// ("total_fee")
	private String totalFee;

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
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

	public String getEtShopName() {
		return this.etShopName;
	}

	public void setEtShopName(String etShopName) {
		this.etShopName = etShopName;
	}

	public String getEtVerifiedShopName() {
		return this.etVerifiedShopName;
	}

	public void setEtVerifiedShopName(String etVerifiedShopName) {
		this.etVerifiedShopName = etVerifiedShopName;
	}

	public Long getItemOid() {
		return this.itemOid;
	}

	public void setItemOid(Long itemOid) {
		this.itemOid = itemOid;
	}

	public Long getNum() {
		return this.num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public Long getOid() {
		return this.oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPicPath() {
		return this.picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getServiceDetailUrl() {
		return this.serviceDetailUrl;
	}

	public void setServiceDetailUrl(String serviceDetailUrl) {
		this.serviceDetailUrl = serviceDetailUrl;
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTmserSpuCode() {
		return this.tmserSpuCode;
	}

	public void setTmserSpuCode(String tmserSpuCode) {
		this.tmserSpuCode = tmserSpuCode;
	}

	public String getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
}