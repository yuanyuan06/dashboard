package o_o.dao;

import java.util.List;
import java.util.Map;

import o_o.model.TmallTrade;

public interface TmallTradeDao {

	List<TmallTrade> queryTmallTradeList(Map<String, Object> map);
	
	void saveTmallTrade(TmallTrade trade);
	
	void tmallTradeDelete(Long id);
}
