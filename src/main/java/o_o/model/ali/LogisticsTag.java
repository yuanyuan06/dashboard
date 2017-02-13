package o_o.model.ali;

import java.util.List;

import o_o.model.BaseEntity;

public class LogisticsTag extends BaseEntity {
	private static final long serialVersionUID = 8287134638895618621L;

	// ("logistic_service_tag_list")
	// ("logistic_service_tag")
	private List<LogisticServiceTag> logisticServiceTagList;

	// ("order_id")
	private String orderId;

	public List<LogisticServiceTag> getLogisticServiceTagList() {
		return this.logisticServiceTagList;
	}

	public void setLogisticServiceTagList(List<LogisticServiceTag> logisticServiceTagList) {
		this.logisticServiceTagList = logisticServiceTagList;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}