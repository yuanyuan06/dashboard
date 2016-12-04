package o_o.model;

import java.util.Date;

public class TmallTrade extends BaseEntity {
	
	private static final long serialVersionUID = -785761691456420433L;
	
	private Long id;
	private String content;
	private Date createTime;
	private Byte dataStatus;
	private Date lastModifyTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Byte getDataStatus() {
		return dataStatus;
	}
	public void setDataStatus(Byte dataStatus) {
		this.dataStatus = dataStatus;
	}
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
}
