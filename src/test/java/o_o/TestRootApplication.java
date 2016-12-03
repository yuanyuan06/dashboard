package o_o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath*:test-spring.xml"})
public class TestRootApplication extends AbstractJUnit4SpringContextTests {
    
    protected Log log = LogFactory.getLog(getClass());
//    protected Logger logger = LoggerFactory.getLogger(getClass());
}



