package o_o.model.ali;

import o_o.model.BaseEntity;

public class PromotionDetail extends BaseEntity {
	private static final long serialVersionUID = 8827845999958643124L;

	// ("discount_fee")
	private String discountFee;

	// ("gift_item_id")
	private String giftItemId;

	// ("gift_item_name")
	private String giftItemName;

	// ("gift_item_num")
	private String giftItemNum;

	// ("id")
	private Long id;

	// ("promotion_desc")
	private String promotionDesc;

	// ("promotion_id")
	private String promotionId;

	// ("promotion_name")
	private String promotionName;

	public String getDiscountFee() {
		return this.discountFee;
	}

	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getGiftItemId() {
		return this.giftItemId;
	}

	public void setGiftItemId(String giftItemId) {
		this.giftItemId = giftItemId;
	}

	public String getGiftItemName() {
		return this.giftItemName;
	}

	public void setGiftItemName(String giftItemName) {
		this.giftItemName = giftItemName;
	}

	public String getGiftItemNum() {
		return this.giftItemNum;
	}

	public void setGiftItemNum(String giftItemNum) {
		this.giftItemNum = giftItemNum;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPromotionDesc() {
		return this.promotionDesc;
	}

	public void setPromotionDesc(String promotionDesc) {
		this.promotionDesc = promotionDesc;
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return this.promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
}