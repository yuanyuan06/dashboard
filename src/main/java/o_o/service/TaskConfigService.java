package o_o.service;

import java.text.ParseException;

import javax.annotation.Resource;

import org.quartz.Scheduler;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.util.StringUtils;


public class TaskConfigService {
	
	private SchedulerFactoryBean schedulerFactoryBean;

	@Resource
    private ApplicationContext applicationContext;
	
    public void addTask(TaskConfig cfg) {
            try {
				Scheduler scheduler = schedulerFactoryBean.getObject();
				MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
				jobDetail.setTargetObject(applicationContext.getBean(Class.forName(cfg.getClassName())));
				jobDetail.setTargetMethod(cfg.getMethod());
				if (StringUtils.hasText(cfg.getArguments())) {
				    // 设置定时任务参数
				    String[] args = cfg.getArguments().split(TaskConfig.ARGUMENTS_SPLIT_CODE);
				    jobDetail.setArguments(args);
				}
				jobDetail.setConcurrent(cfg.getIsConcurrent() == null ? false : cfg.getIsConcurrent());
				jobDetail.setName(cfg.getJobCode());
				jobDetail.afterPropertiesSet();
				CronTriggerFactoryBean ctb = new CronTriggerFactoryBean();
				ctb.setJobDetail(jobDetail.getObject());
				ctb.setName(cfg.getTriggerCode());
				ctb.setGroup(cfg.getGroup());
				ctb.afterPropertiesSet();
				ctb.setCronExpression(cfg.getCronExpression());
			} catch (BeansException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
    }
}
