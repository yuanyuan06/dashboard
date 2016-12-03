package o_o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import o_o.dao.TmallTradeDao;
import o_o.model.TmallTrade;

public class TestCase extends TestRootApplication{
	
	@Autowired
	private TmallTradeDao tmallTradeDao;
	
	@Test
	public void testFirstDao(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<TmallTrade> list = tmallTradeDao.queryTmallTradeList(map);
		System.out.println(list.size());
	}

}
