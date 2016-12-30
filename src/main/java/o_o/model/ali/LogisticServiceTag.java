package o_o.model.ali;

import o_o.model.BaseEntity;

public class LogisticServiceTag extends BaseEntity {
	private static final long serialVersionUID = 1416162652443347492L;

	// ("service_tag")
	private String serviceTag;

	// ("service_type")
	private String serviceType;

	public String getServiceTag() {
		return this.serviceTag;
	}

	public void setServiceTag(String serviceTag) {
		this.serviceTag = serviceTag;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
}