package o_o.context;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class TaskConfigContext {
	
	@Bean
	public SchedulerFactoryBean setSchedulerBean(){
		SchedulerFactoryBean schedulerBean = new SchedulerFactoryBean();
		Properties quartzProperties = new Properties();
		
			quartzProperties.setProperty(SchedulerFactoryBean.PROP_THREAD_COUNT, Integer.toString(100));
		schedulerBean.setQuartzProperties(quartzProperties);
		return schedulerBean;
	}

}
