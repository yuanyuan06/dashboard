package o_o;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@Test
	public void tt(){
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> list = new HashMap<String, Object>();
		list.put("二级标题1", "oo");
		list.put("二级标题2", "pp");
		list.put("二级标题3", "uu");
		
		map.put("一级标题", list);
		System.out.println(JSON.toJSONString(map));
	}
}
