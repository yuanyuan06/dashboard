package o_o.service;

import org.quartz.Scheduler;

import o_o.model.BaseEntity;

public class TaskConfig extends BaseEntity {

	private static final long serialVersionUID = 7236922676107131583L;
	
	public final static String ARGUMENTS_SPLIT_CODE = ";";
	/**
     * PK
     */
    private Long id;
    /**
     * 定时任务类名
     */
    private String className;
    /**
     * 方法名
     */
    private String method;
    /**
     * 是否并行
     */
    private Boolean isConcurrent = false;
    /**
     * 任务名称
     */
    private String jobCode;
    /**
     * 调度名称
     */
    private String triggerCode;
    /**
     * 定时任务组
     */
    private String group = Scheduler.DEFAULT_GROUP;
    /**
     * 描述
     */
    private String describe;
    /**
     * 定时配置
     */
    private String cronExpression;
    /**
     * 是否使用
     */
    private Boolean isAvailable = true;
    /**
     * 定时任务参数，如果无则不填写，如有多个则按分号分隔
     */
    private String arguments;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Boolean getIsConcurrent() {
		return isConcurrent;
	}
	public void setIsConcurrent(Boolean isConcurrent) {
		this.isConcurrent = isConcurrent;
	}
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public String getTriggerCode() {
		return triggerCode;
	}
	public void setTriggerCode(String triggerCode) {
		this.triggerCode = triggerCode;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getCronExpression() {
		return cronExpression;
	}
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getArguments() {
		return arguments;
	}
	public void setArguments(String arguments) {
		this.arguments = arguments;
	}
}
